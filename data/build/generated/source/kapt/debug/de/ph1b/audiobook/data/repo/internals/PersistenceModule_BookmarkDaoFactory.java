// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo.internals;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_BookmarkDaoFactory implements Factory<BookmarkDao> {
  private final PersistenceModule module;

  private final Provider<AppDb> appDbProvider;

  public PersistenceModule_BookmarkDaoFactory(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    this.module = module;
    this.appDbProvider = appDbProvider;
  }

  @Override
  public BookmarkDao get() {
    return provideInstance(module, appDbProvider);
  }

  public static BookmarkDao provideInstance(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    return proxyBookmarkDao(module, appDbProvider.get());
  }

  public static PersistenceModule_BookmarkDaoFactory create(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    return new PersistenceModule_BookmarkDaoFactory(module, appDbProvider);
  }

  public static BookmarkDao proxyBookmarkDao(PersistenceModule instance, AppDb appDb) {
    return Preconditions.checkNotNull(
        instance.bookmarkDao(appDb), "Cannot return null from a non-@Nullable @Provides method");
  }
}
