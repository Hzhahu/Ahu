package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Converts books to media sources.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u0007\u001a\u00020\u000b*\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/playback/utils/DataSourceConverter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mediaSourceFactory", "Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;", "toMediaSource", "Lcom/google/android/exoplayer2/source/MediaSource;", "content", "Lde/ph1b/audiobook/data/BookContent;", "Lcom/google/android/exoplayer2/source/ExtractorMediaSource;", "file", "Ljava/io/File;", "Lde/ph1b/audiobook/data/Chapter;", "app_opensourceDebug"})
@dagger.Reusable()
public final class DataSourceConverter {
    private final com.google.android.exoplayer2.source.ExtractorMediaSource.Factory mediaSourceFactory = null;
    
    private final com.google.android.exoplayer2.source.ExtractorMediaSource toMediaSource(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Chapter $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.source.ExtractorMediaSource toMediaSource(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    /**
     * convert a content to a media source. If the size is > 1 use a concat media source, else a regular 
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.source.MediaSource toMediaSource(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookContent content) {
        return null;
    }
    
    @javax.inject.Inject()
    public DataSourceConverter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}