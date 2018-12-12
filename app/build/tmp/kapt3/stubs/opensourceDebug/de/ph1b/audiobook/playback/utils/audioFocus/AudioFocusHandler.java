package de.ph1b.audiobook.playback.utils.audioFocus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\u0006\u0010$\u001a\u00020\u001bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusHandler;", "", "audioManager", "Landroid/media/AudioManager;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "player", "Lde/ph1b/audiobook/playback/MediaPlayer;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "resumeAfterCallPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "(Landroid/media/AudioManager;Landroid/telephony/TelephonyManager;Lde/ph1b/audiobook/playback/MediaPlayer;Lde/ph1b/audiobook/playback/PlayStateManager;Lde/ph1b/audiobook/persistence/pref/Pref;)V", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "<set-?>", "currentlyHasFocus", "getCurrentlyHasFocus", "()Z", "setCurrentlyHasFocus", "(Z)V", "currentlyHasFocus$delegate", "Lkotlin/properties/ReadWriteProperty;", "focusRequester", "Lde/ph1b/audiobook/playback/utils/audioFocus/CompatAudioFocusRequester;", "abandon", "", "handleFocusChange", "focusChange", "", "handleGain", "handleLoss", "handlePhoneNotIdle", "callState", "handleTemporaryLoss", "request", "app_opensourceDebug"})
public final class AudioFocusHandler {
    private final android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener = null;
    private final de.ph1b.audiobook.playback.utils.audioFocus.CompatAudioFocusRequester focusRequester = null;
    private final kotlin.properties.ReadWriteProperty currentlyHasFocus$delegate = null;
    private final android.telephony.TelephonyManager telephonyManager = null;
    private final de.ph1b.audiobook.playback.MediaPlayer player = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> resumeAfterCallPref = null;
    
    private final boolean getCurrentlyHasFocus() {
        return false;
    }
    
    private final void setCurrentlyHasFocus(boolean p0) {
    }
    
    private final synchronized void handleFocusChange(int focusChange) {
    }
    
    private final void handlePhoneNotIdle(int callState) {
    }
    
    private final void handleTemporaryLoss() {
    }
    
    private final void handleLoss() {
    }
    
    private final void handleGain() {
    }
    
    public final synchronized void request() {
    }
    
    public final synchronized void abandon() {
    }
    
    @javax.inject.Inject()
    public AudioFocusHandler(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager audioManager, @org.jetbrains.annotations.NotNull()
    android.telephony.TelephonyManager telephonyManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.MediaPlayer player, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "resumeAfterCall")
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> resumeAfterCallPref) {
        super();
    }
}