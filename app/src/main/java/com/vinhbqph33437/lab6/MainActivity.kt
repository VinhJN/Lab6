package com.vinhbqph33437.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.vinhbqph33437.lab6.activities.CinemaSeatBookingScreen
import com.vinhbqph33437.lab6.activities.MovieScreen
import com.vinhbqph33437.lab6.activities.createTheaterSeating
import com.vinhbqph33437.lab6.ui.theme.Lab6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            MovieScreen(Movie.getSampleMovies())
//            CinemaSeatBookingScreen(
//                createTheaterSeating(
//                    totalRows = 12,
//                    totalSeatsPerRow = 9,
//                    aislePositionInRow = 4,
//                    aislePositionInColumn = 5
//                ), totalSeatsPerRow = 9
//            )
//            val mainViewModel: MainViewModel by viewModels()
//            val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())
//            MovieScreen(moviesState.value)
            ScreenNavigation()
        }
    }

}