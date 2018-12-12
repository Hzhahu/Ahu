package de.ph1b.audiobook.features.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0010\u0012J)\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020 H\u0002J!\u0010$\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J \u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 H\u0002J \u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0017H\u0002J(\u0010+\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0017H\u0002J\u0006\u0010.\u001a\u00020\u001aJ#\u0010/\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010#\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0010\u0010)\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010\'\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u00063"}, d2 = {"Lde/ph1b/audiobook/features/widget/WidgetUpdater;", "", "context", "Landroid/content/Context;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "imageHelper", "Lde/ph1b/audiobook/uitools/ImageHelper;", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "windowManager", "Ljavax/inject/Provider;", "Landroid/view/WindowManager;", "(Landroid/content/Context;Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/uitools/ImageHelper;Lde/ph1b/audiobook/playback/PlayerController;Lde/ph1b/audiobook/playback/PlayStateManager;Ljavax/inject/Provider;)V", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "kotlin.jvm.PlatformType", "isPortrait", "", "()Z", "initElements", "", "remoteViews", "Landroid/widget/RemoteViews;", "book", "Lde/ph1b/audiobook/data/Book;", "coverSize", "", "(Landroid/widget/RemoteViews;Lde/ph1b/audiobook/data/Book;ILkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "initWidgetForAbsentBook", "widgetId", "initWidgetForPresentBook", "(ILde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "setHorizontalVisibility", "widgetWidth", "setVerticalVisibility", "widgetHeight", "singleChapter", "setVisibilities", "width", "height", "update", "updateWidgetForId", "(Lde/ph1b/audiobook/data/Book;ILkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "opts", "Landroid/os/Bundle;", "app_opensourceDebug"})
@dagger.Reusable()
public final class WidgetUpdater {
    private final android.appwidget.AppWidgetManager appWidgetManager = null;
    private final android.content.Context context = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    private final de.ph1b.audiobook.uitools.ImageHelper imageHelper = null;
    private final de.ph1b.audiobook.playback.PlayerController playerController = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final javax.inject.Provider<android.view.WindowManager> windowManager = null;
    
    public final void update() {
    }
    
    private final int widgetWidth(android.os.Bundle opts) {
        return 0;
    }
    
    private final int widgetHeight(android.os.Bundle opts) {
        return 0;
    }
    
    private final void initWidgetForAbsentBook(int widgetId) {
    }
    
    private final boolean isPortrait() {
        return false;
    }
    
    private final void setVisibilities(android.widget.RemoteViews remoteViews, int width, int height, boolean singleChapter) {
    }
    
    private final void setHorizontalVisibility(android.widget.RemoteViews remoteViews, int widgetWidth, int coverSize) {
    }
    
    private final void setVerticalVisibility(android.widget.RemoteViews remoteViews, int widgetHeight, boolean singleChapter) {
    }
    
    @javax.inject.Inject()
    public WidgetUpdater(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.ImageHelper imageHelper, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController playerController, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<android.view.WindowManager> windowManager) {
        super();
    }
}