package de.ph1b.audiobook.mvp;

import java.lang.System;

/**
 * * Base controller that provides a convenient way for binding a view to a presenter
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\rJ\r\u0010\u000f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0001X\u0088\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00028\u00018F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lde/ph1b/audiobook/mvp/MvpController;", "V", "", "P", "Lde/ph1b/audiobook/mvp/Presenter;", "Lde/ph1b/audiobook/features/BaseController;", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "internalPresenter", "Lde/ph1b/audiobook/mvp/Presenter;", "presenter", "getPresenter", "()Lde/ph1b/audiobook/mvp/Presenter;", "createPresenter", "provideView", "()Ljava/lang/Object;", "app_opensourceDebug"})
public abstract class MvpController<V extends java.lang.Object, P extends de.ph1b.audiobook.mvp.Presenter<V>> extends de.ph1b.audiobook.features.BaseController {
    private P internalPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final P getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public V provideView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract P createPresenter();
    
    public MvpController(@org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
        super(null);
    }
    
    public MvpController() {
        super(null);
    }
}