package de.ph1b.audiobook.data.repo.internals.migrations;

import java.lang.System;

/**
 * * Migrate the database so they will be stored as json objects
 */
@android.annotation.SuppressLint(value = {"Recycle"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/migrations/Migration24to25;", "Lde/ph1b/audiobook/data/repo/internals/migrations/IncrementalMigration;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "data_debug"})
public final class Migration24to25 extends de.ph1b.audiobook.data.repo.internals.migrations.IncrementalMigration {
    private final android.content.Context context = null;
    
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    public Migration24to25(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(0);
    }
}