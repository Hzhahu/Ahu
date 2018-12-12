package de.ph1b.audiobook.uitools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u001b"}, d2 = {"Lde/ph1b/audiobook/uitools/ImageHelper;", "", "windowManager", "Ljavax/inject/Provider;", "Landroid/view/WindowManager;", "(Ljavax/inject/Provider;)V", "smallerScreenSize", "", "getSmallerScreenSize", "()I", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "width", "height", "getEmbeddedCover", "f", "Ljava/io/File;", "saveCover", "", "bitmap", "destination", "(Landroid/graphics/Bitmap;Ljava/io/File;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class ImageHelper {
    private final javax.inject.Provider<android.view.WindowManager> windowManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap drawableToBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable, int width, int height) {
        return null;
    }
    
    /**
     * * Saves a bitmap as a file to the personal directory.
     *
     *   * @param bitmap The bitmap to be saved
     */
    @org.jetbrains.annotations.Nullable()
    public final synchronized java.lang.Object saveCover(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.io.File destination, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @kotlin.Suppress(names = {"deprecation"})
    public final int getSmallerScreenSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getEmbeddedCover(@org.jetbrains.annotations.NotNull()
    java.io.File f) {
        return null;
    }
    
    private final int calculateInSampleSize(android.graphics.BitmapFactory.Options options) {
        return 0;
    }
    
    @javax.inject.Inject()
    public ImageHelper(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<android.view.WindowManager> windowManager) {
        super();
    }
}