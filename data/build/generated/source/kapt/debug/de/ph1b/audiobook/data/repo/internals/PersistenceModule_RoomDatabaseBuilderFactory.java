// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo.internals;

import android.content.Context;
import androidx.room.RoomDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_RoomDatabaseBuilderFactory
    implements Factory<RoomDatabase.Builder<AppDb>> {
  private final PersistenceModule module;

  private final Provider<Context> contextProvider;

  public PersistenceModule_RoomDatabaseBuilderFactory(
      PersistenceModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public RoomDatabase.Builder<AppDb> get() {
    return provideInstance(module, contextProvider);
  }

  public static RoomDatabase.Builder<AppDb> provideInstance(
      PersistenceModule module, Provider<Context> contextProvider) {
    return proxyRoomDatabaseBuilder(module, contextProvider.get());
  }

  public static PersistenceModule_RoomDatabaseBuilderFactory create(
      PersistenceModule module, Provider<Context> contextProvider) {
    return new PersistenceModule_RoomDatabaseBuilderFactory(module, contextProvider);
  }

  public static RoomDatabase.Builder<AppDb> proxyRoomDatabaseBuilder(
      PersistenceModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.roomDatabaseBuilder(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
