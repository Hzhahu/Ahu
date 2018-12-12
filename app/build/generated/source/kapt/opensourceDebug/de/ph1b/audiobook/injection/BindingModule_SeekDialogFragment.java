package de.ph1b.audiobook.injection;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.bookPlaying.SeekDialogFragment;

@Module(subcomponents = BindingModule_SeekDialogFragment.SeekDialogFragmentSubcomponent.class)
public abstract class BindingModule_SeekDialogFragment {
  private BindingModule_SeekDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SeekDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SeekDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SeekDialogFragmentSubcomponent extends AndroidInjector<SeekDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SeekDialogFragment> {}
  }
}
