package com.eparita.ktorcheck.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.eparita.ktorcheck.presentation.screens.splash.SplashScreen
import com.eparita.ktorcheck.util.Constants.DETAILS_ARGUMENT_KEY

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route){
        composable(route = Screen.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screen.Welcome.route){

        }
        composable(route = Screen.Home.route){

        }
        composable(route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
                type= NavType.IntType
            })){

        }
        composable(route = Screen.Search.route){

        }
    }
}