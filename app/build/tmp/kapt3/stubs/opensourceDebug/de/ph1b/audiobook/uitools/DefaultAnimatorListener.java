package de.ph1b.audiobook.uitools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/uitools/DefaultAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_opensourceDebug"})
public abstract interface DefaultAnimatorListener extends android.animation.Animator.AnimatorListener {
    
    @java.lang.Override()
    public abstract void onAnimationRepeat(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animator);
    
    @java.lang.Override()
    public abstract void onAnimationEnd(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animator);
    
    @java.lang.Override()
    public abstract void onAnimationCancel(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animator);
    
    @java.lang.Override()
    public abstract void onAnimationStart(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animator);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onAnimationRepeat(de.ph1b.audiobook.uitools.DefaultAnimatorListener $this, @org.jetbrains.annotations.NotNull()
        android.animation.Animator animator) {
        }
        
        @java.lang.Override()
        public static void onAnimationEnd(de.ph1b.audiobook.uitools.DefaultAnimatorListener $this, @org.jetbrains.annotations.NotNull()
        android.animation.Animator animator) {
        }
        
        @java.lang.Override()
        public static void onAnimationCancel(de.ph1b.audiobook.uitools.DefaultAnimatorListener $this, @org.jetbrains.annotations.NotNull()
        android.animation.Animator animator) {
        }
        
        @java.lang.Override()
        public static void onAnimationStart(de.ph1b.audiobook.uitools.DefaultAnimatorListener $this, @org.jetbrains.annotations.NotNull()
        android.animation.Animator animator) {
        }
    }
}