package de.ph1b.audiobook.features.folderChooser;

import java.lang.System;

/**
 * * Finder for external storages.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/StorageDirFinder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "storageDirs", "", "Ljava/io/File;", "storageDirs2", "", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class StorageDirFinder {
    private final android.content.Context context = null;
    
    /**
     * * Collects the storage dirs of the device.
     *   *
     *   * @return the list of storages.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresPermission(value = "android.permission.READ_EXTERNAL_STORAGE")
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final java.util.List<java.io.File> storageDirs() {
        return null;
    }
    
    private final java.util.List<java.lang.String> storageDirs2() {
        return null;
    }
    
    @javax.inject.Inject()
    public StorageDirFinder(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}