package com.udacity.notepad.data

import android.provider.BaseColumns

import com.udacity.notepad.data.NotesContract.NoteTable.CREATED_AT
import com.udacity.notepad.data.NotesContract.NoteTable._TABLE_NAME

object NotesContract {

    val SQL_CREATE_ENTRIES = "CREATE TABLE " + _TABLE_NAME + " (" +
            NoteTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            NoteTable.TEXT + " TEXT, " +
            NoteTable.IS_PINNED + " INTEGER, " +
            CREATED_AT + " INTEGER, " +
            NoteTable.UPDATED_AT + " INTEGER" +
            ")"

    val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $_TABLE_NAME"

    val SQL_QUERY_ALL =
            "SELECT * FROM NOTE ORDER BY $CREATED_AT DESC"

    interface NoteTable : BaseColumns {
        companion object {
            val _TABLE_NAME = "notes"
            val TEXT = "text"
            val IS_PINNED = "is_pinned"
            val CREATED_AT = "created_at"
            val UPDATED_AT = "updated_at"
        }
    }
}
