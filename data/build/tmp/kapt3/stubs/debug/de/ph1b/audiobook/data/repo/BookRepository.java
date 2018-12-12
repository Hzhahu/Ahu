package de.ph1b.audiobook.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\"J\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070$0\"2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(J \u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0002J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u001f\u0010+\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0019\u00100\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0011\u00101\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0019\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\tR!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0018\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u00064"}, d2 = {"Lde/ph1b/audiobook/data/repo/BookRepository;", "", "storage", "Lde/ph1b/audiobook/data/repo/internals/BookStorage;", "(Lde/ph1b/audiobook/data/repo/internals/BookStorage;)V", "active", "", "Lde/ph1b/audiobook/data/Book;", "getActive", "()Ljava/util/List;", "active$delegate", "Lkotlin/Lazy;", "activeBooks", "", "getActiveBooks", "activeBooksSubject", "Lio/reactivex/subjects/BehaviorSubject;", "getActiveBooksSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "activeBooksSubject$delegate", "allBooks", "getAllBooks", "allBooks$delegate", "orphaned", "getOrphaned", "orphaned$delegate", "addBook", "", "book", "(Lde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "bookById", "id", "Ljava/util/UUID;", "booksStream", "Lio/reactivex/Observable;", "byId", "Lde/ph1b/audiobook/common/Optional;", "chapterByFile", "Lde/ph1b/audiobook/data/Chapter;", "file", "Ljava/io/File;", "books", "getOrphanedBooks", "hideBook", "toDelete", "(Ljava/util/List;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "markBookAsPlayedNow", "(Ljava/util/UUID;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "revealBook", "sortBooksAndNotifySubject", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "updateBook", "data_debug"})
@javax.inject.Singleton()
public final class BookRepository {
    private final kotlin.Lazy allBooks$delegate = null;
    private final kotlin.Lazy active$delegate = null;
    private final kotlin.Lazy orphaned$delegate = null;
    private final kotlin.Lazy activeBooksSubject$delegate = null;
    private final de.ph1b.audiobook.data.repo.internals.BookStorage storage = null;
    
    private final java.util.List<de.ph1b.audiobook.data.Book> getAllBooks() {
        return null;
    }
    
    private final java.util.List<de.ph1b.audiobook.data.Book> getActive() {
        return null;
    }
    
    private final java.util.List<de.ph1b.audiobook.data.Book> getOrphaned() {
        return null;
    }
    
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<de.ph1b.audiobook.data.Book>> getActiveBooksSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<de.ph1b.audiobook.data.Book>> booksStream() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<de.ph1b.audiobook.common.Optional<de.ph1b.audiobook.data.Book>> byId(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBook(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.ph1b.audiobook.data.Book> getActiveBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.ph1b.audiobook.data.Book bookById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.ph1b.audiobook.data.Book> getOrphanedBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateBook(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markBookAsPlayedNow(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hideBook(@org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Book> toDelete, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object revealBook(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.ph1b.audiobook.data.Chapter chapterByFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    private final de.ph1b.audiobook.data.Chapter chapterByFile(java.io.File file, java.util.List<de.ph1b.audiobook.data.Book> books) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookRepository(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.BookStorage storage) {
        super();
    }
}