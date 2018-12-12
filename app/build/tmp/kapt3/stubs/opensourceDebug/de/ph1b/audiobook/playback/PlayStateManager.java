package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Manages the playback state and is able to inform subscriber.
 * * Also manages the reason for pausing and sets it to none if the state gets stopped is playing.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\n0\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/playback/PlayStateManager;", "", "()V", "pauseReason", "Lde/ph1b/audiobook/playback/PlayStateManager$PauseReason;", "getPauseReason", "()Lde/ph1b/audiobook/playback/PlayStateManager$PauseReason;", "setPauseReason", "(Lde/ph1b/audiobook/playback/PlayStateManager$PauseReason;)V", "value", "Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "playState", "getPlayState", "()Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "setPlayState", "(Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;)V", "playStateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "playStateStream", "Lio/reactivex/Observable;", "PauseReason", "PlayState", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class PlayStateManager {
    private final io.reactivex.subjects.BehaviorSubject<de.ph1b.audiobook.playback.PlayStateManager.PlayState> playStateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private de.ph1b.audiobook.playback.PlayStateManager.PauseReason pauseReason;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayStateManager.PauseReason getPauseReason() {
        return null;
    }
    
    public final void setPauseReason(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager.PauseReason p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<de.ph1b.audiobook.playback.PlayStateManager.PlayState> playStateStream() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayStateManager.PlayState getPlayState() {
        return null;
    }
    
    public final void setPlayState(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager.PlayState value) {
    }
    
    @javax.inject.Inject()
    public PlayStateManager() {
        super();
    }
    
    /**
     * Represents the play states for the playback.  
     */
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "", "playbackStateCompat", "", "(Ljava/lang/String;II)V", "getPlaybackStateCompat", "()I", "PLAYING", "PAUSED", "STOPPED", "app_opensourceDebug"})
    public static enum PlayState {
        /*public static final*/ PLAYING /* = new PLAYING(0) */,
        /*public static final*/ PAUSED /* = new PAUSED(0) */,
        /*public static final*/ STOPPED /* = new STOPPED(0) */;
        private final int playbackStateCompat = 0;
        
        public final int getPlaybackStateCompat() {
            return 0;
        }
        
        PlayState(@android.support.v4.media.session.PlaybackStateCompat.State()
        int playbackStateCompat) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/playback/PlayStateManager$PauseReason;", "", "(Ljava/lang/String;I)V", "NONE", "CALL", "BECAUSE_HEADSET", "LOSS_TRANSIENT", "app_opensourceDebug"})
    public static enum PauseReason {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ CALL /* = new CALL() */,
        /*public static final*/ BECAUSE_HEADSET /* = new BECAUSE_HEADSET() */,
        /*public static final*/ LOSS_TRANSIENT /* = new LOSS_TRANSIENT() */;
        
        PauseReason() {
        }
    }
}