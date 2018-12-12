package de.ph1b.audiobook.features.bookOverview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/BookOverviewState;", "", "()V", "Content", "Loading", "NoFolderSet", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$Content;", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$Loading;", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$NoFolderSet;", "app_opensourceDebug"})
public abstract class BookOverviewState {
    
    private BookOverviewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$Content;", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState;", "currentBook", "Lde/ph1b/audiobook/data/Book;", "playing", "", "currentBooks", "", "notStartedBooks", "completedBooks", "(Lde/ph1b/audiobook/data/Book;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "books", "getBooks", "()Ljava/util/List;", "getCompletedBooks", "getCurrentBook", "()Lde/ph1b/audiobook/data/Book;", "getCurrentBooks", "getNotStartedBooks", "getPlaying", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_opensourceDebug"})
    public static final class Content extends de.ph1b.audiobook.features.bookOverview.BookOverviewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<de.ph1b.audiobook.data.Book> books = null;
        @org.jetbrains.annotations.Nullable()
        private final de.ph1b.audiobook.data.Book currentBook = null;
        private final boolean playing = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<de.ph1b.audiobook.data.Book> currentBooks = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<de.ph1b.audiobook.data.Book> notStartedBooks = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<de.ph1b.audiobook.data.Book> completedBooks = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> getBooks() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final de.ph1b.audiobook.data.Book getCurrentBook() {
            return null;
        }
        
        public final boolean getPlaying() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> getCurrentBooks() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> getNotStartedBooks() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> getCompletedBooks() {
            return null;
        }
        
        public Content(@org.jetbrains.annotations.Nullable()
        de.ph1b.audiobook.data.Book currentBook, boolean playing, @org.jetbrains.annotations.NotNull()
        java.util.List<de.ph1b.audiobook.data.Book> currentBooks, @org.jetbrains.annotations.NotNull()
        java.util.List<de.ph1b.audiobook.data.Book> notStartedBooks, @org.jetbrains.annotations.NotNull()
        java.util.List<de.ph1b.audiobook.data.Book> completedBooks) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final de.ph1b.audiobook.data.Book component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<de.ph1b.audiobook.data.Book> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.ph1b.audiobook.features.bookOverview.BookOverviewState.Content copy(@org.jetbrains.annotations.Nullable()
        de.ph1b.audiobook.data.Book currentBook, boolean playing, @org.jetbrains.annotations.NotNull()
        java.util.List<de.ph1b.audiobook.data.Book> currentBooks, @org.jetbrains.annotations.NotNull()
        java.util.List<de.ph1b.audiobook.data.Book> notStartedBooks, @org.jetbrains.annotations.NotNull()
        java.util.List<de.ph1b.audiobook.data.Book> completedBooks) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$Loading;", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState;", "()V", "app_opensourceDebug"})
    public static final class Loading extends de.ph1b.audiobook.features.bookOverview.BookOverviewState {
        public static final de.ph1b.audiobook.features.bookOverview.BookOverviewState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/BookOverviewState$NoFolderSet;", "Lde/ph1b/audiobook/features/bookOverview/BookOverviewState;", "()V", "app_opensourceDebug"})
    public static final class NoFolderSet extends de.ph1b.audiobook.features.bookOverview.BookOverviewState {
        public static final de.ph1b.audiobook.features.bookOverview.BookOverviewState.NoFolderSet INSTANCE = null;
        
        private NoFolderSet() {
            super();
        }
    }
}