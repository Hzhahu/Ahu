// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo.internals;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_AppDbFactory implements Factory<AppDb> {
  private final PersistenceModule module;

  private final Provider<RoomDatabase.Builder<AppDb>> builderProvider;

  private final Provider<Migration[]> migrationsProvider;

  public PersistenceModule_AppDbFactory(
      PersistenceModule module,
      Provider<RoomDatabase.Builder<AppDb>> builderProvider,
      Provider<Migration[]> migrationsProvider) {
    this.module = module;
    this.builderProvider = builderProvider;
    this.migrationsProvider = migrationsProvider;
  }

  @Override
  public AppDb get() {
    return provideInstance(module, builderProvider, migrationsProvider);
  }

  public static AppDb provideInstance(
      PersistenceModule module,
      Provider<RoomDatabase.Builder<AppDb>> builderProvider,
      Provider<Migration[]> migrationsProvider) {
    return proxyAppDb(module, builderProvider.get(), migrationsProvider.get());
  }

  public static PersistenceModule_AppDbFactory create(
      PersistenceModule module,
      Provider<RoomDatabase.Builder<AppDb>> builderProvider,
      Provider<Migration[]> migrationsProvider) {
    return new PersistenceModule_AppDbFactory(module, builderProvider, migrationsProvider);
  }

  public static AppDb proxyAppDb(
      PersistenceModule instance, RoomDatabase.Builder<AppDb> builder, Migration[] migrations) {
    return Preconditions.checkNotNull(
        instance.appDb(builder, migrations),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
