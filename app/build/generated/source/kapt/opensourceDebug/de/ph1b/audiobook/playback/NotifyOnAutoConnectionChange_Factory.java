// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import dagger.internal.Factory;
import de.ph1b.audiobook.data.repo.BookRepository;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.utils.ChangeNotifier;
import java.util.UUID;
import javax.inject.Provider;

public final class NotifyOnAutoConnectionChange_Factory
    implements Factory<NotifyOnAutoConnectionChange> {
  private final Provider<ChangeNotifier> changeNotifierProvider;

  private final Provider<BookRepository> repoProvider;

  private final Provider<Pref<UUID>> currentBookIdPrefProvider;

  private final Provider<AndroidAutoConnectedReceiver> autoConnectionProvider;

  public NotifyOnAutoConnectionChange_Factory(
      Provider<ChangeNotifier> changeNotifierProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectionProvider) {
    this.changeNotifierProvider = changeNotifierProvider;
    this.repoProvider = repoProvider;
    this.currentBookIdPrefProvider = currentBookIdPrefProvider;
    this.autoConnectionProvider = autoConnectionProvider;
  }

  @Override
  public NotifyOnAutoConnectionChange get() {
    return provideInstance(
        changeNotifierProvider, repoProvider, currentBookIdPrefProvider, autoConnectionProvider);
  }

  public static NotifyOnAutoConnectionChange provideInstance(
      Provider<ChangeNotifier> changeNotifierProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectionProvider) {
    return new NotifyOnAutoConnectionChange(
        changeNotifierProvider.get(),
        repoProvider.get(),
        currentBookIdPrefProvider.get(),
        autoConnectionProvider.get());
  }

  public static NotifyOnAutoConnectionChange_Factory create(
      Provider<ChangeNotifier> changeNotifierProvider,
      Provider<BookRepository> repoProvider,
      Provider<Pref<UUID>> currentBookIdPrefProvider,
      Provider<AndroidAutoConnectedReceiver> autoConnectionProvider) {
    return new NotifyOnAutoConnectionChange_Factory(
        changeNotifierProvider, repoProvider, currentBookIdPrefProvider, autoConnectionProvider);
  }

  public static NotifyOnAutoConnectionChange newNotifyOnAutoConnectionChange(
      ChangeNotifier changeNotifier,
      BookRepository repo,
      Pref<UUID> currentBookIdPref,
      AndroidAutoConnectedReceiver autoConnection) {
    return new NotifyOnAutoConnectionChange(
        changeNotifier, repo, currentBookIdPref, autoConnection);
  }
}
