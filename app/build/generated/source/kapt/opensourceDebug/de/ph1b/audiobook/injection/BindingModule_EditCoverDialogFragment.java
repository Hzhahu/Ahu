package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.bookOverview.EditCoverDialogFragment;

@Module(
  subcomponents = BindingModule_EditCoverDialogFragment.EditCoverDialogFragmentSubcomponent.class
)
public abstract class BindingModule_EditCoverDialogFragment {
  private BindingModule_EditCoverDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(EditCoverDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EditCoverDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface EditCoverDialogFragmentSubcomponent
      extends AndroidInjector<EditCoverDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EditCoverDialogFragment> {}
  }
}
