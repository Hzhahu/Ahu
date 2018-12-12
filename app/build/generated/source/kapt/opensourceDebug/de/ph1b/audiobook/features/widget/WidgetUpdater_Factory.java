// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.widget;

import android.content.Context;
import android.view.WindowManager;
import dagger.internal.Factory;
import de.ph1b.audiobook.data.repo.BookRepository;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.PlayStateManager;
import de.ph1b.audiobook.playback.PlayerController;
import de.ph1b.audiobook.uitools.ImageHelper;
import java.util.UUID;
import javax.inject.Provider;

public final class WidgetUpdater_Factory implements Factory<WidgetUpdater> {
  private final Provider<Context> contextProvider;

  private final Provider<BookRepository> repoProvider;

  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  private final Provider<ImageHelper> imageHelperProvider;

  private final Provider<PlayerController> playerControllerProvider;

  private final Provider<PlayStateManager> playStateManagerProvider;

  private final Provider<WindowManager> windowManagerProvider;

  public WidgetUpdater_Factory(
      Provider<Context> contextProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<ImageHelper> imageHelperProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<WindowManager> windowManagerProvider) {
    this.contextProvider = contextProvider;
    this.repoProvider = repoProvider;
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
    this.imageHelperProvider = imageHelperProvider;
    this.playerControllerProvider = playerControllerProvider;
    this.playStateManagerProvider = playStateManagerProvider;
    this.windowManagerProvider = windowManagerProvider;
  }

  @Override
  public WidgetUpdater get() {
    return provideInstance(
        contextProvider,
        repoProvider,
        currentBookIdPrefProvider,
        imageHelperProvider,
        playerControllerProvider,
        playStateManagerProvider,
        windowManagerProvider);
  }

  public static WidgetUpdater provideInstance(
      Provider<Context> contextProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<ImageHelper> imageHelperProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<WindowManager> windowManagerProvider) {
    return new WidgetUpdater(
        contextProvider.get(),
        repoProvider.get(),
        currentBookIdPrefProvider.get(),
        imageHelperProvider.get(),
        playerControllerProvider.get(),
        playStateManagerProvider.get(),
        windowManagerProvider);
  }

  public static WidgetUpdater_Factory create(
      Provider<Context> contextProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<ImageHelper> imageHelperProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<WindowManager> windowManagerProvider) {
    return new WidgetUpdater_Factory(
        contextProvider,
        repoProvider,
        currentBookIdPrefProvider,
        imageHelperProvider,
        playerControllerProvider,
        playStateManagerProvider,
        windowManagerProvider);
  }

  public static WidgetUpdater newWidgetUpdater(
      Context context,
      BookRepository repo,
      Pref<UUID> currentBookIdPref,
      ImageHelper imageHelper,
      PlayerController playerController,
      PlayStateManager playStateManager,
      Provider<WindowManager> windowManager) {
    return new WidgetUpdater(
        context,
        repo,
        currentBookIdPref,
        imageHelper,
        playerController,
        playStateManager,
        windowManager);
  }
}