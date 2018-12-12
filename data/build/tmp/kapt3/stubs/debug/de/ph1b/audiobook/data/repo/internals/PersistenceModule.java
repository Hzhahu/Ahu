package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u00a8\u0006\u0017"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/PersistenceModule;", "", "()V", "appDb", "Lde/ph1b/audiobook/data/repo/internals/AppDb;", "builder", "Landroidx/room/RoomDatabase$Builder;", "migrations", "", "Landroidx/room/migration/Migration;", "(Landroidx/room/RoomDatabase$Builder;[Landroidx/room/migration/Migration;)Lde/ph1b/audiobook/data/repo/internals/AppDb;", "bookSettingsDao", "Lde/ph1b/audiobook/data/repo/internals/BookSettingsDao;", "bookmarkDao", "Lde/ph1b/audiobook/data/repo/internals/BookmarkDao;", "chapterDao", "Lde/ph1b/audiobook/data/repo/internals/ChapterDao;", "metaDataDao", "Lde/ph1b/audiobook/data/repo/internals/BookMetaDataDao;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)[Landroidx/room/migration/Migration;", "roomDatabaseBuilder", "data_debug"})
@dagger.Module()
public final class PersistenceModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final de.ph1b.audiobook.data.repo.internals.BookmarkDao bookmarkDao(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.AppDb appDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final de.ph1b.audiobook.data.repo.internals.ChapterDao chapterDao(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.AppDb appDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final de.ph1b.audiobook.data.repo.internals.BookMetaDataDao metaDataDao(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.AppDb appDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final de.ph1b.audiobook.data.repo.internals.BookSettingsDao bookSettingsDao(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.AppDb appDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.room.RoomDatabase.Builder<de.ph1b.audiobook.data.repo.internals.AppDb> roomDatabaseBuilder(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final de.ph1b.audiobook.data.repo.internals.AppDb appDb(@org.jetbrains.annotations.NotNull()
    androidx.room.RoomDatabase.Builder<de.ph1b.audiobook.data.repo.internals.AppDb> builder, @org.jetbrains.annotations.NotNull()
    androidx.room.migration.Migration[] migrations) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.room.migration.Migration[] migrations(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public PersistenceModule() {
        super();
    }
}