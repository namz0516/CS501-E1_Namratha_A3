package com.namratha.campuseventexplorer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.namratha.campuseventexplorer.data.CampusEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventListScreen(events: List<CampusEvent>) {
    Scaffold(topBar = { TopAppBar(title = { Text("Campus Event Explorer") }) }) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(items = events, key = { it.id }) { event ->
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(event.title, style = MaterialTheme.typography.titleMedium)
                        Text(event.category, color = MaterialTheme.colorScheme.primary)
                        Text("Location: ${event.location}")
                        Text("Time: ${event.time}")
                    }
                }
            }
        }
    }
}
