package de.ph1b.audiobook.uitools;

import java.lang.System;

/**
 * * Class for retrieving covers from disc.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019H\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\""}, d2 = {"Lde/ph1b/audiobook/uitools/CoverFromDiscCollector;", "", "activityManager", "Landroid/app/ActivityManager;", "imageHelper", "Lde/ph1b/audiobook/uitools/ImageHelper;", "(Landroid/app/ActivityManager;Lde/ph1b/audiobook/uitools/ImageHelper;)V", "coverChangedSubject", "Lio/reactivex/subjects/PublishSubject;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "picasso", "Lcom/squareup/picasso/Picasso;", "coverChanged", "Lio/reactivex/Observable;", "findAndSaveCoverEmbedded", "", "book", "Lde/ph1b/audiobook/data/Book;", "(Lde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "findAndSaveCoverFromDisc", "", "findCoverForBook", "findCovers", "books", "", "(Ljava/util/List;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "getCoverFromDisk", "Landroid/graphics/Bitmap;", "coverFiles", "Ljava/io/File;", "getEmbeddedCover", "chapters", "Lde/ph1b/audiobook/data/Chapter;", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class CoverFromDiscCollector {
    private final com.squareup.picasso.Picasso picasso = null;
    private final io.reactivex.subjects.PublishSubject<java.util.UUID> coverChangedSubject = null;
    private final android.app.ActivityManager activityManager = null;
    private final de.ph1b.audiobook.uitools.ImageHelper imageHelper = null;
    
    /**
     * Find and stores covers for each book 
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findCovers(@org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Book> books, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * emits the bookId of a cover that has changed 
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.UUID> coverChanged() {
        return null;
    }
    
    /**
     * Find the embedded cover of a chapter 
     */
    private final android.graphics.Bitmap getEmbeddedCover(java.util.List<de.ph1b.audiobook.data.Chapter> chapters) {
        return null;
    }
    
    /**
     * Returns the first bitmap that could be parsed from an image file 
     */
    private final android.graphics.Bitmap getCoverFromDisk(java.util.List<? extends java.io.File> coverFiles) {
        return null;
    }
    
    @javax.inject.Inject()
    public CoverFromDiscCollector(@org.jetbrains.annotations.NotNull()
    android.app.ActivityManager activityManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.ImageHelper imageHelper) {
        super();
    }
}