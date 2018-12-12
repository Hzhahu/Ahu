package de.ph1b.audiobook.playback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\rJ!\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010!\u001a\u00020\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\f0\f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lde/ph1b/audiobook/playback/SleepTimer;", "", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "shakeDetector", "Lde/ph1b/audiobook/playback/ShakeDetector;", "shakeToResetPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "sleepTimePref", "", "(Lde/ph1b/audiobook/playback/PlayerController;Lde/ph1b/audiobook/playback/PlayStateManager;Lde/ph1b/audiobook/playback/ShakeDetector;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/persistence/pref/Pref;)V", "leftSleepTimeInMs", "Lio/reactivex/Observable;", "getLeftSleepTimeInMs", "()Lio/reactivex/Observable;", "leftSleepTimeSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "shakeDisposable", "Lio/reactivex/disposables/Disposable;", "shakeObservable", "", "shakeTimeoutDisposable", "sleepDisposable", "resetTimerOnShake", "enable", "stopAfter", "", "(ZLjava/lang/Long;)V", "setActive", "sleepTimerActive", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class SleepTimer {
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Integer> leftSleepTimeSubject = null;
    private io.reactivex.disposables.Disposable sleepDisposable;
    private io.reactivex.disposables.Disposable shakeDisposable;
    private io.reactivex.disposables.Disposable shakeTimeoutDisposable;
    private final io.reactivex.Observable<kotlin.Unit> shakeObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Integer> leftSleepTimeInMs = null;
    private final de.ph1b.audiobook.playback.PlayerController playerController = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> shakeToResetPref = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> sleepTimePref = null;
    
    /**
     * turns the sleep timer on or off 
     */
    public final void setActive(boolean enable) {
    }
    
    private final void resetTimerOnShake(boolean enable, java.lang.Long stopAfter) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Integer> getLeftSleepTimeInMs() {
        return null;
    }
    
    public final boolean sleepTimerActive() {
        return false;
    }
    
    @javax.inject.Inject()
    public SleepTimer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController playerController, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.ShakeDetector shakeDetector, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SHAKE_TO_RESET_SLEEP_TIMER")
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> shakeToResetPref, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SLEEP_TIME")
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> sleepTimePref) {
        super();
    }
}