package com.teka.composecamp2023.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.teka.composecamp2023.MainAppScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun RootNavGraph(
    navController: NavHostController,
    startDestination: String = To_MAIN_GRAPH_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        route = ROOT_GRAPH_ROUTE
    ){
        authNavGraph(navController = navController)

        composable(route = To_MAIN_GRAPH_ROUTE){
//            MainNavGraph()
            MainAppScreen()
        }
    }
}