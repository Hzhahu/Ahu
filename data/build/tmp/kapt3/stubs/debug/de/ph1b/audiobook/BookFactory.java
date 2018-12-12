package de.ph1b.audiobook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jp\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/BookFactory;", "", "()V", "create", "Lde/ph1b/audiobook/data/Book;", "id", "Ljava/util/UUID;", "type", "Lde/ph1b/audiobook/data/Book$Type;", "author", "", "currentFileIndex", "", "time", "name", "playbackSpeed", "", "loudnessGain", "skipSilence", "", "chapters", "", "Lde/ph1b/audiobook/data/Chapter;", "data_debug"})
public final class BookFactory {
    public static final de.ph1b.audiobook.BookFactory INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.Book create(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.String author, int currentFileIndex, int time, @org.jetbrains.annotations.NotNull()
    java.lang.String name, float playbackSpeed, int loudnessGain, boolean skipSilence, @org.jetbrains.annotations.NotNull()
    java.util.List<de.ph1b.audiobook.data.Chapter> chapters) {
        return null;
    }
    
    private BookFactory() {
        super();
    }
}