package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\fH\u0007J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\fH\u0007J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\fH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/Converters;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "setMoshi", "(Lcom/squareup/moshi/Moshi;)V", "sparseStringArrayAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Landroidx/collection/SparseArrayCompat;", "", "fromBookType", "type", "Lde/ph1b/audiobook/data/Book$Type;", "fromFile", "file", "Ljava/io/File;", "fromSparseArrayCompat", "array", "fromUUID", "uuid", "Ljava/util/UUID;", "toBookType", "name", "toFile", "path", "toSparseArrayCompat", "json", "toUUID", "string", "data_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.squareup.moshi.Moshi moshi;
    private final com.squareup.moshi.JsonAdapter<androidx.collection.SparseArrayCompat<java.lang.String>> sparseStringArrayAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    public final void setMoshi(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.io.File toFile(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromSparseArrayCompat(@org.jetbrains.annotations.NotNull()
    androidx.collection.SparseArrayCompat<java.lang.String> array) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final androidx.collection.SparseArrayCompat<java.lang.String> toSparseArrayCompat(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromBookType(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final de.ph1b.audiobook.data.Book.Type toBookType(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromUUID(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.UUID toUUID(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    public Converters() {
        super();
    }
}