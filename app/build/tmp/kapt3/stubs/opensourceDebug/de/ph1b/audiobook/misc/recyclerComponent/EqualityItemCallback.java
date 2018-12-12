package de.ph1b.audiobook.misc.recyclerComponent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\t\u00a8\u0006\f"}, d2 = {"Lde/ph1b/audiobook/misc/recyclerComponent/EqualityItemCallback;", "T", "", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "Companion", "app_opensourceDebug"})
public final class EqualityItemCallback<T extends java.lang.Object> extends androidx.recyclerview.widget.DiffUtil.ItemCallback<T> {
    private static final de.ph1b.audiobook.misc.recyclerComponent.EqualityItemCallback<java.lang.Object> instance = null;
    public static final de.ph1b.audiobook.misc.recyclerComponent.EqualityItemCallback.Companion Companion = null;
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    T oldItem, @org.jetbrains.annotations.NotNull()
    T newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    T oldItem, @org.jetbrains.annotations.NotNull()
    T newItem) {
        return false;
    }
    
    private EqualityItemCallback() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0001H\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/ph1b/audiobook/misc/recyclerComponent/EqualityItemCallback$Companion;", "", "()V", "instance", "Lde/ph1b/audiobook/misc/recyclerComponent/EqualityItemCallback;", "invoke", "T", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        public final <T extends java.lang.Object>de.ph1b.audiobook.misc.recyclerComponent.EqualityItemCallback<T> invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}