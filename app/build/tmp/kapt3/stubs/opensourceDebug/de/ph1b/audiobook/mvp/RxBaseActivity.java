package de.ph1b.audiobook.mvp;

import java.lang.System;

/**
 * * Base activity that provides a convenient way for binding a view to a presenter
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\u000b\u0010\u0014\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\nJ\r\u0010\u0015\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/mvp/RxBaseActivity;", "V", "", "P", "Lde/ph1b/audiobook/mvp/Presenter;", "Lde/ph1b/audiobook/features/BaseActivity;", "()V", "presenterDelegate", "Lde/ph1b/audiobook/mvp/PresenterDelegate;", "newPresenter", "()Lde/ph1b/audiobook/mvp/Presenter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "onStart", "onStop", "presenter", "provideView", "()Ljava/lang/Object;", "app_opensourceDebug"})
public abstract class RxBaseActivity<V extends java.lang.Object, P extends de.ph1b.audiobook.mvp.Presenter<V>> extends de.ph1b.audiobook.features.BaseActivity {
    private final de.ph1b.audiobook.mvp.PresenterDelegate<V, P> presenterDelegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract P newPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract V provideView();
    
    @org.jetbrains.annotations.NotNull()
    public final P presenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public RxBaseActivity() {
        super();
    }
}