package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@androidx.room.TypeConverters(value = {de.ph1b.audiobook.data.repo.internals.Converters.class})
@androidx.room.Database(entities = {de.ph1b.audiobook.data.Bookmark.class, de.ph1b.audiobook.data.Chapter.class, de.ph1b.audiobook.data.BookMetaData.class, de.ph1b.audiobook.data.BookSettings.class}, version = 44)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/AppDb;", "Landroidx/room/RoomDatabase;", "()V", "bookMetadataDao", "Lde/ph1b/audiobook/data/repo/internals/BookMetaDataDao;", "bookSettingsDao", "Lde/ph1b/audiobook/data/repo/internals/BookSettingsDao;", "bookmarkDao", "Lde/ph1b/audiobook/data/repo/internals/BookmarkDao;", "chapterDao", "Lde/ph1b/audiobook/data/repo/internals/ChapterDao;", "Companion", "data_debug"})
public abstract class AppDb extends androidx.room.RoomDatabase {
    public static final int VERSION = 44;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "autoBookDB";
    public static final de.ph1b.audiobook.data.repo.internals.AppDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.data.repo.internals.BookmarkDao bookmarkDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.data.repo.internals.ChapterDao chapterDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.data.repo.internals.BookMetaDataDao bookMetadataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.ph1b.audiobook.data.repo.internals.BookSettingsDao bookSettingsDao();
    
    public AppDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/AppDb$Companion;", "", "()V", "DATABASE_NAME", "", "VERSION", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}