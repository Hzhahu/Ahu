package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Observable for detecting shakes. The onSensorChanged formula was taken from
 * * https://github.com/AntennaPod/AntennaPod/blob/8d2ec19cbe05297afa887cc2263347f112aae3e6/core/src/main/java/de/danoeh/antennapod/core/service/playback/ShakeListener.java
 * * And is licensesd as apache 2
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lde/ph1b/audiobook/playback/ShakeDetector;", "", "sensorManager", "Landroid/hardware/SensorManager;", "(Landroid/hardware/SensorManager;)V", "detect", "Lio/reactivex/Observable;", "", "shakeSupported", "", "app_opensourceDebug"})
@dagger.Reusable()
public final class ShakeDetector {
    private final android.hardware.SensorManager sensorManager = null;
    
    public final boolean shakeSupported() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Unit> detect() {
        return null;
    }
    
    @javax.inject.Inject()
    public ShakeDetector(@org.jetbrains.annotations.Nullable()
    android.hardware.SensorManager sensorManager) {
        super();
    }
}