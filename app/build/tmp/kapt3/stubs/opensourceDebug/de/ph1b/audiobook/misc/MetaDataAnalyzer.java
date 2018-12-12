package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Extracts meta data from media files. This class is thread safe.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/misc/MetaDataAnalyzer;", "", "()V", "file", "Ljava/io/File;", "mmr", "Landroid/media/MediaMetadataRetriever;", "chapterNameFallback", "", "parse", "Lde/ph1b/audiobook/misc/MetaDataAnalyzer$MetaData;", "parseAuthor", "parseBookName", "parseChapterName", "parseDuration", "", "prepare", "", "safeExtract", "key", "MetaData", "app_opensourceDebug"})
public final class MetaDataAnalyzer {
    private final android.media.MediaMetadataRetriever mmr = null;
    private java.io.File file;
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized de.ph1b.audiobook.misc.MetaDataAnalyzer.MetaData parse(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    private final boolean prepare() {
        return false;
    }
    
    private final java.lang.String parseChapterName() {
        return null;
    }
    
    private final java.lang.String chapterNameFallback() {
        return null;
    }
    
    private final int parseDuration() {
        return 0;
    }
    
    private final java.lang.String parseBookName() {
        return null;
    }
    
    private final java.lang.String parseAuthor() {
        return null;
    }
    
    /**
     * * As [MediaMetadataRetriever] has several bugs it is important to catch the exception here as
     *   * it randomly throws [RuntimeException] on certain implementations.
     */
    private final java.lang.String safeExtract(@org.jetbrains.annotations.NotNull()
    android.media.MediaMetadataRetriever $receiver, int key) {
        return null;
    }
    
    @javax.inject.Inject()
    public MetaDataAnalyzer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lde/ph1b/audiobook/misc/MetaDataAnalyzer$MetaData;", "", "chapterName", "", "duration", "", "bookName", "author", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getBookName", "getChapterName", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lde/ph1b/audiobook/misc/MetaDataAnalyzer$MetaData;", "equals", "", "other", "hashCode", "toString", "app_opensourceDebug"})
    public static final class MetaData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String chapterName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer duration = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String bookName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String author = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChapterName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getDuration() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBookName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        public MetaData(@org.jetbrains.annotations.NotNull()
        java.lang.String chapterName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
        java.lang.String bookName, @org.jetbrains.annotations.Nullable()
        java.lang.String author) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
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
        public final de.ph1b.audiobook.misc.MetaDataAnalyzer.MetaData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String chapterName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
        java.lang.String bookName, @org.jetbrains.annotations.Nullable()
        java.lang.String author) {
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
}