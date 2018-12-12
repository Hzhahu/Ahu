package de.ph1b.audiobook.features.audio;

import java.lang.System;

/**
 * * Handles the the loudness gain.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lde/ph1b/audiobook/features/audio/LoudnessGain;", "", "()V", "audioSessionId", "", "effectWithSessionId", "Lde/ph1b/audiobook/features/audio/LoudnessGain$LoudnessEnhancerWithAudioSessionId;", "<set-?>", "gainmB", "getGainmB", "()I", "setGainmB", "(I)V", "gainmB$delegate", "Lkotlin/properties/ReadWriteProperty;", "attachEffect", "", "detachEffect", "update", "updateLoudnessEnhancer", "Companion", "LoudnessEnhancerWithAudioSessionId", "app_opensourceDebug"})
@javax.inject.Singleton()
public final class LoudnessGain {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty gainmB$delegate = null;
    private int audioSessionId;
    private de.ph1b.audiobook.features.audio.LoudnessGain.LoudnessEnhancerWithAudioSessionId effectWithSessionId;
    public static final int MAX_MB = 900;
    public static final de.ph1b.audiobook.features.audio.LoudnessGain.Companion Companion = null;
    
    public final int getGainmB() {
        return 0;
    }
    
    public final void setGainmB(int p0) {
    }
    
    public final void update(int audioSessionId) {
    }
    
    private final void updateLoudnessEnhancer() {
    }
    
    private final void attachEffect() {
    }
    
    private final void detachEffect() {
    }
    
    @javax.inject.Inject()
    public LoudnessGain() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lde/ph1b/audiobook/features/audio/LoudnessGain$LoudnessEnhancerWithAudioSessionId;", "", "loudnessEnhancer", "Landroid/media/audiofx/LoudnessEnhancer;", "audioSessionId", "", "(Landroid/media/audiofx/LoudnessEnhancer;I)V", "getAudioSessionId", "()I", "getLoudnessEnhancer", "()Landroid/media/audiofx/LoudnessEnhancer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_opensourceDebug"})
    static final class LoudnessEnhancerWithAudioSessionId {
        @org.jetbrains.annotations.NotNull()
        private final android.media.audiofx.LoudnessEnhancer loudnessEnhancer = null;
        private final int audioSessionId = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final android.media.audiofx.LoudnessEnhancer getLoudnessEnhancer() {
            return null;
        }
        
        public final int getAudioSessionId() {
            return 0;
        }
        
        public LoudnessEnhancerWithAudioSessionId(@org.jetbrains.annotations.NotNull()
        android.media.audiofx.LoudnessEnhancer loudnessEnhancer, int audioSessionId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.media.audiofx.LoudnessEnhancer component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.ph1b.audiobook.features.audio.LoudnessGain.LoudnessEnhancerWithAudioSessionId copy(@org.jetbrains.annotations.NotNull()
        android.media.audiofx.LoudnessEnhancer loudnessEnhancer, int audioSessionId) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lde/ph1b/audiobook/features/audio/LoudnessGain$Companion;", "", "()V", "MAX_MB", "", "app_opensourceDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}