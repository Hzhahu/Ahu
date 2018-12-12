package de.ph1b.audiobook.injection;

import android.app.Service;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ServiceKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.playback.PlaybackService;

@Module(subcomponents = BindingModule_PlaybackService.PlaybackServiceSubcomponent.class)
public abstract class BindingModule_PlaybackService {
  private BindingModule_PlaybackService() {}

  @Binds
  @IntoMap
  @ServiceKey(PlaybackService.class)
  abstract AndroidInjector.Factory<? extends Service> bindAndroidInjectorFactory(
      PlaybackServiceSubcomponent.Builder builder);

  @Subcomponent(modules = PlaybackModule.class)
  @PerService
  public interface PlaybackServiceSubcomponent extends AndroidInjector<PlaybackService> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaybackService> {}
  }
}
