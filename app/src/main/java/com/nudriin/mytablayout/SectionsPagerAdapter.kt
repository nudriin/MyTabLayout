package com.nudriin.mytablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Create adapter for view  pager 2
// Terdapat constructor yang diperlukan yaitu AppCompatActivity karena kita menggunakan Activity.
// Apabila Anda menerapkannya di Fragment, gunakanFragmentActivity.
class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        // return 2 // return the number of fragment
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        // var fragment: Fragment? = null // create initial fragment variable
        // we switch the position
        // if position 0 then fragment will be home fragment
        // if position 1 then fragment will be profile fragment
        // when (position) {
        //    0 -> fragment = HomeFragment()
        //    1 -> fragment = ProfileFragment()
        //}

        // return fragment as Fragment // return the fragment

        // ^^^^^^^^^^^^^^^^^ OLD ^^^^^^^^^^^^^^^^^

        // vvvvvvvvvvvvvvvvvv NEW vvvvvvvvvvvvvvvvv
        val fragment = HomeFragment()
        fragment.arguments = Bundle().apply {
            putInt(HomeFragment.ARG_SECTION_NUMBER, position + 1)
        }

        return fragment
    }
}