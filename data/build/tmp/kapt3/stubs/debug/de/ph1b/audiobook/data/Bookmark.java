package de.ph1b.audiobook.data;

import java.lang.System;

/**
 * * Represents a bookmark in the book.
 */
@androidx.room.Entity(tableName = "bookmark")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lde/ph1b/audiobook/data/Bookmark;", "", "mediaFile", "Ljava/io/File;", "title", "", "time", "", "id", "", "(Ljava/io/File;Ljava/lang/String;IJ)V", "getId", "()J", "getMediaFile", "()Ljava/io/File;", "getTime", "()I", "getTitle", "()Ljava/lang/String;", "compareTo", "other", "component1", "component2", "component3", "component4", "copy", "equals", "", "", "hashCode", "toString", "Companion", "data_debug"})
public final class Bookmark implements java.lang.Comparable<de.ph1b.audiobook.data.Bookmark> {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "file")
    private final java.io.File mediaFile = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "time")
    private final int time = 0;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    private final long id = 0L;
    public static final long ID_UNKNOWN = 0L;
    public static final de.ph1b.audiobook.data.Bookmark.Companion Companion = null;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Bookmark other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getMediaFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getTime() {
        return 0;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public Bookmark(@org.jetbrains.annotations.NotNull()
    java.io.File mediaFile, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int time, long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final long component4() {
        return 0L;
    }
    
    /**
     * * Represents a bookmark in the book.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Bookmark copy(@org.jetbrains.annotations.NotNull()
    java.io.File mediaFile, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int time, long id) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lde/ph1b/audiobook/data/Bookmark$Companion;", "", "()V", "ID_UNKNOWN", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}