package com.fighter.quicknote.ui.notes

import android.util.Log
import androidx.fragment.app.viewModels
import com.fighter.quicknote.R
import com.fighter.quicknote.databinding.FragmentNotesBinding
import com.fighter.quicknote.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.log

@AndroidEntryPoint
class NotesFragment : BaseFragment<FragmentNotesBinding>() {
    override val TAG: String = this::class.java.simpleName
    override val layoutIdFragment: Int = R.layout.fragment_notes
    override val viewModel: NoteViewModel by viewModels()

    override fun setup() {
        initAdapter()
    }

    private fun initAdapter() {
        val noteAdapter = NoteAdapter(mutableListOf() , viewModel)
        viewModel.notes.observe(this){
            binding.recyclerNotes.adapter = noteAdapter
            noteAdapter.apply { setItems(it) }
        }
    }

}