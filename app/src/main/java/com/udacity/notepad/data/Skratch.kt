package com.udacity.notepad.data

/**
 * Created by ${Aly} on 10/21/2018.
 */

fun demoDataClass() {
    val note = Note(text = "we are here")
    note == note.copy()
    val aCopy = note.copy(text = "test",isPinned = true)
}
