package com.teka.composecamp2023.navigation

const val ROOT_GRAPH_ROUTE = "root_graph_route"
const val AUTH_GRAPH_ROUTE = "auth_graph_route"
const val MAIN_GRAPH_ROUTE = "main_graph_route"
const val To_MAIN_GRAPH_ROUTE = "to_main_graph_route"


sealed class ScreenRoutes(val route: String) {
    object HomeScreen : ScreenRoutes(route = "home_screen")
    object WalletScreen : ScreenRoutes(route = "wallet_screen")
    object LoginScreen : ScreenRoutes(route = "login_screen")
    object RegistrationScreen : ScreenRoutes(route = "registration_screen")
    object ProfileScreen : ScreenRoutes(route = "profile_screen")
}