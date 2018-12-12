package de.ph1b.audiobook.features.folderChooser;

import java.lang.System;

/**
 * * The Presenter for [FolderChooserView]
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0006\u0010\"\u001a\u00020\u001bJ\u0010\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u0007J\u0006\u0010%\u001a\u00020\u001bJ\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020\u001bH\u0003J\f\u0010.\u001a\u00020\u0007*\u00020\u0007H\u0002J\u0012\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000700*\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u00062"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserPresenter;", "Lde/ph1b/audiobook/mvp/Presenter;", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserView;", "()V", "SI_CHOSEN_FILE", "", "chosenFile", "Ljava/io/File;", "collectionBookFolderPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "getCollectionBookFolderPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setCollectionBookFolderPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "rootDirs", "Ljava/util/ArrayList;", "singleBookFolderPref", "getSingleBookFolderPref", "setSingleBookFolderPref", "storageDirFinder", "Lde/ph1b/audiobook/features/folderChooser/StorageDirFinder;", "getStorageDirFinder", "()Lde/ph1b/audiobook/features/folderChooser/StorageDirFinder;", "setStorageDirFinder", "(Lde/ph1b/audiobook/features/folderChooser/StorageDirFinder;)V", "addFileAndTerminate", "", "chosen", "backConsumed", "", "canAddNewFolder", "newFile", "canGoBack", "chooseClicked", "fileSelected", "selectedFile", "gotPermission", "onAttach", "view", "onRestore", "savedState", "Landroid/os/Bundle;", "onSave", "state", "refreshRootDirs", "closestFolder", "getContentsSorted", "", "Companion", "app_opensourceDebug"})
public final class FolderChooserPresenter extends de.ph1b.audiobook.mvp.Presenter<de.ph1b.audiobook.features.folderChooser.FolderChooserView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "singleBookFolders")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> singleBookFolderPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "folders")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> collectionBookFolderPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.folderChooser.StorageDirFinder storageDirFinder;
    private final java.util.ArrayList<java.io.File> rootDirs = null;
    private final java.lang.String SI_CHOSEN_FILE = "siChosenFile";
    private java.io.File chosenFile;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MARSHMALLOW_SD_FALLBACK = "/storage";
    public static final de.ph1b.audiobook.features.folderChooser.FolderChooserPresenter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> getSingleBookFolderPref() {
        return null;
    }
    
    public final void setSingleBookFolderPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> getCollectionBookFolderPref() {
        return null;
    }
    
    public final void setCollectionBookFolderPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.folderChooser.StorageDirFinder getStorageDirFinder() {
        return null;
    }
    
    public final void setStorageDirFinder(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderChooser.StorageDirFinder p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderChooser.FolderChooserView view) {
    }
    
    /**
     * Call this when the read external storage permission was granted. 
     */
    public final void gotPermission() {
    }
    
    /**
     * * Call this when choose was clicked.
     *   *
     *   * Asks the user to add a .nomedia file if there is none. Else calls [FolderChooserView.finish]
     */
    public final void chooseClicked() {
    }
    
    /**
     * * Returns the closest folder. If this is a folder return itself. Else return the parent.
     */
    private final java.io.File closestFolder(@org.jetbrains.annotations.NotNull()
    java.io.File $receiver) {
        return null;
    }
    
    /**
     * Call this when a file was selected by the user or the root folder has changed 
     */
    public final void fileSelected(@org.jetbrains.annotations.Nullable()
    java.io.File selectedFile) {
    }
    
    private final boolean canGoBack() {
        return false;
    }
    
    /**
     * * Call this when the user clicked back.
     *   *
     *   * @return true if the presenter handled the back command.
     */
    public final boolean backConsumed() {
        return false;
    }
    
    private final void addFileAndTerminate(java.io.File chosen) {
    }
    
    /**
     * * @param newFile the new folder file
     *   * *
     *   * @return true if the new folder is not added yet and is no sub- or parent folder of an existing
     *   * * book folder
     */
    private final boolean canAddNewFolder(java.lang.String newFile) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void refreshRootDirs() {
    }
    
    /**
     * Gets the containing files of a folder (restricted to music and folders) in a naturally sorted order.  
     */
    private final java.util.List<java.io.File> getContentsSorted(@org.jetbrains.annotations.NotNull()
    java.io.File $receiver) {
        return null;
    }
    
    @java.lang.Override()
    public void onRestore(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedState) {
    }
    
    @java.lang.Override()
    public void onSave(@org.jetbrains.annotations.NotNull()
    android.os.Bundle state) {
    }
    
    public FolderChooserPresenter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserPresenter$Companion;", "", "()V", "MARSHMALLOW_SD_FALLBACK", "", "getMARSHMALLOW_SD_FALLBACK", "()Ljava/lang/String;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMARSHMALLOW_SD_FALLBACK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}