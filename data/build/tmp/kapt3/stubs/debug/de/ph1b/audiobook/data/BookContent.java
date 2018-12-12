package de.ph1b.audiobook.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J-\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0010H\u00d6\u0001J\t\u0010;\u001a\u00020<H\u00d6\u0001J\"\u0010=\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0?\u00a2\u0006\u0002\b@H\u0086\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010(\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0012R\u0011\u0010*\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0012R\u0013\u0010,\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u000201\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u0006A"}, d2 = {"Lde/ph1b/audiobook/data/BookContent;", "", "id", "Ljava/util/UUID;", "chapters", "", "Lde/ph1b/audiobook/data/Chapter;", "settings", "Lde/ph1b/audiobook/data/BookSettings;", "(Ljava/util/UUID;Ljava/util/List;Lde/ph1b/audiobook/data/BookSettings;)V", "getChapters", "()Ljava/util/List;", "currentChapter", "getCurrentChapter", "()Lde/ph1b/audiobook/data/Chapter;", "currentChapterIndex", "", "getCurrentChapterIndex", "()I", "currentFile", "Ljava/io/File;", "getCurrentFile", "()Ljava/io/File;", "duration", "getDuration", "getId", "()Ljava/util/UUID;", "loudnessGain", "getLoudnessGain", "nextChapter", "getNextChapter", "nextChapterMarkPosition", "getNextChapterMarkPosition", "()Ljava/lang/Integer;", "nextChapterMarkPosition$delegate", "Lkotlin/Lazy;", "playbackSpeed", "", "getPlaybackSpeed", "()F", "position", "getPosition", "positionInChapter", "getPositionInChapter", "previousChapter", "getPreviousChapter", "getSettings", "()Lde/ph1b/audiobook/data/BookSettings;", "skipSilence", "", "getSkipSilence", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "updateSettings", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "data_debug"})
public final class BookContent {
    @org.jetbrains.annotations.NotNull()
    private final de.ph1b.audiobook.data.Chapter currentChapter = null;
    private final int currentChapterIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final de.ph1b.audiobook.data.Chapter previousChapter = null;
    @org.jetbrains.annotations.Nullable()
    private final de.ph1b.audiobook.data.Chapter nextChapter = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.Lazy nextChapterMarkPosition$delegate = null;
    private final int duration = 0;
    private final int position = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.io.File currentFile = null;
    private final int positionInChapter = 0;
    private final int loudnessGain = 0;
    private final boolean skipSilence = false;
    private final float playbackSpeed = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<de.ph1b.audiobook.data.Chapter> chapters = null;
    @org.jetbrains.annotations.NotNull()
    private final de.ph1b.audiobook.data.BookSettings settings = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookContent updateSettings(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.BookSettings, de.ph1b.audiobook.data.BookSettings> update) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Chapter getCurrentChapter() {
        return null;
    }
    
    public final int getCurrentChapterIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.ph1b.audiobook.data.Chapter getPreviousChapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.ph1b.audiobook.data.Chapter getNextChapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNextChapterMarkPosition() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getCurrentFile() {
        return null;
    }
    
    public final int getPositionInChapter() {
        return 0;
    }
    
    public final int getLoudnessGain() {
        return 0;
    }
    
    public final boolean getSkipSilence() {
        return false;
    }
    
    public final float getPlaybackSpeed() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.ph1b.audiobook.data.Chapter> getChapters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookSettings getSettings() {
        return null;
    }
    
    public BookContent(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookSettings settings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.ph1b.audiobook.data.Chapter> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookSettings component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookContent copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookSettings settings) {
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