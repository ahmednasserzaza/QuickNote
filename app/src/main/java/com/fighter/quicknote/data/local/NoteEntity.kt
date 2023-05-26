package com.fighter.quicknote.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "NOTE_TABLE")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val content: String,
    val date: Date,
)
