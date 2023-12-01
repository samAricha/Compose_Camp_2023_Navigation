# Jetpack Compose Navigation Basics

## Overview

Jetpack Compose Navigation is a modern Android UI toolkit that simplifies navigation in your Android app. It adopts a declarative approach, offering a concise syntax to streamline UI development.

## Features

- **Declarative Approach:** Define UI based on the current state.
- **Navigation Component:** Foundation for creating seamless navigation flows.
- **Graph Structure:** Visual representation of the app's navigation structure.

## Getting Started

1. **Install Jetpack Compose:** Ensure your project is set up with Jetpack Compose.
2. **Add Navigation Component:** Integrate the Navigation component into your project.
3. **Create a Navigation Graph:** Define destinations and connections in the navigation graph.

```kotlin
NavHost(navController = navController, startDestination = "home") {
    composable("home") {
        HomeScreen()
    }
    composable("profile/{userId}") { backStackEntry ->
        val userId = backStackEntry.arguments?.getString("userId")
        ProfileScreen(userId = userId)
    }
    // Add more destinations as needed
}
