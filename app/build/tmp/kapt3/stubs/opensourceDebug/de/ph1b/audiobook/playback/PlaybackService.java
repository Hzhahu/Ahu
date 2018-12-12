package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Service that hosts the longtime playback and handles its controls.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010Y\u001a\u00020ZH\u0002J\n\u0010[\u001a\u0004\u0018\u00010\\H\u0002J\u0010\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020\u001dH\u0002J\u0019\u0010_\u001a\u00020Z2\u0006\u0010`\u001a\u00020aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010bJ\u0011\u0010c\u001a\u00020ZH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ\u0011\u0010e\u001a\u00020ZH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ\b\u0010f\u001a\u00020ZH\u0002J\b\u0010g\u001a\u00020ZH\u0002J\b\u0010h\u001a\u00020ZH\u0016J\b\u0010i\u001a\u00020ZH\u0016J\"\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020o2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J$\u0010r\u001a\u00020Z2\u0006\u0010s\u001a\u00020m2\u0012\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0v0uH\u0016J\"\u0010x\u001a\u00020o2\b\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020o2\u0006\u0010|\u001a\u00020oH\u0016J\b\u0010}\u001a\u00020ZH\u0002J\b\u0010~\u001a\u00020ZH\u0002J\u001b\u0010\u007f\u001a\u00020Z2\u0007\u0010\u0080\u0001\u001a\u00020\\H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J\u000e\u0010\u0082\u0001\u001a\u00020Z*\u00030\u0083\u0001H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010D\u001a\u00020E8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u00020K8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010P\u001a\u00020Q8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010V\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001f\"\u0004\bX\u0010!\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0085\u0001"}, d2 = {"Lde/ph1b/audiobook/playback/PlaybackService;", "Landroidx/media/MediaBrowserServiceCompat;", "()V", "audioFocusHelper", "Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusHandler;", "getAudioFocusHelper", "()Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusHandler;", "setAudioFocusHelper", "(Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusHandler;)V", "autoConnected", "Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "getAutoConnected", "()Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "setAutoConnected", "(Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;)V", "bookUriConverter", "Lde/ph1b/audiobook/playback/utils/BookUriConverter;", "getBookUriConverter", "()Lde/ph1b/audiobook/playback/utils/BookUriConverter;", "setBookUriConverter", "(Lde/ph1b/audiobook/playback/utils/BookUriConverter;)V", "changeNotifier", "Lde/ph1b/audiobook/playback/utils/ChangeNotifier;", "getChangeNotifier", "()Lde/ph1b/audiobook/playback/utils/ChangeNotifier;", "setChangeNotifier", "(Lde/ph1b/audiobook/playback/utils/ChangeNotifier;)V", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "getCurrentBookIdPref", "()Lde/ph1b/audiobook/persistence/pref/Pref;", "setCurrentBookIdPref", "(Lde/ph1b/audiobook/persistence/pref/Pref;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isForeground", "", "mediaBrowserHelper", "Lde/ph1b/audiobook/playback/utils/MediaBrowserHelper;", "getMediaBrowserHelper", "()Lde/ph1b/audiobook/playback/utils/MediaBrowserHelper;", "setMediaBrowserHelper", "(Lde/ph1b/audiobook/playback/utils/MediaBrowserHelper;)V", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "getMediaSession", "()Landroid/support/v4/media/session/MediaSessionCompat;", "setMediaSession", "(Landroid/support/v4/media/session/MediaSessionCompat;)V", "notificationCreator", "Lde/ph1b/audiobook/playback/utils/NotificationCreator;", "getNotificationCreator", "()Lde/ph1b/audiobook/playback/utils/NotificationCreator;", "setNotificationCreator", "(Lde/ph1b/audiobook/playback/utils/NotificationCreator;)V", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V", "notifyOnAutoConnectionChange", "Lde/ph1b/audiobook/playback/NotifyOnAutoConnectionChange;", "getNotifyOnAutoConnectionChange", "()Lde/ph1b/audiobook/playback/NotifyOnAutoConnectionChange;", "setNotifyOnAutoConnectionChange", "(Lde/ph1b/audiobook/playback/NotifyOnAutoConnectionChange;)V", "playStateManager", "Lde/ph1b/audiobook/playback/PlayStateManager;", "getPlayStateManager", "()Lde/ph1b/audiobook/playback/PlayStateManager;", "setPlayStateManager", "(Lde/ph1b/audiobook/playback/PlayStateManager;)V", "player", "Lde/ph1b/audiobook/playback/MediaPlayer;", "getPlayer", "()Lde/ph1b/audiobook/playback/MediaPlayer;", "setPlayer", "(Lde/ph1b/audiobook/playback/MediaPlayer;)V", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "getRepo", "()Lde/ph1b/audiobook/data/repo/BookRepository;", "setRepo", "(Lde/ph1b/audiobook/data/repo/BookRepository;)V", "resumeOnReplugPref", "getResumeOnReplugPref", "setResumeOnReplugPref", "audioBecomingNoisy", "", "currentBook", "Lde/ph1b/audiobook/data/Book;", "currentBookIdChanged", "id", "handlePlaybackState", "state", "Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;", "(Lde/ph1b/audiobook/playback/PlayStateManager$PlayState;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "handlePlaybackStatePaused", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "handlePlaybackStatePlaying", "handlePlaybackStateStopped", "headsetPlugged", "onCreate", "onDestroy", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "clientPackageName", "", "clientUid", "", "rootHints", "Landroid/os/Bundle;", "onLoadChildren", "parentId", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "onStartCommand", "intent", "Landroid/content/Intent;", "flags", "startId", "play", "tearDownAutomatically", "updateNotification", "book", "(Lde/ph1b/audiobook/data/Book;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "disposeOnDestroy", "Lio/reactivex/disposables/Disposable;", "Companion", "app_opensourceDebug"})
public final class PlaybackService extends androidx.media.MediaBrowserServiceCompat {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private boolean isForeground;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.MediaPlayer player;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.data.repo.BookRepository repo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.app.NotificationManager notificationManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.utils.NotificationCreator notificationCreator;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.PlayStateManager playStateManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.utils.BookUriConverter bookUriConverter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.utils.MediaBrowserHelper mediaBrowserHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.support.v4.media.session.MediaSessionCompat mediaSession;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.utils.ChangeNotifier changeNotifier;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver autoConnected;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.NotifyOnAutoConnectionChange notifyOnAutoConnectionChange;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.playback.utils.audioFocus.AudioFocusHandler audioFocusHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "RESUME_ON_REPLUG")
    @javax.inject.Inject()
    public de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> resumeOnReplugPref;
    private static final int NOTIFICATION_ID = 42;
    public static final de.ph1b.audiobook.playback.PlaybackService.Companion Companion = null;
    
    @java.lang.Override()
    public void onLoadChildren(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String clientPackageName, int clientUid, @org.jetbrains.annotations.Nullable()
    android.os.Bundle rootHints) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> getCurrentBookIdPref() {
        return null;
    }
    
    public final void setCurrentBookIdPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.MediaPlayer getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.MediaPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.data.repo.BookRepository getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    public final void setNotificationManager(@org.jetbrains.annotations.NotNull()
    android.app.NotificationManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.utils.NotificationCreator getNotificationCreator() {
        return null;
    }
    
    public final void setNotificationCreator(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.NotificationCreator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.PlayStateManager getPlayStateManager() {
        return null;
    }
    
    public final void setPlayStateManager(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.PlayStateManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.utils.BookUriConverter getBookUriConverter() {
        return null;
    }
    
    public final void setBookUriConverter(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.BookUriConverter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.utils.MediaBrowserHelper getMediaBrowserHelper() {
        return null;
    }
    
    public final void setMediaBrowserHelper(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.MediaBrowserHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.media.session.MediaSessionCompat getMediaSession() {
        return null;
    }
    
    public final void setMediaSession(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaSessionCompat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.utils.ChangeNotifier getChangeNotifier() {
        return null;
    }
    
    public final void setChangeNotifier(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.ChangeNotifier p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver getAutoConnected() {
        return null;
    }
    
    public final void setAutoConnected(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.NotifyOnAutoConnectionChange getNotifyOnAutoConnectionChange() {
        return null;
    }
    
    public final void setNotifyOnAutoConnectionChange(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.NotifyOnAutoConnectionChange p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.playback.utils.audioFocus.AudioFocusHandler getAudioFocusHelper() {
        return null;
    }
    
    public final void setAudioFocusHelper(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.audioFocus.AudioFocusHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> getResumeOnReplugPref() {
        return null;
    }
    
    public final void setResumeOnReplugPref(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.persistence.pref.Pref<java.lang.Boolean> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void tearDownAutomatically() {
    }
    
    private final void currentBookIdChanged(java.util.UUID id) {
    }
    
    private final void headsetPlugged() {
    }
    
    private final void audioBecomingNoisy() {
    }
    
    private final de.ph1b.audiobook.data.Book currentBook() {
        return null;
    }
    
    private final void handlePlaybackStateStopped() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void play() {
    }
    
    private final void disposeOnDestroy(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable $receiver) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public PlaybackService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lde/ph1b/audiobook/playback/PlaybackService$Companion;", "", "()V", "NOTIFICATION_ID", "", "app_opensourceDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}