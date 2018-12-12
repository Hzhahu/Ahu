package de.ph1b.audiobook.features.bookPlaying;

import java.lang.System;

/**
 * * MVP for the book detail screen
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp;", "", "Presenter", "View", "app_opensourceDebug"})
public abstract interface BookPlayMvp {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$View;", "", "finish", "", "openSleepTimeDialog", "render", "book", "Lde/ph1b/audiobook/data/Book;", "showBookmarkAdded", "showLeftSleepTime", "ms", "", "showPlaying", "playing", "", "app_opensourceDebug"})
    public static abstract interface View {
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        de.ph1b.audiobook.data.Book book);
        
        public abstract void finish();
        
        public abstract void showPlaying(boolean playing);
        
        public abstract void showLeftSleepTime(int ms);
        
        public abstract void openSleepTimeDialog();
        
        public abstract void showBookmarkAdded();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&\u00a8\u0006\u0012"}, d2 = {"Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$Presenter;", "Lde/ph1b/audiobook/mvp/Presenter;", "Lde/ph1b/audiobook/features/bookPlaying/BookPlayMvp$View;", "()V", "addBookmark", "", "fastForward", "next", "playPause", "previous", "rewind", "seekTo", "position", "", "file", "Ljava/io/File;", "toggleSkipSilence", "toggleSleepTimer", "app_opensourceDebug"})
    public static abstract class Presenter extends de.ph1b.audiobook.mvp.Presenter<de.ph1b.audiobook.features.bookPlaying.BookPlayMvp.View> {
        
        public abstract void playPause();
        
        public abstract void rewind();
        
        public abstract void fastForward();
        
        public abstract void next();
        
        public abstract void previous();
        
        public abstract void seekTo(int position, @org.jetbrains.annotations.Nullable()
        java.io.File file);
        
        public abstract void toggleSleepTimer();
        
        public abstract void addBookmark();
        
        public abstract void toggleSkipSilence();
        
        public Presenter() {
            super();
        }
    }
}