// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import androidx.fragment.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import de.ph1b.audiobook.features.BookAdder;
import de.ph1b.audiobook.features.widget.TriggerWidgetOnChange;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver;
import de.ph1b.audiobook.uitools.ThemeUtil;
import javax.inject.Provider;

public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<BookAdder> bookAdderProvider;

  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider;

  private final Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<TriggerWidgetOnChange> triggerWidgetOnChangeProvider;

  private final Provider<AndroidAutoConnectedReceiver> autoConnectedReceiverProvider;

  private final Provider<Pref<ThemeUtil.Theme>> themePrefProvider;

  public App_MembersInjector(
      Provider<BookAdder> bookAdderProvider,
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider,
      Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider,
      Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<TriggerWidgetOnChange> triggerWidgetOnChangeProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectedReceiverProvider,
      Provider<Pref<ThemeUtil.Theme>> themePrefProvider) {
    this.bookAdderProvider = bookAdderProvider;
    this.activityInjectorProvider = activityInjectorProvider;
    this.serviceInjectorProvider = serviceInjectorProvider;
    this.broadcastInjectorProvider = broadcastInjectorProvider;
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.triggerWidgetOnChangeProvider = triggerWidgetOnChangeProvider;
    this.autoConnectedReceiverProvider = autoConnectedReceiverProvider;
    this.themePrefProvider = themePrefProvider;
  }

  public static MembersInjector<App> create(
      Provider<BookAdder> bookAdderProvider,
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider,
      Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider,
      Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<TriggerWidgetOnChange> triggerWidgetOnChangeProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectedReceiverProvider,
      Provider<Pref<ThemeUtil.Theme>> themePrefProvider) {
    return new App_MembersInjector(
        bookAdderProvider,
        activityInjectorProvider,
        serviceInjectorProvider,
        broadcastInjectorProvider,
        supportFragmentInjectorProvider,
        triggerWidgetOnChangeProvider,
        autoConnectedReceiverProvider,
        themePrefProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectBookAdder(instance, bookAdderProvider.get());
    injectActivityInjector(instance, activityInjectorProvider.get());
    injectServiceInjector(instance, serviceInjectorProvider.get());
    injectBroadcastInjector(instance, broadcastInjectorProvider.get());
    injectSupportFragmentInjector(instance, supportFragmentInjectorProvider.get());
    injectTriggerWidgetOnChange(instance, triggerWidgetOnChangeProvider.get());
    injectAutoConnectedReceiver(instance, autoConnectedReceiverProvider.get());
    injectThemePref(instance, themePrefProvider.get());
  }

  public static void injectBookAdder(App instance, BookAdder bookAdder) {
    instance.bookAdder = bookAdder;
  }

  public static void injectActivityInjector(
      App instance, DispatchingAndroidInjector<Activity> activityInjector) {
    instance.activityInjector = activityInjector;
  }

  public static void injectServiceInjector(
      App instance, DispatchingAndroidInjector<Service> serviceInjector) {
    instance.serviceInjector = serviceInjector;
  }

  public static void injectBroadcastInjector(
      App instance, DispatchingAndroidInjector<BroadcastReceiver> broadcastInjector) {
    instance.broadcastInjector = broadcastInjector;
  }

  public static void injectSupportFragmentInjector(
      App instance, DispatchingAndroidInjector<Fragment> supportFragmentInjector) {
    instance.supportFragmentInjector = supportFragmentInjector;
  }

  public static void injectTriggerWidgetOnChange(
      App instance, TriggerWidgetOnChange triggerWidgetOnChange) {
    instance.triggerWidgetOnChange = triggerWidgetOnChange;
  }

  public static void injectAutoConnectedReceiver(
      App instance, AndroidAutoConnectedReceiver autoConnectedReceiver) {
    instance.autoConnectedReceiver = autoConnectedReceiver;
  }

  public static void injectThemePref(App instance, Pref<ThemeUtil.Theme> themePref) {
    instance.themePref = themePref;
  }
}
