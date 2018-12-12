package de.ph1b.audiobook.injection;

import java.lang.System;

/**
 * * Module for dagger bindings
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'\u00a8\u0006\u001f"}, d2 = {"Lde/ph1b/audiobook/injection/BindingModule;", "", "()V", "autoRewindDialogFragment", "Lde/ph1b/audiobook/features/settings/dialogs/AutoRewindDialogFragment;", "baseActivity", "Lde/ph1b/audiobook/features/BaseActivity;", "baseWidgetProvider", "Lde/ph1b/audiobook/features/widget/BaseWidgetProvider;", "editBookBottomSheet", "Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet;", "editBookTitleDialogFragment", "Lde/ph1b/audiobook/features/bookOverview/EditBookTitleDialogFragment;", "editCoverDialogFragment", "Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment;", "folderChooserActivity", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity;", "jumpToPositionDialogFragment", "Lde/ph1b/audiobook/features/bookPlaying/JumpToPositionDialogFragment;", "mainActivity", "Lde/ph1b/audiobook/features/MainActivity;", "playbackService", "Lde/ph1b/audiobook/playback/PlaybackService;", "playbackSpeedDialogFragment", "Lde/ph1b/audiobook/features/settings/dialogs/PlaybackSpeedDialogFragment;", "seekDialogFragment", "Lde/ph1b/audiobook/features/bookPlaying/SeekDialogFragment;", "sleepTimerDialogFragment", "Lde/ph1b/audiobook/features/bookPlaying/SleepTimerDialogFragment;", "themePickerDialogFragment", "Lde/ph1b/audiobook/features/settings/dialogs/ThemePickerDialogFragment;", "app_opensourceDebug"})
@dagger.Module()
public abstract class BindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.MainActivity mainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @PerService()
    @dagger.android.ContributesAndroidInjector(modules = {de.ph1b.audiobook.injection.PlaybackModule.class})
    public abstract de.ph1b.audiobook.playback.PlaybackService playbackService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.settings.dialogs.AutoRewindDialogFragment autoRewindDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.bookOverview.EditCoverDialogFragment editCoverDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.bookOverview.EditBookTitleDialogFragment editBookTitleDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.folderChooser.FolderChooserActivity folderChooserActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.bookPlaying.JumpToPositionDialogFragment jumpToPositionDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.settings.dialogs.PlaybackSpeedDialogFragment playbackSpeedDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.bookPlaying.SeekDialogFragment seekDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.bookPlaying.SleepTimerDialogFragment sleepTimerDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.settings.dialogs.ThemePickerDialogFragment themePickerDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.widget.BaseWidgetProvider baseWidgetProvider();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet editBookBottomSheet();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract de.ph1b.audiobook.features.BaseActivity baseActivity();
    
    public BindingModule() {
        super();
    }
}