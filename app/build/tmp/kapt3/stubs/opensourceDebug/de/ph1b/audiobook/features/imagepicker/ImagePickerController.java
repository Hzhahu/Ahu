package de.ph1b.audiobook.features.imagepicker;

import java.lang.System;

/**
 * * Hosts the image picker.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u000f\u0018\u0000 42\u00020\u0001:\u00014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010*\u001a\u00020(H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0006H\u0014J\u0018\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u00101\u001a\u00020\u0006H\u0014J\b\u00102\u001a\u00020,H\u0017J\b\u00103\u001a\u00020,H\u0003R\u001b\u0010\u0002\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lde/ph1b/audiobook/features/imagepicker/ImagePickerController;", "Lde/ph1b/audiobook/features/BaseController;", "book", "Lde/ph1b/audiobook/data/Book;", "(Lde/ph1b/audiobook/data/Book;)V", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getBook", "()Lde/ph1b/audiobook/data/Book;", "book$delegate", "Lkotlin/Lazy;", "cab", "Lcom/afollestad/materialcab/MaterialCab;", "cabCallback", "de/ph1b/audiobook/features/imagepicker/ImagePickerController$cabCallback$1", "Lde/ph1b/audiobook/features/imagepicker/ImagePickerController$cabCallback$1;", "imageHelper", "Lde/ph1b/audiobook/uitools/ImageHelper;", "getImageHelper", "()Lde/ph1b/audiobook/uitools/ImageHelper;", "setImageHelper", "(Lde/ph1b/audiobook/uitools/ImageHelper;)V", "layoutRes", "", "getLayoutRes", "()I", "originalUrl", "", "getOriginalUrl", "()Ljava/lang/String;", "originalUrl$delegate", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "webViewIsLoading", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "handleBack", "onRestoreViewState", "", "view", "Landroid/view/View;", "savedViewState", "onSaveViewState", "outState", "onViewCreated", "setupToolbar", "Companion", "app_opensourceDebug"})
public final class ImagePickerController extends de.ph1b.audiobook.features.BaseController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.uitools.ImageHelper imageHelper;
    private com.afollestad.materialcab.MaterialCab cab;
    private final com.afollestad.materialcab.MaterialCab.Callback cabCallback = null;
    private io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> webViewIsLoading;
    private final kotlin.Lazy book$delegate = null;
    private final kotlin.Lazy originalUrl$delegate = null;
    private final int layoutRes = 2131492928;
    private static final java.lang.String NI_BOOK_ID = "ni";
    private static final java.lang.String ABOUT_BLANK = "about:blank";
    private static final java.lang.String SI_URL = "savedUrl";
    public static final de.ph1b.audiobook.features.imagepicker.ImagePickerController.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.uitools.ImageHelper getImageHelper() {
        return null;
    }
    
    public final void setImageHelper(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.ImageHelper p0) {
    }
    
    private final de.ph1b.audiobook.data.Book getBook() {
        return null;
    }
    
    private final java.lang.String getOriginalUrl() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override()
    public void onViewCreated() {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final void setupToolbar() {
    }
    
    @java.lang.Override()
    protected void onRestoreViewState(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.os.Bundle savedViewState) {
    }
    
    @java.lang.Override()
    public boolean handleBack() {
        return false;
    }
    
    @java.lang.Override()
    protected void onSaveViewState(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public ImagePickerController(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
        super(null);
    }
    
    public ImagePickerController(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/features/imagepicker/ImagePickerController$Companion;", "", "()V", "ABOUT_BLANK", "", "NI_BOOK_ID", "SI_URL", "app_opensourceDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}