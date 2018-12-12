package de.ph1b.audiobook.misc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a3\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u000b*\b\u0012\u0004\u0012\u0002H\u00050\f2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0086\b\u001a(\u0010\u0010\u001a\u00020\n*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e\u001a\u001d\u0010\u0015\u001a\u00020\n*\u00020\u00162\u000e\b\u0004\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0086\b\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u00a8\u0006\u001c"}, d2 = {"bottomCompoundDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/widget/TextView;", "clicks", "Lio/reactivex/Observable;", "T", "Landroid/view/View;", "(Landroid/view/View;)Lio/reactivex/Observable;", "endCompoundDrawable", "itemSelections", "", "Landroid/widget/Adapter;", "Landroid/widget/AdapterView;", "listener", "Lkotlin/Function1;", "", "onProgressChanged", "Landroid/widget/SeekBar;", "initialNotification", "", "progressChanged", "postedIfComputingLayout", "Landroidx/recyclerview/widget/RecyclerView;", "action", "Lkotlin/Function0;", "progressChangedStream", "startCompoundDrawable", "topCompoundDrawable", "app_opensourceDebug"})
public final class ViewExtensionsKt {
    
    public static final void onProgressChanged(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar $receiver, boolean initialNotification, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progressChanged) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Observable<java.lang.Integer> progressChangedStream(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar $receiver, boolean initialNotification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends android.view.View>io.reactivex.Observable<T> clicks(@org.jetbrains.annotations.NotNull()
    T $receiver) {
        return null;
    }
    
    public static final <T extends android.widget.Adapter>void itemSelections(@org.jetbrains.annotations.NotNull()
    android.widget.AdapterView<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable startCompoundDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable topCompoundDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable endCompoundDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable bottomCompoundDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver) {
        return null;
    }
    
    /**
     * if the recyclerview is computing layout, post the action. else just execute it 
     */
    public static final void postedIfComputingLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
}