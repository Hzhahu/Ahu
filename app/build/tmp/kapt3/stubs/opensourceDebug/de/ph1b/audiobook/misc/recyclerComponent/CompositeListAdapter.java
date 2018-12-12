package de.ph1b.audiobook.misc.recyclerComponent;

import java.lang.System;

/**
 * * An adapter that is designed for composition instead of inheritance.
 * *
 * * Instead of handling the view type and items manually, add a [AdapterComponent] for each view type.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J.\u0010\n\u001a\u00020\u000b\"\b\b\u0001\u0010\u0001*\u00020\u0002\"\b\b\u0002\u0010\f*\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\f0\u000eJ/\u0010\n\u001a\u00020\u000b2\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e0\u000f\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lde/ph1b/audiobook/misc/recyclerComponent/CompositeListAdapter;", "T", "", "Landroidx/recyclerview/widget/ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "helper", "Lde/ph1b/audiobook/misc/recyclerComponent/CompositeAdapterHelper;", "addComponents", "", "VH", "component", "Lde/ph1b/audiobook/misc/recyclerComponent/AdapterComponent;", "", "([Lde/ph1b/audiobook/misc/recyclerComponent/AdapterComponent;)V", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewHolderBound", "app_opensourceDebug"})
public class CompositeListAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.ListAdapter<T, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final de.ph1b.audiobook.misc.recyclerComponent.CompositeAdapterHelper helper = null;
    
    @java.lang.Override()
    public final void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public void onViewHolderBound(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public final int getItemViewType(int position) {
        return 0;
    }
    
    public final <T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder>void addComponents(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.recyclerComponent.AdapterComponent<? super T, VH> component) {
    }
    
    public final void addComponents(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.recyclerComponent.AdapterComponent<?, ?>... component) {
    }
    
    public CompositeListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        super(null);
    }
    
    public CompositeListAdapter() {
        super(null);
    }
}