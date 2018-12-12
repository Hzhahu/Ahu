package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

/**
 * * Queries through all books and removes the ones that were added empty by a bug.
 */
@android.annotation.SuppressLint(value = {"Recycle"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/migrations/Migration30to31;", "Lde/ph1b/audiobook/data/repo/internals/migrations/IncrementalMigration;", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "data_debug"})
public final class Migration30to31 extends de.ph1b.audiobook.data.repo.internals.migrations.IncrementalMigration {
    
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    public Migration30to31() {
        super(0);
    }
}