// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.app.ActivityManager;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AndroidModule_ProvideActivityManagerFactory implements Factory<ActivityManager> {
  private final AndroidModule module;

  private final Provider<Context> contextProvider;

  public AndroidModule_ProvideActivityManagerFactory(
      AndroidModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ActivityManager get() {
    return provideInstance(module, contextProvider);
  }

  public static ActivityManager provideInstance(
      AndroidModule module, Provider<Context> contextProvider) {
    return proxyProvideActivityManager(module, contextProvider.get());
  }

  public static AndroidModule_ProvideActivityManagerFactory create(
      AndroidModule module, Provider<Context> contextProvider) {
    return new AndroidModule_ProvideActivityManagerFactory(module, contextProvider);
  }

  public static ActivityManager proxyProvideActivityManager(
      AndroidModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideActivityManager(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
