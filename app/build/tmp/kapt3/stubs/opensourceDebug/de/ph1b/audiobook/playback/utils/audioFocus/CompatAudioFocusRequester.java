package de.ph1b.audiobook.playback.utils.audioFocus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0096\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lde/ph1b/audiobook/playback/utils/audioFocus/CompatAudioFocusRequester;", "Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusRequester;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioManager", "Landroid/media/AudioManager;", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/media/AudioManager;)V", "abandon", "", "request", "", "app_opensourceDebug"})
public final class CompatAudioFocusRequester implements de.ph1b.audiobook.playback.utils.audioFocus.AudioFocusRequester {
    private final android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener = null;
    private final android.media.AudioManager audioManager = null;
    
    public CompatAudioFocusRequester(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener, @org.jetbrains.annotations.NotNull()
    android.media.AudioManager audioManager) {
        super();
    }
    
    @java.lang.Override()
    public void abandon() {
    }
    
    @java.lang.Override()
    public int request() {
        return 0;
    }
}