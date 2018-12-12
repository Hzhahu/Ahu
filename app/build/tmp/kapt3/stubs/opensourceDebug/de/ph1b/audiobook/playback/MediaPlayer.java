package de.ph1b.audiobook.playback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0015H\u0002J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00062\n\b\u0002\u00109\u001a\u0004\u0018\u00010:J\u000e\u0010;\u001a\u0002072\u0006\u00105\u001a\u00020\u0015J\u0006\u0010<\u001a\u000207J\u000e\u0010=\u001a\u0002072\u0006\u0010>\u001a\u000204J\u0006\u0010?\u001a\u000207J\b\u0010@\u001a\u000207H\u0002J\u000e\u0010A\u001a\u0002072\u0006\u0010B\u001a\u000204J\u0018\u0010C\u001a\u0002072\u0006\u00105\u001a\u00020\u00152\u0006\u0010B\u001a\u000204H\u0002J\u0010\u0010D\u001a\u0002042\u0006\u00105\u001a\u00020\u0015H\u0002J\u000e\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020\u0006J\u000e\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00020IJ\u000e\u0010J\u001a\u0002072\u0006\u0010K\u001a\u000204J\u000e\u0010K\u001a\u0002072\u0006\u0010L\u001a\u000204J\u0006\u0010M\u001a\u000207R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00180\u00180\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u001f\u0010$\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0016*\u0004\u0018\u00010)0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b+\u0010\u001cR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00188B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lde/ph1b/audiobook/playback/MediaPlayer;", "", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "autoRewindAmountPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "seekTimePref", "equalizer", "Lde/ph1b/audiobook/features/audio/Equalizer;", "loudnessGain", "Lde/ph1b/audiobook/features/audio/LoudnessGain;", "wakeLockManager", "Lde/ph1b/audiobook/playback/utils/WakeLockManager;", "dataSourceConverter", "Lde/ph1b/audiobook/playback/utils/DataSourceConverter;", "onlyAudioRenderersFactory", "Lde/ph1b/audiobook/playback/OnlyAudioRenderersFactory;", "(Lde/ph1b/audiobook/playback/PlayStateManager;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/features/audio/Equalizer;Lde/ph1b/audiobook/features/audio/LoudnessGain;Lde/ph1b/audiobook/playback/utils/WakeLockManager;Lde/ph1b/audiobook/playback/utils/DataSourceConverter;Lde/ph1b/audiobook/playback/OnlyAudioRenderersFactory;)V", "_bookContent", "Lio/reactivex/subjects/BehaviorSubject;", "Lde/ph1b/audiobook/data/BookContent;", "kotlin.jvm.PlatformType", "_state", "Lde/ph1b/audiobook/playback/PlayerState;", "<set-?>", "autoRewindAmount", "getAutoRewindAmount", "()I", "setAutoRewindAmount", "(I)V", "autoRewindAmount$delegate", "Lde/ph1b/audiobook/persistence/pref/Pref;", "bookContent", "getBookContent", "()Lde/ph1b/audiobook/data/BookContent;", "bookContentStream", "Lio/reactivex/Observable;", "getBookContentStream", "()Lio/reactivex/Observable;", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "seekTime", "getSeekTime", "seekTime$delegate", "value", "state", "getState", "()Lde/ph1b/audiobook/playback/PlayerState;", "setState", "(Lde/ph1b/audiobook/playback/PlayerState;)V", "alreadyInitializedChapters", "", "content", "changePosition", "", "time", "changedFile", "Ljava/io/File;", "init", "next", "pause", "rewind", "play", "prepareIfIdle", "previous", "toNullOfNewTrack", "previousByFile", "previousByMarks", "setLoudnessGain", "mB", "setPlaybackSpeed", "speed", "", "setSkipSilences", "skip", "forward", "stop", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class MediaPlayer {
    private final com.google.android.exoplayer2.SimpleExoPlayer player = null;
    private final io.reactivex.subjects.BehaviorSubject<de.ph1b.audiobook.data.BookContent> _bookContent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<de.ph1b.audiobook.data.BookContent> bookContentStream = null;
    private final io.reactivex.subjects.BehaviorSubject<de.ph1b.audiobook.playback.PlayerState> _state = null;
    private final de.ph1b.audiobook.persistence.pref.Pref seekTime$delegate = null;
    private final de.ph1b.audiobook.persistence.pref.Pref autoRewindAmount$delegate = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> autoRewindAmountPref = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> seekTimePref = null;
    private final de.ph1b.audiobook.features.audio.Equalizer equalizer = null;
    private final de.ph1b.audiobook.features.audio.LoudnessGain loudnessGain = null;
    private final de.ph1b.audiobook.playback.utils.WakeLockManager wakeLockManager = null;
    private final de.ph1b.audiobook.playback.utils.DataSourceConverter dataSourceConverter = null;
    
    @org.jetbrains.annotations.Nullable()
    public final de.ph1b.audiobook.data.BookContent getBookContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<de.ph1b.audiobook.data.BookContent> getBookContentStream() {
        return null;
    }
    
    private final de.ph1b.audiobook.playback.PlayerState getState() {
        return null;
    }
    
    private final void setState(de.ph1b.audiobook.playback.PlayerState value) {
    }
    
    private final int getSeekTime() {
        return 0;
    }
    
    private final int getAutoRewindAmount() {
        return 0;
    }
    
    private final void setAutoRewindAmount(int p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookContent content) {
    }
    
    private final boolean alreadyInitializedChapters(de.ph1b.audiobook.data.BookContent content) {
        return false;
    }
    
    public final void setLoudnessGain(int mB) {
    }
    
    public final void play() {
    }
    
    public final void skip(boolean forward) {
    }
    
    /**
     * If current time is > 2000ms, seek to 0. Else play previous chapter if there is one. 
     */
    public final void previous(boolean toNullOfNewTrack) {
    }
    
    private final void previousByFile(de.ph1b.audiobook.data.BookContent content, boolean toNullOfNewTrack) {
    }
    
    private final boolean previousByMarks(de.ph1b.audiobook.data.BookContent content) {
        return false;
    }
    
    private final void prepareIfIdle() {
    }
    
    /**
     * Stops the playback and releases some resources. 
     */
    public final void stop() {
    }
    
    /**
     * * Pauses the player.
     *   * @param rewind true if the player should automatically rewind a little bit.
     */
    public final void pause(boolean rewind) {
    }
    
    /**
     * Plays the next chapter. If there is none, don't do anything 
     */
    public final void next() {
    }
    
    /**
     * Changes the current position in book. 
     */
    public final void changePosition(int time, @org.jetbrains.annotations.Nullable()
    java.io.File changedFile) {
    }
    
    /**
     * The current playback speed. 1.0 for normal playback, 2.0 for twice the speed, etc. 
     */
    public final void setPlaybackSpeed(float speed) {
    }
    
    public final void setSkipSilences(boolean skip) {
    }
    
    @javax.inject.Inject()
    public MediaPlayer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "AUTO_REWIND")
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> autoRewindAmountPref, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SEEK_TIME")
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> seekTimePref, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.audio.Equalizer equalizer, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.audio.LoudnessGain loudnessGain, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.WakeLockManager wakeLockManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.DataSourceConverter dataSourceConverter, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.OnlyAudioRenderersFactory onlyAudioRenderersFactory) {
        super();
    }
}