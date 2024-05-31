package com.example.portifolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.portifolio.ui.theme.PortifolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortifolioTheme {
                val navController = rememberNavController()
                Scaffold(bottomBar = { NavigationBar(navController) }
                ) { innerPadding ->
                    NavHost(navController, startDestination = "Home", Modifier.padding(innerPadding)) {
                        composable("Home") { HomeScreen("Marone Carvalho Taques", modifier = Modifier) }
                        composable("AboutMe") { AboutMeScreen("Marone Carvalho Taques", modifier = Modifier) }
                        composable("Contact") { ContactScreen(modifier = Modifier) }
                    }
                }
            }
        }
    }
}

@Composable
fun NavigationBar(navController: NavHostController) {
    val iconText = painterResource(id = R.drawable.pessoa)
    val aboutIcon = painterResource(id = R.drawable.texticon)
    val iconContact = painterResource(id = R.drawable.contact)
    BottomNavigation (
        modifier = Modifier
            .background(Color.Red)
            .height(110.dp)
    ) {
        BottomNavigationItem(
            icon = { Image(
                painter = aboutIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(16.dp)
            ) },
            label = { Text("Tela Principal") },
            selected = false,
            onClick = { navController.navigate("Home") }
        )
        BottomNavigationItem(
            icon = { Image(
                painter = iconText,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(16.dp)
            ) },
            label = { Text("Sobre") },
            selected = false,
            onClick = { navController.navigate("AboutMe") }
        )
        BottomNavigationItem(
            icon = { Image(
                painter = iconContact,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(16.dp)
            ) },
            label = { Text("Contato") },
            selected = false,
            onClick = { navController.navigate("Contact") }
        )
    }
}

@Composable
fun AboutMeScreen(name: String, modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Sobre ${name}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )
        Text(
            text = "Tenho 20 anos, atualmente cursando Ciência da Computação na UNICAP (Universidade " +
                    "Católica de Pernambuco), 5º período (2024.1). Gosto bastante da lógica e do controle " +
                    "possibilitados pelo Back-End.\nSou uma pessoa criativa, colaborativa e persistente, com " +
                    "vontade de descobrir o novo.\nAssim, busco oportunidade desafiadora de inserção no mercado " +
                    "de trabalho, que me permita produzir, aprender, contribuir para o desenvolvimento " +
                    "profissional e evoluir junto à empresa.",
            fontSize = 20.sp,
            modifier = Modifier.padding(20.dp)
        )
    }
}
@Composable
fun ContactScreen(modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Encontre-me em:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )
        Text(text = "Gmail: maronectm@gmail.com",
            fontSize = 20.sp,
            modifier = Modifier.padding(20.dp)
        )
        Text(text = "Github: https://github.com/maronect",
            fontSize = 20.sp,
            modifier = Modifier.padding(20.dp)
        )
        Text(text = "Linkedin: https://www.linkedin.com/in/marone-carvalho-taques-493583234/",
            fontSize = 20.sp,
            modifier = Modifier.padding(20.dp)
        )
    }
}


@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
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
                    .padding(top = 50.dp)
                /*.background(Color.Blue)*/
            ) {
                Text(
                    text = "Bem vindo!\nSou\n$name \nEstudante de Ciência da Computação",
                    fontSize = 20.sp
                )
            }
        }
        Text(
            text = "Objetivo",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp))
        Text(
            text = "Integração no mercado de trabalho com o objetivo de atuar no Back-end",

        )
        Text(
            text = "Stacks",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )
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
    }
}