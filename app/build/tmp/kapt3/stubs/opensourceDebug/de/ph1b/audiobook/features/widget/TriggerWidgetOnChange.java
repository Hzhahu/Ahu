package de.ph1b.audiobook.features.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/features/widget/TriggerWidgetOnChange;", "", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "widgetUpdater", "Lde/ph1b/audiobook/features/widget/WidgetUpdater;", "(Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/playback/PlayStateManager;Lde/ph1b/audiobook/features/widget/WidgetUpdater;)V", "anythingChanged", "Lio/reactivex/Observable;", "bookIdChanged", "currentBookChanged", "Lde/ph1b/audiobook/data/Book;", "init", "", "playStateChanged", "Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "app_opensourceDebug"})
@dagger.Reusable()
public final class TriggerWidgetOnChange {
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final de.ph1b.audiobook.features.widget.WidgetUpdater widgetUpdater = null;
    
    public final void init() {
    }
    
    private final io.reactivex.Observable<java.lang.Object> anythingChanged() {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.UUID> bookIdChanged() {
        return null;
    }
    
    private final io.reactivex.Observable<de.ph1b.audiobook.playback.PlayStateManager.PlayState> playStateChanged() {
        return null;
    }
    
    private final io.reactivex.Observable<de.ph1b.audiobook.data.Book> currentBookChanged() {
        return null;
    }
    
    @javax.inject.Inject()
    public TriggerWidgetOnChange(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.widget.WidgetUpdater widgetUpdater) {
        super();
    }
}