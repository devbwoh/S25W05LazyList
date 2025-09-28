package kr.ac.kumoh.s20250000.s25w05lazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kr.ac.kumoh.s20250000.s25w05lazylist.ui.theme.S25W05LazyListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S25W05LazyListTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        MyList(
            modifier = Modifier.padding(innerPadding)
        )
    }
}
@Composable
fun MyList(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
        Text("노래 1")
        Text("노래 2")
        Text("노래 3")
    }
}