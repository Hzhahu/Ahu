// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.bookOverview;

import dagger.internal.Factory;
import de.ph1b.audiobook.data.repo.BookRepository;
import de.ph1b.audiobook.features.BookAdder;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.PlayStateManager;
import de.ph1b.audiobook.playback.PlayerController;
import de.ph1b.audiobook.uitools.CoverFromDiscCollector;
import java.util.UUID;
import javax.inject.Provider;

public final class BookOverviewViewModel_Factory implements Factory<BookOverviewViewModel> {
  private final Provider<BookRepository> repoProvider;

  private final Provider<BookAdder> bookAdderProvider;

  private final Provider<PlayStateManager> playStateManagerProvider;

  private final Provider<PlayerController> playerControllerProvider;

  private final Provider<CoverFromDiscCollector> coverFromDiscCollectorProvider;

  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  public BookOverviewViewModel_Factory(
      Provider<BookRepository> repoProvider,
      Provider<BookAdder> bookAdderProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<CoverFromDiscCollector> coverFromDiscCollectorProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider) {
    this.repoProvider = repoProvider;
    this.bookAdderProvider = bookAdderProvider;
    this.playStateManagerProvider = playStateManagerProvider;
    this.playerControllerProvider = playerControllerProvider;
    this.coverFromDiscCollectorProvider = coverFromDiscCollectorProvider;
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
  }

  @Override
  public BookOverviewViewModel get() {
    return provideInstance(
        repoProvider,
        bookAdderProvider,
        playStateManagerProvider,
        playerControllerProvider,
        coverFromDiscCollectorProvider,
        currentBookIdPrefProvider);
  }

  public static BookOverviewViewModel provideInstance(
      Provider<BookRepository> repoProvider,
      Provider<BookAdder> bookAdderProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<CoverFromDiscCollector> coverFromDiscCollectorProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider) {
    return new BookOverviewViewModel(
        repoProvider.get(),
        bookAdderProvider.get(),
        playStateManagerProvider.get(),
        playerControllerProvider.get(),
        coverFromDiscCollectorProvider.get(),
        currentBookIdPrefProvider.get());
  }

  public static BookOverviewViewModel_Factory create(
      Provider<BookRepository> repoProvider,
      Provider<BookAdder> bookAdderProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<CoverFromDiscCollector> coverFromDiscCollectorProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider) {
    return new BookOverviewViewModel_Factory(
        repoProvider,
        bookAdderProvider,
        playStateManagerProvider,
        playerControllerProvider,
        coverFromDiscCollectorProvider,
        currentBookIdPrefProvider);
  }

  public static BookOverviewViewModel newBookOverviewViewModel(
      BookRepository repo,
      BookAdder bookAdder,
      PlayStateManager playStateManager,
      PlayerController playerController,
      CoverFromDiscCollector coverFromDiscCollector,
      Pref<UUID> currentBookIdPref) {
    return new BookOverviewViewModel(
        repo,
        bookAdder,
        playStateManager,
        playerController,
        coverFromDiscCollector,
        currentBookIdPref);
  }
}
