package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * A wrapper that wraps a dialog in a controller
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H$J\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0014J\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lde/ph1b/audiobook/misc/DialogController;", "Lcom/bluelinelabs/conductor/RestoreViewOnCreateController;", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "dialog", "Landroid/app/Dialog;", "dismissed", "", "dismissDialog", "", "onAttach", "view", "Landroid/view/View;", "onCreateDialog", "savedViewState", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDetach", "onSaveViewState", "outState", "showDialog", "router", "Lcom/bluelinelabs/conductor/Router;", "tag", "", "app_opensourceDebug"})
public abstract class DialogController extends com.bluelinelabs.conductor.RestoreViewOnCreateController {
    private android.app.Dialog dialog;
    private boolean dismissed;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedViewState) {
        return null;
    }
    
    @java.lang.Override()
    protected void onSaveViewState(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onAttach(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onDetach(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onDestroyView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    com.bluelinelabs.conductor.Router router, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    public final void dismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedViewState);
    
    public DialogController(@org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
        super();
    }
    
    public DialogController() {
        super();
    }
}