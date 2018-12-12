package de.ph1b.audiobook.features;

import java.lang.System;

/**
 * * Base class for adding new books.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\b\u0001\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\u0002\u0010\u0011J7\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00172\u0006\u0010,\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J!\u0010/\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0011\u00101\u001a\u00020&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0011\u00103\u001a\u00020&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\"\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\'\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\u0006\u00106\u001a\u00020\u0014H\u0002J\u001e\u00107\u001a\b\u0012\u0004\u0012\u00020+0\u00172\u0006\u0010(\u001a\u00020)2\u0006\u0010\'\u001a\u00020\u0018H\u0002J\u001f\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020&0;H\u0082\bJ\u0010\u0010<\u001a\u00020&2\b\b\u0002\u0010=\u001a\u00020\u0014J\b\u0010>\u001a\u00020&H\u0002J\'\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u0002052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AR\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0015*\u0004\u0018\u00010\u001c0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001aR\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006B"}, d2 = {"Lde/ph1b/audiobook/features/BookAdder;", "", "context", "Landroid/content/Context;", "repo", "Lde/ph1b/audiobook/data/repo/BookRepository;", "coverCollector", "Lde/ph1b/audiobook/uitools/CoverFromDiscCollector;", "mediaAnalyzer", "Lde/ph1b/audiobook/misc/MediaAnalyzer;", "chapterReader", "Lde/paulwoitaschek/chapterreader/ChapterReader;", "singleBookFolderPref", "Lde/ph1b/audiobook/persistence/pref/Pref;", "", "", "collectionBookFolderPref", "(Landroid/content/Context;Lde/ph1b/audiobook/data/repo/BookRepository;Lde/ph1b/audiobook/uitools/CoverFromDiscCollector;Lde/ph1b/audiobook/misc/MediaAnalyzer;Lde/paulwoitaschek/chapterreader/ChapterReader;Lde/ph1b/audiobook/persistence/pref/Pref;Lde/ph1b/audiobook/persistence/pref/Pref;)V", "_scannerActive", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "collectionBookFiles", "", "Ljava/io/File;", "getCollectionBookFiles", "()Ljava/util/List;", "executor", "Ljava/util/concurrent/ExecutorService;", "isScanning", "scannerActive", "Lio/reactivex/Observable;", "getScannerActive", "()Lio/reactivex/Observable;", "singleBookFiles", "getSingleBookFiles", "stopScanner", "addNewBook", "", "rootFile", "bookId", "Ljava/util/UUID;", "newChapters", "Lde/ph1b/audiobook/data/Chapter;", "type", "Lde/ph1b/audiobook/data/Book$Type;", "(Ljava/io/File;Ljava/util/UUID;Ljava/util/List;Lde/ph1b/audiobook/data/Book$Type;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "checkBook", "(Ljava/io/File;Lde/ph1b/audiobook/data/Book$Type;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "checkForBooks", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "deleteOldBooks", "getBookFromDb", "Lde/ph1b/audiobook/data/Book;", "orphaned", "getChaptersByRootFile", "profile", "taskName", "task", "Lkotlin/Function0;", "scanForFiles", "restartIfScanning", "throwIfStopRequested", "updateBook", "bookExisting", "(Lde/ph1b/audiobook/data/Book;Ljava/util/List;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class BookAdder {
    private final java.util.concurrent.ExecutorService executor = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> _scannerActive = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Boolean> scannerActive = null;
    private volatile boolean stopScanner;
    private volatile boolean isScanning;
    private final android.content.Context context = null;
    private final de.ph1b.audiobook.data.repo.BookRepository repo = null;
    private final de.ph1b.audiobook.uitools.CoverFromDiscCollector coverCollector = null;
    private final de.ph1b.audiobook.misc.MediaAnalyzer mediaAnalyzer = null;
    private final de.paulwoitaschek.chapterreader.ChapterReader chapterReader = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> singleBookFolderPref = null;
    private final de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> collectionBookFolderPref = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> getScannerActive() {
        return null;
    }
    
    /**
     * Restarts the scanner 
     */
    public final void scanForFiles(boolean restartIfScanning) {
    }
    
    private final void profile(java.lang.String taskName, kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    private final java.util.List<java.io.File> getSingleBookFiles() {
        return null;
    }
    
    private final java.util.List<java.io.File> getCollectionBookFiles() {
        return null;
    }
    
    private final java.util.List<de.ph1b.audiobook.data.Chapter> getChaptersByRootFile(java.util.UUID bookId, java.io.File rootFile) {
        return null;
    }
    
    private final void throwIfStopRequested() throws java.lang.InterruptedException {
    }
    
    /**
     * * Gets a book from the database matching to a defines mask.
     *   *
     *   * @param orphaned If we should return a book that is orphaned, or a book that is currently
     */
    private final de.ph1b.audiobook.data.Book getBookFromDb(java.io.File rootFile, de.ph1b.audiobook.data.Book.Type type, boolean orphaned) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookAdder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.repo.BookRepository repo, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.uitools.CoverFromDiscCollector coverCollector, @org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.misc.MediaAnalyzer mediaAnalyzer, @org.jetbrains.annotations.NotNull()
    de.paulwoitaschek.chapterreader.ChapterReader chapterReader, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "singleBookFolders")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> singleBookFolderPref, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "folders")
    de.ph1b.audiobook.persistence.pref.Pref<java.util.Set<java.lang.String>> collectionBookFolderPref) {
        super();
    }
}