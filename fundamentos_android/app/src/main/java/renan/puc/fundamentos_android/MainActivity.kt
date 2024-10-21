package renan.puc.fundamentos_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import renan.puc.calculadoralib.Calculadora
import renan.puc.fundamentos_android.ui.theme.Fundamentos_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Fundamentos_androidTheme {
                val resultantTextView = Calculadora.multiplicacao(10.0, 20.0)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        value = "Resultant: $resultantTextView",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(value: String, modifier: Modifier = Modifier) {
    Text(
        text = value,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val resultantTextView = Calculadora.soma(10.0, 20.0)
    Fundamentos_androidTheme {
        Greeting("Resultant: $resultantTextView")
    }
}