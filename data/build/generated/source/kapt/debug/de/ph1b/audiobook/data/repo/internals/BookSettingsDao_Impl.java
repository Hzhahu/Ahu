package de.ph1b.audiobook.data.repo.internals;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import de.ph1b.audiobook.data.BookSettings;
import java.io.File;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unchecked")
public final class BookSettingsDao_Impl implements BookSettingsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBookSettings;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfSetActive;

  public BookSettingsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookSettings = new EntityInsertionAdapter<BookSettings>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bookSettings`(`id`,`currentFile`,`positionInChapter`,`playbackSpeed`,`loudnessGain`,`skipSilence`,`active`,`lastPlayedAtMillis`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookSettings value) {
        final String _tmp;
        _tmp = __converters.fromUUID(value.getId());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.fromFile(value.getCurrentFile());
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp_1);
        }
        stmt.bindLong(3, value.getPositionInChapter());
        stmt.bindDouble(4, value.getPlaybackSpeed());
        stmt.bindLong(5, value.getLoudnessGain());
        final int _tmp_2;
        _tmp_2 = value.getSkipSilence() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getActive() ? 1 : 0;
        stmt.bindLong(7, _tmp_3);
        stmt.bindLong(8, value.getLastPlayedAtMillis());
      }
    };
    this.__preparedStmtOfSetActive = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE bookSettings SET active=? WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(BookSettings bookSettings) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookSettings.insert(bookSettings);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setActive(UUID id, boolean active) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetActive.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = active ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 2;
      final String _tmp_1;
      _tmp_1 = __converters.fromUUID(id);
      if (_tmp_1 == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _tmp_1);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetActive.release(_stmt);
    }
  }

  @Override
  public List<BookSettings> all() {
    final String _sql = "SELECT * FROM bookSettings";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCurrentFile = _cursor.getColumnIndexOrThrow("currentFile");
      final int _cursorIndexOfPositionInChapter = _cursor.getColumnIndexOrThrow("positionInChapter");
      final int _cursorIndexOfPlaybackSpeed = _cursor.getColumnIndexOrThrow("playbackSpeed");
      final int _cursorIndexOfLoudnessGain = _cursor.getColumnIndexOrThrow("loudnessGain");
      final int _cursorIndexOfSkipSilence = _cursor.getColumnIndexOrThrow("skipSilence");
      final int _cursorIndexOfActive = _cursor.getColumnIndexOrThrow("active");
      final int _cursorIndexOfLastPlayedAtMillis = _cursor.getColumnIndexOrThrow("lastPlayedAtMillis");
      final List<BookSettings> _result = new ArrayList<BookSettings>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BookSettings _item;
        final UUID _tmpId;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfId);
        _tmpId = __converters.toUUID(_tmp);
        final File _tmpCurrentFile;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfCurrentFile);
        _tmpCurrentFile = __converters.toFile(_tmp_1);
        final int _tmpPositionInChapter;
        _tmpPositionInChapter = _cursor.getInt(_cursorIndexOfPositionInChapter);
        final float _tmpPlaybackSpeed;
        _tmpPlaybackSpeed = _cursor.getFloat(_cursorIndexOfPlaybackSpeed);
        final int _tmpLoudnessGain;
        _tmpLoudnessGain = _cursor.getInt(_cursorIndexOfLoudnessGain);
        final boolean _tmpSkipSilence;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfSkipSilence);
        _tmpSkipSilence = _tmp_2 != 0;
        final boolean _tmpActive;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfActive);
        _tmpActive = _tmp_3 != 0;
        final long _tmpLastPlayedAtMillis;
        _tmpLastPlayedAtMillis = _cursor.getLong(_cursorIndexOfLastPlayedAtMillis);
        _item = new BookSettings(_tmpId,_tmpCurrentFile,_tmpPositionInChapter,_tmpPlaybackSpeed,_tmpLoudnessGain,_tmpSkipSilence,_tmpActive,_tmpLastPlayedAtMillis);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
