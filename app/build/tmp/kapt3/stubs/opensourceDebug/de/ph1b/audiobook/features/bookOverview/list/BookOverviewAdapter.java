package de.ph1b.audiobook.features.bookOverview.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewAdapter;", "Lde/ph1b/audiobook/misc/recyclerComponent/CompositeListAdapter;", "", "bookClickListener", "Lkotlin/Function2;", "Lde/ph1b/audiobook/data/Book;", "Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewClick;", "", "Lde/ph1b/audiobook/features/bookOverview/list/BookClickListener;", "(Lkotlin/jvm/functions/Function2;)V", "reloadBookCover", "bookId", "Ljava/util/UUID;", "app_opensourceDebug"})
public final class BookOverviewAdapter extends de.ph1b.audiobook.misc.recyclerComponent.CompositeListAdapter<java.lang.Object> {
    
    public final void reloadBookCover(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
    }
    
    public BookOverviewAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super de.ph1b.audiobook.data.Book, ? super de.ph1b.audiobook.features.bookOverview.list.BookOverviewClick, kotlin.Unit> bookClickListener) {
        super(null);
    }
}