package de.ph1b.audiobook.features.imagepicker;

import java.lang.System;

/**
 * * Layout that enables a crop selection. Put this on top of over another view.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002ABB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\n \u000b*\u0004\u0018\u00010\n0\nH\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0014J(\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0014J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u000207H\u0017J\b\u00108\u001a\u00020-H\u0002J\b\u00109\u001a\u00020-H\u0002J\u000e\u0010:\u001a\u0004\u0018\u00010\u0018*\u000207H\u0002J\u001c\u0010;\u001a\u00020-*\u00020\n2\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020*H\u0002J\u0015\u0010>\u001a\u00020!*\u00020*2\u0006\u0010?\u001a\u00020*H\u0082\u0004J\u0014\u0010@\u001a\u00020-*\u00020\r2\u0006\u0010 \u001a\u00020*H\u0002R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\'\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lde/ph1b/audiobook/features/imagepicker/CropOverlay;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomCircle", "Landroid/view/View;", "kotlin.jvm.PlatformType", "bounds", "Landroid/graphics/RectF;", "darkeningPaint", "Landroid/graphics/Paint;", "dragRect", "dragRectCache", "eventType", "Lde/ph1b/audiobook/features/imagepicker/CropOverlay$EventType;", "lastTouchPoint", "Landroid/graphics/PointF;", "leftCircle", "resizeType", "Lde/ph1b/audiobook/features/imagepicker/CropOverlay$Resize;", "rightCircle", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "selectedRect", "Landroid/graphics/Rect;", "getSelectedRect", "()Landroid/graphics/Rect;", "value", "", "selectionOn", "getSelectionOn", "()Z", "setSelectionOn", "(Z)V", "topCircle", "touchOffset", "minRectSize", "", "newCircle", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldW", "oldH", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "preserveBounds", "preserveSize", "asResizeType", "center", "x", "y", "inRangeOf", "target", "squareInset", "EventType", "Resize", "app_opensourceDebug"})
public final class CropOverlay extends android.widget.FrameLayout {
    private final android.view.View leftCircle = null;
    private final android.view.View topCircle = null;
    private final android.view.View rightCircle = null;
    private final android.view.View bottomCircle = null;
    private final android.graphics.PointF lastTouchPoint = null;
    private final android.graphics.RectF dragRectCache = null;
    private final android.graphics.RectF dragRect = null;
    private final android.graphics.RectF bounds = null;
    private final android.graphics.Paint darkeningPaint = null;
    private final android.view.ScaleGestureDetector scaleGestureDetector = null;
    private boolean selectionOn;
    private de.ph1b.audiobook.features.imagepicker.CropOverlay.EventType eventType;
    private de.ph1b.audiobook.features.imagepicker.CropOverlay.Resize resizeType;
    private final int touchOffset = 0;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getSelectionOn() {
        return false;
    }
    
    public final void setSelectionOn(boolean value) {
    }
    
    private final android.view.View newCircle() {
        return null;
    }
    
    private final float minRectSize() {
        return 0.0F;
    }
    
    private final boolean inRangeOf(float $receiver, float target) {
        return false;
    }
    
    private final de.ph1b.audiobook.features.imagepicker.CropOverlay.Resize asResizeType(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent $receiver) {
        return null;
    }
    
    private final void squareInset(@org.jetbrains.annotations.NotNull()
    android.graphics.RectF $receiver, float value) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final void preserveBounds() {
    }
    
    private final void preserveSize() {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldW, int oldH) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Rect getSelectedRect() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void center(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, float x, float y) {
    }
    
    public CropOverlay(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public CropOverlay(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CropOverlay(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lde/ph1b/audiobook/features/imagepicker/CropOverlay$EventType;", "", "(Ljava/lang/String;I)V", "DRAG", "RESIZE", "app_opensourceDebug"})
    public static enum EventType {
        /*public static final*/ DRAG /* = new DRAG() */,
        /*public static final*/ RESIZE /* = new RESIZE() */;
        
        EventType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/features/imagepicker/CropOverlay$Resize;", "", "(Ljava/lang/String;I)V", "TOP", "RIGHT", "BOTTOM", "LEFT", "app_opensourceDebug"})
    public static enum Resize {
        /*public static final*/ TOP /* = new TOP() */,
        /*public static final*/ RIGHT /* = new RIGHT() */,
        /*public static final*/ BOTTOM /* = new BOTTOM() */,
        /*public static final*/ LEFT /* = new LEFT() */;
        
        Resize() {
        }
    }
}