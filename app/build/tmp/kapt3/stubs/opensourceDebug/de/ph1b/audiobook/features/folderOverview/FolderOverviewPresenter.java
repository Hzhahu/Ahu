package de.ph1b.audiobook.features.folderOverview;

import java.lang.System;

/**
 * * The presenter for [FolderOverviewController]
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014R*\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/features/folderOverview/FolderOverviewPresenter;", "Lde/ph1b/audiobook/mvp/Presenter;", "Lde/ph1b/audiobook/features/folderOverview/FolderOverviewController;", "()V", "collectionBookFolderPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "", "getCollectionBookFolderPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setCollectionBookFolderPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "singleBookFolderPref", "getSingleBookFolderPref", "setSingleBookFolderPref", "onAttach", "", "view", "removeFolder", "folder", "Lde/ph1b/audiobook/features/folderOverview/FolderModel;", "app_opensourceDebug"})
public final class FolderOverviewPresenter extends de.ph1b.audiobook.mvp.Presenter<de.ph1b.audiobook.features.folderOverview.FolderOverviewController> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "singleBookFolders")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> singleBookFolderPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "folders")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> collectionBookFolderPref;
    
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
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderOverview.FolderOverviewController view) {
    }
    
    /**
     * removes a selected folder 
     */
    public final void removeFolder(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderOverview.FolderModel folder) {
    }
    
    public FolderOverviewPresenter() {
        super();
    }
}