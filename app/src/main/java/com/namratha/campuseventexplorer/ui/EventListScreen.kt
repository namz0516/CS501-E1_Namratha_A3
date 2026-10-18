package com.namratha.campuseventexplorer.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.namratha.campuseventexplorer.data.CampusEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventListScreen(
    events: List<CampusEvent>,
    query: String,
    onQueryChange: (String) -> Unit,
    onEventSelected: (Long) -> Unit
) {
    Scaffold(topBar = { TopAppBar(title = { Text("Campus Event Explorer") }) }) { padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding)) {
            OutlinedTextField(
                value = query,
                onValueChange = onQueryChange,
                label = { Text("Search events") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            )
            if (events.isEmpty()) {
                Text("No matching events", modifier = Modifier.padding(16.dp))
            } else {
                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(items = events, key = { it.id }) { event ->
                        Card(modifier = Modifier.fillMaxWidth().clickable { onEventSelected(event.id) }) {
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
    }
}
