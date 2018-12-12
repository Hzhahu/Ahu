package de.ph1b.audiobook.features.bookmarks;

import java.lang.System;

/**
 * * Dialog for creating a bookmark
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u00011B\r\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001bH\u0016J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J$\u0010&\u001a\u00020\u00152\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00180(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0(H\u0016J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010/\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00062"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/BookmarkController;", "Lde/ph1b/audiobook/mvp/MvpController;", "Lde/ph1b/audiobook/features/bookmarks/BookmarkView;", "Lde/ph1b/audiobook/features/bookmarks/BookmarkPresenter;", "Lde/ph1b/audiobook/features/bookmarks/list/BookmarkClickListener;", "Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog$Callback;", "Lde/ph1b/audiobook/features/bookmarks/dialogs/DeleteBookmarkDialog$Callback;", "Lde/ph1b/audiobook/features/bookmarks/dialogs/EditBookmarkDialog$Callback;", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "adapter", "Lde/ph1b/audiobook/features/bookmarks/list/BookmarkAdapter;", "bookId", "Ljava/util/UUID;", "layoutRes", "", "getLayoutRes", "()I", "createPresenter", "finish", "", "onBookmarkClicked", "bookmark", "Lde/ph1b/audiobook/data/Bookmark;", "onBookmarkNameChosen", "name", "", "onDeleteBookmarkConfirmed", "id", "", "onDestroyView", "onEditBookmark", "title", "onOptionsMenuClicked", "v", "Landroid/view/View;", "onViewCreated", "render", "bookmarks", "", "chapters", "Lde/ph1b/audiobook/data/Chapter;", "setupList", "setupToolbar", "showAddBookmarkDialog", "showBookmarkAdded", "showDeleteBookmarkDialog", "showEditBookmarkDialog", "Companion", "app_opensourceDebug"})
public final class BookmarkController extends de.ph1b.audiobook.mvp.MvpController<de.ph1b.audiobook.features.bookmarks.BookmarkView, de.ph1b.audiobook.features.bookmarks.BookmarkPresenter> implements de.ph1b.audiobook.features.bookmarks.BookmarkView, de.ph1b.audiobook.features.bookmarks.list.BookmarkClickListener, de.ph1b.audiobook.features.bookmarks.dialogs.AddBookmarkDialog.Callback, de.ph1b.audiobook.features.bookmarks.dialogs.DeleteBookmarkDialog.Callback, de.ph1b.audiobook.features.bookmarks.dialogs.EditBookmarkDialog.Callback {
    private final java.util.UUID bookId = null;
    private final de.ph1b.audiobook.features.bookmarks.list.BookmarkAdapter adapter = null;
    private final int layoutRes = 2131492904;
    private static final java.lang.String NI_BOOK_ID = "ni#bookId";
    public static final de.ph1b.audiobook.features.bookmarks.BookmarkController.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.bookmarks.BookmarkPresenter createPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Bookmark> bookmarks, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters) {
    }
    
    @java.lang.Override()
    public void showBookmarkAdded(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark) {
    }
    
    @java.lang.Override()
    public void onDeleteBookmarkConfirmed(long id) {
    }
    
    @java.lang.Override()
    public void onBookmarkClicked(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark) {
    }
    
    @java.lang.Override()
    public void onEditBookmark(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void onBookmarkNameChosen(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    public void onViewCreated() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupList() {
    }
    
    @java.lang.Override()
    public void onOptionsMenuClicked(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void showEditBookmarkDialog(de.ph1b.audiobook.data.Bookmark bookmark) {
    }
    
    private final void showAddBookmarkDialog() {
    }
    
    private final void showDeleteBookmarkDialog(de.ph1b.audiobook.data.Bookmark bookmark) {
    }
    
    public BookmarkController(@org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/BookmarkController$Companion;", "", "()V", "NI_BOOK_ID", "", "newInstance", "Lde/ph1b/audiobook/features/bookmarks/BookmarkController;", "bookId", "Ljava/util/UUID;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final de.ph1b.audiobook.features.bookmarks.BookmarkController newInstance(@org.jetbrains.annotations.NotNull()
        java.util.UUID bookId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}