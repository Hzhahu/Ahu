package de.ph1b.audiobook.features.crashlytics;

import java.lang.System;

/**
 * * No-Op proxy for crashlytics
 */
@kotlin.Suppress(names = {"UNUSED_PARAMETER"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lde/ph1b/audiobook/features/crashlytics/CrashlyticsProxy;", "Lde/ph1b/audiobook/misc/ErrorReporter;", "()V", "init", "", "app", "Landroid/app/Application;", "enabled", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "log", "message", "", "logException", "throwable", "", "app_opensourceDebug"})
public final class CrashlyticsProxy implements de.ph1b.audiobook.misc.ErrorReporter {
    public static final de.ph1b.audiobook.features.crashlytics.CrashlyticsProxy INSTANCE = null;
    
    @java.lang.Override()
    public void log(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void logException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> enabled) {
    }
    
    private CrashlyticsProxy() {
        super();
    }
}