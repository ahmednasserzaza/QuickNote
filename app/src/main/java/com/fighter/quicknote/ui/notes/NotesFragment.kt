package com.fighter.quicknote.ui.notes

import androidx.fragment.app.viewModels
import com.fighter.quicknote.R
import com.fighter.quicknote.databinding.FragmentNotesBinding
import com.fighter.quicknote.ui.base.BaseFragment

class NotesFragment : BaseFragment<FragmentNotesBinding>() {
    override val layoutIdFragment: Int = R.layout.fragment_notes
    override val viewModel: NoteViewModel by viewModels()

}