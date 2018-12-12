package de.ph1b.audiobook.injection;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.folderChooser.FolderChooserActivity;

@Module(subcomponents = BindingModule_FolderChooserActivity.FolderChooserActivitySubcomponent.class)
public abstract class BindingModule_FolderChooserActivity {
  private BindingModule_FolderChooserActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(FolderChooserActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      FolderChooserActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface FolderChooserActivitySubcomponent
      extends AndroidInjector<FolderChooserActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FolderChooserActivity> {}
  }
}
