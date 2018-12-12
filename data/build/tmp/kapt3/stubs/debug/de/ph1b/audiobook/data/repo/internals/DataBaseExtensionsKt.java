package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b\u00a2\u0006\u0002\u0010\t\u001a2\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\f0\u000f\u00a2\u0006\u0002\b\u0010H\u0086\b\u001a&\u0010\u0011\u001a\u00020\u0012*\u00020\r2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u000f\u00a2\u0006\u0002\b\u0010H\u0086\b\u001a~\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007\u001a;\u0010\u001e\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001d2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\f0\u000f\u00a2\u0006\u0002\b\u0010H\u0086\b\u00a2\u0006\u0002\u0010\"\u001a;\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b\u00a2\u0006\u0002\u0010&\u00a8\u0006\'"}, d2 = {"delete", "", "Landroid/database/sqlite/SQLiteDatabase;", "table", "", "whereClause", "whereArgs", "", "", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "mapRows", "", "T", "Landroid/database/Cursor;", "mapper", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "moveToNextLoop", "", "func", "query", "columns", "selection", "selectionArgs", "groupBy", "having", "orderBy", "limit", "distinct", "", "transaction", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "exclusive", "body", "(Landroidx/sqlite/db/SupportSQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "update", "values", "Landroid/content/ContentValues;", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "data_debug"})
public final class DataBaseExtensionsKt {
    
    public static final void moveToNextLoop(@org.jetbrains.annotations.NotNull()
    android.database.Cursor $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.database.Cursor, kotlin.Unit> func) {
    }
    
    /**
     * a function that iterates of the rows of a cursor and maps all using a supplied mapper function 
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.List<T> mapRows(@org.jetbrains.annotations.NotNull()
    android.database.Cursor $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.database.Cursor, ? extends T> mapper) {
        return null;
    }
    
    public static final <T extends java.lang.Object>T transaction(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase $receiver, boolean exclusive, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteDatabase, ? extends T> body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"Recycle"})
    public static final android.database.Cursor query(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String table, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> columns, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> selectionArgs, @org.jetbrains.annotations.Nullable()
    java.lang.String groupBy, @org.jetbrains.annotations.Nullable()
    java.lang.String having, @org.jetbrains.annotations.Nullable()
    java.lang.String orderBy, @org.jetbrains.annotations.Nullable()
    java.lang.String limit, boolean distinct) {
        return null;
    }
    
    public static final int update(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String table, @org.jetbrains.annotations.NotNull()
    android.content.ContentValues values, @org.jetbrains.annotations.NotNull()
    java.lang.String whereClause, @org.jetbrains.annotations.NotNull()
    java.lang.Object... whereArgs) {
        return 0;
    }
    
    public static final int delete(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String table, @org.jetbrains.annotations.NotNull()
    java.lang.String whereClause, @org.jetbrains.annotations.NotNull()
    java.lang.Object... whereArgs) {
        return 0;
    }
}