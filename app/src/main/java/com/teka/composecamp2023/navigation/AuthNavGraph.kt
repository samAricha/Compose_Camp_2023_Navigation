package com.teka.composecamp2023.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.teka.composecamp2023.screens.auth.LoginScreen
import com.teka.composecamp2023.screens.auth.RegistrationScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){

    navigation(
        startDestination = ScreenRoutes.LoginScreen.route,
        route = AUTH_GRAPH_ROUTE
    ){

        composable(
            route = ScreenRoutes.LoginScreen.route
        ) {
            LoginScreen(
                navController = navController
            )
        }

        composable(
            route = ScreenRoutes.RegistrationScreen.route
        ) {
            RegistrationScreen(
                navController = navController,
            )
        }

    }
}