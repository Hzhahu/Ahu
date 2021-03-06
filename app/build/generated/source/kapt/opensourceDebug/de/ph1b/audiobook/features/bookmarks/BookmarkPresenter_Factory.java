// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.bookmarks;

import dagger.internal.Factory;
import de.ph1b.audiobook.data.repo.BookRepository;
import de.ph1b.audiobook.data.repo.BookmarkRepo;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.PlayStateManager;
import de.ph1b.audiobook.playback.PlayerController;
import java.util.UUID;
import javax.inject.Provider;

public final class BookmarkPresenter_Factory implements Factory<BookmarkPresenter> {
  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  private final Provider<BookRepository> repoProvider;

  private final Provider<BookmarkRepo> bookmarkRepoProvider;

  private final Provider<PlayStateManager> playStateManagerProvider;

  private final Provider<PlayerController> playerControllerProvider;

  public BookmarkPresenter_Factory(
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<BookRepository> repoProvider,
      Provider<BookmarkRepo> bookmarkRepoProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<PlayerController> playerControllerProvider) {
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
    this.repoProvider = repoProvider;
    this.bookmarkRepoProvider = bookmarkRepoProvider;
    this.playStateManagerProvider = playStateManagerProvider;
    this.playerControllerProvider = playerControllerProvider;
  }

  @Override
  public BookmarkPresenter get() {
    return provideInstance(
        currentBookIdPrefProvider,
        repoProvider,
        bookmarkRepoProvider,
        playStateManagerProvider,
        playerControllerProvider);
  }

  public static BookmarkPresenter provideInstance(
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<BookRepository> repoProvider,
      Provider<BookmarkRepo> bookmarkRepoProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<PlayerController> playerControllerProvider) {
    return new BookmarkPresenter(
        currentBookIdPrefProvider.get(),
        repoProvider.get(),
        bookmarkRepoProvider.get(),
        playStateManagerProvider.get(),
        playerControllerProvider.get());
  }

  public static BookmarkPresenter_Factory create(
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<BookRepository> repoProvider,
      Provider<BookmarkRepo> bookmarkRepoProvider,
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<PlayerController> playerControllerProvider) {
    return new BookmarkPresenter_Factory(
        currentBookIdPrefProvider,
        repoProvider,
        bookmarkRepoProvider,
        playStateManagerProvider,
        playerControllerProvider);
  }

  public static BookmarkPresenter newBookmarkPresenter(
      Pref<UUID> currentBookIdPref,
      BookRepository repo,
      BookmarkRepo bookmarkRepo,
      PlayStateManager playStateManager,
      PlayerController playerController) {
    return new BookmarkPresenter(
        currentBookIdPref, repo, bookmarkRepo, playStateManager, playerController);
  }
}
