package de.ph1b.audiobook.data.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/data/di/DataComponent;", "", "inject", "", "converters", "Lde/ph1b/audiobook/data/repo/internals/Converters;", "data_debug"})
public abstract interface DataComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.internals.Converters converters);
}