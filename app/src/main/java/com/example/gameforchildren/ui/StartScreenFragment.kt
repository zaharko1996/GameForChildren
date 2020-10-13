package com.example.gameforchildren.ui

import androidx.fragment.app.Fragment
import com.example.gameforchildren.R
import com.example.gameforchildren.ui.fragments.LevelSelectionFragment
import com.example.gameforchildren.utilits.replaceFragment
import kotlinx.android.synthetic.main.fragment_start_screen_fragment.*

class StartScreenFragment : Fragment(R.layout.fragment_start_screen_fragment){

private lateinit var test:String

    override fun onResume() {
        super.onResume()
        buttonStartScreen.setOnClickListener {
            replaceFragment(LevelSelectionFragment(), false)
        }
    }
}