package com.teka.composecamp2023

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.teka.composecamp2023.navigation.AUTH_GRAPH_ROUTE
import com.teka.composecamp2023.navigation.RootNavGraph
import com.teka.composecamp2023.ui.theme.ComposeCamp2023Theme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCamp2023Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootNavGraph(
                        navController = rememberNavController(),
                        startDestination = AUTH_GRAPH_ROUTE
                    )
                }
            }
        }
    }
}
