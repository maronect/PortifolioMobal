package com.example.portifolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portifolio.ui.theme.PortifolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortifolioTheme {
                ImageBackG()
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "Marone Carvalho Taques",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ImageBackG() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.fotoperfil),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()

        )
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val myimage = painterResource(id = R.drawable.fotoperfil)
    val iconJava = painterResource(id = R.drawable.java)
    val iconPy = painterResource(id = R.drawable.python)
    val iconCpp = painterResource(id = R.drawable.c_)
    val iconHTML = painterResource(id = R.drawable.html_5)
    val iconCSS = painterResource(id = R.drawable.css_3)
    val iconJs = painterResource(id = R.drawable.js)

    Column (modifier = modifier
        .padding(15.dp)) {
        Row(
            modifier = modifier
                .padding(15.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
            ) {
                Image(
                    painter = myimage,
                    contentDescription = null,
                    modifier = modifier
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
                    .padding(top = 100.dp)
                /*.background(Color.Blue)*/
            ) {
                Text(
                    text = "Bem vindo! Sou\n$name \nEstudante de Ciência da Computação"
                )
            }
        }
        Text(text = "Stacks")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            Image(
                painter = iconJava,
                contentDescription = null,
                modifier = modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
            Image(
                painter = iconPy,
                contentDescription = null,
                modifier = modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
            Image(
                painter = iconCpp,
                contentDescription = null,
                modifier = modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Image(
                painter = iconHTML,
                contentDescription = null,
                modifier = modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
            Image(
                painter = iconCSS,
                contentDescription = null,
                modifier = modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
            Image(
                painter = iconJs,
                contentDescription = null,
                modifier = modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
        }

        ElevatedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {

            }
        ) {
            Text("Conheça Marone")
        }
        ElevatedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {

            }
        ) {
            Text("Projetos")
        }

    }
}

@Preview(showBackground = true)// eh um parametro que vai na funcao by default
@Composable
fun GreetingPreview() {
    PortifolioTheme {
        Greeting("Marone Carvalho Taques")
    }
}