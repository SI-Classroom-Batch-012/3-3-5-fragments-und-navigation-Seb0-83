package com.example.mywallet.data

import com.example.mywallet.R

class Datasource() {
    fun loadNote(): List<Note>{
        return listOf(
            Note(R.string.bspNoteTitle,R.string.bspNoteText)
        )
    }

}