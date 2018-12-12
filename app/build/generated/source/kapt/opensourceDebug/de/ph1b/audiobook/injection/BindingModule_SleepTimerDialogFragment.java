package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.bookPlaying.SleepTimerDialogFragment;

@Module(
  subcomponents = BindingModule_SleepTimerDialogFragment.SleepTimerDialogFragmentSubcomponent.class
)
public abstract class BindingModule_SleepTimerDialogFragment {
  private BindingModule_SleepTimerDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SleepTimerDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SleepTimerDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SleepTimerDialogFragmentSubcomponent
      extends AndroidInjector<SleepTimerDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SleepTimerDialogFragment> {}
  }
}
