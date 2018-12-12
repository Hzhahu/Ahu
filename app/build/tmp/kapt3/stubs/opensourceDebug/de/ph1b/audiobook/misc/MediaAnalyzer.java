package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Analyzes media files for meta data and duration.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lde/ph1b/audiobook/misc/MediaAnalyzer;", "", "exoPlayerDurationParser", "Lde/ph1b/audiobook/misc/DurationAnalyzer;", "metaDataAnalyzer", "Lde/ph1b/audiobook/misc/MetaDataAnalyzer;", "(Lde/ph1b/audiobook/misc/DurationAnalyzer;Lde/ph1b/audiobook/misc/MetaDataAnalyzer;)V", "analyze", "Lio/reactivex/Single;", "Lde/ph1b/audiobook/misc/MediaAnalyzer$Result;", "kotlin.jvm.PlatformType", "file", "Ljava/io/File;", "Result", "app_opensourceDebug"})
public final class MediaAnalyzer {
    private final de.ph1b.audiobook.misc.DurationAnalyzer exoPlayerDurationParser = null;
    private final de.ph1b.audiobook.misc.MetaDataAnalyzer metaDataAnalyzer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<de.ph1b.audiobook.misc.MediaAnalyzer.Result> analyze(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @javax.inject.Inject()
    public MediaAnalyzer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.DurationAnalyzer exoPlayerDurationParser, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.MetaDataAnalyzer metaDataAnalyzer) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/misc/MediaAnalyzer$Result;", "", "()V", "Failure", "Success", "Lde/ph1b/audiobook/misc/MediaAnalyzer$Result$Success;", "Lde/ph1b/audiobook/misc/MediaAnalyzer$Result$Failure;", "app_opensourceDebug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lde/ph1b/audiobook/misc/MediaAnalyzer$Result$Success;", "Lde/ph1b/audiobook/misc/MediaAnalyzer$Result;", "duration", "", "chapterName", "", "author", "bookName", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getBookName", "getChapterName", "getDuration", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_opensourceDebug"})
        public static final class Success extends de.ph1b.audiobook.misc.MediaAnalyzer.Result {
            private final int duration = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String chapterName = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String author = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String bookName = null;
            
            public final int getDuration() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getChapterName() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAuthor() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBookName() {
                return null;
            }
            
            public Success(int duration, @org.jetbrains.annotations.NotNull()
            java.lang.String chapterName, @org.jetbrains.annotations.Nullable()
            java.lang.String author, @org.jetbrains.annotations.Nullable()
            java.lang.String bookName) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final de.ph1b.audiobook.misc.MediaAnalyzer.Result.Success copy(int duration, @org.jetbrains.annotations.NotNull()
            java.lang.String chapterName, @org.jetbrains.annotations.Nullable()
            java.lang.String author, @org.jetbrains.annotations.Nullable()
            java.lang.String bookName) {
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
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lde/ph1b/audiobook/misc/MediaAnalyzer$Result$Failure;", "Lde/ph1b/audiobook/misc/MediaAnalyzer$Result;", "()V", "app_opensourceDebug"})
        public static final class Failure extends de.ph1b.audiobook.misc.MediaAnalyzer.Result {
            public static final de.ph1b.audiobook.misc.MediaAnalyzer.Result.Failure INSTANCE = null;
            
            private Failure() {
                super();
            }
        }
    }
}