package de.ph1b.audiobook.data.repo.internals;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import de.ph1b.audiobook.data.Book;
import de.ph1b.audiobook.data.BookMetaData;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.UUID;

@SuppressWarnings("unchecked")
public final class BookMetaDataDao_Impl implements BookMetaDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBookMetaData;

  private final Converters __converters = new Converters();

  public BookMetaDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookMetaData = new EntityInsertionAdapter<BookMetaData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bookMetaData`(`id`,`type`,`author`,`name`,`root`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookMetaData value) {
        final String _tmp;
        _tmp = __converters.fromUUID(value.getId());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.fromBookType(value.getType());
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp_1);
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getRoot() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRoot());
        }
      }
    };
  }

  @Override
  public void insert(BookMetaData metaData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookMetaData.insert(metaData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public BookMetaData byId(UUID id) {
    final String _sql = "SELECT * FROM bookMetaData WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __converters.fromUUID(id);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfType = _cursor.getColumnIndexOrThrow("type");
      final int _cursorIndexOfAuthor = _cursor.getColumnIndexOrThrow("author");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfRoot = _cursor.getColumnIndexOrThrow("root");
      final BookMetaData _result;
      if(_cursor.moveToFirst()) {
        final UUID _tmpId;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfId);
        _tmpId = __converters.toUUID(_tmp_1);
        final Book.Type _tmpType;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfType);
        _tmpType = __converters.toBookType(_tmp_2);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRoot;
        _tmpRoot = _cursor.getString(_cursorIndexOfRoot);
        _result = new BookMetaData(_tmpId,_tmpType,_tmpAuthor,_tmpName,_tmpRoot);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
