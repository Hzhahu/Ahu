package de.ph1b.audiobook.injection;

import java.lang.System;

/**
 * * Module for playback related classes
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/injection/PlaybackModule;", "", "()V", "provideButtonRecieverPendingIntent", "Landroid/app/PendingIntent;", "service", "Lde/ph1b/audiobook/playback/PlaybackService;", "mbrComponentName", "Landroid/content/ComponentName;", "provideMediaButtonReceiverComponentName", "provideMediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "callback", "Lde/ph1b/audiobook/playback/MediaSessionCallback;", "buttonReceiverPendingIntent", "app_opensourceDebug"})
@dagger.Module()
public final class PlaybackModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.ComponentName provideMediaButtonReceiverComponentName(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlaybackService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @PerService()
    @dagger.Provides()
    public final android.app.PendingIntent provideButtonRecieverPendingIntent(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlaybackService service, @org.jetbrains.annotations.NotNull()
    android.content.ComponentName mbrComponentName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @PerService()
    @dagger.Provides()
    public final android.support.v4.media.session.MediaSessionCompat provideMediaSession(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlaybackService service, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.MediaSessionCallback callback, @org.jetbrains.annotations.NotNull()
    android.content.ComponentName mbrComponentName, @org.jetbrains.annotations.NotNull()
    android.app.PendingIntent buttonReceiverPendingIntent) {
        return null;
    }
    
    public PlaybackModule() {
        super();
    }
}