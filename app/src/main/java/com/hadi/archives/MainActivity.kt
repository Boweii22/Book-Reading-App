package com.hadi.archives

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.hadi.archives.presentation.navigation.SetupNavGraph
import com.hadi.archives.ui.theme.ArchivesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArchivesTheme(applicationContext) {
                val navController = rememberNavController()
                Surface(modifier = Modifier.fillMaxSize()) {
                    SetupNavGraph(navController)
                }
            }
        }
    }
}
