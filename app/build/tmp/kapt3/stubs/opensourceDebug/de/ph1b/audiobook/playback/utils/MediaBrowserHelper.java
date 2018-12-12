package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Helper class for MediaBrowserServiceCompat handling
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001dJ\u001f\u0010\u001e\u001a\u00020\u0013*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\""}, d2 = {"Lde/ph1b/audiobook/playback/utils/MediaBrowserHelper;", "", "bookUriConverter", "Lde/ph1b/audiobook/playback/utils/BookUriConverter;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "(Lde/ph1b/audiobook/playback/utils/BookUriConverter;Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/persistence/pref/Pref;Landroid/content/Context;)V", "fileProviderUri", "Landroid/net/Uri;", "coverFile", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "mediaItems", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "uri", "(Landroid/net/Uri;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "onLoadChildren", "", "parentId", "", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "toMediaDescription", "Lde/ph1b/audiobook/data/Book;", "titlePrefix", "(Lde/ph1b/audiobook/data/Book;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "app_opensourceDebug"})
@dagger.Reusable()
public final class MediaBrowserHelper {
    private final de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot() {
        return null;
    }
    
    public final void onLoadChildren(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result) {
    }
    
    @javax.inject.Inject()
    public MediaBrowserHelper(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}