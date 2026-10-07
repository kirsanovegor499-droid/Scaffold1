package com.example.scaffoldlessonkenaav

import android.R.attr.contentDescription
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.scaffoldlessonkenaav.ui.theme.ScaffoldLessonKENAAVTheme
import org.jetbrains.annotations.ApiStatus

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldLessonKENAAVTheme {
                BasicScaffold()


            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicScaffold() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("App") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.ic_menu),
                            contentDescription = "menu"
                        )
                    }
                }

            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = {
                        Icon(
                        painter=painterResource(R.drawable.ic_home),
                        contentDescription="Home"
                    )
                    },
                    label = {Text("Home")},
                    selected = true,
                    onClick = {}
                )
                NavigationBarItem(
                    icon = {Icon(
                        painter = painterResource(R.drawable.ic_search),
                        contentDescription="Search"
                    )
                    },
                    label = {Text("Search")},
                    selected = false,
                    onClick = {}
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_add),
                    contentDescription = ""
                )


            }
        }
    ){ innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Text("Screen content")
        }

    }
}

