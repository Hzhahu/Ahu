package de.ph1b.audiobook.features.bookPlaying;

import java.lang.System;

/**
 * * Simple dialog for activating the sleep timer
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001fH\u0003J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u000203H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u000208H\u0016J\b\u0010<\u001a\u000203H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\f\"\u0004\b(\u0010\u000eR$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006="}, d2 = {"Lde/ph1b/audiobook/features/bookPlaying/SleepTimerDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "bookId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "()V", "_layoutContainer", "Lde/ph1b/audiobook/misc/DialogLayoutContainer;", "bookmarkOnSleepTimerPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "getBookmarkOnSleepTimerPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setBookmarkOnSleepTimerPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "bookmarkRepo", "Lde/ph1b/audiobook/data/repo/BookmarkRepo;", "getBookmarkRepo", "()Lde/ph1b/audiobook/data/repo/BookmarkRepo;", "setBookmarkRepo", "(Lde/ph1b/audiobook/data/repo/BookmarkRepo;)V", "layoutContainer", "getLayoutContainer", "()Lde/ph1b/audiobook/misc/DialogLayoutContainer;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "selectedMinutes", "", "shakeDetector", "Lde/ph1b/audiobook/playback/ShakeDetector;", "getShakeDetector", "()Lde/ph1b/audiobook/playback/ShakeDetector;", "setShakeDetector", "(Lde/ph1b/audiobook/playback/ShakeDetector;)V", "shakeToResetPref", "getShakeToResetPref", "setShakeToResetPref", "sleepTimePref", "getSleepTimePref", "setSleepTimePref", "sleepTimer", "Lde/ph1b/audiobook/playback/SleepTimer;", "getSleepTimer", "()Lde/ph1b/audiobook/playback/SleepTimer;", "setSleepTimer", "(Lde/ph1b/audiobook/playback/SleepTimer;)V", "appendNumber", "", "number", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSaveInstanceState", "outState", "updateTimeState", "app_opensourceDebug"})
public final class SleepTimerDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookmarkRepo bookmarkRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.SleepTimer sleepTimer;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.ShakeDetector shakeDetector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SHAKE_TO_RESET_SLEEP_TIMER")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> shakeToResetPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "BOOKMARK_ON_SLEEP")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> bookmarkOnSleepTimerPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "SLEEP_TIME")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> sleepTimePref;
    private de.ph1b.audiobook.misc.DialogLayoutContainer _layoutContainer;
    private int selectedMinutes;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookmarkRepo getBookmarkRepo() {
        return null;
    }
    
    public final void setBookmarkRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookmarkRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.SleepTimer getSleepTimer() {
        return null;
    }
    
    public final void setSleepTimer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.SleepTimer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.ShakeDetector getShakeDetector() {
        return null;
    }
    
    public final void setShakeDetector(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.ShakeDetector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getShakeToResetPref() {
        return null;
    }
    
    public final void setShakeToResetPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getBookmarkOnSleepTimerPref() {
        return null;
    }
    
    public final void setBookmarkOnSleepTimerPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> getSleepTimePref() {
        return null;
    }
    
    public final void setSleepTimePref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Integer> p0) {
    }
    
    private final de.ph1b.audiobook.misc.DialogLayoutContainer getLayoutContainer() {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void appendNumber(int number) {
    }
    
    private final void updateTimeState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public SleepTimerDialogFragment() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"ValidFragment"})
    public SleepTimerDialogFragment(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
        super();
    }
}