package com.vinhbqph33437.lab6

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.vinhbqph33437.lab6.activities.LoginScreen
import com.vinhbqph33437.lab6.activities.MovieFormScreen
import com.vinhbqph33437.lab6.activities.MovieScreen
import com.vinhbqph33437.lab6.viewmodel.MovieViewModel

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    val movieViewModel = MovieViewModel()
    NavHost(
        navController = navController,
        startDestination = Screen.MOVIE_SCREEN.route,
    ) {
        composable(Screen.LOGIN.route) { LoginScreen(navController) }
        composable(Screen.MOVIE_SCREEN.route) { MovieScreen(navController) }
        composable(Screen.ADD.route) { MovieFormScreen(navController, movieViewModel, null) }
        composable(
            "${Screen.EDIT.route}/{filmId}",
            arguments = listOf(navArgument("filmId") { type = NavType.StringType }),
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("filmId")?.let { filmId ->
                MovieFormScreen(navController, movieViewModel, filmId)
            }
        }
    }
}


