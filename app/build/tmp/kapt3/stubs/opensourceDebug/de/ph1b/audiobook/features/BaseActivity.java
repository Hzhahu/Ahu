package de.ph1b.audiobook.features;

import java.lang.System;

/**
 * * Base class for all Activities which checks in onResume, if the storage
 * * is mounted. Shuts down service if not.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\f"}, d2 = {"Lde/ph1b/audiobook/features/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "nightModeAtCreation", "", "Ljava/lang/Integer;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "app_opensourceDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.lang.Integer nightModeAtCreation;
    public static final de.ph1b.audiobook.features.BaseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/features/BaseActivity$Companion;", "", "()V", "storageMounted", "", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "app_opensourceDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object storageMounted(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.experimental.Continuation<? super java.lang.Boolean> p0) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}