package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
//        TopAppBar()
        UpperPanel(navController)
        LowerPanel(navController, DishRepository.dishes)
    }
}
