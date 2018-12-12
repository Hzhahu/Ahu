package de.ph1b.audiobook.features.settings;

import java.lang.System;

/**
 * * Controller for the user settings
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J2\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u00052\b\b\u0001\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J<\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(2\b\b\u0001\u0010#\u001a\u00020\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0*H\u0082\b\u00a2\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u001fH\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t\u00a8\u0006-"}, d2 = {"Lde/ph1b/audiobook/features/settings/SettingsController;", "Lde/ph1b/audiobook/features/BaseController;", "()V", "autoRewindAmountPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "getAutoRewindAmountPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setAutoRewindAmountPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "crashReportEnabledPref", "", "getCrashReportEnabledPref", "setCrashReportEnabledPref", "layoutRes", "getLayoutRes", "()I", "resumeAfterCallPref", "getResumeAfterCallPref", "setResumeAfterCallPref", "resumeOnReplugPref", "getResumeOnReplugPref", "setResumeOnReplugPref", "seekTimePref", "getSeekTimePref", "setSeekTimePref", "themePref", "Lde/ph1b/audiobook/uitools/ThemeUtil$Theme;", "getThemePref", "setThemePref", "onViewCreated", "", "setupSwitchSetting", "settingView", "Lde/ph1b/audiobook/features/settings/SwitchSettingView;", "titleRes", "contentRes", "pref", "setupTextSetting", "doubleSettingView", "Lde/ph1b/audiobook/features/settings/DoubleSettingView;", "onClick", "Lkotlin/Function0;", "(Lde/ph1b/audiobook/features/settings/DoubleSettingView;ILjava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "setupToolbar", "app_opensourceDebug"})
public final class SettingsController extends de.ph1b.audiobook.features.BaseController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "THEME2_KEY")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> themePref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "RESUME_ON_REPLUG")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> resumeOnReplugPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "resumeAfterCall")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> resumeAfterCallPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "AUTO_REWIND")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> autoRewindAmountPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SEEK_TIME")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> seekTimePref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "allowCrashReports")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> crashReportEnabledPref;
    private final int layoutRes = 2131492987;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> getThemePref() {
        return null;
    }
    
    public final void setThemePref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getResumeOnReplugPref() {
        return null;
    }
    
    public final void setResumeOnReplugPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getResumeAfterCallPref() {
        return null;
    }
    
    public final void setResumeAfterCallPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> getAutoRewindAmountPref() {
        return null;
    }
    
    public final void setAutoRewindAmountPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> getSeekTimePref() {
        return null;
    }
    
    public final void setSeekTimePref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getCrashReportEnabledPref() {
        return null;
    }
    
    public final void setCrashReportEnabledPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated() {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupTextSetting(de.ph1b.audiobook.features.settings.DoubleSettingView doubleSettingView, @androidx.annotation.StringRes()
    int titleRes, @androidx.annotation.StringRes()
    java.lang.Integer contentRes, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    private final void setupSwitchSetting(de.ph1b.audiobook.features.settings.SwitchSettingView settingView, @androidx.annotation.StringRes()
    int titleRes, @androidx.annotation.StringRes()
    int contentRes, de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> pref) {
    }
    
    public SettingsController() {
        super(null);
    }
}