package de.ph1b.audiobook.misc.conductor;

import java.lang.System;

/**
 * * Like [com.bluelinelabs.conductor.ChangeHandlerFrameLayout], but as a CoordinatorLayout
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ4\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lde/ph1b/audiobook/misc/conductor/ChangeHandlerCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/bluelinelabs/conductor/ControllerChangeHandler$ControllerChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inProgressTransactionCount", "onChangeCompleted", "", "to", "Lcom/bluelinelabs/conductor/Controller;", "from", "isPush", "", "container", "Landroid/view/ViewGroup;", "handler", "Lcom/bluelinelabs/conductor/ControllerChangeHandler;", "onChangeStarted", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "app_opensourceDebug"})
public final class ChangeHandlerCoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout implements com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener {
    private int inProgressTransactionCount;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    public void onChangeStarted(@org.jetbrains.annotations.Nullable()
    com.bluelinelabs.conductor.Controller to, @org.jetbrains.annotations.Nullable()
    com.bluelinelabs.conductor.Controller from, boolean isPush, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, @org.jetbrains.annotations.NotNull()
    com.bluelinelabs.conductor.ControllerChangeHandler handler) {
    }
    
    @java.lang.Override()
    public void onChangeCompleted(@org.jetbrains.annotations.Nullable()
    com.bluelinelabs.conductor.Controller to, @org.jetbrains.annotations.Nullable()
    com.bluelinelabs.conductor.Controller from, boolean isPush, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, @org.jetbrains.annotations.NotNull()
    com.bluelinelabs.conductor.ControllerChangeHandler handler) {
    }
    
    public ChangeHandlerCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ChangeHandlerCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ChangeHandlerCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}