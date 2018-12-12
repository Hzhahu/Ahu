package de.ph1b.audiobook.data;

import java.lang.System;

@androidx.room.Entity(tableName = "bookSettings")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003J\t\u0010%\u001a\u00020\fH\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003JY\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0007H\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012\u00a8\u0006-"}, d2 = {"Lde/ph1b/audiobook/data/BookSettings;", "", "id", "Ljava/util/UUID;", "currentFile", "Ljava/io/File;", "positionInChapter", "", "playbackSpeed", "", "loudnessGain", "skipSilence", "", "active", "lastPlayedAtMillis", "", "(Ljava/util/UUID;Ljava/io/File;IFIZZJ)V", "getActive", "()Z", "getCurrentFile", "()Ljava/io/File;", "getId", "()Ljava/util/UUID;", "getLastPlayedAtMillis", "()J", "getLoudnessGain", "()I", "getPlaybackSpeed", "()F", "getPositionInChapter", "getSkipSilence", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "data_debug"})
public final class BookSettings {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "id")
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "currentFile")
    private final java.io.File currentFile = null;
    @androidx.room.ColumnInfo(name = "positionInChapter")
    private final int positionInChapter = 0;
    @androidx.room.ColumnInfo(name = "playbackSpeed")
    private final float playbackSpeed = 0.0F;
    @androidx.room.ColumnInfo(name = "loudnessGain")
    private final int loudnessGain = 0;
    @androidx.room.ColumnInfo(name = "skipSilence")
    private final boolean skipSilence = false;
    @androidx.room.ColumnInfo(name = "active")
    private final boolean active = false;
    @androidx.room.ColumnInfo(name = "lastPlayedAtMillis")
    private final long lastPlayedAtMillis = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getCurrentFile() {
        return null;
    }
    
    public final int getPositionInChapter() {
        return 0;
    }
    
    public final float getPlaybackSpeed() {
        return 0.0F;
    }
    
    public final int getLoudnessGain() {
        return 0;
    }
    
    public final boolean getSkipSilence() {
        return false;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final long getLastPlayedAtMillis() {
        return 0L;
    }
    
    public BookSettings(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.io.File currentFile, int positionInChapter, float playbackSpeed, int loudnessGain, boolean skipSilence, boolean active, long lastPlayedAtMillis) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookSettings copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.io.File currentFile, int positionInChapter, float playbackSpeed, int loudnessGain, boolean skipSilence, boolean active, long lastPlayedAtMillis) {
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
}