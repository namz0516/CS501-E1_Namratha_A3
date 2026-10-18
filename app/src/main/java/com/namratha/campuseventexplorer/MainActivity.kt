package com.namratha.campuseventexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.namratha.campuseventexplorer.data.EventRepository
import com.namratha.campuseventexplorer.ui.EventListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                EventListScreen(events = EventRepository.events)
            }
        }
    }
}
