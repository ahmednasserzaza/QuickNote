package com.fighter.quicknote.ui.notes

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.fighter.quicknote.data.local.NoteEntity
import com.fighter.quicknote.data.repositories.NoteRepository
import com.fighter.quicknote.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(private val noteRepository: NoteRepository) :
    BaseViewModel(), NoteInteractionListener {

    val newNoteTitle = MutableLiveData<String>()
    val newNoteContent = MutableLiveData<String>()

    val searchTerm = MutableStateFlow("")

    private val _notes = MutableLiveData<List<NoteEntity>>()
    val notes: LiveData<List<NoteEntity>>
        get() = _notes

    init {
        getAllNotes()
    }


    private fun getAllNotes() {
        viewModelScope.launch {
            noteRepository.getAllNotes().collect {
                _notes.postValue(it)
                Log.e("My data" , "${notes.value}")
            }
        }
    }

    fun addNote() {
        viewModelScope.launch {
            newNoteTitle.value?.let { title ->
                newNoteContent.value?.let { content ->
                    noteRepository.insertNewNote(
                        NoteEntity(
                            title = title,
                            content = content,
                            date = Date()
                        )
                    )
                    newNoteTitle.value = ""
                    newNoteContent.value = ""
                }
            }
        }
    }

    override fun onClickNote(note: NoteEntity) {

    }


}
