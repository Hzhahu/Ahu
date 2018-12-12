// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import com.f2prateek.rx.preferences2.RxSharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.ph1b.audiobook.persistence.pref.Pref;
import javax.inject.Provider;

public final class PrefsModule_ProvideAutoRewindAmountPreferenceFactory
    implements Factory<Pref<Integer>> {
  private final PrefsModule module;

  private final Provider<RxSharedPreferences> prefsProvider;

  public PrefsModule_ProvideAutoRewindAmountPreferenceFactory(
      PrefsModule module, Provider<RxSharedPreferences> prefsProvider) {
    this.module = module;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public Pref<Integer> get() {
    return provideInstance(module, prefsProvider);
  }

  public static Pref<Integer> provideInstance(
      PrefsModule module, Provider<RxSharedPreferences> prefsProvider) {
    return proxyProvideAutoRewindAmountPreference(module, prefsProvider.get());
  }

  public static PrefsModule_ProvideAutoRewindAmountPreferenceFactory create(
      PrefsModule module, Provider<RxSharedPreferences> prefsProvider) {
    return new PrefsModule_ProvideAutoRewindAmountPreferenceFactory(module, prefsProvider);
  }

  public static Pref<Integer> proxyProvideAutoRewindAmountPreference(
      PrefsModule instance, RxSharedPreferences prefs) {
    return Preconditions.checkNotNull(
        instance.provideAutoRewindAmountPreference(prefs),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
