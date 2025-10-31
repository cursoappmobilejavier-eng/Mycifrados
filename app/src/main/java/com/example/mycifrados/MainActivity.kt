package com.example.mycifrados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycifrados.ui.theme.MycifradosTheme // Necesitarás crear este tema

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // El tema envuelve toda la app, aplicando los estilos de Material 3
            MycifradosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Aquí llamaremos al composable principal de nuestra navegación
                    ChordSyncApp()
                }
            }
        }
    }
}

@Composable
fun ChordSyncApp() {
    // Por ahora, solo mostraremos un texto.
    // Más adelante, aquí irá nuestro sistema de navegación (NavHost).
    Greeting(name = "ChordSync")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "¡Bienvenido a $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MycifradosTheme {
        Greeting("ChordSync")
    }
}
