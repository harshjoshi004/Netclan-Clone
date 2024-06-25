package com.example.netclan.ExploreScreen

import androidx.annotation.DrawableRes
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.example.netclan.R


class ExploreScreenViewModel:ViewModel() {
    private val _selectedTabIndex  =  mutableIntStateOf(0)
    val selectedTabIndex: MutableIntState = _selectedTabIndex
    fun setSelectedTab(i:Int){
        _selectedTabIndex.intValue = i
    }

    private val _selectedScreenIndex  =  mutableIntStateOf(0)
    val selectedScreenIndex: MutableIntState = _selectedScreenIndex
    fun setSelectedScreen(i:Int){
        _selectedScreenIndex.intValue = i
    }

    val tabs = listOf("Personal","Services","Businesses")
    data class BottomItem(
        val title: String,
        @DrawableRes val selectedIcon: Int
    )
    val list = listOf(
        BottomItem(
            title = "Explore",
            selectedIcon = R.drawable.explore
        ),
        BottomItem(
            title = "Connect",
            selectedIcon = R.drawable.connections
        ),
        BottomItem(
            title = "Chat",
            selectedIcon = R.drawable.chat
        ),
        BottomItem(
            title = "Contacts",
            selectedIcon = R.drawable.contacts
        ),
        BottomItem(
            title = "Groups",
            selectedIcon = R.drawable.groups
        ),
    )
}