package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet;

@Module(subcomponents = BindingModule_EditBookBottomSheet.EditBookBottomSheetSubcomponent.class)
public abstract class BindingModule_EditBookBottomSheet {
  private BindingModule_EditBookBottomSheet() {}

  @Binds
  @IntoMap
  @FragmentKey(EditBookBottomSheet.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EditBookBottomSheetSubcomponent.Builder builder);

  @Subcomponent
  public interface EditBookBottomSheetSubcomponent extends AndroidInjector<EditBookBottomSheet> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EditBookBottomSheet> {}
  }
}
