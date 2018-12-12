package de.ph1b.audiobook.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016H\u0017J\n\u0010\u0019\u001a\u00020\u0010*\u00020\u001aR\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lde/ph1b/audiobook/mvp/Presenter;", "V", "", "()V", "attached", "", "getAttached", "()Z", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "internalView", "Ljava/lang/Object;", "view", "getView", "()Ljava/lang/Object;", "attach", "", "(Ljava/lang/Object;)V", "detach", "onAttach", "onRestore", "savedState", "Landroid/os/Bundle;", "onSave", "state", "disposeOnDetach", "Lio/reactivex/disposables/Disposable;", "app_opensourceDebug"})
public abstract class Presenter<V extends java.lang.Object> {
    private V internalView;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final V getView() {
        return null;
    }
    
    public final boolean getAttached() {
        return false;
    }
    
    @androidx.annotation.CallSuper()
    public void onRestore(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedState) {
    }
    
    public final void attach(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    public final void detach() {
    }
    
    @androidx.annotation.CallSuper()
    public void onSave(@org.jetbrains.annotations.NotNull()
    android.os.Bundle state) {
    }
    
    public void onAttach(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    public final void disposeOnDetach(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable $receiver) {
    }
    
    public Presenter() {
        super();
    }
}