// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PrefsModule_ProvideSharedPreferencesFactory
    implements Factory<SharedPreferences> {
  private final PrefsModule module;

  private final Provider<Context> contextProvider;

  public PrefsModule_ProvideSharedPreferencesFactory(
      PrefsModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module, contextProvider);
  }

  public static SharedPreferences provideInstance(
      PrefsModule module, Provider<Context> contextProvider) {
    return proxyProvideSharedPreferences(module, contextProvider.get());
  }

  public static PrefsModule_ProvideSharedPreferencesFactory create(
      PrefsModule module, Provider<Context> contextProvider) {
    return new PrefsModule_ProvideSharedPreferencesFactory(module, contextProvider);
  }

  public static SharedPreferences proxyProvideSharedPreferences(
      PrefsModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideSharedPreferences(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
