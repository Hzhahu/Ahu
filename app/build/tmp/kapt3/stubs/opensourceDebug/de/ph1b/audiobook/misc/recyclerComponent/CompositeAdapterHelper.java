package de.ph1b.audiobook.misc.recyclerComponent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0010\bJ.\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u000bJ/\u0010\u000e\u001a\u00020\u000f2\"\u0010\u0012\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u0013\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0004R6\u0010\t\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000b`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lde/ph1b/audiobook/misc/recyclerComponent/CompositeAdapterHelper;", "", "getItem", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "(Lkotlin/jvm/functions/Function1;)V", "components", "Ljava/util/ArrayList;", "Lde/ph1b/audiobook/misc/recyclerComponent/AdapterComponent;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/collections/ArrayList;", "addComponents", "", "T", "VH", "component", "", "([Lde/ph1b/audiobook/misc/recyclerComponent/AdapterComponent;)V", "componentForViewType", "viewType", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app_opensourceDebug"})
public final class CompositeAdapterHelper {
    private final java.util.ArrayList<de.ph1b.audiobook.misc.recyclerComponent.AdapterComponent<java.lang.Object, androidx.recyclerview.widget.RecyclerView.ViewHolder>> components = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getItem = null;
    
    public final int getItemViewType(int position) {
        return 0;
    }
    
    public final <T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder>void addComponents(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.recyclerComponent.AdapterComponent<? super T, VH> component) {
    }
    
    public final void addComponents(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.recyclerComponent.AdapterComponent<?, ?>... component) {
    }
    
    public final void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final de.ph1b.audiobook.misc.recyclerComponent.AdapterComponent<java.lang.Object, androidx.recyclerview.widget.RecyclerView.ViewHolder> componentForViewType(int viewType) {
        return null;
    }
    
    public CompositeAdapterHelper(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> getItem) {
        super();
    }
}