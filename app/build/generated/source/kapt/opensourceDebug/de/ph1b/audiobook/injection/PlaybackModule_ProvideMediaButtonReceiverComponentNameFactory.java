// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.content.ComponentName;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.ph1b.audiobook.playback.PlaybackService;
import javax.inject.Provider;

public final class PlaybackModule_ProvideMediaButtonReceiverComponentNameFactory
    implements Factory<ComponentName> {
  private final PlaybackModule module;

  private final Provider<PlaybackService> serviceProvider;

  public PlaybackModule_ProvideMediaButtonReceiverComponentNameFactory(
      PlaybackModule module, Provider<PlaybackService> serviceProvider) {
    this.module = module;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ComponentName get() {
    return provideInstance(module, serviceProvider);
  }

  public static ComponentName provideInstance(
      PlaybackModule module, Provider<PlaybackService> serviceProvider) {
    return proxyProvideMediaButtonReceiverComponentName(module, serviceProvider.get());
  }

  public static PlaybackModule_ProvideMediaButtonReceiverComponentNameFactory create(
      PlaybackModule module, Provider<PlaybackService> serviceProvider) {
    return new PlaybackModule_ProvideMediaButtonReceiverComponentNameFactory(
        module, serviceProvider);
  }

  public static ComponentName proxyProvideMediaButtonReceiverComponentName(
      PlaybackModule instance, PlaybackService service) {
    return Preconditions.checkNotNull(
        instance.provideMediaButtonReceiverComponentName(service),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}