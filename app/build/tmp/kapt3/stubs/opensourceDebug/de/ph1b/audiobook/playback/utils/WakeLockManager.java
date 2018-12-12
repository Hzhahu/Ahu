package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Simple wrapper for the wakelock
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\nH\u0007R\u001e\u0010\u0005\u001a\u0012 \u0007*\b\u0018\u00010\u0006R\u00020\u00030\u0006R\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lde/ph1b/audiobook/playback/utils/WakeLockManager;", "", "powerManager", "Landroid/os/PowerManager;", "(Landroid/os/PowerManager;)V", "lock", "Landroid/os/PowerManager$WakeLock;", "kotlin.jvm.PlatformType", "stayAwake", "", "", "app_opensourceDebug"})
public final class WakeLockManager {
    private final android.os.PowerManager.WakeLock lock = null;
    
    @android.annotation.SuppressLint(value = {"WakelockTimeout"})
    public final void stayAwake(boolean stayAwake) {
    }
    
    @javax.inject.Inject()
    public WakeLockManager(@org.jetbrains.annotations.NotNull()
    android.os.PowerManager powerManager) {
        super();
    }
}