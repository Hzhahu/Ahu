package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Class that simplifies the permission requesting
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002J)\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lde/ph1b/audiobook/misc/Permissions;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "REQUEST_CODE", "", "permissionSubject", "Lio/reactivex/subjects/PublishSubject;", "", "", "kotlin.jvm.PlatformType", "hasPermission", "", "permission", "onRequestPermissionsResult", "", "requestCode", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "request", "Lio/reactivex/Single;", "Lde/ph1b/audiobook/misc/Permissions$PermissionResult;", "showRationale", "PermissionResult", "app_opensourceDebug"})
public final class Permissions {
    private final int REQUEST_CODE = 1512;
    private final io.reactivex.subjects.PublishSubject<java.lang.String[]> permissionSubject = null;
    private final android.app.Activity activity = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<de.ph1b.audiobook.misc.Permissions.PermissionResult> request(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final boolean hasPermission(java.lang.String permission) {
        return false;
    }
    
    private final boolean showRationale(java.lang.String permission) {
        return false;
    }
    
    public Permissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/misc/Permissions$PermissionResult;", "", "(Ljava/lang/String;I)V", "GRANTED", "DENIED_FOREVER", "DENIED_ASK_AGAIN", "app_opensourceDebug"})
    public static enum PermissionResult {
        /*public static final*/ GRANTED /* = new GRANTED() */,
        /*public static final*/ DENIED_FOREVER /* = new DENIED_FOREVER() */,
        /*public static final*/ DENIED_ASK_AGAIN /* = new DENIED_ASK_AGAIN() */;
        
        PermissionResult() {
        }
    }
}