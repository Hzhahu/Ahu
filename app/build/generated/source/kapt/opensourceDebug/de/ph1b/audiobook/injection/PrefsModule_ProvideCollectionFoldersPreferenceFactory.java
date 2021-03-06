// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.injection;

import com.f2prateek.rx.preferences2.RxSharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.ph1b.audiobook.persistence.pref.Pref;
import java.util.Set;
import javax.inject.Provider;

public final class PrefsModule_ProvideCollectionFoldersPreferenceFactory
    implements Factory<Pref<Set<String>>> {
  private final PrefsModule module;

  private final Provider<RxSharedPreferences> prefsProvider;

  public PrefsModule_ProvideCollectionFoldersPreferenceFactory(
      PrefsModule module, Provider<RxSharedPreferences> prefsProvider) {
    this.module = module;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public Pref<Set<String>> get() {
    return provideInstance(module, prefsProvider);
  }

  public static Pref<Set<String>> provideInstance(
      PrefsModule module, Provider<RxSharedPreferences> prefsProvider) {
    return proxyProvideCollectionFoldersPreference(module, prefsProvider.get());
  }

  public static PrefsModule_ProvideCollectionFoldersPreferenceFactory create(
      PrefsModule module, Provider<RxSharedPreferences> prefsProvider) {
    return new PrefsModule_ProvideCollectionFoldersPreferenceFactory(module, prefsProvider);
  }

  public static Pref<Set<String>> proxyProvideCollectionFoldersPreference(
      PrefsModule instance, RxSharedPreferences prefs) {
    return Preconditions.checkNotNull(
        instance.provideCollectionFoldersPreference(prefs),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
