package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"BOOKMARK_PATH", "", "BOOKMARK_TIME", "BOOKMARK_TITLE", "BOOK_ACTIVE", "BOOK_AUTHOR", "BOOK_CURRENT_MEDIA_PATH", "BOOK_ID", "BOOK_NAME", "BOOK_PLAYBACK_SPEED", "BOOK_ROOT", "BOOK_TIME", "BOOK_TYPE", "BOOK_USE_COVER_REPLACEMENT", "CHAPTER_DURATION", "CHAPTER_NAME", "CHAPTER_PATH", "CREATE_TABLE_BOOK", "CREATE_TABLE_BOOKMARKS", "CREATE_TABLE_CHAPTERS", "TABLE_BOOK", "TABLE_BOOKMARKS", "TABLE_CHAPTERS", "data_debug"})
public final class Migration29to30Kt {
    private static final java.lang.String TABLE_BOOK = "tableBooks";
    private static final java.lang.String TABLE_CHAPTERS = "tableChapters";
    private static final java.lang.String TABLE_BOOKMARKS = "tableBookmarks";
    private static final java.lang.String BOOK_ID = "bookId";
    private static final java.lang.String BOOK_NAME = "bookName";
    private static final java.lang.String BOOK_AUTHOR = "bookAuthor";
    private static final java.lang.String BOOK_CURRENT_MEDIA_PATH = "bookCurrentMediaPath";
    private static final java.lang.String BOOK_PLAYBACK_SPEED = "bookSpeed";
    private static final java.lang.String BOOK_ROOT = "bookRoot";
    private static final java.lang.String BOOK_TIME = "bookTime";
    private static final java.lang.String BOOK_TYPE = "bookType";
    private static final java.lang.String BOOK_USE_COVER_REPLACEMENT = "bookUseCoverReplacement";
    private static final java.lang.String BOOK_ACTIVE = "BOOK_ACTIVE";
    private static final java.lang.String CHAPTER_DURATION = "chapterDuration";
    private static final java.lang.String CHAPTER_NAME = "chapterName";
    private static final java.lang.String CHAPTER_PATH = "chapterPath";
    private static final java.lang.String BOOKMARK_TIME = "bookmarkTime";
    private static final java.lang.String BOOKMARK_PATH = "bookmarkPath";
    private static final java.lang.String BOOKMARK_TITLE = "bookmarkTitle";
    private static final java.lang.String CREATE_TABLE_BOOK = "\n    CREATE TABLE tableBooks (\n      bookId INTEGER PRIMARY KEY AUTOINCREMENT,\n      bookName TEXT NOT NULL, bookAuthor TEXT,\n      bookCurrentMediaPath TEXT NOT NULL,\n      bookSpeed REAL NOT NULL,\n      bookRoot TEXT NOT NULL,\n      bookTime INTEGER NOT NULL,\n      bookType TEXT NOT NULL,\n      bookUseCoverReplacement INTEGER NOT NULL,\n      BOOK_ACTIVE INTEGER NOT NULL DEFAULT 1\n    )\n  ";
    private static final java.lang.String CREATE_TABLE_CHAPTERS = "\n    CREATE TABLE tableChapters (\n      chapterDuration INTEGER NOT NULL,\n      chapterName TEXT NOT NULL,\n      chapterPath TEXT NOT NULL,\n      bookId INTEGER NOT NULL,\n      FOREIGN KEY (bookId) REFERENCES tableBooks(bookId)\n    )\n  ";
    private static final java.lang.String CREATE_TABLE_BOOKMARKS = "\n    CREATE TABLE tableBookmarks (\n      bookmarkPath TEXT NOT NULL,\n      bookmarkTitle TEXT NOT NULL,\n      bookmarkTime INTEGER NOT NULL,\n      bookId INTEGER NOT NULL,\n      FOREIGN KEY (bookId) REFERENCES tableBooks(bookId)\n    )\n  ";
}