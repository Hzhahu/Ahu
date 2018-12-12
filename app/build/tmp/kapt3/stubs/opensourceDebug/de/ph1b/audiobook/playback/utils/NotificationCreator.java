package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Provides Notifications based on playing information.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001f\u001a\u00020\u0017H\u0002J\f\u0010 \u001a\u00020\u0015*\u00020\u0015H\u0002J\u0014\u0010!\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002J\f\u0010$\u001a\u00020\u0015*\u00020\u0015H\u0002J\u0014\u0010%\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010&\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001d\u0010\'\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006)"}, d2 = {"Lde/ph1b/audiobook/playback/utils/NotificationCreator;", "", "context", "Landroid/content/Context;", "imageHelper", "Lde/ph1b/audiobook/uitools/ImageHelper;", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "notificationChannelCreator", "Lde/ph1b/audiobook/playback/utils/NotificationChannelCreator;", "(Landroid/content/Context;Lde/ph1b/audiobook/uitools/ImageHelper;Lde/ph1b/audiobook/playback/PlayerController;Lde/ph1b/audiobook/playback/PlayStateManager;Landroid/support/v4/media/session/MediaSessionCompat;Lde/ph1b/audiobook/playback/utils/NotificationChannelCreator;)V", "cachedImage", "Lde/ph1b/audiobook/playback/utils/CachedImage;", "mediaStyle", "Landroidx/media/app/NotificationCompat$MediaStyle;", "kotlin.jvm.PlatformType", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "contentIntent", "Landroid/app/PendingIntent;", "book", "Lde/ph1b/audiobook/data/Book;", "cover", "Landroid/graphics/Bitmap;", "(Lde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "createNotification", "Landroid/app/Notification;", "stopIntent", "addFastForwardAction", "addPlayPauseAction", "playState", "Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "addRewindAction", "setChapterInfo", "setContentTitle", "setLargeIcon", "(Landroidx/core/app/NotificationCompat$Builder;Lde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "app_opensourceDebug"})
@de.ph1b.audiobook.injection.PerService()
public final class NotificationCreator {
    private de.ph1b.audiobook.playback.utils.CachedImage cachedImage;
    private final androidx.media.app.NotificationCompat.MediaStyle mediaStyle = null;
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder = null;
    private final android.content.Context context = null;
    private final de.ph1b.audiobook.uitools.ImageHelper imageHelper = null;
    private final de.ph1b.audiobook.playback.PlayerController playerController = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final android.support.v4.media.session.MediaSessionCompat mediaSession = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createNotification(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super android.app.Notification> p1) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder setContentTitle(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder $receiver, de.ph1b.audiobook.data.Book book) {
        return null;
    }
    
    private final android.app.PendingIntent contentIntent(de.ph1b.audiobook.data.Book book) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder setChapterInfo(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder $receiver, de.ph1b.audiobook.data.Book book) {
        return null;
    }
    
    private final android.app.PendingIntent stopIntent() {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder addFastForwardAction(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder $receiver) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder addRewindAction(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder $receiver) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder addPlayPauseAction(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder $receiver, de.ph1b.audiobook.playback.PlayStateManager.PlayState playState) {
        return null;
    }
    
    @javax.inject.Inject()
    public NotificationCreator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.ImageHelper imageHelper, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController playerController, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaSessionCompat mediaSession, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.NotificationChannelCreator notificationChannelCreator) {
        super();
    }
}