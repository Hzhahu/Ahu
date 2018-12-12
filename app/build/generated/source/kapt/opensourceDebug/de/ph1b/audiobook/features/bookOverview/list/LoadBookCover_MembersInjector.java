// Generated by Dagger (https://google.github.io/dagger).
package de.ph1b.audiobook.features.bookOverview.list;

import dagger.MembersInjector;
import de.ph1b.audiobook.covercolorextractor.CoverColorExtractor;
import javax.inject.Provider;

public final class LoadBookCover_MembersInjector implements MembersInjector<LoadBookCover> {
  private final Provider<CoverColorExtractor> coverColorExtractorProvider;

  public LoadBookCover_MembersInjector(Provider<CoverColorExtractor> coverColorExtractorProvider) {
    this.coverColorExtractorProvider = coverColorExtractorProvider;
  }

  public static MembersInjector<LoadBookCover> create(
      Provider<CoverColorExtractor> coverColorExtractorProvider) {
    return new LoadBookCover_MembersInjector(coverColorExtractorProvider);
  }

  @Override
  public void injectMembers(LoadBookCover instance) {
    injectCoverColorExtractor(instance, coverColorExtractorProvider.get());
  }

  public static void injectCoverColorExtractor(
      LoadBookCover instance, CoverColorExtractor coverColorExtractor) {
    instance.coverColorExtractor = coverColorExtractor;
  }
}