package de.ph1b.audiobook.features;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u0014J\"\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010&\u001a\u00020\'H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0007H\u0004J\b\u0010)\u001a\u00020\'H\u0016J\n\u0010*\u001a\u00020\'*\u00020\u001bJ\n\u0010+\u001a\u00020\'*\u00020,R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lde/ph1b/audiobook/features/BaseController;", "Lcom/bluelinelabs/conductor/RestoreViewOnCreateController;", "Lkotlinx/android/extensions/LayoutContainer;", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "_containerView", "Landroid/view/View;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "containerView", "getContainerView", "()Landroid/view/View;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "layoutRes", "", "getLayoutRes", "()I", "onCreateViewDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "onCreateViewJobs", "Ljava/util/ArrayList;", "Lkotlinx/coroutines/experimental/Job;", "Lkotlin/collections/ArrayList;", "getString", "", "resId", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedViewState", "onDestroyView", "", "view", "onViewCreated", "cancelOnDestroyView", "disposeOnDestroyView", "Lio/reactivex/disposables/Disposable;", "app_opensourceDebug"})
public abstract class BaseController extends com.bluelinelabs.conductor.RestoreViewOnCreateController implements kotlinx.android.extensions.LayoutContainer {
    private final io.reactivex.disposables.CompositeDisposable onCreateViewDisposables = null;
    private final java.util.ArrayList<kotlinx.coroutines.experimental.Job> onCreateViewJobs = null;
    private android.view.View _containerView;
    private java.util.HashMap _$_findViewCache;
    
    public final void disposeOnDestroyView(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable $receiver) {
    }
    
    public final void cancelOnDestroyView(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.Job $receiver) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedViewState) {
        return null;
    }
    
    @java.lang.Override()
    protected final void onDestroyView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public void onViewCreated() {
    }
    
    public void onDestroyView() {
    }
    
    public BaseController(@org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
        super();
    }
    
    public BaseController() {
        super();
    }
}