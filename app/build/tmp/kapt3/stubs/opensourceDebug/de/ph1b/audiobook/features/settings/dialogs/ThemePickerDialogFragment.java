package de.ph1b.audiobook.features.settings.dialogs;

import java.lang.System;

/**
 * * Dialog for picking the UI theme.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/features/settings/dialogs/ThemePickerDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "themePref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Lde/ph1b/audiobook/uitools/ThemeUtil$Theme;", "getThemePref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setThemePref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_opensourceDebug"})
public final class ThemePickerDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "THEME2_KEY")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> themePref;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final de.ph1b.audiobook.features.settings.dialogs.ThemePickerDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> getThemePref() {
        return null;
    }
    
    public final void setThemePref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public ThemePickerDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/features/settings/dialogs/ThemePickerDialogFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}