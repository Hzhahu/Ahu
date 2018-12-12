// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.content.Context;
import android.hardware.SensorManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

public final class AndroidModule_ProvideSensorManagerFactory implements Factory<SensorManager> {
  private final AndroidModule module;

  private final Provider<Context> contextProvider;

  public AndroidModule_ProvideSensorManagerFactory(
      AndroidModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  @Nullable
  public SensorManager get() {
    return provideInstance(module, contextProvider);
  }

  @Nullable
  public static SensorManager provideInstance(
      AndroidModule module, Provider<Context> contextProvider) {
    return proxyProvideSensorManager(module, contextProvider.get());
  }

  public static AndroidModule_ProvideSensorManagerFactory create(
      AndroidModule module, Provider<Context> contextProvider) {
    return new AndroidModule_ProvideSensorManagerFactory(module, contextProvider);
  }

  @Nullable
  public static SensorManager proxyProvideSensorManager(AndroidModule instance, Context context) {
    return instance.provideSensorManager(context);
  }
}