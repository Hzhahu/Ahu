// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class PlayerController_Factory implements Factory<PlayerController> {
  private final Provider<Context> contextProvider;

  public PlayerController_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PlayerController get() {
    return provideInstance(contextProvider);
  }

  public static PlayerController provideInstance(Provider<Context> contextProvider) {
    return new PlayerController(contextProvider.get());
  }

  public static PlayerController_Factory create(Provider<Context> contextProvider) {
    return new PlayerController_Factory(contextProvider);
  }

  public static PlayerController newPlayerController(Context context) {
    return new PlayerController(context);
  }
}