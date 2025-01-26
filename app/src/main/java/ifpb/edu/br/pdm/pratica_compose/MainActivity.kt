package ifpb.edu.br.pdm.pratica_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.FractionRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ifpb.edu.br.pdm.pratica_compose.ui.theme.Pratica_ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pratica_ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantesText(
                        title1 = "Text composable",
                        content1 = "Displays text and follows the recommended Material Design guidelines.",
                        title2 = "Image composable",
                        content2 = "Creates a composable that lays out and draws a given Painter class object.",
                        title3 = "Row composable",
                        content3 = "A layout composable that places its children in a horizontal sequence.",
                        title4 = "Column composable",
                        content4 = "A layout composable that places its children in a vertical sequence."
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantesText(
    title1: String, content1: String,
    title2: String, content2: String,
    title3: String, content3: String,
    title4: String, content4: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxWidth().fillMaxHeight()) {
        Row(
            modifier = modifier.weight(1f),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            ) {
                Text(
                    text = title1,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = content1,
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ) {
                Text(
                    text = title2,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = content2,
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(
            modifier = modifier.weight(1f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            ) {
                Text(
                    text = title3,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = content3,
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ) {
                Text(
                    text = title4,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = content4,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Quadrantes() {
    Pratica_ComposeTheme {
        QuadrantesText(
            title1 = "Text composable",
            content1 = "Displays text and follows the recommended Material Design guidelines.",
            title2 = "Image composable",
            content2 = "Creates a composable that lays out and draws a given Painter class object.",
            title3 = "Row composable",
            content3 = "A layout composable that places its children in a horizontal sequence.",
            title4 = "Column composable",
            content4 = "A layout composable that places its children in a vertical sequence."
        )
    }
}