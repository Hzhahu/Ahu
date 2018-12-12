package de.ph1b.audiobook.data.repo;

import java.lang.System;

/**
 * * Provides access to bookmarks.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/data/repo/BookmarkRepo;", "", "dao", "Lde/ph1b/audiobook/data/repo/internals/BookmarkDao;", "(Lde/ph1b/audiobook/data/repo/internals/BookmarkDao;)V", "addBookmark", "Lde/ph1b/audiobook/data/Bookmark;", "bookmark", "(Lde/ph1b/audiobook/data/Bookmark;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "addBookmarkAtBookPosition", "book", "Lde/ph1b/audiobook/data/Book;", "title", "", "(Lde/ph1b/audiobook/data/Book;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "bookmarks", "", "(Lde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "deleteBookmark", "", "id", "", "(JLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "data_debug"})
@javax.inject.Singleton()
public final class BookmarkRepo {
    private final de.ph1b.audiobook.data.repo.internals.BookmarkDao dao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteBookmark(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super de.ph1b.audiobook.data.Bookmark> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBookmarkAtBookPosition(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super de.ph1b.audiobook.data.Bookmark> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object bookmarks(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.util.List<de.ph1b.audiobook.data.Bookmark>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookmarkRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.BookmarkDao dao) {
        super();
    }
}