package de.ph1b.audiobook.uitools;

import java.lang.System;

/**
 * * Creates [Snackbar]s with convenient values set + theming
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/uitools/BetterSnack;", "", "()V", "make", "", "root", "Landroid/view/View;", "text", "", "duration", "Lde/ph1b/audiobook/uitools/BetterSnack$Duration;", "action", "listener", "Lkotlin/Function0;", "Duration", "app_opensourceDebug"})
public final class BetterSnack {
    public static final de.ph1b.audiobook.uitools.BetterSnack INSTANCE = null;
    
    /**
     * * @param root the root for the snackbar
     *   * @param text the text to be displayed
     *   * @param duration the duration of the snacbkar
     *   * @param action the text that should be set as action
     *   * @param listener the listener that should be invoked when an action was made
     */
    public final void make(@org.jetbrains.annotations.NotNull()
    android.view.View root, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.BetterSnack.Duration duration, @org.jetbrains.annotations.Nullable()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    private BetterSnack() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lde/ph1b/audiobook/uitools/BetterSnack$Duration;", "", "internalDuration", "", "(Ljava/lang/String;II)V", "getInternalDuration", "()I", "INDEFINITE_NO_DISMISS", "app_opensourceDebug"})
    public static enum Duration {
        /*public static final*/ INDEFINITE_NO_DISMISS /* = new INDEFINITE_NO_DISMISS(0) */;
        private final int internalDuration = 0;
        
        public final int getInternalDuration() {
            return 0;
        }
        
        Duration(int internalDuration) {
        }
    }
}