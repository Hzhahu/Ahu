package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"ACTIVE", "", "AUTHOR", "CREATE_TABLE", "CURRENT_MEDIA_PATH", "ID", "NAME", "PLAYBACK_SPEED", "ROOT", "TABLE_NAME", "TIME", "TYPE", "data_debug"})
public final class Migration35to36Kt {
    private static final java.lang.String ID = "bookId";
    private static final java.lang.String NAME = "bookName";
    private static final java.lang.String AUTHOR = "bookAuthor";
    private static final java.lang.String CURRENT_MEDIA_PATH = "bookCurrentMediaPath";
    private static final java.lang.String PLAYBACK_SPEED = "bookSpeed";
    private static final java.lang.String ROOT = "bookRoot";
    private static final java.lang.String TIME = "bookTime";
    private static final java.lang.String TYPE = "bookType";
    private static final java.lang.String ACTIVE = "BOOK_ACTIVE";
    private static final java.lang.String TABLE_NAME = "tableBooks";
    private static final java.lang.String CREATE_TABLE = "\n    CREATE TABLE tableBooks (\n      bookId INTEGER PRIMARY KEY AUTOINCREMENT,\n      bookName TEXT NOT NULL,\n      bookAuthor TEXT,\n      bookCurrentMediaPath TEXT NOT NULL,\n      bookSpeed REAL NOT NULL,\n      bookRoot TEXT NOT NULL,\n      bookTime INTEGER NOT NULL,\n      bookType TEXT NOT NULL,\n      BOOK_ACTIVE INTEGER NOT NULL DEFAULT 1\n    )\n  ";
}