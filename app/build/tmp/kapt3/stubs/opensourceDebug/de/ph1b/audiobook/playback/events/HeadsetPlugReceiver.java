package de.ph1b.audiobook.playback.events;

import java.lang.System;

/**
 * * Simple receiver wrapper which holds a [android.content.BroadcastReceiver] that notifies on headset changes.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lde/ph1b/audiobook/playback/events/HeadsetPlugReceiver;", "", "()V", "PLUGGED", "", "UNPLUGGED", "filter", "Landroid/content/IntentFilter;", "events", "Lio/reactivex/Observable;", "Lde/ph1b/audiobook/playback/events/HeadsetPlugReceiver$HeadsetState;", "c", "Landroid/content/Context;", "HeadsetState", "app_opensourceDebug"})
public final class HeadsetPlugReceiver {
    private static final android.content.IntentFilter filter = null;
    private static final int PLUGGED = 1;
    private static final int UNPLUGGED = 0;
    public static final de.ph1b.audiobook.playback.events.HeadsetPlugReceiver INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<de.ph1b.audiobook.playback.events.HeadsetPlugReceiver.HeadsetState> events(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    private HeadsetPlugReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/playback/events/HeadsetPlugReceiver$HeadsetState;", "", "(Ljava/lang/String;I)V", "PLUGGED", "UNPLUGGED", "UNKNOWN", "app_opensourceDebug"})
    public static enum HeadsetState {
        /*public static final*/ PLUGGED /* = new PLUGGED() */,
        /*public static final*/ UNPLUGGED /* = new UNPLUGGED() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        HeadsetState() {
        }
    }
}