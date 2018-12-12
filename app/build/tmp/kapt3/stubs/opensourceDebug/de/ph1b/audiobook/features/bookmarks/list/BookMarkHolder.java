package de.ph1b.audiobook.features.bookmarks.list;

import java.lang.System;

/**
 * * ViewHolder for displaying a Bookmark
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/list/BookMarkHolder;", "Lde/ph1b/audiobook/uitools/ExtensionsHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lde/ph1b/audiobook/features/bookmarks/list/BookmarkClickListener;", "(Landroid/view/ViewGroup;Lde/ph1b/audiobook/features/bookmarks/list/BookmarkClickListener;)V", "<set-?>", "Lde/ph1b/audiobook/data/Bookmark;", "boundBookmark", "getBoundBookmark", "()Lde/ph1b/audiobook/data/Bookmark;", "setBoundBookmark", "(Lde/ph1b/audiobook/data/Bookmark;)V", "bind", "", "bookmark", "chapters", "", "Lde/ph1b/audiobook/data/Chapter;", "formatTime", "", "ms", "", "app_opensourceDebug"})
public final class BookMarkHolder extends de.ph1b.audiobook.uitools.ExtensionsHolder {
    @org.jetbrains.annotations.Nullable()
    private de.ph1b.audiobook.data.Bookmark boundBookmark;
    private final de.ph1b.audiobook.features.bookmarks.list.BookmarkClickListener listener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final de.ph1b.audiobook.data.Bookmark getBoundBookmark() {
        return null;
    }
    
    private final void setBoundBookmark(de.ph1b.audiobook.data.Bookmark p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters) {
    }
    
    private final java.lang.String formatTime(int ms) {
        return null;
    }
    
    public BookMarkHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookmarks.list.BookmarkClickListener listener) {
        super(null, 0);
    }
}