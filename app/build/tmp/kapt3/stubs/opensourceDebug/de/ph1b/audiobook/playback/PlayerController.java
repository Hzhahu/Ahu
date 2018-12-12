package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Class for controlling the player through the service
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u0017J\u0006\u0010$\u001a\u00020\u0017J\u0006\u0010%\u001a\u00020\u0017J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0019J\u000e\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u00060"}, d2 = {"Lde/ph1b/audiobook/playback/PlayerController;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "fastForwardAutoPlayIntent", "Landroid/content/Intent;", "getFastForwardAutoPlayIntent", "()Landroid/content/Intent;", "fastForwardIntent", "nextIntent", "playIntent", "playPauseIntent", "getPlayPauseIntent", "previousIntent", "rewindAutoPlayerIntent", "getRewindAutoPlayerIntent", "rewindIntent", "stopIntent", "getStopIntent", "changePosition", "", "time", "", "file", "Ljava/io/File;", "fastForward", "fire", "intent", "action", "", "next", "play", "playPause", "previous", "rewind", "setLoudnessGain", "mB", "setSkipSilence", "skip", "", "setSpeed", "speed", "", "stop", "Companion", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class PlayerController {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent playPauseIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent rewindAutoPlayerIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent stopIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent fastForwardAutoPlayIntent = null;
    private final android.content.Intent fastForwardIntent = null;
    private final android.content.Intent rewindIntent = null;
    private final android.content.Intent playIntent = null;
    private final android.content.Intent nextIntent = null;
    private final android.content.Intent previousIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SPEED = "de.ph1b.audiobook.ACTION_SPEED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP = "de.ph1b.audiobook.ACTION_STOP";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PLAY = "de.ph1b.audiobook.ACTION_PLAY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REWIND = "de.ph1b.audiobook.ACTION_REWIND";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REWIND_AUTO_PLAY = "de.ph1b.audiobook.ACTION_REWIND_AUTO_PLAY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FAST_FORWARD = "de.ph1b.audiobook.ACTION_FAST_FORWARD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FAST_FORWARD_AUTO_PLAY = "de.ph1b.audiobook.ACTION_FAST_FORWARD_AUTO_PLAY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FORCE_NEXT = "de.ph1b.audiobook.ACTION_FORCE_NEXT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FORCE_PREVIOUS = "de.ph1b.audiobook.ACTION_FORCE_PREVIOUS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PLAY_PAUSE = "de.ph1b.audiobook.ACTION_PLAY_PAUSE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOUDNESS = "de.ph1b.audiobook.ACTION_LOUDNESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SKIP_SILENCE = "de.ph1b.audiobook.ACTION_SKIP_SILENCE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKIP_SILENCE = "de.ph1b.audiobook.SKIP_SILENCE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SPEED = "de.ph1b.audiobook.EXTRA_SPEED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CHANGE = "de.ph1b.audiobook.ACTION_CHANGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_TIME = "de.ph1b.audiobook.CHANGE_TIME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_LOUDNESS = "de.ph1b.audiobook.CHANGE_LOUDNESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_FILE = "de.ph1b.audiobook.CHANGE_FILE";
    public static final de.ph1b.audiobook.playback.PlayerController.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getPlayPauseIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getRewindAutoPlayerIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getStopIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getFastForwardAutoPlayIntent() {
        return null;
    }
    
    private final android.content.Intent intent(java.lang.String action) {
        return null;
    }
    
    public final void stop() {
    }
    
    public final void rewind() {
    }
    
    public final void play() {
    }
    
    public final void fastForward() {
    }
    
    private final void fire(android.content.Intent intent) {
    }
    
    public final void previous() {
    }
    
    public final void playPause() {
    }
    
    public final void next() {
    }
    
    public final void setSpeed(float speed) {
    }
    
    public final void changePosition(int time, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final void setLoudnessGain(int mB) {
    }
    
    public final void setSkipSilence(boolean skip) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public PlayerController(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lde/ph1b/audiobook/playback/PlayerController$Companion;", "", "()V", "ACTION_CHANGE", "", "ACTION_FAST_FORWARD", "ACTION_FAST_FORWARD_AUTO_PLAY", "ACTION_FORCE_NEXT", "ACTION_FORCE_PREVIOUS", "ACTION_LOUDNESS", "ACTION_PLAY", "ACTION_PLAY_PAUSE", "ACTION_REWIND", "ACTION_REWIND_AUTO_PLAY", "ACTION_SKIP_SILENCE", "ACTION_SPEED", "ACTION_STOP", "CHANGE_FILE", "CHANGE_LOUDNESS", "CHANGE_TIME", "EXTRA_SPEED", "SKIP_SILENCE", "app_opensourceDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}