package de.ph1b.audiobook.persistence.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR1\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00008F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lde/ph1b/audiobook/persistence/pref/Pref;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "()V", "stream", "Lio/reactivex/Observable;", "getStream", "()Lio/reactivex/Observable;", "<set-?>", "value", "value$annotations", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Lde/ph1b/audiobook/persistence/pref/Pref;", "app_opensourceDebug"})
public abstract class Pref<T extends java.lang.Object> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {
    @org.jetbrains.annotations.NotNull()
    private final de.ph1b.audiobook.persistence.pref.Pref value$delegate = null;
    
    @kotlin.Suppress(names = {"LeakingThis"})
    public static void value$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<T> getStream();
    
    public Pref() {
        super();
    }
}