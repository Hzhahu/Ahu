package de.ph1b.audiobook.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00000\u0001:\u000256B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\'\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010\u001f\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u001eH\u00d6\u0001J\t\u0010-\u001a\u00020\nH\u00d6\u0001JZ\u0010.\u001a\u00020\u00002\u0019\b\u0002\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000500\u00a2\u0006\u0002\b12\u0019\b\u0002\u00102\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000700\u00a2\u0006\u0002\b12\u0019\b\u0002\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020400\u00a2\u0006\u0002\b1H\u0086\bJ\"\u0010/\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000500\u00a2\u0006\u0002\b1H\u0086\bJ\u001f\u00102\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000700\u00a2\u0006\u0002\b1R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\t\u00a8\u00067"}, d2 = {"Lde/ph1b/audiobook/data/Book;", "", "id", "Ljava/util/UUID;", "content", "Lde/ph1b/audiobook/data/BookContent;", "metaData", "Lde/ph1b/audiobook/data/BookMetaData;", "(Ljava/util/UUID;Lde/ph1b/audiobook/data/BookContent;Lde/ph1b/audiobook/data/BookMetaData;)V", "author", "", "getAuthor", "()Ljava/lang/String;", "getContent", "()Lde/ph1b/audiobook/data/BookContent;", "coverTransitionName", "getCoverTransitionName", "getId", "()Ljava/util/UUID;", "getMetaData", "()Lde/ph1b/audiobook/data/BookMetaData;", "name", "getName", "root", "getRoot", "type", "Lde/ph1b/audiobook/data/Book$Type;", "getType", "()Lde/ph1b/audiobook/data/Book$Type;", "compareTo", "", "other", "component1", "component2", "component3", "copy", "coverFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "equals", "", "", "hashCode", "toString", "update", "updateContent", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updateMetaData", "updateSettings", "Lde/ph1b/audiobook/data/BookSettings;", "Companion", "Type", "data_debug"})
public final class Book implements java.lang.Comparable<de.ph1b.audiobook.data.Book> {
    @org.jetbrains.annotations.NotNull()
    private final de.ph1b.audiobook.data.Book.Type type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String root = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coverTransitionName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    private final de.ph1b.audiobook.data.BookContent content = null;
    @org.jetbrains.annotations.NotNull()
    private final de.ph1b.audiobook.data.BookMetaData metaData = null;
    public static final long ID_UNKNOWN = 0L;
    public static final float SPEED_MAX = 2.5F;
    public static final float SPEED_MIN = 0.5F;
    public static final de.ph1b.audiobook.data.Book.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Book.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Book updateMetaData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.BookMetaData, de.ph1b.audiobook.data.BookMetaData> update) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverTransitionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Book updateContent(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.BookContent, de.ph1b.audiobook.data.BookContent> update) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Book update(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.BookContent, de.ph1b.audiobook.data.BookContent> updateContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.BookMetaData, de.ph1b.audiobook.data.BookMetaData> updateMetaData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super de.ph1b.audiobook.data.BookSettings, de.ph1b.audiobook.data.BookSettings> updateSettings) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object coverFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.io.File> p1) {
        return null;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookContent getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookMetaData getMetaData() {
        return null;
    }
    
    public Book(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookContent content, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookMetaData metaData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookContent component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.BookMetaData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Book copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookContent content, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookMetaData metaData) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/data/Book$Type;", "", "(Ljava/lang/String;I)V", "COLLECTION_FOLDER", "COLLECTION_FILE", "SINGLE_FOLDER", "SINGLE_FILE", "data_debug"})
    public static enum Type {
        /*public static final*/ COLLECTION_FOLDER /* = new COLLECTION_FOLDER() */,
        /*public static final*/ COLLECTION_FILE /* = new COLLECTION_FILE() */,
        /*public static final*/ SINGLE_FOLDER /* = new SINGLE_FOLDER() */,
        /*public static final*/ SINGLE_FILE /* = new SINGLE_FILE() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lde/ph1b/audiobook/data/Book$Companion;", "", "()V", "ID_UNKNOWN", "", "SPEED_MAX", "", "SPEED_MIN", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}