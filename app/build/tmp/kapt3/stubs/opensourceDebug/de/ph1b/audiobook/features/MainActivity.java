package de.ph1b.audiobook.features;

import java.lang.System;

/**
 * * Activity that coordinates the book shelf and play screens.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0012\u00106\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0014J+\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130<2\u0006\u0010=\u001a\u00020>H\u0016\u00a2\u0006\u0002\u0010?J\b\u0010@\u001a\u000202H\u0014J\b\u0010A\u001a\u00020-H\u0016J\u0012\u0010B\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0002J\b\u0010C\u001a\u000202H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017\u00a8\u0006E"}, d2 = {"Lde/ph1b/audiobook/features/MainActivity;", "Lde/ph1b/audiobook/features/BaseActivity;", "Lde/ph1b/audiobook/misc/RouterProvider;", "()V", "bookSearchHandler", "Lde/ph1b/audiobook/features/bookSearch/BookSearchHandler;", "getBookSearchHandler", "()Lde/ph1b/audiobook/features/bookSearch/BookSearchHandler;", "setBookSearchHandler", "(Lde/ph1b/audiobook/features/bookSearch/BookSearchHandler;)V", "bookSearchParser", "Lde/ph1b/audiobook/features/bookSearch/BookSearchParser;", "getBookSearchParser", "()Lde/ph1b/audiobook/features/bookSearch/BookSearchParser;", "setBookSearchParser", "(Lde/ph1b/audiobook/features/bookSearch/BookSearchParser;)V", "collectionBookFolderPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "", "getCollectionBookFolderPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setCollectionBookFolderPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "currentBookIdPref", "Ljava/util/UUID;", "getCurrentBookIdPref", "setCurrentBookIdPref", "permissionHelper", "Lde/ph1b/audiobook/misc/PermissionHelper;", "permissions", "Lde/ph1b/audiobook/misc/Permissions;", "playerController", "Lde/ph1b/audiobook/playback/PlayerController;", "getPlayerController", "()Lde/ph1b/audiobook/playback/PlayerController;", "setPlayerController", "(Lde/ph1b/audiobook/playback/PlayerController;)V", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "router", "Lcom/bluelinelabs/conductor/Router;", "singleBookFolderPref", "getSingleBookFolderPref", "setSingleBookFolderPref", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onRequestPermissionsResult", "requestCode", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "provideRouter", "setupFromIntent", "setupRouter", "Companion", "app_opensourceDebug"})
public final class MainActivity extends de.ph1b.audiobook.features.BaseActivity implements de.ph1b.audiobook.misc.RouterProvider {
    private de.ph1b.audiobook.misc.PermissionHelper permissionHelper;
    private de.ph1b.audiobook.misc.Permissions permissions;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "singleBookFolders")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> singleBookFolderPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "folders")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> collectionBookFolderPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.PlayerController playerController;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.bookSearch.BookSearchParser bookSearchParser;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.features.bookSearch.BookSearchHandler bookSearchHandler;
    private com.bluelinelabs.conductor.Router router;
    private static final java.lang.String NI_GO_TO_BOOK = "niGotoBook";
    private static final java.lang.String NI_PLAY_CURRENT_BOOK_IMMEDIATELY = "ni#playCurrentBookImmediately";
    public static final de.ph1b.audiobook.features.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> getCurrentBookIdPref() {
        return null;
    }
    
    public final void setCurrentBookIdPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> getSingleBookFolderPref() {
        return null;
    }
    
    public final void setSingleBookFolderPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> getCollectionBookFolderPref() {
        return null;
    }
    
    public final void setCollectionBookFolderPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayerController getPlayerController() {
        return null;
    }
    
    public final void setPlayerController(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayerController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.bookSearch.BookSearchParser getBookSearchParser() {
        return null;
    }
    
    public final void setBookSearchParser(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookSearch.BookSearchParser p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.features.bookSearch.BookSearchHandler getBookSearchHandler() {
        return null;
    }
    
    public final void setBookSearchHandler(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookSearch.BookSearchHandler p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void setupFromIntent(android.content.Intent intent) {
    }
    
    private final void setupRouter() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bluelinelabs.conductor.Router provideRouter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lde/ph1b/audiobook/features/MainActivity$Companion;", "", "()V", "NI_GO_TO_BOOK", "", "NI_PLAY_CURRENT_BOOK_IMMEDIATELY", "goToBookIntent", "Landroid/content/Intent;", "c", "Landroid/content/Context;", "bookId", "Ljava/util/UUID;", "newIntent", "context", "playCurrentBookImmediately", "", "app_opensourceDebug"})
    public static final class Companion {
        
        /**
         * Returns an intent that lets you go directly to the playback screen for a certain book 
         */
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent goToBookIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.NotNull()
        java.util.UUID bookId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean playCurrentBookImmediately) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}