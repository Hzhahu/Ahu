package de.ph1b.audiobook.persistence.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0096\u0002\u00a2\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lde/ph1b/audiobook/persistence/pref/PersistentPref;", "T", "", "Lde/ph1b/audiobook/persistence/pref/Pref;", "pref", "Lcom/f2prateek/rx/preferences2/Preference;", "(Lcom/f2prateek/rx/preferences2/Preference;)V", "stream", "Lio/reactivex/Observable;", "getStream", "()Lio/reactivex/Observable;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_opensourceDebug"})
public final class PersistentPref<T extends java.lang.Object> extends de.ph1b.audiobook.persistence.pref.Pref<T> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<T> stream = null;
    private final com.f2prateek.rx.preferences2.Preference<T> pref = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<T> getStream() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T getValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull()
    T value) {
    }
    
    public PersistentPref(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.Preference<T> pref) {
        super();
    }
}