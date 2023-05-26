package com.fighter.quicknote.ui.main

import androidx.activity.viewModels
import com.fighter.quicknote.R
import com.fighter.quicknote.databinding.ActivityMainBinding
import com.fighter.quicknote.ui.base.BaseActivity
import com.fighter.quicknote.ui.base.BaseViewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layoutIdActivity: Int = R.layout.activity_main
    override val viewModel: BaseViewModel by viewModels()
}