package de.ph1b.audiobook.features.folderOverview;

import java.lang.System;

/**
 * * Controller that lets the user add, edit or remove the set audio book folders.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001dH\u0014J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006&"}, d2 = {"Lde/ph1b/audiobook/features/folderOverview/FolderOverviewController;", "Lde/ph1b/audiobook/mvp/MvpController;", "Lde/ph1b/audiobook/features/folderOverview/FolderOverviewPresenter;", "()V", "adapter", "Lde/ph1b/audiobook/features/folderOverview/FolderOverviewAdapter;", "buttonRepresentingTheFam", "Landroid/view/View;", "famMenuListener", "de/ph1b/audiobook/features/folderOverview/FolderOverviewController$famMenuListener$1", "Lde/ph1b/audiobook/features/folderOverview/FolderOverviewController$famMenuListener$1;", "layoutRes", "", "getLayoutRes", "()I", "createPresenter", "getFamCenter", "", "point", "Landroid/graphics/Point;", "handleBack", "", "newData", "models", "", "Lde/ph1b/audiobook/features/folderOverview/FolderModel;", "onRestoreViewState", "view", "savedViewState", "Landroid/os/Bundle;", "onSaveViewState", "outState", "onViewCreated", "provideView", "setupToolbar", "startFolderChooserActivity", "operationMode", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;", "app_opensourceDebug"})
public final class FolderOverviewController extends de.ph1b.audiobook.mvp.MvpController<de.ph1b.audiobook.features.folderOverview.FolderOverviewController, de.ph1b.audiobook.features.folderOverview.FolderOverviewPresenter> {
    private final int layoutRes = 2131492927;
    private android.view.View buttonRepresentingTheFam;
    private de.ph1b.audiobook.features.folderOverview.FolderOverviewAdapter adapter;
    private final com.getbase.floatingactionbutton.FloatingActionsMenu.OnFloatingActionsMenuUpdateListener famMenuListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderOverview.FolderOverviewPresenter createPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated() {
    }
    
    private final void setupToolbar() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderOverview.FolderOverviewController provideView() {
        return null;
    }
    
    /**
     * * Calculates the point representing the center of the floating action menus button. Note, that
     *   * the fam is only a container, so we have to calculate the point relatively.
     */
    private final void getFamCenter(android.graphics.Point point) {
    }
    
    @java.lang.Override()
    protected void onRestoreViewState(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.os.Bundle savedViewState) {
    }
    
    private final void startFolderChooserActivity(de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.OperationMode operationMode) {
    }
    
    @java.lang.Override()
    public boolean handleBack() {
        return false;
    }
    
    /**
     * Updates the adapter with new contents. 
     */
    public final void newData(@org.jetbrains.annotations.NotNull()
    java.util.Collection<de.ph1b.audiobook.features.folderOverview.FolderModel> models) {
    }
    
    @java.lang.Override()
    protected void onSaveViewState(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public FolderOverviewController() {
        super(null);
    }
}