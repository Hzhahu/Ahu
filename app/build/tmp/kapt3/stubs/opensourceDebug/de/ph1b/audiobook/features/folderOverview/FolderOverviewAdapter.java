package de.ph1b.audiobook.features.folderOverview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lde/ph1b/audiobook/features/folderOverview/FolderOverviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lde/ph1b/audiobook/features/folderOverview/FolderOverviewHolder;", "deleteClicked", "Lkotlin/Function1;", "Lde/ph1b/audiobook/features/folderOverview/FolderModel;", "Lkotlin/ParameterName;", "name", "toDelete", "", "(Lkotlin/jvm/functions/Function1;)V", "items", "Ljava/util/ArrayList;", "getItemCount", "", "newItems", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_opensourceDebug"})
public final class FolderOverviewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<de.ph1b.audiobook.features.folderOverview.FolderOverviewHolder> {
    private final java.util.ArrayList<de.ph1b.audiobook.features.folderOverview.FolderModel> items = null;
    private final kotlin.jvm.functions.Function1<de.ph1b.audiobook.features.folderOverview.FolderModel, kotlin.Unit> deleteClicked = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.ph1b.audiobook.features.folderOverview.FolderOverviewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.folderOverview.FolderOverviewHolder holder, int position) {
    }
    
    public final void newItems(@org.jetbrains.annotations.NotNull()
    java.util.Collection<de.ph1b.audiobook.features.folderOverview.FolderModel> newItems) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public FolderOverviewAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.features.folderOverview.FolderModel, kotlin.Unit> deleteClicked) {
        super();
    }
}