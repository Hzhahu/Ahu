package de.ph1b.audiobook.uitools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lde/ph1b/audiobook/uitools/SimpleTarget;", "Lcom/squareup/picasso/Target;", "onBitmapLoaded", "", "bitmap", "Landroid/graphics/Bitmap;", "from", "Lcom/squareup/picasso/Picasso$LoadedFrom;", "onPrepareLoad", "placeHolderDrawable", "Landroid/graphics/drawable/Drawable;", "app_opensourceDebug"})
public abstract interface SimpleTarget extends com.squareup.picasso.Target {
    
    @java.lang.Override()
    public abstract void onPrepareLoad(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeHolderDrawable);
    
    @java.lang.Override()
    public abstract void onBitmapLoaded(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.Nullable()
    com.squareup.picasso.Picasso.LoadedFrom from);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onPrepareLoad(de.ph1b.audiobook.uitools.SimpleTarget $this, @org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable placeHolderDrawable) {
        }
        
        @java.lang.Override()
        public static void onBitmapLoaded(de.ph1b.audiobook.uitools.SimpleTarget $this, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.Nullable()
        com.squareup.picasso.Picasso.LoadedFrom from) {
        }
    }
}