package de.ph1b.audiobook.injection;

import java.lang.System;

/**
 * * Base component that is the entry point for injection.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001$J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001bH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001dH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001eH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001fH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020 H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020!H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\"H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020#H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lde/ph1b/audiobook/injection/AppComponent;", "Lde/ph1b/audiobook/data/di/DataComponent;", "allowCrashReports", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "getAllowCrashReports", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "bookmarkPresenter", "Lde/ph1b/audiobook/features/bookmarks/BookmarkPresenter;", "getBookmarkPresenter", "()Lde/ph1b/audiobook/features/bookmarks/BookmarkPresenter;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "getPlayStateManager", "()Lde/ph1b/audiobook/playback/PlayStateManager;", "player", "Lde/ph1b/audiobook/playback/MediaPlayer;", "getPlayer", "()Lde/ph1b/audiobook/playback/MediaPlayer;", "inject", "", "target", "Lde/ph1b/audiobook/features/audio/LoudnessDialog;", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewController;", "Lde/ph1b/audiobook/features/bookOverview/list/LoadBookCover;", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayController;", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayPresenter;", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserPresenter;", "Lde/ph1b/audiobook/features/folderOverview/FolderOverviewPresenter;", "Lde/ph1b/audiobook/features/imagepicker/ImagePickerController;", "Lde/ph1b/audiobook/features/settings/SettingsController;", "Lde/ph1b/audiobook/injection/App;", "Builder", "app_opensourceDebug"})
@dagger.Component(modules = {de.ph1b.audiobook.injection.AndroidModule.class, de.ph1b.audiobook.injection.PrefsModule.class, de.ph1b.audiobook.injection.BindingModule.class, dagger.android.support.AndroidSupportInjectionModule.class, de.ph1b.audiobook.data.repo.internals.PersistenceModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends de.ph1b.audiobook.data.di.DataComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.features.bookmarks.BookmarkPresenter getBookmarkPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.playback.MediaPlayer getPlayer();
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.playback.PlayStateManager getPlayStateManager();
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "allowCrashReports")
    public abstract de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getAllowCrashReports();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.injection.App target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookPlaying.BookPlayController target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookOverview.list.LoadBookCover target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookPlaying.BookPlayPresenter target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookOverview.BookOverviewController target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderChooser.FolderChooserPresenter target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderOverview.FolderOverviewPresenter target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.imagepicker.ImagePickerController target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.audio.LoudnessDialog target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.settings.SettingsController target);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/injection/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lde/ph1b/audiobook/injection/AppComponent;", "app_opensourceDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract de.ph1b.audiobook.injection.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract de.ph1b.audiobook.injection.AppComponent build();
    }
}