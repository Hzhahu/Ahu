package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.settings.dialogs.ThemePickerDialogFragment;

@Module(
  subcomponents =
      BindingModule_ThemePickerDialogFragment.ThemePickerDialogFragmentSubcomponent.class
)
public abstract class BindingModule_ThemePickerDialogFragment {
  private BindingModule_ThemePickerDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ThemePickerDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ThemePickerDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ThemePickerDialogFragmentSubcomponent
      extends AndroidInjector<ThemePickerDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ThemePickerDialogFragment> {}
  }
}
