package de.ph1b.audiobook.playback.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a#\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00020\u00072\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0086\b\u001a#\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u001a\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0012"}, d2 = {"onAudioSessionId", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "action", "Lkotlin/Function1;", "", "onError", "Lcom/google/android/exoplayer2/ExoPlayer;", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onPositionDiscontinuity", "Lkotlin/Function0;", "onStateChanged", "Lde/ph1b/audiobook/playback/PlayerState;", "setPlaybackParameters", "speed", "", "skipSilence", "", "app_opensourceDebug"})
public final class ExoExtensionsKt {
    
    public static final void setPlaybackParameters(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer $receiver, float speed, boolean skipSilence) {
    }
    
    public static final void onStateChanged(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlayer $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.playback.PlayerState, kotlin.Unit> action) {
    }
    
    public static final void onError(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlayer $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.exoplayer2.ExoPlaybackException, kotlin.Unit> action) {
    }
    
    public static final void onAudioSessionId(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> action) {
    }
    
    public static final void onPositionDiscontinuity(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlayer $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
}