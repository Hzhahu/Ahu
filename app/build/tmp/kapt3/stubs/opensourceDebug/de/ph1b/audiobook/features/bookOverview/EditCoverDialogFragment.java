package de.ph1b.audiobook.features.bookOverview;

import java.lang.System;

/**
 * * Simple dialog to edit the cover of a book.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "imageHelper", "Lde/ph1b/audiobook/uitools/ImageHelper;", "getImageHelper", "()Lde/ph1b/audiobook/uitools/ImageHelper;", "setImageHelper", "(Lde/ph1b/audiobook/uitools/ImageHelper;)V", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Callback", "Companion", "app_opensourceDebug"})
public final class EditCoverDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.uitools.ImageHelper imageHelper;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final java.lang.String NI_COVER_URI = "ni#coverPath";
    private static final java.lang.String NI_BOOK_ID = "ni#id";
    private static final java.lang.String NI_TARGET = "ni#target";
    public static final de.ph1b.audiobook.features.bookOverview.EditCoverDialogFragment.Companion Companion = null;
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
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public EditCoverDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment$Callback;", "", "onBookCoverChanged", "", "book", "Lde/ph1b/audiobook/data/Book;", "app_opensourceDebug"})
    public static abstract interface Callback {
        
        public abstract void onBookCoverChanged(@org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.data.Book book);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\n\u001a\u00020\u000b\"\f\b\u0000\u0010\f*\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment$Companion;", "", "()V", "NI_BOOK_ID", "", "NI_COVER_URI", "NI_TARGET", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment;", "T", "Lcom/bluelinelabs/conductor/Controller;", "Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment$Callback;", "target", "book", "Lde/ph1b/audiobook/data/Book;", "uri", "Landroid/net/Uri;", "(Lcom/bluelinelabs/conductor/Controller;Lde/ph1b/audiobook/data/Book;Landroid/net/Uri;)Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends com.bluelinelabs.conductor.Controller & de.ph1b.audiobook.features.bookOverview.EditCoverDialogFragment.Callback>de.ph1b.audiobook.features.bookOverview.EditCoverDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        T target, @org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.data.Book book, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}