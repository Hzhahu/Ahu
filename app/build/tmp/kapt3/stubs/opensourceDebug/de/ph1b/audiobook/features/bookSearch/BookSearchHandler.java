package de.ph1b.audiobook.features.bookSearch;

import java.lang.System;

/**
 * * This class provides a single point of entry to find and play a book by a search query
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0082\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lde/ph1b/audiobook/features/bookSearch/BookSearchHandler;", "", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "player", "Lde/ph1b/audiobook/playback/PlayerController;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "(Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/playback/PlayerController;Lde/ph1b/audiobook/persistence/pref/Pref;)V", "findAndPlayFirstMatch", "", "selector", "Lkotlin/Function1;", "Lde/ph1b/audiobook/data/Book;", "handle", "", "search", "Lde/ph1b/audiobook/features/bookSearch/BookSearch;", "playAlbum", "playArtist", "playUnstructuredSearch", "query", "", "app_opensourceDebug"})
@dagger.Reusable()
public final class BookSearchHandler {
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.playback.PlayerController player = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    
    public final void handle(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookSearch.BookSearch search) {
    }
    
    private final void playAlbum(de.ph1b.audiobook.features.bookSearch.BookSearch search) {
    }
    
    private final void playUnstructuredSearch(java.lang.String query) {
    }
    
    private final void playArtist(de.ph1b.audiobook.features.bookSearch.BookSearch search) {
    }
    
    private final boolean findAndPlayFirstMatch(kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.Book, java.lang.Boolean> selector) {
        return false;
    }
    
    @javax.inject.Inject()
    public BookSearchHandler(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController player, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref) {
        super();
    }
}