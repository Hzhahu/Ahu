package de.ph1b.audiobook.data.repo.internals;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import de.ph1b.audiobook.data.Bookmark;
import java.io.File;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class BookmarkDao_Impl implements BookmarkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBookmark;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteBookmark;

  public BookmarkDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookmark = new EntityInsertionAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `bookmark`(`file`,`title`,`time`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
        final String _tmp;
        _tmp = __converters.fromFile(value.getMediaFile());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getTime());
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteBookmark = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM bookmark WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long addBookmark(Bookmark bookmark) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfBookmark.insertAndReturnId(bookmark);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteBookmark(long id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBookmark.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteBookmark.release(_stmt);
    }
  }

  @Override
  public List<Bookmark> allForFiles(List<File> files) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM bookmark WHERE file IN(");
    final int _inputSize = files.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (File _item : files) {
      final String _tmp;
      _tmp = __converters.fromFile(_item);
      if (_tmp == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _tmp);
      }
      _argIndex ++;
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfMediaFile = _cursor.getColumnIndexOrThrow("file");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfTime = _cursor.getColumnIndexOrThrow("time");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final List<Bookmark> _result = new ArrayList<Bookmark>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Bookmark _item_1;
        final File _tmpMediaFile;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfMediaFile);
        _tmpMediaFile = __converters.toFile(_tmp_1);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final int _tmpTime;
        _tmpTime = _cursor.getInt(_cursorIndexOfTime);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item_1 = new Bookmark(_tmpMediaFile,_tmpTitle,_tmpTime,_tmpId);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
