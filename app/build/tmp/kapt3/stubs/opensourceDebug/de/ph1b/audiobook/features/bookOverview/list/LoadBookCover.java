package de.ph1b.audiobook.features.bookOverview.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lde/ph1b/audiobook/features/bookOverview/list/LoadBookCover;", "", "holder", "Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewHolder;", "(Lde/ph1b/audiobook/features/bookOverview/list/BookOverviewHolder;)V", "boundFile", "Ljava/io/File;", "boundName", "", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "cover", "Landroid/widget/ImageView;", "coverColorExtractor", "Lde/ph1b/audiobook/covercolorextractor/CoverColorExtractor;", "getCoverColorExtractor", "()Lde/ph1b/audiobook/covercolorextractor/CoverColorExtractor;", "setCoverColorExtractor", "(Lde/ph1b/audiobook/covercolorextractor/CoverColorExtractor;)V", "currentCoverBindingJob", "Lkotlinx/coroutines/experimental/Job;", "defaultProgressColor", "", "progress", "Lde/ph1b/audiobook/uitools/SquareProgressView;", "load", "", "book", "Lde/ph1b/audiobook/data/Book;", "app_opensourceDebug"})
public final class LoadBookCover {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public de.ph1b.audiobook.covercolorextractor.CoverColorExtractor coverColorExtractor;
    private final android.content.Context context = null;
    private final de.ph1b.audiobook.uitools.SquareProgressView progress = null;
    private final android.widget.ImageView cover = null;
    private final int defaultProgressColor = 0;
    private java.io.File boundFile;
    private java.lang.String boundName;
    private kotlinx.coroutines.experimental.Job currentCoverBindingJob;
    
    @org.jetbrains.annotations.NotNull()
    public final de.ph1b.audiobook.covercolorextractor.CoverColorExtractor getCoverColorExtractor() {
        return null;
    }
    
    public final void setCoverColorExtractor(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.covercolorextractor.CoverColorExtractor p0) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.data.Book book) {
    }
    
    public LoadBookCover(@org.jetbrains.annotations.NotNull()
    de.ph1b.audiobook.features.bookOverview.list.BookOverviewHolder holder) {
        super();
    }
}