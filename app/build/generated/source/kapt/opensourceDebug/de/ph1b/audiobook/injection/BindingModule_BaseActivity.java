package de.ph1b.audiobook.injection;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.BaseActivity;

@Module(subcomponents = BindingModule_BaseActivity.BaseActivitySubcomponent.class)
public abstract class BindingModule_BaseActivity {
  private BindingModule_BaseActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(BaseActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      BaseActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface BaseActivitySubcomponent extends AndroidInjector<BaseActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {}
  }
}
