package de.ph1b.audiobook.features.folderChooser;

import java.lang.System;

/**
 * * Adapter for displaying files and folders.
 * * Constructor that initializes the class with the necessary values
 * *
 * * @param c The context
 * * @param mode The operation mode which defines the interaction.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\b\u0012\u0004\u0012\u00020\t`\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lde/ph1b/audiobook/features/folderChooser/FolderChooserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lde/ph1b/audiobook/features/folderChooser/Holder;", "c", "Landroid/content/Context;", "mode", "Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;", "listener", "Lkotlin/Function1;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "selected", "", "(Landroid/content/Context;Lde/ph1b/audiobook/features/folderChooser/FolderChooserActivity$OperationMode;Lkotlin/jvm/functions/Function1;)V", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "newData", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_opensourceDebug"})
public final class FolderChooserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<de.ph1b.audiobook.features.folderChooser.Holder> {
    private final java.util.ArrayList<java.io.File> data = null;
    private final android.content.Context c = null;
    private final de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.OperationMode mode = null;
    private final kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> listener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderChooser.Holder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderChooser.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void newData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> newData) {
    }
    
    public FolderChooserAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderChooser.FolderChooserActivity.OperationMode mode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> listener) {
        super();
    }
}