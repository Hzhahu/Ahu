package de.ph1b.audiobook.playback;

import java.lang.System;

/**
 * * Notifies about changes upon android auto connection.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lde/ph1b/audiobook/playback/NotifyOnAutoConnectionChange;", "", "changeNotifier", "Lde/ph1b/audiobook/playback/utils/ChangeNotifier;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "currentBookIdPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "Ljava/util/UUID;", "autoConnection", "Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;", "(Lde/ph1b/audiobook/playback/utils/ChangeNotifier;Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/playback/AndroidAutoConnectedReceiver;)V", "listeningDisposable", "Lio/reactivex/disposables/Disposable;", "listen", "", "unregister", "app_opensourceDebug"})
@de.ph1b.audiobook.injection.PerService()
public final class NotifyOnAutoConnectionChange {
    private io.reactivex.disposables.Disposable listeningDisposable;
    private final de.ph1b.audiobook.playback.utils.ChangeNotifier changeNotifier = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref = null;
    private final de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver autoConnection = null;
    
    public final void listen() {
    }
    
    public final void unregister() {
    }
    
    @javax.inject.Inject()
    public NotifyOnAutoConnectionChange(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.utils.ChangeNotifier changeNotifier, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "currentBook")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.UUID> currentBookIdPref, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.playback.AndroidAutoConnectedReceiver autoConnection) {
        super();
    }
}