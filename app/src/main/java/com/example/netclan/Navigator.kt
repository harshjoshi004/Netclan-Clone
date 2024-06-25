package com.example.netclan

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.netclan.ExploreScreen.ExploreUI
import com.example.netclan.RefineScreen.RefineUI

@Composable
fun Navigator() {
    val navcon = rememberNavController()
    NavHost(navController = navcon, startDestination = Screens.Explore.route){
        composable(Screens.Explore.route){
            ExploreUI(navcon)
        }
        composable(Screens.Refine.route){
            RefineUI(navcon)
        }
    }
}