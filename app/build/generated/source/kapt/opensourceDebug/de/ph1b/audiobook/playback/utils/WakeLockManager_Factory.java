// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback.utils;

import android.os.PowerManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class WakeLockManager_Factory implements Factory<WakeLockManager> {
  private final Provider<PowerManager> powerManagerProvider;

  public WakeLockManager_Factory(Provider<PowerManager> powerManagerProvider) {
    this.powerManagerProvider = powerManagerProvider;
  }

  @Override
  public WakeLockManager get() {
    return provideInstance(powerManagerProvider);
  }

  public static WakeLockManager provideInstance(Provider<PowerManager> powerManagerProvider) {
    return new WakeLockManager(powerManagerProvider.get());
  }

  public static WakeLockManager_Factory create(Provider<PowerManager> powerManagerProvider) {
    return new WakeLockManager_Factory(powerManagerProvider);
  }

  public static WakeLockManager newWakeLockManager(PowerManager powerManager) {
    return new WakeLockManager(powerManager);
  }
}
