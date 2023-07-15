package com.eparita.ktorcheck

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.eparita.ktorcheck.navigation.SetupNavGraph
import com.eparita.ktorcheck.ui.theme.BorutoAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BorutoAppTheme {
                navController= rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}