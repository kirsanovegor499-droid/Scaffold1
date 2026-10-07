package com.example.scaffoldlessonkenaav

import android.R.attr.contentDescription
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
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
                title = { Text("Home") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_favorite),
                    contentDescription = ""
                )


            }
        }
    ){ innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("Main content")
        }

    }
}

