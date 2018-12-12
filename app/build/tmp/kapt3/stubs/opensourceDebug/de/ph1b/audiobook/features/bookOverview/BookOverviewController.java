package de.ph1b.audiobook.features.bookOverview;

import java.lang.System;

/**
 * * Showing the shelf of all the available books and provide a navigation to each book.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u00020!H\u0002J\"\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001d2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020=H\u0014J\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020@H\u0014J\u0010\u0010A\u001a\u0002022\u0006\u00105\u001a\u00020!H\u0016J\b\u0010B\u001a\u000202H\u0016J\u0010\u0010C\u001a\u0002022\u0006\u00105\u001a\u00020!H\u0016J\u0010\u0010D\u001a\u0002022\u0006\u00105\u001a\u00020!H\u0016J\b\u0010E\u001a\u000202H\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u000202H\u0002J\b\u0010J\u001a\u000202H\u0002J\b\u0010K\u001a\u000202H\u0002J\b\u0010L\u001a\u000202H\u0002J\u0010\u0010M\u001a\u0002022\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u000202H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b*\u0010\r\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u0006Q"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/BookOverviewController;", "Lde/ph1b/audiobook/features/BaseController;", "Lde/ph1b/audiobook/features/bookOverview/EditCoverDialogFragment$Callback;", "Lde/ph1b/audiobook/features/bookOverview/EditBookBottomSheet$Callback;", "()V", "<set-?>", "Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewAdapter;", "adapter", "getAdapter", "()Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewAdapter;", "setAdapter", "(Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewAdapter;)V", "adapter$delegate", "Lkotlin/properties/ReadWriteProperty;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "getCurrentBookIdPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setCurrentBookIdPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "Lcom/getkeepsafe/taptargetview/TapTargetView;", "currentTapTarget", "getCurrentTapTarget", "()Lcom/getkeepsafe/taptargetview/TapTargetView;", "setCurrentTapTarget", "(Lcom/getkeepsafe/taptargetview/TapTargetView;)V", "currentTapTarget$delegate", "layoutRes", "", "getLayoutRes", "()I", "menuBook", "Lde/ph1b/audiobook/data/Book;", "pendingTransaction", "Landroidx/fragment/app/FragmentTransaction;", "Lde/ph1b/audiobook/uitools/PlayPauseDrawableSetter;", "playPauseDrawableSetter", "getPlayPauseDrawableSetter", "()Lde/ph1b/audiobook/uitools/PlayPauseDrawableSetter;", "setPlayPauseDrawableSetter", "(Lde/ph1b/audiobook/uitools/PlayPauseDrawableSetter;)V", "playPauseDrawableSetter$delegate", "viewModel", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewViewModel;", "getViewModel", "()Lde/ph1b/audiobook/features/bookOverview/BookOverviewViewModel;", "setViewModel", "(Lde/ph1b/audiobook/features/bookOverview/BookOverviewViewModel;)V", "bookCoverChanged", "", "bookId", "invokeBookSelectionCallback", "book", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onActivityResumed", "activity", "Landroid/app/Activity;", "onAttach", "view", "Landroid/view/View;", "onBookCoverChanged", "onDestroyView", "onFileCoverRequested", "onInternetCoverRequested", "onViewCreated", "render", "state", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState;", "setupBottomAppBar", "setupFab", "setupRecyclerView", "showNoFolderWarning", "showPlaying", "playing", "", "toFolderOverview", "app_opensourceDebug"})
public final class BookOverviewController extends de.ph1b.audiobook.features.BaseController implements de.ph1b.audiobook.features.bookOverview.EditCoverDialogFragment.Callback, de.ph1b.audiobook.features.bookOverview.EditBookBottomSheet.Callback {
    private final int layoutRes = 2131492902;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.bookOverview.BookOverviewViewModel viewModel;
    private final kotlin.properties.ReadWriteProperty playPauseDrawableSetter$delegate = null;
    private final kotlin.properties.ReadWriteProperty adapter$delegate = null;
    private final kotlin.properties.ReadWriteProperty currentTapTarget$delegate = null;
    private de.ph1b.audiobook.data.Book menuBook;
    private androidx.fragment.app.FragmentTransaction pendingTransaction;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> getCurrentBookIdPref() {
        return null;
    }
    
    public final void setCurrentBookIdPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.bookOverview.BookOverviewViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookOverview.BookOverviewViewModel p0) {
    }
    
    private final de.ph1b.audiobook.uitools.PlayPauseDrawableSetter getPlayPauseDrawableSetter() {
        return null;
    }
    
    private final void setPlayPauseDrawableSetter(de.ph1b.audiobook.uitools.PlayPauseDrawableSetter p0) {
    }
    
    private final de.ph1b.audiobook.features.bookOverview.list.BookOverviewAdapter getAdapter() {
        return null;
    }
    
    private final void setAdapter(de.ph1b.audiobook.features.bookOverview.list.BookOverviewAdapter p0) {
    }
    
    private final com.getkeepsafe.taptargetview.TapTargetView getCurrentTapTarget() {
        return null;
    }
    
    private final void setCurrentTapTarget(com.getkeepsafe.taptargetview.TapTargetView p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated() {
    }
    
    private final void setupFab() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupBottomAppBar() {
    }
    
    private final void toFolderOverview() {
    }
    
    @java.lang.Override()
    protected void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void invokeBookSelectionCallback(de.ph1b.audiobook.data.Book book) {
    }
    
    private final void render(de.ph1b.audiobook.features.bookOverview.BookOverviewState state) {
    }
    
    private final void showPlaying(boolean playing) {
    }
    
    /**
     * Show a warning that no audiobook folder was chosen 
     */
    private final void showNoFolderWarning() {
    }
    
    private final void bookCoverChanged(java.util.UUID bookId) {
    }
    
    @java.lang.Override()
    public void onBookCoverChanged(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    @java.lang.Override()
    public void onInternetCoverRequested(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    @java.lang.Override()
    public void onFileCoverRequested(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    protected void onAttach(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public BookOverviewController() {
        super(null);
    }
}