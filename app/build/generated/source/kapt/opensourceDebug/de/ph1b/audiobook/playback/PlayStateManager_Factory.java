// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import dagger.internal.Factory;

public final class PlayStateManager_Factory implements Factory<PlayStateManager> {
  private static final PlayStateManager_Factory INSTANCE = new PlayStateManager_Factory();

  @Override
  public PlayStateManager get() {
    return provideInstance();
  }

  public static PlayStateManager provideInstance() {
    return new PlayStateManager();
  }

  public static PlayStateManager_Factory create() {
    return INSTANCE;
  }

  public static PlayStateManager newPlayStateManager() {
    return new PlayStateManager();
  }
}