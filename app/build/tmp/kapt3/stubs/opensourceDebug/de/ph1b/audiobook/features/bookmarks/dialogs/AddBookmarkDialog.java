package de.ph1b.audiobook.features.bookmarks.dialogs;

import java.lang.System;

/**
 * * Dialog for chosing a title for a new bookmark.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog;", "Lde/ph1b/audiobook/misc/DialogController;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedViewState", "Landroid/os/Bundle;", "Callback", "Companion", "app_opensourceDebug"})
public final class AddBookmarkDialog extends de.ph1b.audiobook.misc.DialogController {
    public static final de.ph1b.audiobook.features.bookmarks.dialogs.AddBookmarkDialog.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedViewState) {
        return null;
    }
    
    public AddBookmarkDialog() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog$Callback;", "", "onBookmarkNameChosen", "", "name", "", "app_opensourceDebug"})
    public static abstract interface Callback {
        
        public abstract void onBookmarkNameChosen(@org.jetbrains.annotations.NotNull()
        java.lang.String name);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u0004\"\f\b\u0000\u0010\u0005*\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0005H\u0086\u0002\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog$Companion;", "", "()V", "invoke", "Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog;", "T", "Lcom/bluelinelabs/conductor/Controller;", "Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog$Callback;", "target", "(Lcom/bluelinelabs/conductor/Controller;)Lde/ph1b/audiobook/features/bookmarks/dialogs/AddBookmarkDialog;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends com.bluelinelabs.conductor.Controller & de.ph1b.audiobook.features.bookmarks.dialogs.AddBookmarkDialog.Callback>de.ph1b.audiobook.features.bookmarks.dialogs.AddBookmarkDialog invoke(@org.jetbrains.annotations.NotNull()
        T target) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}