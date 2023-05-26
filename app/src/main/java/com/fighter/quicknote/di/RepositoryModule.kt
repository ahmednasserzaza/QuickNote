package com.fighter.quicknote.di

import com.fighter.quicknote.data.local.NoteDao
import com.fighter.quicknote.data.repositories.NoteRepository
import com.fighter.quicknote.data.repositories.NoteRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun providesNoteRepository(dao: NoteDao): NoteRepository = NoteRepositoryImp(dao)
}