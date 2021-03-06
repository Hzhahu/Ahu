// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo.internals;

import android.content.Context;
import androidx.room.migration.Migration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_MigrationsFactory implements Factory<Migration[]> {
  private final PersistenceModule module;

  private final Provider<Context> contextProvider;

  public PersistenceModule_MigrationsFactory(
      PersistenceModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Migration[] get() {
    return provideInstance(module, contextProvider);
  }

  public static Migration[] provideInstance(
      PersistenceModule module, Provider<Context> contextProvider) {
    return proxyMigrations(module, contextProvider.get());
  }

  public static PersistenceModule_MigrationsFactory create(
      PersistenceModule module, Provider<Context> contextProvider) {
    return new PersistenceModule_MigrationsFactory(module, contextProvider);
  }

  public static Migration[] proxyMigrations(PersistenceModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.migrations(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
