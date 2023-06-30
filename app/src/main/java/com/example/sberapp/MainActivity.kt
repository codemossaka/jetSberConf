package com.example.sberapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.sberapp.navigation.AppNavigation
import com.example.sberapp.ui.theme.SberAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SberAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StaterPoint()
                }
            }
        }
    }
}

@Composable
fun StaterPoint() {
    val navController = rememberNavController()
    Text(text = "")
    AppNavigation(navController)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SberAppTheme {
        StaterPoint()
    }
}