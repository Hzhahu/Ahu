package de.ph1b.audiobook.features.folderChooser;

import java.lang.System;

/**
 * * The view for choosing a root folder.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH&\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserView;", "", "finish", "", "getMode", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;", "newRootFolders", "newFolders", "", "Ljava/io/File;", "setChooseButtonEnabled", "chooseEnabled", "", "setCurrentFolderText", "text", "", "setUpButtonEnabled", "upEnabled", "showNewData", "newData", "showSubFolderWarning", "first", "second", "app_opensourceDebug"})
public abstract interface FolderChooserView {
    
    /**
     * * @param upEnabled True if the up button should be enabled.
     */
    public abstract void setUpButtonEnabled(boolean upEnabled);
    
    /**
     * * @param chooseEnabled True if the choose button should be enabled
     */
    public abstract void setChooseButtonEnabled(boolean chooseEnabled);
    
    /**
     * * Sets the new text to display the chosen folder to the user
     *   *
     *   * @param text the new text
     */
    public abstract void setCurrentFolderText(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    /**
     * * When navigating to another directory this is called to let the view show the new files
     */
    public abstract void showNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> newData);
    
    /**
     * * When the root folder was changed.
     */
    public abstract void newRootFolders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> newFolders);
    
    /**
     * * When all tasks are completed this is called and the view should finish.
     */
    public abstract void finish();
    
    /**
     * * The operation mode for view to handle.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.OperationMode getMode();
    
    /**
     * * Shows a warning that the selected folders are sub-folders of each other.
     */
    public abstract void showSubFolderWarning(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String second);
}