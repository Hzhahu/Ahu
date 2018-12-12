package de.ph1b.audiobook.uitools;

import java.lang.System;

/**
 * * Performs cropping based on the crop overlay
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lde/ph1b/audiobook/uitools/CropTransformation;", "Lcom/squareup/picasso/Transformation;", "cropOverlay", "Lde/ph1b/audiobook/features/imagepicker/CropOverlay;", "cropSource", "Landroid/widget/ImageView;", "(Lde/ph1b/audiobook/features/imagepicker/CropOverlay;Landroid/widget/ImageView;)V", "rect", "Landroid/graphics/Rect;", "key", "", "scaleRect", "", "scaleFactor", "", "transform", "Landroid/graphics/Bitmap;", "source", "app_opensourceDebug"})
public final class CropTransformation implements com.squareup.picasso.Transformation {
    private final android.graphics.Rect rect = null;
    private final android.widget.ImageView cropSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap source) {
        return null;
    }
    
    private final void scaleRect(android.graphics.Rect rect, float scaleFactor) {
    }
    
    public CropTransformation(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.imagepicker.CropOverlay cropOverlay, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView cropSource) {
        super();
    }
}