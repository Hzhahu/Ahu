package de.ph1b.audiobook.playback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0014JV\u0010\u0010\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0014\u00a8\u0006\u001a"}, d2 = {"Lde/ph1b/audiobook/playback/OnlyAudioRenderersFactory;", "Lcom/google/android/exoplayer2/DefaultRenderersFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildTextRenderers", "", "output", "Lcom/google/android/exoplayer2/text/TextOutput;", "outputLooper", "Landroid/os/Looper;", "extensionRendererMode", "", "out", "Ljava/util/ArrayList;", "Lcom/google/android/exoplayer2/Renderer;", "buildVideoRenderers", "drmSessionManager", "Lcom/google/android/exoplayer2/drm/DrmSessionManager;", "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;", "allowedVideoJoiningTimeMs", "", "eventHandler", "Landroid/os/Handler;", "eventListener", "Lcom/google/android/exoplayer2/video/VideoRendererEventListener;", "app_opensourceDebug"})
public final class OnlyAudioRenderersFactory extends com.google.android.exoplayer2.DefaultRenderersFactory {
    
    @java.lang.Override()
    protected void buildVideoRenderers(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.google.android.exoplayer2.drm.DrmSessionManager<com.google.android.exoplayer2.drm.FrameworkMediaCrypto> drmSessionManager, long allowedVideoJoiningTimeMs, @org.jetbrains.annotations.Nullable()
    android.os.Handler eventHandler, @org.jetbrains.annotations.Nullable()
    com.google.android.exoplayer2.video.VideoRendererEventListener eventListener, int extensionRendererMode, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.google.android.exoplayer2.Renderer> out) {
    }
    
    @java.lang.Override()
    protected void buildTextRenderers(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.google.android.exoplayer2.text.TextOutput output, @org.jetbrains.annotations.Nullable()
    android.os.Looper outputLooper, int extensionRendererMode, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.google.android.exoplayer2.Renderer> out) {
    }
    
    @javax.inject.Inject()
    public OnlyAudioRenderersFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}