package com.fighter.quicknote.data.repositories

import android.util.Log
import com.fighter.quicknote.data.local.NoteDao
import com.fighter.quicknote.data.local.NoteEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImp @Inject constructor(private val dao: NoteDao) : NoteRepository {

    override suspend fun insertNewNote(note: NoteEntity) = dao.insertNote(note)

    override fun getAllNotes():Flow<List<NoteEntity>>{
        Log.e("My data" , "${dao.getAllNotes()}")
        return dao.getAllNotes()

    }

    override suspend fun getFilteredNotes(searchTerm: String) =
        dao.getFilteredNotes("%$searchTerm%")
}