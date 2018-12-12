// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AndroidModule_ProvideConnectivityManagerFactory
    implements Factory<ConnectivityManager> {
  private final AndroidModule module;

  private final Provider<Context> contextProvider;

  public AndroidModule_ProvideConnectivityManagerFactory(
      AndroidModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectivityManager get() {
    return provideInstance(module, contextProvider);
  }

  public static ConnectivityManager provideInstance(
      AndroidModule module, Provider<Context> contextProvider) {
    return proxyProvideConnectivityManager(module, contextProvider.get());
  }

  public static AndroidModule_ProvideConnectivityManagerFactory create(
      AndroidModule module, Provider<Context> contextProvider) {
    return new AndroidModule_ProvideConnectivityManagerFactory(module, contextProvider);
  }

  public static ConnectivityManager proxyProvideConnectivityManager(
      AndroidModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideConnectivityManager(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
