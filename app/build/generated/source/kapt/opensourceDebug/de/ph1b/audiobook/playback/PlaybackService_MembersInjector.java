// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import android.app.NotificationManager;
import android.support.v4.media.session.MediaSessionCompat;
import dagger.MembersInjector;
import de.ph1b.audiobook.data.repo.BookRepository;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.utils.BookUriConverter;
import de.ph1b.audiobook.playback.utils.ChangeNotifier;
import de.ph1b.audiobook.playback.utils.MediaBrowserHelper;
import de.ph1b.audiobook.playback.utils.NotificationCreator;
import de.ph1b.audiobook.playback.utils.audioFocus.AudioFocusHandler;
import java.util.UUID;
import javax.inject.Provider;

public final class PlaybackService_MembersInjector implements MembersInjector<PlaybackService> {
  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  private final Provider<MediaPlayer> playerProvider;

  private final Provider<BookRepository> repoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<NotificationCreator> notificationCreatorProvider;

  private final Provider<PlayStateManager> playStateManagerProvider;

  private final Provider<BookUriConverter> bookUriConverterProvider;

  private final Provider<MediaBrowserHelper> mediaBrowserHelperProvider;

  private final Provider<MediaSessionCompat> mediaSessionProvider;

  private final Provider<ChangeNotifier> changeNotifierProvider;

  private final Provider<AndroidAutoConnectedReceiver> autoConnectedProvider;

  private final Provider<NotifyOnAutoConnectionChange> notifyOnAutoConnectionChangeProvider;

  private final Provider<AudioFocusHandler> audioFocusHelperProvider;

  private final Provider<Pref<Boolean>> resumeOnReplugPrefProvider;

  public PlaybackService_MembersInjector(
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<MediaPlayer> playerProvider,
      Provider<BookRepository> repoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<NotificationCreator> notificationCreatorProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<MediaBrowserHelper> mediaBrowserHelperProvider,
      Provider<MediaSessionCompat> mediaSessionProvider,
      Provider<ChangeNotifier> changeNotifierProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectedProvider,
      Provider<NotifyOnAutoConnectionChange> notifyOnAutoConnectionChangeProvider,
      Provider<AudioFocusHandler> audioFocusHelperProvider,
      Provider<Pref<Boolean>> resumeOnReplugPrefProvider) {
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
    this.playerProvider = playerProvider;
    this.repoProvider = repoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.notificationCreatorProvider = notificationCreatorProvider;
    this.playStateManagerProvider = playStateManagerProvider;
    this.bookUriConverterProvider = bookUriConverterProvider;
    this.mediaBrowserHelperProvider = mediaBrowserHelperProvider;
    this.mediaSessionProvider = mediaSessionProvider;
    this.changeNotifierProvider = changeNotifierProvider;
    this.autoConnectedProvider = autoConnectedProvider;
    this.notifyOnAutoConnectionChangeProvider = notifyOnAutoConnectionChangeProvider;
    this.audioFocusHelperProvider = audioFocusHelperProvider;
    this.resumeOnReplugPrefProvider = resumeOnReplugPrefProvider;
  }

  public static MembersInjector<PlaybackService> create(
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<MediaPlayer> playerProvider,
      Provider<BookRepository> repoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<NotificationCreator> notificationCreatorProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<BookUriConverter> bookUriConverterProvider,
      Provider<MediaBrowserHelper> mediaBrowserHelperProvider,
      Provider<MediaSessionCompat> mediaSessionProvider,
      Provider<ChangeNotifier> changeNotifierProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectedProvider,
      Provider<NotifyOnAutoConnectionChange> notifyOnAutoConnectionChangeProvider,
      Provider<AudioFocusHandler> audioFocusHelperProvider,
      Provider<Pref<Boolean>> resumeOnReplugPrefProvider) {
    return new PlaybackService_MembersInjector(
        currentBookIdPrefProvider,
        playerProvider,
        repoProvider,
        notificationManagerProvider,
        notificationCreatorProvider,
        playStateManagerProvider,
        bookUriConverterProvider,
        mediaBrowserHelperProvider,
        mediaSessionProvider,
        changeNotifierProvider,
        autoConnectedProvider,
        notifyOnAutoConnectionChangeProvider,
        audioFocusHelperProvider,
        resumeOnReplugPrefProvider);
  }

