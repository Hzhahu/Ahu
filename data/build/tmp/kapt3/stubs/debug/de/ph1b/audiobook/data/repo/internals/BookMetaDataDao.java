package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/BookMetaDataDao;", "", "byId", "Lde/ph1b/audiobook/data/BookMetaData;", "id", "Ljava/util/UUID;", "insert", "", "metaData", "data_debug"})
public abstract interface BookMetaDataDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookMetaData metaData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookMetaData WHERE id = :id")
    public abstract de.ph1b.audiobook.data.BookMetaData byId(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
}