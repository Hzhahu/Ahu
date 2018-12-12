package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Adapter for [Spinner] that highlights the current selection and shows multiple lines of text.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BY\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00128\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\tH\u0016J$\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0014\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lde/ph1b/audiobook/misc/MultiLineSpinnerAdapter;", "Type", "Landroid/widget/BaseAdapter;", "Landroid/widget/SpinnerAdapter;", "spinner", "Landroid/widget/Spinner;", "context", "Landroid/content/Context;", "unselectedTextColor", "", "resolveName", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "type", "position", "", "(Landroid/widget/Spinner;Landroid/content/Context;ILkotlin/jvm/functions/Function2;)V", "data", "Ljava/util/ArrayList;", "getCount", "getItem", "(I)Ljava/lang/Object;", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setData", "", "", "app_opensourceDebug"})
public final class MultiLineSpinnerAdapter<Type extends java.lang.Object> extends android.widget.BaseAdapter implements android.widget.SpinnerAdapter {
    private final java.util.ArrayList<Type> data = null;
    private final android.widget.Spinner spinner = null;
    private final android.content.Context context = null;
    private final int unselectedTextColor = 0;
    private final kotlin.jvm.functions.Function2<Type, java.lang.Integer, java.lang.String> resolveName = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public Type getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Type> data) {
    }
    
    public MultiLineSpinnerAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner spinner, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorInt()
    int unselectedTextColor, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super Type, ? super java.lang.Integer, java.lang.String> resolveName) {
        super();
    }
}