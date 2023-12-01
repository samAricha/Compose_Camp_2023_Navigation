package com.teka.composecamp2023.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.teka.composecamp2023.navigation.ScreenRoutes


data class BottomNavigation(
    val title: String,
    val icon: ImageVector,
    val route: String
)

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = ScreenRoutes.HomeScreen.route
    ),

    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Wallet,
        route = ScreenRoutes.WalletScreen.route
    ),

    BottomNavigation(
        title = "Profile",
        icon = Icons.Rounded.AccountCircle,
        route = ScreenRoutes.ProfileScreen.route
    )
)

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    NavigationBar(
        containerColor = Color.White,
        tonalElevation = 5.dp
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        Column {
            Row(
                modifier = Modifier.background(Color.White)
            ) {

                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color.Blue,
                            unselectedIconColor = Color.Gray,
                            selectedIconColor = Color.White
                        ),
                        selected = currentRoute == item.route,
                        onClick = {
                                  navController.navigate(item.route)
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                            )
                        },
                        label = {
                            Text(
                                text = item.title,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    )
                }

            }
        }
    }
}


























