package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.settings.dialogs.PlaybackSpeedDialogFragment;

@Module(
  subcomponents =
      BindingModule_PlaybackSpeedDialogFragment.PlaybackSpeedDialogFragmentSubcomponent.class
)
public abstract class BindingModule_PlaybackSpeedDialogFragment {
  private BindingModule_PlaybackSpeedDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaybackSpeedDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaybackSpeedDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PlaybackSpeedDialogFragmentSubcomponent
      extends AndroidInjector<PlaybackSpeedDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaybackSpeedDialogFragment> {}
  }
}
