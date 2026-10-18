package com.namratha.campuseventexplorer.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.namratha.campuseventexplorer.data.CampusEvent
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventDetailScreen(
    event: CampusEvent?,
    onBack: () -> Unit,
    onShare: () -> Unit
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Event details") },
            navigationIcon = {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Navigate up")
                }
            }
        )
    }) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            if (event == null) {
                Text("Event unavailable", style = MaterialTheme.typography.headlineMedium)
                Button(onClick = onBack) { Text("Return to events") }
            } else {
                Text(event.title, style = MaterialTheme.typography.headlineMedium)
                Text("Category: ${event.category}")
                Text("Date/time: ${event.time}")
                Text("Location: ${event.location}")
                Text("About this event", style = MaterialTheme.typography.titleLarge)
                Text(event.description)

                //share action
                Button(
                    onClick = onShare,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.secondary
                    )
                ) {
                    Text("Share event")
                }
            }
        }
    }
}
