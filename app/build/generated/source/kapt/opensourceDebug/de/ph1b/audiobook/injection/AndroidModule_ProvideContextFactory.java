// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AndroidModule_ProvideContextFactory implements Factory<Context> {
  private final AndroidModule module;

  private final Provider<Application> appProvider;

  public AndroidModule_ProvideContextFactory(
      AndroidModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideInstance(module, appProvider);
  }

  public static Context provideInstance(AndroidModule module, Provider<Application> appProvider) {
    return proxyProvideContext(module, appProvider.get());
  }

  public static AndroidModule_ProvideContextFactory create(
      AndroidModule module, Provider<Application> appProvider) {
    return new AndroidModule_ProvideContextFactory(module, appProvider);
  }

  public static Context proxyProvideContext(AndroidModule instance, Application app) {
    return Preconditions.checkNotNull(
        instance.provideContext(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
