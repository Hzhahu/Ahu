// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo.internals;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_MetaDataDaoFactory implements Factory<BookMetaDataDao> {
  private final PersistenceModule module;

  private final Provider<AppDb> appDbProvider;

  public PersistenceModule_MetaDataDaoFactory(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    this.module = module;
    this.appDbProvider = appDbProvider;
  }

  @Override
  public BookMetaDataDao get() {
    return provideInstance(module, appDbProvider);
  }

  public static BookMetaDataDao provideInstance(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    return proxyMetaDataDao(module, appDbProvider.get());
  }

  public static PersistenceModule_MetaDataDaoFactory create(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    return new PersistenceModule_MetaDataDaoFactory(module, appDbProvider);
  }

  public static BookMetaDataDao proxyMetaDataDao(PersistenceModule instance, AppDb appDb) {
    return Preconditions.checkNotNull(
        instance.metaDataDao(appDb), "Cannot return null from a non-@Nullable @Provides method");
  }
}
