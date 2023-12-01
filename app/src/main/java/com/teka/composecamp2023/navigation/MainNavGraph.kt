package com.teka.composecamp2023.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.teka.composecamp2023.screens.main.HomeScreen
import com.teka.composecamp2023.screens.main.ProfileScreen
import com.teka.composecamp2023.screens.main.WalletScreen


@Composable
fun MainNavGraph(
    navController: NavHostController = rememberNavController(),
) {

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.HomeScreen.route,
        route = MAIN_GRAPH_ROUTE
    ) {


        composable(
            route = ScreenRoutes.HomeScreen.route,
        ){
            HomeScreen(navController = navController)
        }

        composable(
            route = ScreenRoutes.ProfileScreen.route
        ){
            ProfileScreen(navController = navController)
        }

        composable(
            route = ScreenRoutes.WalletScreen.route
        ){
            WalletScreen()
        }

    }
}