package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t\u00a2\u0006\u0002\b\n0\u0007H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\'\u00a8\u0006\u000e"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/BookmarkDao;", "", "addBookmark", "", "bookmark", "Lde/ph1b/audiobook/data/Bookmark;", "allForFiles", "", "files", "Ljava/io/File;", "Lkotlin/jvm/JvmSuppressWildcards;", "deleteBookmark", "", "id", "data_debug"})
public abstract interface BookmarkDao {
    
    @androidx.room.Query(value = "DELETE FROM bookmark WHERE id = :id")
    public abstract void deleteBookmark(long id);
    
    @androidx.room.Insert()
    public abstract long addBookmark(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark bookmark);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookmark WHERE file IN(:files)")
    public abstract java.util.List<de.ph1b.audiobook.data.Bookmark> allForFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<java.io.File> files);
}