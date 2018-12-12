package de.ph1b.audiobook.uitools.noPauseAnimator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0012\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lde/ph1b/audiobook/uitools/noPauseAnimator/NoPauseAnimator;", "Landroid/animation/Animator;", "animator", "(Landroid/animation/Animator;)V", "listeners", "Landroid/util/ArrayMap;", "Landroid/animation/Animator$AnimatorListener;", "addListener", "", "listener", "cancel", "end", "getDuration", "", "getInterpolator", "Landroid/animation/TimeInterpolator;", "getListeners", "Ljava/util/ArrayList;", "getStartDelay", "isPaused", "", "isRunning", "isStarted", "removeAllListeners", "removeListener", "setDuration", "duration", "setInterpolator", "timeInterpolator", "setStartDelay", "startDelay", "setTarget", "target", "", "setupEndValues", "setupStartValues", "start", "app_opensourceDebug"})
public final class NoPauseAnimator extends android.animation.Animator {
    private final android.util.ArrayMap<android.animation.Animator.AnimatorListener, android.animation.Animator.AnimatorListener> listeners = null;
    private final android.animation.Animator animator = null;
    
    @java.lang.Override()
    public void addListener(@org.jetbrains.annotations.NotNull()
    android.animation.Animator.AnimatorListener listener) {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @java.lang.Override()
    public void end() {
    }
    
    @java.lang.Override()
    public long getDuration() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.animation.TimeInterpolator getInterpolator() {
        return null;
    }
    
    @java.lang.Override()
    public void setInterpolator(@org.jetbrains.annotations.NotNull()
    android.animation.TimeInterpolator timeInterpolator) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<android.animation.Animator.AnimatorListener> getListeners() {
        return null;
    }
    
    @java.lang.Override()
    public long getStartDelay() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setStartDelay(long startDelay) {
    }
    
    @java.lang.Override()
    public boolean isPaused() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isRunning() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isStarted() {
        return false;
    }
    
    @java.lang.Override()
    public void removeAllListeners() {
    }
    
    @java.lang.Override()
    public void removeListener(@org.jetbrains.annotations.NotNull()
    android.animation.Animator.AnimatorListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.animation.Animator setDuration(long duration) {
        return null;
    }
    
    @java.lang.Override()
    public void setTarget(@org.jetbrains.annotations.Nullable()
    java.lang.Object target) {
    }
    
    @java.lang.Override()
    public void setupEndValues() {
    }
    
    @java.lang.Override()
    public void setupStartValues() {
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    public NoPauseAnimator(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animator) {
        super();
    }
}