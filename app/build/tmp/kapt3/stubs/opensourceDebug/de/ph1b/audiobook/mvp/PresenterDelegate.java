package de.ph1b.audiobook.mvp;

import java.lang.System;

/**
 * * Delegates lifecycle methods to the presenter.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0002B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u000b\u0010\t\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0001X\u0088\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lde/ph1b/audiobook/mvp/PresenterDelegate;", "V", "", "P", "Lde/ph1b/audiobook/mvp/Presenter;", "newPresenter", "Lkotlin/Function0;", "getView", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "presenter", "Lde/ph1b/audiobook/mvp/Presenter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "onStart", "onStop", "()Lde/ph1b/audiobook/mvp/Presenter;", "app_opensourceDebug"})
public final class PresenterDelegate<V extends java.lang.Object, P extends de.ph1b.audiobook.mvp.Presenter<V>> {
    private P presenter;
    private final kotlin.jvm.functions.Function0<P> newPresenter = null;
    private final kotlin.jvm.functions.Function0<V> getView = null;
    
    @org.jetbrains.annotations.NotNull()
    public final P presenter() {
        return null;
    }
    
    public final void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
    
    public final void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public final void onDestroy() {
    }
    
    public PresenterDelegate(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends P> newPresenter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends V> getView) {
        super();
    }
}