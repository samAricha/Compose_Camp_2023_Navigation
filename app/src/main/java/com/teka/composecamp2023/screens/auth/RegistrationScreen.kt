package com.teka.composecamp2023.screens.auth

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import com.teka.composecamp2023.navigation.ScreenRoutes


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RegistrationScreen(
    navController: NavController
){

    Scaffold(
        topBar = {
                Text(
                    text = "Wallet",
                    fontWeight = FontWeight.Bold,
                )
        },

   ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
            contentAlignment = Alignment.Center

        ){
            Column {
                Text(text = "REGISTRATION SCREEN")

                Button(
                    onClick = {
                        navController.navigate(ScreenRoutes.LoginScreen.route)
                    },
                    modifier = Modifier
                        .padding(top = 16.dp)
                ) {
                    Text("Login")
                }
            }


        }
    }
}




