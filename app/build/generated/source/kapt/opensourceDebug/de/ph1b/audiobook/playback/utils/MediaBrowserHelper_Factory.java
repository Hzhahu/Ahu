// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback.utils;

import android.content.Context;
import dagger.internal.Factory;
import de.ph1b.audiobook.data.repo.BookRepository;
import de.ph1b.audiobook.persistence.pref.Pref;
import java.util.UUID;
import javax.inject.Provider;

public final class MediaBrowserHelper_Factory implements Factory<MediaBrowserHelper> {
  private final Provider<BookUriConverter> bookUriConverterProvider;

  private final Provider<BookRepository> repoProvider;

  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  private final Provider<Context> contextProvider;

  public MediaBrowserHelper_Factory(
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<Context> contextProvider) {
    this.bookUriConverterProvider = bookUriConverterProvider;
    this.repoProvider = repoProvider;
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public MediaBrowserHelper get() {
    return provideInstance(
        bookUriConverterProvider, repoProvider, currentBookIdPrefProvider, contextProvider);
  }

  public static MediaBrowserHelper provideInstance(
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<Context> contextProvider) {
    return new MediaBrowserHelper(
        bookUriConverterProvider.get(),
        repoProvider.get(),
        currentBookIdPrefProvider.get(),
        contextProvider.get());
  }

  public static MediaBrowserHelper_Factory create(
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<Context> contextProvider) {
    return new MediaBrowserHelper_Factory(
        bookUriConverterProvider, repoProvider, currentBookIdPrefProvider, contextProvider);
  }

  public static MediaBrowserHelper newMediaBrowserHelper(
      BookUriConverter bookUriConverter,
      BookRepository repo,
      Pref<UUID> currentBookIdPref,
      Context context) {
    return new MediaBrowserHelper(bookUriConverter, repo, currentBookIdPref, context);
  }
}
