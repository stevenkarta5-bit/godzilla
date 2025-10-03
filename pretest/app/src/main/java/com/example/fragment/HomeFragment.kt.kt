package com.example.app.ui

import android.app.Fragment
import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.app.R
import com.example.app.data.MockBooks
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.fragment.MainActivity

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val listView = view.findViewById<ListView>(R.id.listViewBooks)
        val titles = MockBooks.items.map { it.title }
        listView.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, titles)

        listView.setOnItemClickListener { _, _, position, _ ->
            (requireActivity() as MainActivity).navigateTo(
                DetailFragment.newInstance(position),
                addToBackStack = true
            )
        }

        view.findViewById<View>(R.id.btnOpenSettings).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(
                SettingsFragment.newInstance(),
                addToBackStack = true
            )
        }
    }
}
