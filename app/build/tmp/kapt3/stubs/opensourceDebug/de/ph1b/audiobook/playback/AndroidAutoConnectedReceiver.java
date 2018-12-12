package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Observes the android auto connection state.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "", "()V", "_connected", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "connected", "getConnected", "()Z", "receiver", "de/ph1b/audiobook/playback/AndroidAutoConnectedReceiver$receiver$1", "Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver$receiver$1;", "stream", "Lio/reactivex/Observable;", "getStream", "()Lio/reactivex/Observable;", "register", "", "context", "Landroid/content/Context;", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class AndroidAutoConnectedReceiver {
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> _connected = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Boolean> stream = null;
    private final android.content.BroadcastReceiver receiver = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> getStream() {
        return null;
    }
    
    public final boolean getConnected() {
        return false;
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @javax.inject.Inject()
    public AndroidAutoConnectedReceiver() {
        super();
    }
}