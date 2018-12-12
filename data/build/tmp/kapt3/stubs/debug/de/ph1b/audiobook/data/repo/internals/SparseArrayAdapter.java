package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

/**
 * * JsonAdapter for a sparse array
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J0\u0010\u000e\u001a\u00020\n*\u00020\b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010H\u0082\bJ&\u0010\u0015\u001a\u00020\n*\u00020\f2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\u0002\b\u0017H\u0082\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/SparseArrayAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Landroidx/collection/SparseArrayCompat;", "adapter", "(Lcom/squareup/moshi/JsonAdapter;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "sparseArray", "readObject", "handle", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", "writeObject", "write", "Lkotlin/ExtensionFunctionType;", "data_debug"})
public final class SparseArrayAdapter<T extends java.lang.Object> extends com.squareup.moshi.JsonAdapter<androidx.collection.SparseArrayCompat<T>> {
    private final com.squareup.moshi.JsonAdapter<T> adapter = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    androidx.collection.SparseArrayCompat<T> sparseArray) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.collection.SparseArrayCompat<T> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    /**
     * iterates over the values in an object and executes the handle function. The handle function must return true if it consumed the object 
     */
    private final void readObject(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader $receiver, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> handle) {
    }
    
    private final void writeObject(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter $receiver, kotlin.jvm.functions.Function1<? super com.squareup.moshi.JsonWriter, kotlin.Unit> write) {
    }
    
    public SparseArrayAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<T> adapter) {
        super();
    }
}