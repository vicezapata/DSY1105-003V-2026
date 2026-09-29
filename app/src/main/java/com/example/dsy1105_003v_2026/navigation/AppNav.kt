package com.example.dsy1105_003v_2026.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dsy1105_003v_2026.Home.MuestraDatosScreen
import com.example.dsy1105_003v_2026.ui.theme.HomeScreen
import com.example.dsy1105_003v_2026.view.DrawerMenu

@Composable

fun AppNav(){
    val navController = rememberNavController()

    NavHost(navController=navController, startDestination = "login"){
        composable("login"){
            HomeScreen(navController=navController)
        }

        composable(
            //route="muestraDatos/{username}",
            route="DrawerMenu/{username}",


            arguments = listOf(
                navArgument("username"){
                    type= NavType.StringType
                }
            )//fin listof
        )//fin segundo

        { //inicio back
            backStartEntry ->
            val username=backStartEntry.arguments?.getString("username").orEmpty()
          //  MuestraDatosScreen(username=username,navController=navController)
            DrawerMenu(username=username,navController=navController)

        }//termino inicio back



    }//Fin NavHost


}//Fin AppNav