// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.bookOverview;

import dagger.MembersInjector;
import de.ph1b.audiobook.data.repo.BookRepository;
import javax.inject.Provider;

public final class EditBookBottomSheet_MembersInjector
    implements MembersInjector<EditBookBottomSheet> {
  private final Provider<BookRepository> repoProvider;

  public EditBookBottomSheet_MembersInjector(Provider<BookRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  public static MembersInjector<EditBookBottomSheet> create(Provider<BookRepository> repoProvider) {
    return new EditBookBottomSheet_MembersInjector(repoProvider);
  }

  @Override
  public void injectMembers(EditBookBottomSheet instance) {
    injectRepo(instance, repoProvider.get());
  }

  public static void injectRepo(EditBookBottomSheet instance, BookRepository repo) {
    instance.repo = repo;
  }
}
