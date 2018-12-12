package de.ph1b.audiobook.uitools;

import java.lang.System;

/**
 * * Change handler that animates vertically
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0014\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/uitools/VerticalChangeHandler;", "Lcom/bluelinelabs/conductor/changehandler/AnimatorChangeHandler;", "()V", "getAnimator", "Landroid/animation/Animator;", "container", "Landroid/view/ViewGroup;", "from", "Landroid/view/View;", "to", "isPush", "", "toAddedToContainer", "resetFromView", "", "app_opensourceDebug"})
public final class VerticalChangeHandler extends com.bluelinelabs.conductor.changehandler.AnimatorChangeHandler {
    
    @java.lang.Override()
    protected void resetFromView(@org.jetbrains.annotations.NotNull()
    android.view.View from) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.animation.Animator getAnimator(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.view.View from, @org.jetbrains.annotations.Nullable()
    android.view.View to, boolean isPush, boolean toAddedToContainer) {
        return null;
    }
    
    public VerticalChangeHandler() {
        super();
    }
}