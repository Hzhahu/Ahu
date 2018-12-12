package de.ph1b.audiobook.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u001e"}, d2 = {"Lde/ph1b/audiobook/injection/PrefsModule;", "", "()V", "crashReportEnabledPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "prefs", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "provideAutoRewindAmountPreference", "", "provideBookmarkOnSleepTimerPreference", "provideCollectionFoldersPreference", "", "", "provideCurrentBookIdPreference", "Ljava/util/UUID;", "provideResumeAfterCallPreference", "provideResumeOnReplugPreference", "provideRxSharedPreferences", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSeekTimePreference", "provideShakeToResetPreference", "provideSharedPreferences", "context", "Landroid/content/Context;", "provideSingleBookFoldersPreference", "provideSleepTimePreference", "provideThemePreference", "Lde/ph1b/audiobook/uitools/ThemeUtil$Theme;", "app_opensourceDebug"})
@dagger.Module()
public final class PrefsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.f2prateek.rx.preferences2.RxSharedPreferences provideRxSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "THEME2_KEY")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> provideThemePreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "RESUME_ON_REPLUG")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> provideResumeOnReplugPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "allowCrashReports")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> crashReportEnabledPref(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "BOOKMARK_ON_SLEEP")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> provideBookmarkOnSleepTimerPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SHAKE_TO_RESET_SLEEP_TIMER")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> provideShakeToResetPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "AUTO_REWIND")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> provideAutoRewindAmountPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SEEK_TIME")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> provideSeekTimePreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SLEEP_TIME")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> provideSleepTimePreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "singleBookFolders")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> provideSingleBookFoldersPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "folders")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> provideCollectionFoldersPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> provideCurrentBookIdPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "resumeAfterCall")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> provideResumeAfterCallPreference(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences prefs) {
        return null;
    }
    
    public PrefsModule() {
        super();
    }
}