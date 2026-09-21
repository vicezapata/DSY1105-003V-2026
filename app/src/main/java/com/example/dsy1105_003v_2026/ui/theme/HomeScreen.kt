package com.example.dsy1105_003v_2026.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dsy1105_003v_2026.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
    //Scaffold que genera una pantalla basica
    //darkColor que es una funcion de Material3
    val ColorScheme = darkColorScheme(
        primary = Color(0xFF98222E),
        onPrimary = Color.White,
        onSurface = Color(0xFF333333)
    )// Fin Dark

    MaterialTheme(
        colorScheme=ColorScheme
    ){// inicio Material

    Scaffold(
        topBar={
            TopAppBar(title={Text("Miprimer App",
            color= MaterialTheme.colorScheme.onPrimary
            ) })
        }// fin topBar

    ) {innerPadding ->
        Column(
            modifier= Modifier
                .padding(innerPadding )
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFFF0F0F0)), //gris
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {//Aplicar Columna
        Text("!!!!!   Bienvenido  !!!!!!",
        style= MaterialTheme.typography.headlineMedium,
            color= MaterialTheme.colorScheme.primary
        )

            Spacer(modifier= Modifier.height(66.dp))

            Image(
                painter = painterResource(id= R.drawable.logoduoc),
                contentDescription = "Logo App",
                modifier= Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit

            )

            Row(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(horizontal=16.dp),
                horizontalArrangement = Arrangement.SpaceBetween


            ){//inicio aplicacion row
                Text("Texto uno",
                    style= MaterialTheme.typography.bodyLarge.copy(
                        color= MaterialTheme.colorScheme.onSurface.copy(alpha=0.8f),
                        fontWeight = FontWeight.Bold),
                    modifier= Modifier
                        .padding(end=8.dp)

                )//fin text1


                Text("Texto dos",
                    style= MaterialTheme.typography.bodyLarge.copy(
                        color= MaterialTheme.colorScheme.onSurface.copy(alpha=0.8f),
                        fontWeight = FontWeight.Bold),
                    modifier= Modifier
                        .padding(end=8.dp)

                )//fin text2

            }//Fin //inicio aplicacion row


            Spacer(modifier= Modifier.height(66.dp))
            Button(onClick = {/* accion futura */},
            modifier = Modifier.fillMaxWidth(0.8f)


            ) {
                Text("Presioname")
            }


        }// fin //Aplicar Columna



    }//Fin inner
    }//fin Material
}// Fin HomeScreen


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}