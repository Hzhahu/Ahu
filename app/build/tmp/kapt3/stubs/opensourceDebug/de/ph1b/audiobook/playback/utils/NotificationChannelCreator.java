package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Creates the notification channel and exposes the channel name.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0003R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lde/ph1b/audiobook/playback/utils/NotificationChannelCreator;", "", "notificationManager", "Landroid/app/NotificationManager;", "context", "Landroid/content/Context;", "(Landroid/app/NotificationManager;Landroid/content/Context;)V", "musicChannel", "", "getMusicChannel", "()Ljava/lang/String;", "createChannel", "", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class NotificationChannelCreator {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String musicChannel = "musicChannel4";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMusicChannel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void createChannel(android.content.Context context, android.app.NotificationManager notificationManager) {
    }
    
    @javax.inject.Inject()
    public NotificationChannelCreator(@org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}