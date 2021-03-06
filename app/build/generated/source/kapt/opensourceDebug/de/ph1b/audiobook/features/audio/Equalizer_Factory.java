// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.audio;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class Equalizer_Factory implements Factory<Equalizer> {
  private final Provider<Context> contextProvider;

  public Equalizer_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Equalizer get() {
    return provideInstance(contextProvider);
  }

  public static Equalizer provideInstance(Provider<Context> contextProvider) {
    return new Equalizer(contextProvider.get());
  }

  public static Equalizer_Factory create(Provider<Context> contextProvider) {
    return new Equalizer_Factory(contextProvider);
  }

  public static Equalizer newEqualizer(Context context) {
    return new Equalizer(context);
  }
}
