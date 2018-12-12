package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

/**
 * * Due to a bug negative book ids were inserted
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/migrations/Migration34to35;", "Lde/ph1b/audiobook/data/repo/internals/migrations/IncrementalMigration;", "()V", "TABLE_NAME", "", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "data_debug"})
public final class Migration34to35 extends de.ph1b.audiobook.data.repo.internals.migrations.IncrementalMigration {
    private final java.lang.String TABLE_NAME = "tableBooks";
    
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    public Migration34to35() {
        super(0);
    }
}