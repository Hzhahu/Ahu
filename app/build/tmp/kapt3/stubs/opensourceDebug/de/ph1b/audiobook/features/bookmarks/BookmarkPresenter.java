package de.ph1b.audiobook.features.bookmarks;

import java.lang.System;

/**
 * * Presenter for the bookmark MVP
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dJ\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u001bH\u0002J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0015j\b\u0012\u0004\u0012\u00020\u0019`\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/BookmarkPresenter;", "Lde/ph1b/audiobook/mvp/Presenter;", "Lde/ph1b/audiobook/features/bookmarks/BookmarkView;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "bookmarkRepo", "Lde/ph1b/audiobook/data/repo/BookmarkRepo;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "(Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/data/repo/BookmarkRepo;Lde/ph1b/audiobook/playback/PlayStateManager;Lde/ph1b/audiobook/playback/PlayerController;)V", "bookId", "getBookId", "()Ljava/util/UUID;", "setBookId", "(Ljava/util/UUID;)V", "bookmarks", "Ljava/util/ArrayList;", "Lde/ph1b/audiobook/data/Bookmark;", "Lkotlin/collections/ArrayList;", "chapters", "Lde/ph1b/audiobook/data/Chapter;", "addBookmark", "", "name", "", "deleteBookmark", "id", "", "editBookmark", "newTitle", "onAttach", "view", "renderView", "selectBookmark", "app_opensourceDebug"})
public final class BookmarkPresenter extends de.ph1b.audiobook.mvp.Presenter<de.ph1b.audiobook.features.bookmarks.BookmarkView> {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID bookId;
    private final java.util.ArrayList<de.ph1b.audiobook.data.Bookmark> bookmarks = null;
    private final java.util.ArrayList<de.ph1b.audiobook.data.Chapter> chapters = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.data.repo.BookmarkRepo bookmarkRepo = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final de.ph1b.audiobook.playback.PlayerController playerController = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getBookId() {
        return null;
    }
    
    public final void setBookId(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookmarks.BookmarkView view) {
    }
    
    public final void deleteBookmark(long id) {
    }
    
    public final void selectBookmark(long id) {
    }
    
    public final void editBookmark(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle) {
    }
    
    public final void addBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    private final void renderView() {
    }
    
    @javax.inject.Inject()
    public BookmarkPresenter(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookmarkRepo bookmarkRepo, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController playerController) {
        super();
    }
}