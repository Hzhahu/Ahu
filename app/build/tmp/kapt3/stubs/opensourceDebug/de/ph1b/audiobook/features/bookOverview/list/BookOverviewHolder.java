package de.ph1b.audiobook.features.bookOverview.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewHolder;", "Lde/ph1b/audiobook/uitools/ExtensionsHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lkotlin/Function2;", "Lde/ph1b/audiobook/data/Book;", "Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewClick;", "", "Lde/ph1b/audiobook/features/bookOverview/list/BookClickListener;", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "boundBook", "loadBookCover", "Lde/ph1b/audiobook/features/bookOverview/list/LoadBookCover;", "bind", "book", "app_opensourceDebug"})
public final class BookOverviewHolder extends de.ph1b.audiobook.uitools.ExtensionsHolder {
    private de.ph1b.audiobook.data.Book boundBook;
    private final de.ph1b.audiobook.features.bookOverview.list.LoadBookCover loadBookCover = null;
    private final kotlin.jvm.functions.Function2<de.ph1b.audiobook.data.Book, de.ph1b.audiobook.features.bookOverview.list.BookOverviewClick, kotlin.Unit> listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    public BookOverviewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super de.ph1b.audiobook.data.Book, ? super de.ph1b.audiobook.features.bookOverview.list.BookOverviewClick, kotlin.Unit> listener) {
        super(null, 0);
    }
}