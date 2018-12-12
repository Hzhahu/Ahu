package de.ph1b.audiobook.features.bookPlaying;

import java.lang.System;

/**
 * * Base class for book playing interaction.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u000207H\u0002J\b\u0010=\u001a\u000207H\u0016J\b\u0010>\u001a\u000207H\u0016J\b\u0010?\u001a\u000207H\u0016J\u0010\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000207H\u0002J\b\u0010D\u001a\u000207H\u0002J\b\u0010E\u001a\u000207H\u0002J\b\u0010F\u001a\u000207H\u0002J\b\u0010G\u001a\u000207H\u0016J\u0010\u0010H\u001a\u0002072\u0006\u0010:\u001a\u00020\u0016H\u0016J\u0010\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\rj\b\u0012\u0004\u0012\u00020\u000b`\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\"8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R+\u0010)\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\"8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R7\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0-2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0-8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010!\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u0006L"}, d2 = {"Lde/ph1b/audiobook/features/bookPlaying/BookPlayController;", "Lde/ph1b/audiobook/mvp/MvpController;", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$View;", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$Presenter;", "bookId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "currentChapter", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayChapter;", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "equalizer", "Lde/ph1b/audiobook/features/audio/Equalizer;", "getEqualizer", "()Lde/ph1b/audiobook/features/audio/Equalizer;", "setEqualizer", "(Lde/ph1b/audiobook/features/audio/Equalizer;)V", "layoutRes", "", "getLayoutRes", "()I", "<set-?>", "Lde/ph1b/audiobook/uitools/PlayPauseDrawableSetter;", "playPauseDrawableSetter", "getPlayPauseDrawableSetter", "()Lde/ph1b/audiobook/uitools/PlayPauseDrawableSetter;", "setPlayPauseDrawableSetter", "(Lde/ph1b/audiobook/uitools/PlayPauseDrawableSetter;)V", "playPauseDrawableSetter$delegate", "Lkotlin/properties/ReadWriteProperty;", "Landroid/view/MenuItem;", "skipSilenceItem", "getSkipSilenceItem", "()Landroid/view/MenuItem;", "setSkipSilenceItem", "(Landroid/view/MenuItem;)V", "skipSilenceItem$delegate", "sleepTimerItem", "getSleepTimerItem", "setSleepTimerItem", "sleepTimerItem$delegate", "Lde/ph1b/audiobook/misc/MultiLineSpinnerAdapter;", "spinnerAdapter", "getSpinnerAdapter", "()Lde/ph1b/audiobook/misc/MultiLineSpinnerAdapter;", "setSpinnerAdapter", "(Lde/ph1b/audiobook/misc/MultiLineSpinnerAdapter;)V", "spinnerAdapter$delegate", "createPresenter", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayPresenter;", "finish", "", "formatTime", "", "ms", "duration", "launchJumpToPositionDialog", "onDestroyView", "onViewCreated", "openSleepTimeDialog", "render", "book", "Lde/ph1b/audiobook/data/Book;", "setupClicks", "setupSeekBar", "setupSpinner", "setupToolbar", "showBookmarkAdded", "showLeftSleepTime", "showPlaying", "playing", "", "app_opensourceDebug"})
public final class BookPlayController extends de.ph1b.audiobook.mvp.MvpController<de.ph1b.audiobook.features.bookPlaying.BookPlayMvp.View, de.ph1b.audiobook.features.bookPlaying.BookPlayMvp.Presenter> implements de.ph1b.audiobook.features.bookPlaying.BookPlayMvp.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.audio.Equalizer equalizer;
    private final java.util.ArrayList<de.ph1b.audiobook.features.bookPlaying.BookPlayChapter> data = null;
    private final java.util.UUID bookId = null;
    private de.ph1b.audiobook.features.bookPlaying.BookPlayChapter currentChapter;
    private final int layoutRes = 2131492900;
    private final kotlin.properties.ReadWriteProperty spinnerAdapter$delegate = null;
    private final kotlin.properties.ReadWriteProperty sleepTimerItem$delegate = null;
    private final kotlin.properties.ReadWriteProperty skipSilenceItem$delegate = null;
    private final kotlin.properties.ReadWriteProperty playPauseDrawableSetter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.audio.Equalizer getEqualizer() {
        return null;
    }
    
    public final void setEqualizer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.audio.Equalizer p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.bookPlaying.BookPlayPresenter createPresenter() {
        return null;
    }
    
    private final de.ph1b.audiobook.misc.MultiLineSpinnerAdapter<de.ph1b.audiobook.features.bookPlaying.BookPlayChapter> getSpinnerAdapter() {
        return null;
    }
    
    private final void setSpinnerAdapter(de.ph1b.audiobook.misc.MultiLineSpinnerAdapter<de.ph1b.audiobook.features.bookPlaying.BookPlayChapter> p0) {
    }
    
    private final android.view.MenuItem getSleepTimerItem() {
        return null;
    }
    
    private final void setSleepTimerItem(android.view.MenuItem p0) {
    }
    
    private final android.view.MenuItem getSkipSilenceItem() {
        return null;
    }
    
    private final void setSkipSilenceItem(android.view.MenuItem p0) {
    }
    
    private final de.ph1b.audiobook.uitools.PlayPauseDrawableSetter getPlayPauseDrawableSetter() {
        return null;
    }
    
    private final void setPlayPauseDrawableSetter(de.ph1b.audiobook.uitools.PlayPauseDrawableSetter p0) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    public void onViewCreated() {
    }
    
    private final void setupClicks() {
    }
    
    private final void setupSeekBar() {
    }
    
    private final void setupSpinner() {
    }
    
    private final void setupToolbar() {
    }
    
    @java.lang.Override()
    public void showPlaying(boolean playing) {
    }
    
    private final void launchJumpToPositionDialog() {
    }
    
    @java.lang.Override()
    public void showLeftSleepTime(int ms) {
    }
    
    @java.lang.Override()
    public void openSleepTimeDialog() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void showBookmarkAdded() {
    }
    
    private final java.lang.String formatTime(int ms, int duration) {
        return null;
    }
    
    public BookPlayController(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
        super(null);
    }
    
    public BookPlayController(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
        super(null);
    }
}