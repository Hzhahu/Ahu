package de.ph1b.audiobook.playback.utils.audioFocus;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusRequesterApi26;", "Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusRequester;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioManager", "Landroid/media/AudioManager;", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/media/AudioManager;)V", "audioAttributes", "Landroid/media/AudioAttributes;", "focusRequest", "Landroid/media/AudioFocusRequest;", "abandon", "", "request", "", "app_opensourceDebug"})
public final class AudioFocusRequesterApi26 implements de.ph1b.audiobook.playback.utils.audioFocus.AudioFocusRequester {
    private final android.media.AudioAttributes audioAttributes = null;
    private android.media.AudioFocusRequest focusRequest;
    private final android.media.AudioManager audioManager = null;
    
    @java.lang.Override()
    public int request() {
        return 0;
    }
    
    @java.lang.Override()
    public void abandon() {
    }
    
    public AudioFocusRequesterApi26(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener, @org.jetbrains.annotations.NotNull()
    android.media.AudioManager audioManager) {
        super();
    }
}