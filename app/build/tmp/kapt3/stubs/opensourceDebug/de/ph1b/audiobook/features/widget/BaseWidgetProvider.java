package de.ph1b.audiobook.features.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lde/ph1b/audiobook/features/widget/BaseWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "widgetUpdater", "Lde/ph1b/audiobook/features/widget/WidgetUpdater;", "getWidgetUpdater", "()Lde/ph1b/audiobook/features/widget/WidgetUpdater;", "setWidgetUpdater", "(Lde/ph1b/audiobook/features/widget/WidgetUpdater;)V", "onAppWidgetOptionsChanged", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetIds", "", "app_opensourceDebug"})
public final class BaseWidgetProvider extends android.appwidget.AppWidgetProvider {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.widget.WidgetUpdater widgetUpdater;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.widget.WidgetUpdater getWidgetUpdater() {
        return null;
    }
    
    public final void setWidgetUpdater(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.widget.WidgetUpdater p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    @java.lang.Override()
    public void onAppWidgetOptionsChanged(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, @org.jetbrains.annotations.NotNull()
    android.os.Bundle newOptions) {
    }
    
    public BaseWidgetProvider() {
        super();
    }
}