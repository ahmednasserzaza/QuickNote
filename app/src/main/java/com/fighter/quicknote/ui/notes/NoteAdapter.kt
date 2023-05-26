package com.fighter.quicknote.ui.notes

import com.fighter.quicknote.R
import com.fighter.quicknote.data.local.NoteEntity
import com.fighter.quicknote.ui.base.BaseAdapter
import com.fighter.quicknote.ui.base.BaseInteractionListener


class NoteAdapter(
    notes: List<NoteEntity>,
    listener: NoteInteractionListener
) : BaseAdapter<NoteEntity>(notes , listener) {
    override val layoutID: Int = R.layout.item_note
}

interface NoteInteractionListener : BaseInteractionListener {
    fun onClickNote(note: NoteEntity)
}