// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.playback;

import dagger.internal.Factory;
import de.ph1b.audiobook.features.audio.Equalizer;
import de.ph1b.audiobook.features.audio.LoudnessGain;
import de.ph1b.audiobook.persistence.pref.Pref;
import de.ph1b.audiobook.playback.utils.DataSourceConverter;
import de.ph1b.audiobook.playback.utils.WakeLockManager;
import javax.inject.Provider;

public final class MediaPlayer_Factory implements Factory<MediaPlayer> {
  private final Provider<PlayStateManager> playStateManagerProvider;

  private final Provider<Pref<Integer>> autoRewindAmountPrefProvider;

  private final Provider<Pref<Integer>> seekTimePrefProvider;

  private final Provider<Equalizer> equalizerProvider;

  private final Provider<LoudnessGain> loudnessGainProvider;

  private final Provider<WakeLockManager> wakeLockManagerProvider;

  private final Provider<DataSourceConverter> dataSourceConverterProvider;

  private final Provider<OnlyAudioRenderersFactory> onlyAudioRenderersFactoryProvider;

  public MediaPlayer_Factory(
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<Pref<Integer>> autoRewindAmountPrefProvider,
      Provider<Pref<Integer>> seekTimePrefProvider,
      Provider<Equalizer> equalizerProvider,
      Provider<LoudnessGain> loudnessGainProvider,
      Provider<WakeLockManager> wakeLockManagerProvider,
      Provider<DataSourceConverter> dataSourceConverterProvider,
      Provider<OnlyAudioRenderersFactory> onlyAudioRenderersFactoryProvider) {
    this.playStateManagerProvider = playStateManagerProvider;
    this.autoRewindAmountPrefProvider = autoRewindAmountPrefProvider;
    this.seekTimePrefProvider = seekTimePrefProvider;
    this.equalizerProvider = equalizerProvider;
    this.loudnessGainProvider = loudnessGainProvider;
    this.wakeLockManagerProvider = wakeLockManagerProvider;
    this.dataSourceConverterProvider = dataSourceConverterProvider;
    this.onlyAudioRenderersFactoryProvider = onlyAudioRenderersFactoryProvider;
  }

  @Override
  public MediaPlayer get() {
    return provideInstance(
        playStateManagerProvider,
        autoRewindAmountPrefProvider,
        seekTimePrefProvider,
        equalizerProvider,
        loudnessGainProvider,
        wakeLockManagerProvider,
        dataSourceConverterProvider,
        onlyAudioRenderersFactoryProvider);
  }

  public static MediaPlayer provideInstance(
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<Pref<Integer>> autoRewindAmountPrefProvider,
      Provider<Pref<Integer>> seekTimePrefProvider,
      Provider<Equalizer> equalizerProvider,
      Provider<LoudnessGain> loudnessGainProvider,
      Provider<WakeLockManager> wakeLockManagerProvider,
      Provider<DataSourceConverter> dataSourceConverterProvider,
      Provider<OnlyAudioRenderersFactory> onlyAudioRenderersFactoryProvider) {
    return new MediaPlayer(
        playStateManagerProvider.get(),
        autoRewindAmountPrefProvider.get(),
        seekTimePrefProvider.get(),
        equalizerProvider.get(),
        loudnessGainProvider.get(),
        wakeLockManagerProvider.get(),
        dataSourceConverterProvider.get(),
        onlyAudioRenderersFactoryProvider.get());
  }

  public static MediaPlayer_Factory create(
      Provider<PlayStateManager> playStateManagerProvider,
      Provider<Pref<Integer>> autoRewindAmountPrefProvider,
      Provider<Pref<Integer>> seekTimePrefProvider,
      Provider<Equalizer> equalizerProvider,
      Provider<LoudnessGain> loudnessGainProvider,
      Provider<WakeLockManager> wakeLockManagerProvider,
      Provider<DataSourceConverter> dataSourceConverterProvider,
      Provider<OnlyAudioRenderersFactory> onlyAudioRenderersFactoryProvider) {
    return new MediaPlayer_Factory(
        playStateManagerProvider,
        autoRewindAmountPrefProvider,
        seekTimePrefProvider,
        equalizerProvider,
        loudnessGainProvider,
        wakeLockManagerProvider,
        dataSourceConverterProvider,
        onlyAudioRenderersFactoryProvider);
  }

  public static MediaPlayer newMediaPlayer(
      PlayStateManager playStateManager,
      Pref<Integer> autoRewindAmountPref,
      Pref<Integer> seekTimePref,
      Equalizer equalizer,
      LoudnessGain loudnessGain,
      WakeLockManager wakeLockManager,
      DataSourceConverter dataSourceConverter,
      OnlyAudioRenderersFactory onlyAudioRenderersFactory) {
    return new MediaPlayer(
        playStateManager,
        autoRewindAmountPref,
        seekTimePref,
        equalizer,
        loudnessGain,
        wakeLockManager,
        dataSourceConverter,
        onlyAudioRenderersFactory);
  }
}
