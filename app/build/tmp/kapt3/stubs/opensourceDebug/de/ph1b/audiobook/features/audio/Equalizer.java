package de.ph1b.audiobook.features.audio;

import java.lang.System;

/**
 * * The equalizer. Delegates to the system integrated equalizer
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\r*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lde/ph1b/audiobook/features/audio/Equalizer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "exists", "", "getExists", "()Z", "launchIntent", "Landroid/content/Intent;", "updateIntent", "launch", "", "activity", "Landroid/app/Activity;", "update", "audioSessionId", "", "putAudioSessionId", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class Equalizer {
    private final android.content.Intent launchIntent = null;
    private final android.content.Intent updateIntent = null;
    private final boolean exists = false;
    private final android.content.Context context = null;
    
    public final boolean getExists() {
        return false;
    }
    
    private final void putAudioSessionId(@org.jetbrains.annotations.NotNull()
    android.content.Intent $receiver, int audioSessionId) {
    }
    
    public final void update(int audioSessionId) {
    }
    
    public final void launch(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @javax.inject.Inject()
    public Equalizer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}