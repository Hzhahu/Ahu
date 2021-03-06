// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo.internals;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_BookSettingsDaoFactory implements Factory<BookSettingsDao> {
  private final PersistenceModule module;

  private final Provider<AppDb> appDbProvider;

  public PersistenceModule_BookSettingsDaoFactory(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    this.module = module;
    this.appDbProvider = appDbProvider;
  }

  @Override
  public BookSettingsDao get() {
    return provideInstance(module, appDbProvider);
  }

  public static BookSettingsDao provideInstance(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    return proxyBookSettingsDao(module, appDbProvider.get());
  }

  public static PersistenceModule_BookSettingsDaoFactory create(
      PersistenceModule module, Provider<AppDb> appDbProvider) {
    return new PersistenceModule_BookSettingsDaoFactory(module, appDbProvider);
  }

  public static BookSettingsDao proxyBookSettingsDao(PersistenceModule instance, AppDb appDb) {
    return Preconditions.checkNotNull(
        instance.bookSettingsDao(appDb),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
