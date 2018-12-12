// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.uitools;

import android.app.ActivityManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CoverFromDiscCollector_Factory implements Factory<CoverFromDiscCollector> {
  private final Provider<ActivityManager> activityManagerProvider;

  private final Provider<ImageHelper> imageHelperProvider;

  public CoverFromDiscCollector_Factory(
      Provider<ActivityManager> activityManagerProvider,
      Provider<ImageHelper> imageHelperProvider) {
    this.activityManagerProvider = activityManagerProvider;
    this.imageHelperProvider = imageHelperProvider;
  }

  @Override
  public CoverFromDiscCollector get() {
    return provideInstance(activityManagerProvider, imageHelperProvider);
  }

  public static CoverFromDiscCollector provideInstance(
      Provider<ActivityManager> activityManagerProvider,
      Provider<ImageHelper> imageHelperProvider) {
    return new CoverFromDiscCollector(activityManagerProvider.get(), imageHelperProvider.get());
  }

  public static CoverFromDiscCollector_Factory create(
      Provider<ActivityManager> activityManagerProvider,
      Provider<ImageHelper> imageHelperProvider) {
    return new CoverFromDiscCollector_Factory(activityManagerProvider, imageHelperProvider);
  }

  public static CoverFromDiscCollector newCoverFromDiscCollector(
      ActivityManager activityManager, ImageHelper imageHelper) {
    return new CoverFromDiscCollector(activityManager, imageHelper);
  }
}
