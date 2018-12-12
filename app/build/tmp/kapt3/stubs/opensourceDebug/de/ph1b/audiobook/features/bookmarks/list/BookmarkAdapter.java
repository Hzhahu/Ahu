package de.ph1b.audiobook.features.bookmarks.list;

import java.lang.System;

/**
 * * Adapter for displaying a list of bookmarks.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bJ\"\u0010\u0010\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/list/BookmarkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lde/ph1b/audiobook/features/bookmarks/list/BookMarkHolder;", "listener", "Lde/ph1b/audiobook/features/bookmarks/list/BookmarkClickListener;", "(Lde/ph1b/audiobook/features/bookmarks/list/BookmarkClickListener;)V", "bookmarks", "Ljava/util/ArrayList;", "Lde/ph1b/audiobook/data/Bookmark;", "Lkotlin/collections/ArrayList;", "chapters", "Lde/ph1b/audiobook/data/Chapter;", "getItemCount", "", "indexOf", "bookmark", "newData", "", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_opensourceDebug"})
public final class BookmarkAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<de.ph1b.audiobook.features.bookmarks.list.BookMarkHolder> {
    private final java.util.ArrayList<de.ph1b.audiobook.data.Bookmark> bookmarks = null;
    private final java.util.ArrayList<de.ph1b.audiobook.data.Chapter> chapters = null;
    private final de.ph1b.audiobook.features.bookmarks.list.BookmarkClickListener listener = null;
    
    public final void newData(@org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Bookmark> bookmarks, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters) {
    }
    
    public final int indexOf(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.bookmarks.list.BookMarkHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookmarks.list.BookMarkHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BookmarkAdapter(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookmarks.list.BookmarkClickListener listener) {
        super();
    }
}