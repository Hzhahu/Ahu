package de.ph1b.audiobook.features.audio;

import java.lang.System;

/**
 * * Dialog for controlling the loudness.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lde/ph1b/audiobook/features/audio/LoudnessDialog;", "Lde/ph1b/audiobook/misc/DialogController;", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "dbFormat", "Ljava/text/DecimalFormat;", "player", "Lde/ph1b/audiobook/playback/PlayerController;", "getPlayer", "()Lde/ph1b/audiobook/playback/PlayerController;", "setPlayer", "(Lde/ph1b/audiobook/playback/PlayerController;)V", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "format", "", "kotlin.jvm.PlatformType", "milliDb", "", "onCreateDialog", "Landroid/app/Dialog;", "savedViewState", "Companion", "app_opensourceDebug"})
public final class LoudnessDialog extends de.ph1b.audiobook.misc.DialogController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.PlayerController player;
    private final java.text.DecimalFormat dbFormat = null;
    private static final java.lang.String NI_BOOK_ID = "ni#bookId";
    public static final de.ph1b.audiobook.features.audio.LoudnessDialog.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayerController getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    protected android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedViewState) {
        return null;
    }
    
    private final java.lang.String format(int milliDb) {
        return null;
    }
    
    public LoudnessDialog(@org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/features/audio/LoudnessDialog$Companion;", "", "()V", "NI_BOOK_ID", "", "invoke", "Lde/ph1b/audiobook/features/audio/LoudnessDialog;", "bookId", "Ljava/util/UUID;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final de.ph1b.audiobook.features.audio.LoudnessDialog invoke(@org.jetbrains.annotations.NotNull()
        java.util.UUID bookId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}