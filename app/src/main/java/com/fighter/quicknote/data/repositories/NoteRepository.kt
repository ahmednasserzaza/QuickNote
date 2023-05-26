package com.fighter.quicknote.data.repositories

import com.fighter.quicknote.data.local.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insertNewNote(note: NoteEntity)

    fun getAllNotes(): Flow<List<NoteEntity>>

    suspend fun getFilteredNotes(searchTerm: String): List<NoteEntity>
}