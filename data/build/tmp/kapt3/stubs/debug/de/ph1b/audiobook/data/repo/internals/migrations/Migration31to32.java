package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

/**
 * * Corrects media paths that have been falsely set.
 */
@android.annotation.SuppressLint(value = {"Recycle"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/migrations/Migration31to32;", "Lde/ph1b/audiobook/data/repo/internals/migrations/IncrementalMigration;", "()V", "BOOK_CURRENT_MEDIA_PATH", "", "BOOK_ID", "CHAPTER_PATH", "TABLE_BOOK", "TABLE_CHAPTERS", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "data_debug"})
public final class Migration31to32 extends de.ph1b.audiobook.data.repo.internals.migrations.IncrementalMigration {
    private final java.lang.String BOOK_ID = "bookId";
    private final java.lang.String TABLE_BOOK = "tableBooks";
    private final java.lang.String TABLE_CHAPTERS = "tableChapters";
    private final java.lang.String BOOK_CURRENT_MEDIA_PATH = "bookCurrentMediaPath";
    private final java.lang.String CHAPTER_PATH = "chapterPath";
    
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    public Migration31to32() {
        super(0);
    }
}