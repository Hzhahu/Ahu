package de.ph1b.audiobook.data.repo.internals;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lde/ph1b/audiobook/data/repo/internals/BookSettingsDao;", "", "all", "", "Lde/ph1b/audiobook/data/BookSettings;", "insert", "", "bookSettings", "setActive", "id", "Ljava/util/UUID;", "active", "", "data_debug"})
public abstract interface BookSettingsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.BookSettings bookSettings);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookSettings")
    public abstract java.util.List<de.ph1b.audiobook.data.BookSettings> all();
    
    @androidx.room.Query(value = "UPDATE bookSettings SET active=:active WHERE id=:id")
    public abstract void setActive(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, boolean active);
}