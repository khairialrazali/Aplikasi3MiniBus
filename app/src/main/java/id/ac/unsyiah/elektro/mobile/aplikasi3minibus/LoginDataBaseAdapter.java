package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class LoginDataBaseAdapter {
    static final String DATABASE_NAME = "login.db";
    static final int DATABASE_VERSION = 1;
    public static final int NAME_COLUMN = 1;
    static final String DATABASE_CREATE = "create table " + "LOGIN" + "( "
            + "ID" + " integer primary key autoincrement,"
            + "USERNAME  text,PASSWORD text); ";
    public SQLiteDatabase db;
    private final Context context;
    private DataBaseHelper dbHelper;

    public LoginDataBaseAdapter(Context _context) {
        context = _context;
        dbHelper = new DataBaseHelper(context, DATABASE_NAME, null,
                DATABASE_VERSION);
    }

    /*public LoginDataBaseAdapter open() throws SQLiteException {
        db = dbHelper.getWritableDatabase();
        //db = dbHelper.getReadableDatabase();
        return this;
    } */

    public void close() {
        db = dbHelper.getReadableDatabase();
        db.close();
    }

    public SQLiteDatabase getDatabaseInstance() {
        db = dbHelper.getWritableDatabase();
        return db;
    }

    public void insertEntry(String username, String password) {
        db = dbHelper.getWritableDatabase();
        ContentValues newValues = new ContentValues();
        newValues.put("USERNAME", username);
        newValues.put("PASSWORD", password);
        db.insert("LOGIN", null, newValues);

    }

    public int deleteEntry(String username) {
        db = dbHelper.getWritableDatabase();
        String where = "USERNAME=?";
        int numberOFEntriesDeleted = db.delete("LOGIN", where,
                new String[] { username });
        return numberOFEntriesDeleted;
    }

    public String getSinlgeEntry(String username) {
        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query("LOGIN", null, " USERNAME=?",
                new String[] { username }, null, null, null);
        if (cursor.getCount() < 1) {
            cursor.close();
            return "NOT EXIST";
        }
        cursor.moveToFirst();
        String password = cursor.getString(cursor.getColumnIndex("PASSWORD"));
        cursor.close();
        return password;
    }

    public void updateEntry(String username, String password) {
        db = dbHelper.getWritableDatabase();
        ContentValues updatedValues = new ContentValues();
        updatedValues.put("USERNAME", username);
        updatedValues.put("PASSWORD", password);

        String where = "USERNAME = ?";
        db.update("LOGIN", updatedValues, where, new String[] { username });
    }
}
