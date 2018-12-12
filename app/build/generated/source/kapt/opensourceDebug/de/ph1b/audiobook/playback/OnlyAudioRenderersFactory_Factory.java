// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class OnlyAudioRenderersFactory_Factory implements Factory<OnlyAudioRenderersFactory> {
  private final Provider<Context> contextProvider;

  public OnlyAudioRenderersFactory_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public OnlyAudioRenderersFactory get() {
    return provideInstance(contextProvider);
  }

  public static OnlyAudioRenderersFactory provideInstance(Provider<Context> contextProvider) {
    return new OnlyAudioRenderersFactory(contextProvider.get());
  }

  public static OnlyAudioRenderersFactory_Factory create(Provider<Context> contextProvider) {
    return new OnlyAudioRenderersFactory_Factory(contextProvider);
  }

  public static OnlyAudioRenderersFactory newOnlyAudioRenderersFactory(Context context) {
    return new OnlyAudioRenderersFactory(context);
  }
}
