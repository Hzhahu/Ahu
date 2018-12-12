package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Analyzes the duration of a file
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0015H\u0002J4\u0010\u0016\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u000e0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J,\u0010\u0017\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u000e0\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lde/ph1b/audiobook/misc/DurationAnalyzer;", "", "dataSourceConverter", "Lde/ph1b/audiobook/playback/utils/DataSourceConverter;", "context", "Landroid/content/Context;", "(Lde/ph1b/audiobook/playback/utils/DataSourceConverter;Landroid/content/Context;)V", "exoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "playbackStateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "duration", "Lio/reactivex/Single;", "file", "Ljava/io/File;", "enableOnlyAudioRenderer", "", "trackSelector", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "scan", "waitForIdle", "app_opensourceDebug"})
public final class DurationAnalyzer {
    private final com.google.android.exoplayer2.ExoPlayer exoPlayer = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Integer> playbackStateSubject = null;
    private final de.ph1b.audiobook.playback.utils.DataSourceConverter dataSourceConverter = null;
    
    private final void enableOnlyAudioRenderer(com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector, com.google.android.exoplayer2.SimpleExoPlayer exoPlayer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.Integer> duration(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.Integer> waitForIdle() {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.Integer> scan(java.io.File file) {
        return null;
    }
    
    @javax.inject.Inject()
    public DurationAnalyzer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.DataSourceConverter dataSourceConverter, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}