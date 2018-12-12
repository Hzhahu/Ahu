package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Helper class for converting book and chapter ids to uris and back.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lde/ph1b/audiobook/playback/utils/BookUriConverter;", "", "()V", "matcher", "Landroid/content/UriMatcher;", "allBooks", "Landroid/net/Uri;", "baseBuilder", "Landroid/net/Uri$Builder;", "kotlin.jvm.PlatformType", "book", "bookId", "Ljava/util/UUID;", "chapter", "", "extractBook", "uri", "type", "Companion", "app_opensourceDebug"})
public final class BookUriConverter {
    private final android.content.UriMatcher matcher = null;
    private static final java.lang.String AUTHORITY = "books";
    private static final java.lang.String PATH_BOOKS = "root";
    private static final java.lang.String PATH_CHAPTERS = "chapters";
    public static final int ROOT = 1;
    public static final int BOOK_ID = 2;
    public static final int CHAPTER_ID = 3;
    public static final de.ph1b.audiobook.playback.utils.BookUriConverter.Companion Companion = null;
    
    private final android.net.Uri.Builder baseBuilder() {
        return null;
    }
    
    public final int type(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri allBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri book(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri chapter(@org.jetbrains.annotations.NotNull()
    java.util.UUID bookId, int chapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID extractBook(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookUriConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lde/ph1b/audiobook/playback/utils/BookUriConverter$Companion;", "", "()V", "AUTHORITY", "", "BOOK_ID", "", "CHAPTER_ID", "PATH_BOOKS", "PATH_CHAPTERS", "ROOT", "app_opensourceDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}