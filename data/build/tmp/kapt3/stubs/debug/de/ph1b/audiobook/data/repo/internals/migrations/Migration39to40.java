package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

/**
 * * From DB version 39, the position of a book must no longer be negative. So all negative positions
 * * get set to 0.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/migrations/Migration39to40;", "Lde/ph1b/audiobook/data/repo/internals/migrations/IncrementalMigration;", "()V", "BOOK_TABLE_NAME", "", "BOOK_TIME", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "data_debug"})
public final class Migration39to40 extends de.ph1b.audiobook.data.repo.internals.migrations.IncrementalMigration {
    private final java.lang.String BOOK_TABLE_NAME = "tableBooks";
    private final java.lang.String BOOK_TIME = "bookTime";
    
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    public Migration39to40() {
        super(0);
    }
}