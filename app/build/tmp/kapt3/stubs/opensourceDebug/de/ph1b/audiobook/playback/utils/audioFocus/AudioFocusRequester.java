package de.ph1b.audiobook.playback.utils.audioFocus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lde/ph1b/audiobook/playback/utils/audioFocus/AudioFocusRequester;", "", "abandon", "", "request", "", "app_opensourceDebug"})
public abstract interface AudioFocusRequester {
    
    public abstract int request();
    
    public abstract void abandon();
}