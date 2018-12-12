package de.ph1b.audiobook.misc;

import java.lang.System;

/**
 * * Class containing methods for recognizing different file types by their file ending.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR2\u0010\r\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u0005 \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lde/ph1b/audiobook/misc/FileRecognition;", "", "()V", "audioTypes", "", "", "[Ljava/lang/String;", "folderAndMusicFilter", "Ljava/io/FileFilter;", "getFolderAndMusicFilter", "()Ljava/io/FileFilter;", "imageFilter", "getImageFilter", "imageTypes", "", "kotlin.jvm.PlatformType", "", "musicFilter", "getMusicFilter", "app_opensourceDebug"})
public final class FileRecognition {
    private static final java.util.List<java.lang.String> imageTypes = null;
    private static final java.lang.String[] audioTypes = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.io.FileFilter imageFilter = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.io.FileFilter musicFilter = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.io.FileFilter folderAndMusicFilter = null;
    public static final de.ph1b.audiobook.misc.FileRecognition INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.FileFilter getImageFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.FileFilter getMusicFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.FileFilter getFolderAndMusicFilter() {
        return null;
    }
    
    private FileRecognition() {
        super();
    }
}