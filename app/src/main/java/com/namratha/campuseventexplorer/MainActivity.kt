
package com.namratha.campuseventexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.namratha.campuseventexplorer.navigation.AppNavigation
import com.namratha.campuseventexplorer.ui.CampusEventExplorerTheme
import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CampusEventExplorerTheme {
                AppNavigation()
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun LightPreview() {
    CampusEventExplorerTheme(darkTheme = false) {
        AppNavigation()
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DarkPreview() {
    CampusEventExplorerTheme(darkTheme = true) {
        AppNavigation()
    }
}
