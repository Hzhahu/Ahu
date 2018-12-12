// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.settings.dialogs;

import dagger.MembersInjector;
import de.ph1b.audiobook.persistence.pref.Pref;
import javax.inject.Provider;

public final class AutoRewindDialogFragment_MembersInjector
    implements MembersInjector<AutoRewindDialogFragment> {
  private final Provider<Pref<Integer>> autoRewindAmountPrefProvider;

  public AutoRewindDialogFragment_MembersInjector(
      Provider<Pref<Integer>> autoRewindAmountPrefProvider) {
    this.autoRewindAmountPrefProvider = autoRewindAmountPrefProvider;
  }

  public static MembersInjector<AutoRewindDialogFragment> create(
      Provider<Pref<Integer>> autoRewindAmountPrefProvider) {
    return new AutoRewindDialogFragment_MembersInjector(autoRewindAmountPrefProvider);
  }

  @Override
  public void injectMembers(AutoRewindDialogFragment instance) {
    injectAutoRewindAmountPref(instance, autoRewindAmountPrefProvider.get());
  }

  public static void injectAutoRewindAmountPref(
      AutoRewindDialogFragment instance, Pref<Integer> autoRewindAmountPref) {
    instance.autoRewindAmountPref = autoRewindAmountPref;
  }
}