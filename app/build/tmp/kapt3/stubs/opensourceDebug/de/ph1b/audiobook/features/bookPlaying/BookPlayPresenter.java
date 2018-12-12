package de.ph1b.audiobook.features.bookPlaying;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020$H\u0016J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0016J\u001a\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020$H\u0016J\b\u00103\u001a\u00020$H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00064"}, d2 = {"Lde/ph1b/audiobook/features/bookPlaying/BookPlayPresenter;", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$Presenter;", "bookId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "bookRepository", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getBookRepository", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setBookRepository", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "bookmarkRepo", "Lde/ph1b/audiobook/data/repo/BookmarkRepo;", "getBookmarkRepo", "()Lde/ph1b/audiobook/data/repo/BookmarkRepo;", "setBookmarkRepo", "(Lde/ph1b/audiobook/data/repo/BookmarkRepo;)V", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "getPlayStateManager", "()Lde/ph1b/audiobook/playback/PlayStateManager;", "setPlayStateManager", "(Lde/ph1b/audiobook/playback/PlayStateManager;)V", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "getPlayerController", "()Lde/ph1b/audiobook/playback/PlayerController;", "setPlayerController", "(Lde/ph1b/audiobook/playback/PlayerController;)V", "sleepTimer", "Lde/ph1b/audiobook/playback/SleepTimer;", "getSleepTimer", "()Lde/ph1b/audiobook/playback/SleepTimer;", "setSleepTimer", "(Lde/ph1b/audiobook/playback/SleepTimer;)V", "addBookmark", "", "fastForward", "next", "onAttach", "view", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$View;", "playPause", "previous", "rewind", "seekTo", "position", "", "file", "Ljava/io/File;", "toggleSkipSilence", "toggleSleepTimer", "app_opensourceDebug"})
public final class BookPlayPresenter extends de.ph1b.audiobook.features.bookPlaying.BookPlayMvp.Presenter {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository bookRepository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.PlayerController playerController;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.PlayStateManager playStateManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.SleepTimer sleepTimer;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookmarkRepo bookmarkRepo;
    private final java.util.UUID bookId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getBookRepository() {
        return null;
    }
    
    public final void setBookRepository(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayerController getPlayerController() {
        return null;
    }
    
    public final void setPlayerController(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayStateManager getPlayStateManager() {
        return null;
    }
    
    public final void setPlayStateManager(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.SleepTimer getSleepTimer() {
        return null;
    }
    
    public final void setSleepTimer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.SleepTimer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookmarkRepo getBookmarkRepo() {
        return null;
    }
    
    public final void setBookmarkRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookmarkRepo p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookPlaying.BookPlayMvp.View view) {
    }
    
    @java.lang.Override()
    public void playPause() {
    }
    
    @java.lang.Override()
    public void rewind() {
    }
    
    @java.lang.Override()
    public void fastForward() {
    }
    
    @java.lang.Override()
    public void next() {
    }
    
    @java.lang.Override()
    public void previous() {
    }
    
    @java.lang.Override()
    public void seekTo(int position, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
    }
    
    @java.lang.Override()
    public void toggleSkipSilence() {
    }
    
    @java.lang.Override()
    public void toggleSleepTimer() {
    }
    
    @java.lang.Override()
    public void addBookmark() {
    }
    
    public BookPlayPresenter(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
        super();
    }
}