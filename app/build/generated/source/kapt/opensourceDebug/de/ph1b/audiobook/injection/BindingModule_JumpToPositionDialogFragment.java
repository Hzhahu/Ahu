package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.bookPlaying.JumpToPositionDialogFragment;

@Module(
  subcomponents =
      BindingModule_JumpToPositionDialogFragment.JumpToPositionDialogFragmentSubcomponent.class
)
public abstract class BindingModule_JumpToPositionDialogFragment {
  private BindingModule_JumpToPositionDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(JumpToPositionDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      JumpToPositionDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface JumpToPositionDialogFragmentSubcomponent
      extends AndroidInjector<JumpToPositionDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<JumpToPositionDialogFragment> {}
  }
}
