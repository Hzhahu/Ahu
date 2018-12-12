package de.ph1b.audiobook.data;

import java.lang.System;

/**
 * * Represents a chapter in a book.
 */
@androidx.room.Entity(tableName = "chapters", indices = {@androidx.room.Index(value = {"bookId"})})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010\u001e\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\u0007H\u0016J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006,"}, d2 = {"Lde/ph1b/audiobook/data/Chapter;", "", "file", "Ljava/io/File;", "name", "", "duration", "", "fileLastModified", "", "marks", "Landroidx/collection/SparseArrayCompat;", "bookId", "Ljava/util/UUID;", "id", "(Ljava/io/File;Ljava/lang/String;IJLandroidx/collection/SparseArrayCompat;Ljava/util/UUID;J)V", "getBookId", "()Ljava/util/UUID;", "getDuration", "()I", "getFile", "()Ljava/io/File;", "getFileLastModified", "()J", "getId", "getMarks", "()Landroidx/collection/SparseArrayCompat;", "getName", "()Ljava/lang/String;", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "", "hashCode", "toString", "data_debug"})
public final class Chapter implements java.lang.Comparable<de.ph1b.audiobook.data.Chapter> {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "file")
    private final java.io.File file = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "duration")
    private final int duration = 0;
    @androidx.room.ColumnInfo(name = "fileLastModified")
    private final long fileLastModified = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "marks")
    private final androidx.collection.SparseArrayCompat<java.lang.String> marks = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "bookId")
    private final java.util.UUID bookId = null;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    private final long id = 0L;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Chapter other) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public final long getFileLastModified() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.collection.SparseArrayCompat<java.lang.String> getMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getBookId() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public Chapter(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int duration, long fileLastModified, @org.jetbrains.annotations.NotNull()
    androidx.collection.SparseArrayCompat<java.lang.String> marks, @org.jetbrains.annotations.NotNull()
    java.util.UUID bookId, long id) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.collection.SparseArrayCompat<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    /**
     * * Represents a chapter in a book.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Chapter copy(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int duration, long fileLastModified, @org.jetbrains.annotations.NotNull()
    androidx.collection.SparseArrayCompat<java.lang.String> marks, @org.jetbrains.annotations.NotNull()
    java.util.UUID bookId, long id) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}