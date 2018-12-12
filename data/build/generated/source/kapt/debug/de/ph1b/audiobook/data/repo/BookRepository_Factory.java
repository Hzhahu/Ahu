// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.data.repo;

import dagger.internal.Factory;
import de.ph1b.audiobook.data.repo.internals.BookStorage;
import javax.inject.Provider;

public final class BookRepository_Factory implements Factory<BookRepository> {
  private final Provider<BookStorage> storageProvider;

  public BookRepository_Factory(Provider<BookStorage> storageProvider) {
    this.storageProvider = storageProvider;
  }

  @Override
  public BookRepository get() {
    return provideInstance(storageProvider);
  }

  public static BookRepository provideInstance(Provider<BookStorage> storageProvider) {
    return new BookRepository(storageProvider.get());
  }

  public static BookRepository_Factory create(Provider<BookStorage> storageProvider) {
    return new BookRepository_Factory(storageProvider);
  }

  public static BookRepository newBookRepository(BookStorage storage) {
    return new BookRepository(storage);
  }
}