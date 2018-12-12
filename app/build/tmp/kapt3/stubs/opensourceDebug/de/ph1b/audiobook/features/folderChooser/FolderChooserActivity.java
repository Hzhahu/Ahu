package de.ph1b.audiobook.features.folderChooser;

import java.lang.System;

/**
 * * Activity for choosing an audiobook folder. If there are multiple SD-Cards, the Activity unifies
 * * them to a fake-folder structure. We must make sure that this is not choosable. When there are no
 * * multiple sd-cards, we will directly show the content of the 1 SD Card.
 * *
 * *
 * * Use [newInstanceIntent] to get a new intent with the necessary
 * * values.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002:\u000201B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0012H\u0014J\b\u0010\"\u001a\u00020\u0000H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020\u0012H\u0002J\u0016\u0010+\u001a\u00020\u00122\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity;", "Lde/ph1b/audiobook/mvp/RxBaseActivity;", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserView;", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserPresenter;", "()V", "adapter", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserAdapter;", "permissionHelper", "Lde/ph1b/audiobook/misc/PermissionHelper;", "permissions", "Lde/ph1b/audiobook/misc/Permissions;", "spinnerAdapter", "Lde/ph1b/audiobook/misc/MultiLineSpinnerAdapter;", "Ljava/io/File;", "getMode", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;", "newPresenter", "newRootFolders", "", "newFolders", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "provideView", "setChooseButtonEnabled", "chooseEnabled", "", "setCurrentFolderText", "text", "setUpButtonEnabled", "upEnabled", "setupToolbar", "showNewData", "newData", "showSubFolderWarning", "first", "second", "Companion", "OperationMode", "app_opensourceDebug"})
public final class FolderChooserActivity extends de.ph1b.audiobook.mvp.RxBaseActivity<de.ph1b.audiobook.features.folderChooser.FolderChooserView, de.ph1b.audiobook.features.folderChooser.FolderChooserPresenter> implements de.ph1b.audiobook.features.folderChooser.FolderChooserView {
    private de.ph1b.audiobook.features.folderChooser.FolderChooserAdapter adapter;
    private de.ph1b.audiobook.misc.MultiLineSpinnerAdapter<java.io.File> spinnerAdapter;
    private de.ph1b.audiobook.misc.Permissions permissions;
    private de.ph1b.audiobook.misc.PermissionHelper permissionHelper;
    private static final java.lang.String NI_OPERATION_MODE = "niOperationMode";
    public static final de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderChooser.FolderChooserPresenter newPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderChooser.FolderChooserActivity provideView() {
        return null;
    }
    
    @java.lang.Override()
    public void showSubFolderWarning(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String second) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.OperationMode getMode() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupToolbar() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void setCurrentFolderText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void showNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> newData) {
    }
    
    @java.lang.Override()
    public void setChooseButtonEnabled(boolean chooseEnabled) {
    }
    
    @java.lang.Override()
    public void newRootFolders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> newFolders) {
    }
    
    /**
     * * Sets the choose button enabled or disabled, depending on where we are in the hierarchy
     */
    @java.lang.Override()
    public void setUpButtonEnabled(boolean upEnabled) {
    }
    
    public FolderChooserActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;", "", "(Ljava/lang/String;I)V", "COLLECTION_BOOK", "SINGLE_BOOK", "app_opensourceDebug"})
    public static enum OperationMode {
        /*public static final*/ COLLECTION_BOOK /* = new COLLECTION_BOOK() */,
        /*public static final*/ SINGLE_BOOK /* = new SINGLE_BOOK() */;
        
        OperationMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$Companion;", "", "()V", "NI_OPERATION_MODE", "", "newInstanceIntent", "Landroid/content/Intent;", "c", "Landroid/content/Context;", "operationMode", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;", "app_opensourceDebug"})
    public static final class Companion {
        
        /**
         * * Generates a new intent with the necessary extras
         *
         *     * @param c The context
         *     * *
         *     * @param operationMode The operation mode for the activity
         *     * *
         *     * @return The new intent
         */
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newInstanceIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.OperationMode operationMode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}