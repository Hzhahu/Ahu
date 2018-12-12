package de.ph1b.audiobook.features.bookOverview;

import java.lang.System;

/**
 * * Bottom sheet dialog fragment that will be displayed when a book edit was requested
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "bookId", "Ljava/util/UUID;", "callback", "Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet$Callback;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "tintLeftDrawable", "", "textView", "Landroid/widget/TextView;", "Callback", "Companion", "app_opensourceDebug"})
public final class EditBookBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    private static final java.lang.String NI_BOOK = "ni#book";
    private static final java.lang.String NI_TARGET = "ni#target";
    public static final de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    private final de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet.Callback callback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void tintLeftDrawable(android.widget.TextView textView) {
    }
    
    private final java.util.UUID bookId() {
        return null;
    }
    
    public EditBookBottomSheet() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet$Callback;", "", "onFileCoverRequested", "", "book", "Lde/ph1b/audiobook/data/Book;", "onInternetCoverRequested", "app_opensourceDebug"})
    public static abstract interface Callback {
        
        public abstract void onInternetCoverRequested(@org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.data.Book book);
        
        public abstract void onFileCoverRequested(@org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.data.Book book);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0006\u001a\u00020\u0007\"\f\b\u0000\u0010\b*\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\b2\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet$Companion;", "", "()V", "NI_BOOK", "", "NI_TARGET", "newInstance", "Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet;", "T", "Lcom/bluelinelabs/conductor/Controller;", "Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet$Callback;", "target", "book", "Lde/ph1b/audiobook/data/Book;", "(Lcom/bluelinelabs/conductor/Controller;Lde/ph1b/audiobook/data/Book;)Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends com.bluelinelabs.conductor.Controller & de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet.Callback>de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet newInstance(@org.jetbrains.annotations.NotNull()
        T target, @org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.data.Book book) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}