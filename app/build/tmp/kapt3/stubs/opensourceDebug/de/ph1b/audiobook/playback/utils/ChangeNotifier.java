package de.ph1b.audiobook.playback.utils;

import java.lang.System;

/**
 * * Sets updated metadata on the media session and sends broadcasts about meta changes
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J+\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006#"}, d2 = {"Lde/ph1b/audiobook/playback/utils/ChangeNotifier;", "", "bookUriConverter", "Lde/ph1b/audiobook/playback/utils/BookUriConverter;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "imageHelper", "Lde/ph1b/audiobook/uitools/ImageHelper;", "context", "Landroid/content/Context;", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "(Lde/ph1b/audiobook/playback/utils/BookUriConverter;Landroid/support/v4/media/session/MediaSessionCompat;Lde/ph1b/audiobook/uitools/ImageHelper;Landroid/content/Context;Lde/ph1b/audiobook/playback/PlayStateManager;)V", "lastFileForMetaData", "Ljava/io/File;", "mediaMetaDataBuilder", "Landroid/support/v4/media/MediaMetadataCompat$Builder;", "playbackStateBuilder", "Landroid/support/v4/media/session/PlaybackStateCompat$Builder;", "kotlin.jvm.PlatformType", "playbackStateBuilderForAuto", "appendQueue", "", "book", "Lde/ph1b/audiobook/data/Book;", "notify", "what", "Lde/ph1b/audiobook/playback/utils/ChangeNotifier$Type;", "forAuto", "", "(Lde/ph1b/audiobook/playback/utils/ChangeNotifier$Type;Lde/ph1b/audiobook/data/Book;ZLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "toMediaDescription", "Landroid/support/v4/media/MediaDescriptionCompat;", "Lde/ph1b/audiobook/data/Chapter;", "Type", "app_opensourceDebug"})
@de.ph1b.audiobook.injection.PerService()
public final class ChangeNotifier {
    
    /**
     * The last file the [.notifyChange] has used to update the metadata. 
     */
    private volatile java.io.File lastFileForMetaData;
    private final android.support.v4.media.session.PlaybackStateCompat.Builder playbackStateBuilder = null;
    private final android.support.v4.media.session.PlaybackStateCompat.Builder playbackStateBuilderForAuto = null;
    private final android.support.v4.media.MediaMetadataCompat.Builder mediaMetaDataBuilder = null;
    private final de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter = null;
    private final android.support.v4.media.session.MediaSessionCompat mediaSession = null;
    private final de.ph1b.audiobook.uitools.ImageHelper imageHelper = null;
    private final android.content.Context context = null;
    private final de.ph1b.audiobook.playback.PlayStateManager playStateManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object notify(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.ChangeNotifier.Type what, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book, boolean forAuto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    private final void appendQueue(de.ph1b.audiobook.data.Book book) {
    }
    
    private final android.support.v4.media.MediaDescriptionCompat toMediaDescription(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Chapter $receiver, de.ph1b.audiobook.data.Book book) {
        return null;
    }
    
    @javax.inject.Inject()
    public ChangeNotifier(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaSessionCompat mediaSession, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.ImageHelper imageHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager playStateManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lde/ph1b/audiobook/playback/utils/ChangeNotifier$Type;", "", "intentUrl", "", "(Ljava/lang/String;ILjava/lang/String;)V", "intent", "Landroid/content/Intent;", "broadcastIntent", "author", "bookName", "chapterName", "playState", "Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "time", "", "METADATA", "PLAY_STATE", "app_opensourceDebug"})
    public static enum Type {
        /*public static final*/ METADATA /* = new METADATA(null) */,
        /*public static final*/ PLAY_STATE /* = new PLAY_STATE(null) */;
        private final android.content.Intent intent = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent broadcastIntent(@org.jetbrains.annotations.Nullable()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String bookName, @org.jetbrains.annotations.NotNull()
        java.lang.String chapterName, @org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.playback.PlayStateManager.PlayState playState, int time) {
            return null;
        }
        
        Type(@org.jetbrains.annotations.NotNull()
        java.lang.String intentUrl) {
        }
    }
}