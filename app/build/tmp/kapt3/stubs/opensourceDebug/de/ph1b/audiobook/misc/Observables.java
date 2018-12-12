package de.ph1b.audiobook.misc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Je\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u0005*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00050\fH\u0086\bJ\u00a1\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\r*\u00020\u0001\"\b\b\u0003\u0010\u000e*\u00020\u0001\"\b\b\u0004\u0010\u0005*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\t2&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00050\u0011H\u0086\b\u00a8\u0006\u0012"}, d2 = {"Lde/ph1b/audiobook/misc/Observables;", "", "()V", "combineLatest", "Lio/reactivex/Observable;", "R", "T1", "T2", "source1", "Lio/reactivex/ObservableSource;", "source2", "combiner", "Lkotlin/Function2;", "T3", "T4", "source3", "source4", "Lkotlin/Function4;", "app_opensourceDebug"})
public final class Observables {
    public static final de.ph1b.audiobook.misc.Observables INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <T1 extends java.lang.Object, T2 extends java.lang.Object, R extends java.lang.Object>io.reactivex.Observable<R> combineLatest(@org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableSource<T1> source1, @org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableSource<T2> source2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends R> combiner) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object, R extends java.lang.Object>io.reactivex.Observable<R> combineLatest(@org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableSource<T1> source1, @org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableSource<T2> source2, @org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableSource<T3> source3, @org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableSource<T4> source4, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combiner) {
        return null;
    }
    
    private Observables() {
        super();
    }
}