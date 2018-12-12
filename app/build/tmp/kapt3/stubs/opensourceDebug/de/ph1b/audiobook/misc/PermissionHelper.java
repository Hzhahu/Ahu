package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Simple helper for obtaining android api 23 permissions
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/misc/PermissionHelper;", "", "activity", "Landroid/app/Activity;", "permissions", "Lde/ph1b/audiobook/misc/Permissions;", "(Landroid/app/Activity;Lde/ph1b/audiobook/misc/Permissions;)V", "PERMISSION", "", "permissionDialogConfirmed", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "handleDeniedForever", "root", "Landroid/view/View;", "showRationale", "listener", "Lkotlin/Function0;", "storagePermission", "gotPermission", "app_opensourceDebug"})
public final class PermissionHelper {
    private final java.lang.String PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> permissionDialogConfirmed = null;
    private final android.app.Activity activity = null;
    private final de.ph1b.audiobook.misc.Permissions permissions = null;
    
    public final void storagePermission(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> gotPermission) {
    }
    
    private final void showRationale(android.view.View root, kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    private final void handleDeniedForever(android.view.View root) {
    }
    
    public PermissionHelper(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.Permissions permissions) {
        super();
    }
}