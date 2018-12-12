package de.ph1b.audiobook.uitools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/uitools/ThemeUtil;", "", "()V", "getResourceId", "", "c", "Landroid/content/Context;", "attr", "Theme", "app_opensourceDebug"})
public final class ThemeUtil {
    public static final de.ph1b.audiobook.uitools.ThemeUtil INSTANCE = null;
    
    @androidx.annotation.AnyRes()
    public final int getResourceId(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @androidx.annotation.AttrRes()
    int attr) {
        return 0;
    }
    
    private ThemeUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lde/ph1b/audiobook/uitools/ThemeUtil$Theme;", "", "nameId", "", "nightMode", "(Ljava/lang/String;III)V", "getNameId", "()I", "getNightMode", "DAY_NIGHT", "DAY", "NIGHT", "app_opensourceDebug"})
    public static enum Theme {
        /*public static final*/ DAY_NIGHT /* = new DAY_NIGHT(0, 0) */,
        /*public static final*/ DAY /* = new DAY(0, 0) */,
        /*public static final*/ NIGHT /* = new NIGHT(0, 0) */;
        private final int nameId = 0;
        private final int nightMode = 0;
        
        public final int getNameId() {
            return 0;
        }
        
        public final int getNightMode() {
            return 0;
        }
        
        Theme(@androidx.annotation.StringRes()
        int nameId, @androidx.appcompat.app.AppCompatDelegate.NightMode()
        int nightMode) {
        }
    }
}