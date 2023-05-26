package com.fighter.quicknote.ui.notes

import androidx.fragment.app.viewModels
import com.fighter.quicknote.R
import com.fighter.quicknote.databinding.FragmentNotesBinding
import com.fighter.quicknote.ui.base.BaseFragment

class NotesFragment : BaseFragment<FragmentNotesBinding>() {
    override val TAG: String = this::class.java.simpleName
    override val layoutIdFragment: Int = R.layout.fragment_notes
    override val viewModel: NoteViewModel by viewModels()
    private lateinit var noteAdapter:NoteAdapter

    override fun setup() {
        initAdapter()
    }

    private fun initAdapter() {
        noteAdapter = NoteAdapter(emptyList() , viewModel)
    }

}