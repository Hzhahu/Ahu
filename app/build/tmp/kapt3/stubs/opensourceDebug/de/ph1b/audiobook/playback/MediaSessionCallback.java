package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Media session callback that handles playback controls.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u001c\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lde/ph1b/audiobook/playback/MediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "bookUriConverter", "Lde/ph1b/audiobook/playback/utils/BookUriConverter;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "bookSearchHandler", "Lde/ph1b/audiobook/features/bookSearch/BookSearchHandler;", "autoConnection", "Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "player", "Lde/ph1b/audiobook/playback/MediaPlayer;", "bookSearchParser", "Lde/ph1b/audiobook/features/bookSearch/BookSearchParser;", "(Lde/ph1b/audiobook/playback/utils/BookUriConverter;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/features/bookSearch/BookSearchHandler;Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;Lde/ph1b/audiobook/playback/MediaPlayer;Lde/ph1b/audiobook/features/bookSearch/BookSearchParser;)V", "onCustomAction", "", "action", "", "extras", "Landroid/os/Bundle;", "onFastForward", "onPause", "onPlay", "onPlayFromMediaId", "mediaId", "onPlayFromSearch", "query", "onRewind", "onSkipToNext", "onSkipToPrevious", "onSkipToQueueItem", "id", "", "onStop", "app_opensourceDebug"})
public final class MediaSessionCallback extends android.support.v4.media.session.MediaSessionCompat.Callback {
    private final de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    private final de.ph1b.audiobook.features.bookSearch.BookSearchHandler bookSearchHandler = null;
    private final de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver autoConnection = null;
    private final de.ph1b.audiobook.playback.MediaPlayer player = null;
    private final de.ph1b.audiobook.features.bookSearch.BookSearchParser bookSearchParser = null;
    
    @java.lang.Override()
    public void onSkipToQueueItem(long id) {
    }
    
    @java.lang.Override()
    public void onPlayFromMediaId(@org.jetbrains.annotations.Nullable()
    java.lang.String mediaId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPlayFromSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onSkipToNext() {
    }
    
    @java.lang.Override()
    public void onRewind() {
    }
    
    @java.lang.Override()
    public void onSkipToPrevious() {
    }
    
    @java.lang.Override()
    public void onFastForward() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onPlay() {
    }
    
    @java.lang.Override()
    public void onCustomAction(@org.jetbrains.annotations.Nullable()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @javax.inject.Inject()
    public MediaSessionCallback(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookSearch.BookSearchHandler bookSearchHandler, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver autoConnection, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.MediaPlayer player, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookSearch.BookSearchParser bookSearchParser) {
        super();
    }
}