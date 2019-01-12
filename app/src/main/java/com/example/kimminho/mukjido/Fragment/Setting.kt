package com.example.kimminho.mukjido.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kimminho.mukjido.FragmentLayout.SettingLayout
import org.jetbrains.anko.AnkoContext

class Setting : Fragment() {

    val layout = SettingLayout()

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {
        val context = parent?.context
        return context?.let { layout.createView(AnkoContext.create(it)) }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout.apply {

        }

    }

}