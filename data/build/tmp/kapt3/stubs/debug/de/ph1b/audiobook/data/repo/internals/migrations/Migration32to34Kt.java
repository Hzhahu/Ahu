package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"BM_PATH", "", "BM_TIME", "BM_TITLE", "BOOKMARK_TABLE_NAME", "CREATE_TABLE_BOOKMARKS", "ID", "PATH", "TABLE_NAME", "TIME", "TITLE", "data_debug"})
public final class Migration32to34Kt {
    private static final java.lang.String BOOKMARK_TABLE_NAME = "tableBookmarks";
    private static final java.lang.String BM_PATH = "bookmarkPath";
    private static final java.lang.String BM_TITLE = "bookmarkTitle";
    private static final java.lang.String BM_TIME = "bookmarkTime";
    private static final java.lang.String PATH = "bookmarkPath";
    private static final java.lang.String TITLE = "bookmarkTitle";
    private static final java.lang.String TABLE_NAME = "tableBookmarks";
    private static final java.lang.String TIME = "bookmarkTime";
    private static final java.lang.String ID = "_id";
    private static final java.lang.String CREATE_TABLE_BOOKMARKS = "\n    CREATE TABLE tableBookmarks (\n      _id INTEGER PRIMARY KEY AUTOINCREMENT,\n      bookmarkPath TEXT NOT NULL,\n      bookmarkTitle TEXT NOT NULL,\n      bookmarkTime INTEGER NOT NULL\n    )\n  ";
}