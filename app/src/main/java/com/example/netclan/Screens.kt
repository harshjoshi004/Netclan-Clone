package com.example.netclan

sealed class Screens(val title: String, val route: String) {
    object Refine: Screens(title = "Refine", route = "refine_screen")
    object Explore: Screens(title = "Explore", route = "explore_screen")
}