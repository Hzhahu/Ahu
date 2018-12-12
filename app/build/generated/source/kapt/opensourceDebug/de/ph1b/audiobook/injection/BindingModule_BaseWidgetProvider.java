package de.ph1b.audiobook.injection;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import de.ph1b.audiobook.features.widget.BaseWidgetProvider;

@Module(subcomponents = BindingModule_BaseWidgetProvider.BaseWidgetProviderSubcomponent.class)
public abstract class BindingModule_BaseWidgetProvider {
  private BindingModule_BaseWidgetProvider() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(BaseWidgetProvider.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      BaseWidgetProviderSubcomponent.Builder builder);

  @Subcomponent
  public interface BaseWidgetProviderSubcomponent extends AndroidInjector<BaseWidgetProvider> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseWidgetProvider> {}
  }
}
