// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import dagger.internal.Factory;
import de.ph1b.audiobook.features.bookSearch.BookSearchHandler;
import de.ph1b.audiobook.features.bookSearch.BookSearchParser;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.utils.BookUriConverter;
import java.util.UUID;
import javax.inject.Provider;

public final class MediaSessionCallback_Factory implements Factory<MediaSessionCallback> {
  private final Provider<BookUriConverter> bookUriConverterProvider;

  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  private final Provider<BookSearchHandler> bookSearchHandlerProvider;

  private final Provider<AndroidAutoConnectedReceiver> autoConnectionProvider;

  private final Provider<MediaPlayer> playerProvider;

  private final Provider<BookSearchParser> bookSearchParserProvider;

  public MediaSessionCallback_Factory(
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<BookSearchHandler> bookSearchHandlerProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectionProvider,
      Provider<MediaPlayer> playerProvider,
      Provider<BookSearchParser> bookSearchParserProvider) {
    this.bookUriConverterProvider = bookUriConverterProvider;
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
    this.bookSearchHandlerProvider = bookSearchHandlerProvider;
    this.autoConnectionProvider = autoConnectionProvider;
    this.playerProvider = playerProvider;
    this.bookSearchParserProvider = bookSearchParserProvider;
  }

  @Override
  public MediaSessionCallback get() {
    return provideInstance(
        bookUriConverterProvider,
        currentBookIdPrefProvider,
        bookSearchHandlerProvider,
        autoConnectionProvider,
        playerProvider,
        bookSearchParserProvider);
  }

  public static MediaSessionCallback provideInstance(
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<BookSearchHandler> bookSearchHandlerProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectionProvider,
      Provider<MediaPlayer> playerProvider,
      Provider<BookSearchParser> bookSearchParserProvider) {
    return new MediaSessionCallback(
        bookUriConverterProvider.get(),
        currentBookIdPrefProvider.get(),
        bookSearchHandlerProvider.get(),
        autoConnectionProvider.get(),
        playerProvider.get(),
        bookSearchParserProvider.get());
  }

  public static MediaSessionCallback_Factory create(
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<BookSearchHandler> bookSearchHandlerProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectionProvider,
      Provider<MediaPlayer> playerProvider,
      Provider<BookSearchParser> bookSearchParserProvider) {
    return new MediaSessionCallback_Factory(
        bookUriConverterProvider,
        currentBookIdPrefProvider,
        bookSearchHandlerProvider,
        autoConnectionProvider,
        playerProvider,
        bookSearchParserProvider);
  }

  public static MediaSessionCallback newMediaSessionCallback(
      BookUriConverter bookUriConverter,
      Pref<UUID> currentBookIdPref,
      BookSearchHandler bookSearchHandler,
      AndroidAutoConnectedReceiver autoConnection,
      MediaPlayer player,
      BookSearchParser bookSearchParser) {
    return new MediaSessionCallback(
        bookUriConverter,
        currentBookIdPref,
        bookSearchHandler,
        autoConnection,
        player,
        bookSearchParser);
  }
}
