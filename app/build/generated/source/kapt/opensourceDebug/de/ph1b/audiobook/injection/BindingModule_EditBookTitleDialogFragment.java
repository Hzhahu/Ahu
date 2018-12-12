package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.bookOverview.EditBookTitleDialogFragment;

@Module(
  subcomponents =
      BindingModule_EditBookTitleDialogFragment.EditBookTitleDialogFragmentSubcomponent.class
)
public abstract class BindingModule_EditBookTitleDialogFragment {
  private BindingModule_EditBookTitleDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(EditBookTitleDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EditBookTitleDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface EditBookTitleDialogFragmentSubcomponent
      extends AndroidInjector<EditBookTitleDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EditBookTitleDialogFragment> {}
  }
}
