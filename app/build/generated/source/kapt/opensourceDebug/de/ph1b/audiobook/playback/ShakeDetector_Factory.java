// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import android.hardware.SensorManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ShakeDetector_Factory implements Factory<ShakeDetector> {
  private final Provider<SensorManager> sensorManagerProvider;

  public ShakeDetector_Factory(Provider<SensorManager> sensorManagerProvider) {
    this.sensorManagerProvider = sensorManagerProvider;
  }

  @Override
  public ShakeDetector get() {
    return provideInstance(sensorManagerProvider);
  }

  public static ShakeDetector provideInstance(Provider<SensorManager> sensorManagerProvider) {
    return new ShakeDetector(sensorManagerProvider.get());
  }

  public static ShakeDetector_Factory create(Provider<SensorManager> sensorManagerProvider) {
    return new ShakeDetector_Factory(sensorManagerProvider);
  }

  public static ShakeDetector newShakeDetector(SensorManager sensorManager) {
    return new ShakeDetector(sensorManager);
  }
}
