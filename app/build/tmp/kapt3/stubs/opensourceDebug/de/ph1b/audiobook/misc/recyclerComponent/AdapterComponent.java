package de.ph1b.audiobook.misc.recyclerComponent;

import java.lang.System;

/**
 * * A component for the [CompositeListAdapter].
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0002B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0015H&\u00a2\u0006\u0002\u0010\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/misc/recyclerComponent/AdapterComponent;", "Model", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "modelClazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "viewType", "", "getViewType", "()I", "isForViewType", "", "model", "onBindViewHolder", "", "holder", "(Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_opensourceDebug"})
public abstract class AdapterComponent<Model extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int viewType = 0;
    private final kotlin.reflect.KClass<? super Model> modelClazz = null;
    
    public int getViewType() {
        return 0;
    }
    
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    Model model, @org.jetbrains.annotations.NotNull()
    VH holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
    
    public boolean isForViewType(@org.jetbrains.annotations.NotNull()
    java.lang.Object model) {
        return false;
    }
    
    public AdapterComponent(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? super Model> modelClazz) {
        super();
    }
}