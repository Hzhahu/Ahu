package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.settings.dialogs.AutoRewindDialogFragment;

@Module(
  subcomponents = BindingModule_AutoRewindDialogFragment.AutoRewindDialogFragmentSubcomponent.class
)
public abstract class BindingModule_AutoRewindDialogFragment {
  private BindingModule_AutoRewindDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(AutoRewindDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AutoRewindDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AutoRewindDialogFragmentSubcomponent
      extends AndroidInjector<AutoRewindDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AutoRewindDialogFragment> {}
  }
}