  @Override
  public void injectMembers(PlaybackService instance) {
    injectCurrentBookIdPref(instance, currentBookIdPrefProvider.get());
    injectPlayer(instance, playerProvider.get());
    injectRepo(instance, repoProvider.get());
    injectNotificationManager(instance, notificationManagerProvider.get());
    injectNotificationCreator(instance, notificationCreatorProvider.get());
    injectPlayStateManager(instance, playStateManagerProvider.get());
    injectBookUriConverter(instance, bookUriConverterProvider.get());
    injectMediaBrowserHelper(instance, mediaBrowserHelperProvider.get());
    injectMediaSession(instance, mediaSessionProvider.get());
    injectChangeNotifier(instance, changeNotifierProvider.get());
    injectAutoConnected(instance, autoConnectedProvider.get());
    injectNotifyOnAutoConnectionChange(instance, notifyOnAutoConnectionChangeProvider.get());
    injectAudioFocusHelper(instance, audioFocusHelperProvider.get());
    injectResumeOnReplugPref(instance, resumeOnReplugPrefProvider.get());
  }

  public static void injectCurrentBookIdPref(
      PlaybackService instance, Pref<UUID> currentBookIdPref) {
    instance.currentBookIdPref = currentBookIdPref;
  }

  public static void injectPlayer(PlaybackService instance, MediaPlayer player) {
    instance.player = player;
  }

  public static void injectRepo(PlaybackService instance, BookRepository repo) {
    instance.repo = repo;
  }

  public static void injectNotificationManager(
      PlaybackService instance, NotificationManager notificationManager) {
    instance.notificationManager = notificationManager;
  }

  public static void injectNotificationCreator(
      PlaybackService instance, NotificationCreator notificationCreator) {
    instance.notificationCreator = notificationCreator;
  }

  public static void injectPlayStateManager(
      PlaybackService instance, PlayStateManager playStateManager) {
    instance.playStateManager = playStateManager;
  }

  public static void injectBookUriConverter(
      PlaybackService instance, BookUriConverter bookUriConverter) {
    instance.bookUriConverter = bookUriConverter;
  }

  public static void injectMediaBrowserHelper(
      PlaybackService instance, MediaBrowserHelper mediaBrowserHelper) {
    instance.mediaBrowserHelper = mediaBrowserHelper;
  }

  public static void injectMediaSession(PlaybackService instance, MediaSessionCompat mediaSession) {
    instance.mediaSession = mediaSession;
  }

  public static void injectChangeNotifier(PlaybackService instance, ChangeNotifier changeNotifier) {
    instance.changeNotifier = changeNotifier;
  }

  public static void injectAutoConnected(
      PlaybackService instance, AndroidAutoConnectedReceiver autoConnected) {
    instance.autoConnected = autoConnected;
  }

  public static void injectNotifyOnAutoConnectionChange(
      PlaybackService instance, NotifyOnAutoConnectionChange notifyOnAutoConnectionChange) {
    instance.notifyOnAutoConnectionChange = notifyOnAutoConnectionChange;
  }

  public static void injectAudioFocusHelper(
      PlaybackService instance, AudioFocusHandler audioFocusHelper) {
    instance.audioFocusHelper = audioFocusHelper;
  }

  public static void injectResumeOnReplugPref(
      PlaybackService instance, Pref<Boolean> resumeOnReplugPref) {
    instance.resumeOnReplugPref = resumeOnReplugPref;
  }
}
