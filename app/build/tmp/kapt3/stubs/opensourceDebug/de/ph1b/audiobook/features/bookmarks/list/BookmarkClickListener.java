package de.ph1b.audiobook.features.bookmarks.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/list/BookmarkClickListener;", "", "onBookmarkClicked", "", "bookmark", "Lde/ph1b/audiobook/data/Bookmark;", "onOptionsMenuClicked", "v", "Landroid/view/View;", "app_opensourceDebug"})
public abstract interface BookmarkClickListener {
    
    public abstract void onOptionsMenuClicked(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    android.view.View v);
    
    public abstract void onBookmarkClicked(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark);
}