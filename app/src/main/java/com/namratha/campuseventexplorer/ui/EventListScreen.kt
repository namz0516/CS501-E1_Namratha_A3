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
import androidx.compose.ui.res.stringResource
import com.namratha.campuseventexplorer.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventListScreen(
    events: List<CampusEvent>,
    query: String,
    onQueryChange: (String) -> Unit,
    onEventSelected: (Long) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_name),
                    )
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding)) {
            OutlinedTextField(
                value = query,
                onValueChange = onQueryChange,
                label = { Text(stringResource(R.string.search_events)) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            )
            if (events.isEmpty()) {
                Text(
                    stringResource(R.string.no_matching_events),
                    modifier = Modifier.padding(16.dp)
                )
            } else {
                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(items = events, key = { it.id }) { event ->
                        Card(
                            modifier = Modifier.fillMaxWidth().clickable { onEventSelected(event.id) },
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer
                            )
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Text(event.title, style = MaterialTheme.typography.titleMedium)
                                Text(event.category, color = MaterialTheme.colorScheme.secondary)
                                Text(stringResource(R.string.location_label, event.location))
                                Text(stringResource(R.string.time_label, event.time))
                            }
                        }
                    }
                }
            }
        }
    }
}


