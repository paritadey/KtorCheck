package com.eparita.ktorcheck.presentation.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Scaffold(topBar = {
        HomeTopBar(onSearchClicked = {})
    }) {

    }
}