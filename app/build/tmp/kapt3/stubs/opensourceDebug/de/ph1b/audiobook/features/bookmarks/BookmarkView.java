package de.ph1b.audiobook.features.bookmarks;

import java.lang.System;

/**
 * * View of the bookmarks
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/BookmarkView;", "", "finish", "", "render", "bookmarks", "", "Lde/ph1b/audiobook/data/Bookmark;", "chapters", "Lde/ph1b/audiobook/data/Chapter;", "showBookmarkAdded", "bookmark", "app_opensourceDebug"})
public abstract interface BookmarkView {
    
    public abstract void render(@org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Bookmark> bookmarks, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters);
    
    public abstract void showBookmarkAdded(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark);
    
    public abstract void finish();
}