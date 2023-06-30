package com.example.sberapp.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(itemId: Long?, navController: NavHostController = rememberNavController(),) {

    Text(text = "clicked item was $itemId")
}