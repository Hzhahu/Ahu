package de.ph1b.audiobook.features.bookOverview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0017\u001a\u00020\u0018J(\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\u0018J0\u0010\u0014\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\"\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006#"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/BookOverviewViewModel;", "", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "bookAdder", "Lde/ph1b/audiobook/features/BookAdder;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "coverFromDiscCollector", "Lde/ph1b/audiobook/uitools/CoverFromDiscCollector;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "(Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/features/BookAdder;Lde/ph1b/audiobook/playback/PlayStateManager;Lde/ph1b/audiobook/playback/PlayerController;Lde/ph1b/audiobook/uitools/CoverFromDiscCollector;Lde/ph1b/audiobook/persistence/pref/Pref;)V", "coverChanged", "Lio/reactivex/Observable;", "getCoverChanged", "()Lio/reactivex/Observable;", "state", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState;", "getState", "attach", "", "content", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$Content;", "books", "", "Lde/ph1b/audiobook/data/Book;", "currentBookId", "playing", "", "playPause", "scannerActive", "app_opensourceDebug"})
public final class BookOverviewViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.UUID> coverChanged = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.features.BookAdder bookAdder = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    private final de.ph1b.audiobook.playback.PlayerController playerController = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    
    public final void attach() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.UUID> getCoverChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<de.ph1b.audiobook.features.bookOverview.BookOverviewState> getState() {
        return null;
    }
    
    private final de.ph1b.audiobook.features.bookOverview.BookOverviewState state(java.util.List<de.ph1b.audiobook.data.Book> books, boolean scannerActive, java.util.UUID currentBookId, boolean playing) {
        return null;
    }
    
    private final de.ph1b.audiobook.features.bookOverview.BookOverviewState.Content content(java.util.List<de.ph1b.audiobook.data.Book> books, java.util.UUID currentBookId, boolean playing) {
        return null;
    }
    
    public final void playPause() {
    }
    
    @javax.inject.Inject()
    public BookOverviewViewModel(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.BookAdder bookAdder, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController playerController, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.CoverFromDiscCollector coverFromDiscCollector, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref) {
        super();
    }
}