package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

/**
 * * Provides access to the persistent storage for bookmarks.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019H\u0082\b\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/BookStorage;", "", "chapterDao", "Lde/ph1b/audiobook/data/repo/internals/ChapterDao;", "metaDataDao", "Lde/ph1b/audiobook/data/repo/internals/BookMetaDataDao;", "bookSettingsDao", "Lde/ph1b/audiobook/data/repo/internals/BookSettingsDao;", "appDb", "Lde/ph1b/audiobook/data/repo/internals/AppDb;", "(Lde/ph1b/audiobook/data/repo/internals/ChapterDao;Lde/ph1b/audiobook/data/repo/internals/BookMetaDataDao;Lde/ph1b/audiobook/data/repo/internals/BookSettingsDao;Lde/ph1b/audiobook/data/repo/internals/AppDb;)V", "addOrUpdate", "", "book", "Lde/ph1b/audiobook/data/Book;", "books", "", "hideBook", "bookId", "Ljava/util/UUID;", "revealBook", "transaction", "T", "Landroidx/room/RoomDatabase;", "action", "Lkotlin/Function0;", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "data_debug"})
public final class BookStorage {
    private final de.ph1b.audiobook.data.repo.internals.ChapterDao chapterDao = null;
    private final de.ph1b.audiobook.data.repo.internals.BookMetaDataDao metaDataDao = null;
    private final de.ph1b.audiobook.data.repo.internals.BookSettingsDao bookSettingsDao = null;
    private final de.ph1b.audiobook.data.repo.internals.AppDb appDb = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.ph1b.audiobook.data.Book> books() {
        return null;
    }
    
    public final void revealBook(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
    }
    
    public final void hideBook(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
    }
    
    public final void addOrUpdate(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    private final <T extends java.lang.Object>T transaction(@org.jetbrains.annotations.NotNull()
    androidx.room.RoomDatabase $receiver, kotlin.jvm.functions.Function0<? extends T> action) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookStorage(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.ChapterDao chapterDao, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.BookMetaDataDao metaDataDao, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.BookSettingsDao bookSettingsDao, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.AppDb appDb) {
        super();
    }
}