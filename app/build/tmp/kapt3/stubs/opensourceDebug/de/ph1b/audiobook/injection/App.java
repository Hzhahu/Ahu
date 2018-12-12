package de.ph1b.audiobook.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0\bH\u0016J\b\u00104\u001a\u000205H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\bH\u0016R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR$\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR$\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u00067"}, d2 = {"Lde/ph1b/audiobook/injection/App;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "Ldagger/android/HasServiceInjector;", "Ldagger/android/support/HasSupportFragmentInjector;", "Ldagger/android/HasBroadcastReceiverInjector;", "()V", "activityInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "autoConnectedReceiver", "Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "getAutoConnectedReceiver", "()Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "setAutoConnectedReceiver", "(Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;)V", "bookAdder", "Lde/ph1b/audiobook/features/BookAdder;", "getBookAdder", "()Lde/ph1b/audiobook/features/BookAdder;", "setBookAdder", "(Lde/ph1b/audiobook/features/BookAdder;)V", "broadcastInjector", "Landroid/content/BroadcastReceiver;", "getBroadcastInjector", "setBroadcastInjector", "serviceInjector", "Landroid/app/Service;", "getServiceInjector", "setServiceInjector", "supportFragmentInjector", "Landroidx/fragment/app/Fragment;", "getSupportFragmentInjector", "setSupportFragmentInjector", "themePref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Lde/ph1b/audiobook/uitools/ThemeUtil$Theme;", "getThemePref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setThemePref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "triggerWidgetOnChange", "Lde/ph1b/audiobook/features/widget/TriggerWidgetOnChange;", "getTriggerWidgetOnChange", "()Lde/ph1b/audiobook/features/widget/TriggerWidgetOnChange;", "setTriggerWidgetOnChange", "(Lde/ph1b/audiobook/features/widget/TriggerWidgetOnChange;)V", "broadcastReceiverInjector", "onCreate", "", "Companion", "app_opensourceDebug"})
public final class App extends android.app.Application implements dagger.android.HasActivityInjector, dagger.android.HasServiceInjector, dagger.android.support.HasSupportFragmentInjector, dagger.android.HasBroadcastReceiverInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.BookAdder bookAdder;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Service> serviceInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> broadcastInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.widget.TriggerWidgetOnChange triggerWidgetOnChange;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver autoConnectedReceiver;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "THEME2_KEY")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> themePref;
    @org.jetbrains.annotations.NotNull()
    public static de.ph1b.audiobook.injection.AppComponent component;
    public static final de.ph1b.audiobook.injection.App.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.BookAdder getBookAdder() {
        return null;
    }
    
    public final void setBookAdder(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.BookAdder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityInjector() {
        return null;
    }
    
    public final void setActivityInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Service> getServiceInjector() {
        return null;
    }
    
    public final void setServiceInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Service> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> getBroadcastInjector() {
        return null;
    }
    
    public final void setBroadcastInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getSupportFragmentInjector() {
        return null;
    }
    
    public final void setSupportFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.widget.TriggerWidgetOnChange getTriggerWidgetOnChange() {
        return null;
    }
    
    public final void setTriggerWidgetOnChange(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.widget.TriggerWidgetOnChange p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver getAutoConnectedReceiver() {
        return null;
    }
    
    public final void setAutoConnectedReceiver(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> getThemePref() {
        return null;
    }
    
    public final void setThemePref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<de.ph1b.audiobook.uitools.ThemeUtil.Theme> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Service> serviceInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> broadcastReceiverInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lde/ph1b/audiobook/injection/App$Companion;", "", "()V", "<set-?>", "Lde/ph1b/audiobook/injection/AppComponent;", "component", "getComponent", "()Lde/ph1b/audiobook/injection/AppComponent;", "setComponent", "(Lde/ph1b/audiobook/injection/AppComponent;)V", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final de.ph1b.audiobook.injection.AppComponent getComponent() {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        public final void setComponent(@org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.injection.AppComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}