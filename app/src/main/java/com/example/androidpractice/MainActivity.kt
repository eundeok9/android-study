package com.example.androidpractice


import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidpractice.ui.theme.AndroidPracticeTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import dagger.Lazy

// MainActivity 진입점 설정
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var app: Application

    @Inject
    lateinit var lazyFoo1: Lazy<Foo>

    @Inject
    lateinit var lazyFoo2: Lazy<Foo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        assert(lazyFoo1 !== lazyFoo2) // scope를 지정할 경우 같은 인스턴스가 생성됨

        setContent {
            AndroidPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("eundeok")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidPracticeTheme {
        Greeting("Android")
    }
}