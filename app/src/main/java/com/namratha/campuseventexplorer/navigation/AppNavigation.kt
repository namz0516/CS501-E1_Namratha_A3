package com.namratha.campuseventexplorer.navigation

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.namratha.campuseventexplorer.data.EventRepository
import com.namratha.campuseventexplorer.ui.EventDetailScreen
import com.namratha.campuseventexplorer.ui.EventListScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    var query by rememberSaveable { mutableStateOf("") }

    NavHost(navController = navController, startDestination = EventList) {
        composable<EventList> {
            val filteredEvents = EventRepository.events.filter { event ->
                event.title.contains(query, ignoreCase = true) ||
                    event.category.contains(query, ignoreCase = true)
            }
            EventListScreen(
                events = filteredEvents,
                query = query,
                onQueryChange = { query = it },
                onEventSelected = { id -> navController.navigate(EventDetail(id)) }
            )
        }
        composable<EventDetail> { entry ->
            val route = entry.toRoute<EventDetail>()
            val event = EventRepository.findById(route.eventId)
            EventDetailScreen(
                event = event,
                onBack = { navController.popBackStack() },
                onShare = {} // Added in Commit 3.
            )
        }
    }
}
