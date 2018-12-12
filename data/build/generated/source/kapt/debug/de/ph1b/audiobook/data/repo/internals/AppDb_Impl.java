package de.ph1b.audiobook.data.repo.internals;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDb_Impl extends AppDb {
  private volatile BookmarkDao _bookmarkDao;

  private volatile ChapterDao _chapterDao;

  private volatile BookMetaDataDao _bookMetaDataDao;

  private volatile BookSettingsDao _bookSettingsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(44) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bookmark` (`file` TEXT NOT NULL, `title` TEXT NOT NULL, `time` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `chapters` (`file` TEXT NOT NULL, `name` TEXT NOT NULL, `duration` INTEGER NOT NULL, `fileLastModified` INTEGER NOT NULL, `marks` TEXT NOT NULL, `bookId` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE  INDEX `index_chapters_bookId` ON `chapters` (`bookId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bookMetaData` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `author` TEXT, `name` TEXT NOT NULL, `root` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bookSettings` (`id` TEXT NOT NULL, `currentFile` TEXT NOT NULL, `positionInChapter` INTEGER NOT NULL, `playbackSpeed` REAL NOT NULL, `loudnessGain` INTEGER NOT NULL, `skipSilence` INTEGER NOT NULL, `active` INTEGER NOT NULL, `lastPlayedAtMillis` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"5dd09eb49be8be0853be8ae0342f41f4\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `bookmark`");
        _db.execSQL("DROP TABLE IF EXISTS `chapters`");
        _db.execSQL("DROP TABLE IF EXISTS `bookMetaData`");
        _db.execSQL("DROP TABLE IF EXISTS `bookSettings`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBookmark = new HashMap<String, TableInfo.Column>(4);
        _columnsBookmark.put("file", new TableInfo.Column("file", "TEXT", true, 0));
        _columnsBookmark.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsBookmark.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
        _columnsBookmark.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookmark = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookmark = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookmark = new TableInfo("bookmark", _columnsBookmark, _foreignKeysBookmark, _indicesBookmark);
        final TableInfo _existingBookmark = TableInfo.read(_db, "bookmark");
        if (! _infoBookmark.equals(_existingBookmark)) {
          throw new IllegalStateException("Migration didn't properly handle bookmark(de.ph1b.audiobook.data.Bookmark).\n"
                  + " Expected:\n" + _infoBookmark + "\n"
                  + " Found:\n" + _existingBookmark);
        }
        final HashMap<String, TableInfo.Column> _columnsChapters = new HashMap<String, TableInfo.Column>(7);
        _columnsChapters.put("file", new TableInfo.Column("file", "TEXT", true, 0));
        _columnsChapters.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsChapters.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0));
        _columnsChapters.put("fileLastModified", new TableInfo.Column("fileLastModified", "INTEGER", true, 0));
        _columnsChapters.put("marks", new TableInfo.Column("marks", "TEXT", true, 0));
        _columnsChapters.put("bookId", new TableInfo.Column("bookId", "TEXT", true, 0));
        _columnsChapters.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChapters = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChapters = new HashSet<TableInfo.Index>(1);
        _indicesChapters.add(new TableInfo.Index("index_chapters_bookId", false, Arrays.asList("bookId")));
        final TableInfo _infoChapters = new TableInfo("chapters", _columnsChapters, _foreignKeysChapters, _indicesChapters);
        final TableInfo _existingChapters = TableInfo.read(_db, "chapters");
        if (! _infoChapters.equals(_existingChapters)) {
          throw new IllegalStateException("Migration didn't properly handle chapters(de.ph1b.audiobook.data.Chapter).\n"
                  + " Expected:\n" + _infoChapters + "\n"
                  + " Found:\n" + _existingChapters);
        }
        final HashMap<String, TableInfo.Column> _columnsBookMetaData = new HashMap<String, TableInfo.Column>(5);
        _columnsBookMetaData.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsBookMetaData.put("type", new TableInfo.Column("type", "TEXT", true, 0));
        _columnsBookMetaData.put("author", new TableInfo.Column("author", "TEXT", false, 0));
        _columnsBookMetaData.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsBookMetaData.put("root", new TableInfo.Column("root", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookMetaData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookMetaData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookMetaData = new TableInfo("bookMetaData", _columnsBookMetaData, _foreignKeysBookMetaData, _indicesBookMetaData);
        final TableInfo _existingBookMetaData = TableInfo.read(_db, "bookMetaData");
        if (! _infoBookMetaData.equals(_existingBookMetaData)) {
          throw new IllegalStateException("Migration didn't properly handle bookMetaData(de.ph1b.audiobook.data.BookMetaData).\n"
                  + " Expected:\n" + _infoBookMetaData + "\n"
                  + " Found:\n" + _existingBookMetaData);
        }
        final HashMap<String, TableInfo.Column> _columnsBookSettings = new HashMap<String, TableInfo.Column>(8);
        _columnsBookSettings.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsBookSettings.put("currentFile", new TableInfo.Column("currentFile", "TEXT", true, 0));
        _columnsBookSettings.put("positionInChapter", new TableInfo.Column("positionInChapter", "INTEGER", true, 0));
        _columnsBookSettings.put("playbackSpeed", new TableInfo.Column("playbackSpeed", "REAL", true, 0));
        _columnsBookSettings.put("loudnessGain", new TableInfo.Column("loudnessGain", "INTEGER", true, 0));
        _columnsBookSettings.put("skipSilence", new TableInfo.Column("skipSilence", "INTEGER", true, 0));
        _columnsBookSettings.put("active", new TableInfo.Column("active", "INTEGER", true, 0));
        _columnsBookSettings.put("lastPlayedAtMillis", new TableInfo.Column("lastPlayedAtMillis", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookSettings = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookSettings = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookSettings = new TableInfo("bookSettings", _columnsBookSettings, _foreignKeysBookSettings, _indicesBookSettings);
        final TableInfo _existingBookSettings = TableInfo.read(_db, "bookSettings");
        if (! _infoBookSettings.equals(_existingBookSettings)) {
          throw new IllegalStateException("Migration didn't properly handle bookSettings(de.ph1b.audiobook.data.BookSettings).\n"
                  + " Expected:\n" + _infoBookSettings + "\n"
                  + " Found:\n" + _existingBookSettings);
        }
      }
    }, "5dd09eb49be8be0853be8ae0342f41f4", "0fdf7a6cdaf2d7b3a0de5c7d068fa58a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "bookmark","chapters","bookMetaData","bookSettings");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `bookmark`");
      _db.execSQL("DELETE FROM `chapters`");
      _db.execSQL("DELETE FROM `bookMetaData`");
      _db.execSQL("DELETE FROM `bookSettings`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public BookmarkDao bookmarkDao() {
    if (_bookmarkDao != null) {
      return _bookmarkDao;
    } else {
      synchronized(this) {
        if(_bookmarkDao == null) {
          _bookmarkDao = new BookmarkDao_Impl(this);
        }
        return _bookmarkDao;
      }
    }
  }

  @Override
  public ChapterDao chapterDao() {
    if (_chapterDao != null) {
      return _chapterDao;
    } else {
      synchronized(this) {
        if(_chapterDao == null) {
          _chapterDao = new ChapterDao_Impl(this);
        }
        return _chapterDao;
      }
    }
  }

  @Override
  public BookMetaDataDao bookMetadataDao() {
    if (_bookMetaDataDao != null) {
      return _bookMetaDataDao;
    } else {
      synchronized(this) {
        if(_bookMetaDataDao == null) {
          _bookMetaDataDao = new BookMetaDataDao_Impl(this);
        }
        return _bookMetaDataDao;
      }
    }
  }

  @Override
  public BookSettingsDao bookSettingsDao() {
    if (_bookSettingsDao != null) {
      return _bookSettingsDao;
    } else {
      synchronized(this) {
        if(_bookSettingsDao == null) {
          _bookSettingsDao = new BookSettingsDao_Impl(this);
        }
        return _bookSettingsDao;
      }
    }
  }
}
