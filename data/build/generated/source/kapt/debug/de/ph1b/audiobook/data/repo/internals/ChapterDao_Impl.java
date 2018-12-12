package de.ph1b.audiobook.data.repo.internals;

import android.database.Cursor;
import androidx.collection.SparseArrayCompat;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import de.ph1b.audiobook.data.Chapter;
import java.io.File;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unchecked")
public final class ChapterDao_Impl implements ChapterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfChapter;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteByBookId;

  public ChapterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChapter = new EntityInsertionAdapter<Chapter>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `chapters`(`file`,`name`,`duration`,`fileLastModified`,`marks`,`bookId`,`id`) VALUES (?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Chapter value) {
        final String _tmp;
        _tmp = __converters.fromFile(value.getFile());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getDuration());
        stmt.bindLong(4, value.getFileLastModified());
        final String _tmp_1;
        _tmp_1 = __converters.fromSparseArrayCompat(value.getMarks());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converters.fromUUID(value.getBookId());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDeleteByBookId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM chapters WHERE bookId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<Chapter> chapters) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfChapter.insert(chapters);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteByBookId(UUID bookId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByBookId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final String _tmp;
      _tmp = __converters.fromUUID(bookId);
      if (_tmp == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _tmp);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByBookId.release(_stmt);
    }
  }

  @Override
  public List<Chapter> byBookId(UUID bookId) {
    final String _sql = "SELECT * FROM chapters WHERE bookId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __converters.fromUUID(bookId);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfFile = _cursor.getColumnIndexOrThrow("file");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfDuration = _cursor.getColumnIndexOrThrow("duration");
      final int _cursorIndexOfFileLastModified = _cursor.getColumnIndexOrThrow("fileLastModified");
      final int _cursorIndexOfMarks = _cursor.getColumnIndexOrThrow("marks");
      final int _cursorIndexOfBookId = _cursor.getColumnIndexOrThrow("bookId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final List<Chapter> _result = new ArrayList<Chapter>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Chapter _item;
        final File _tmpFile;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfFile);
        _tmpFile = __converters.toFile(_tmp_1);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpDuration;
        _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
        final long _tmpFileLastModified;
        _tmpFileLastModified = _cursor.getLong(_cursorIndexOfFileLastModified);
        final SparseArrayCompat<String> _tmpMarks;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfMarks);
        _tmpMarks = __converters.toSparseArrayCompat(_tmp_2);
        final UUID _tmpBookId;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfBookId);
        _tmpBookId = __converters.toUUID(_tmp_3);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item = new Chapter(_tmpFile,_tmpName,_tmpDuration,_tmpFileLastModified,_tmpMarks,_tmpBookId,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
