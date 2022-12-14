package com.example.e_commerceapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.e_commerceapp.ui.AccountFragment
import com.example.e_commerceapp.ui.CartFragment
import com.example.e_commerceapp.ui.HomeFragment
import com.example.e_commerceapp.ui.WalletFragment

class MainViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
return when(position){
    0->HomeFragment()

    1->CartFragment()

    2->WalletFragment()

    else->AccountFragment()
}

    }
}