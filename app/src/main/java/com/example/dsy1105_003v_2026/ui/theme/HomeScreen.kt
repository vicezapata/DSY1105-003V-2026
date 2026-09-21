package com.example.dsy1105_003v_2026.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dsy1105_003v_2026.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
    //Scaffold que genera una pantalla basica
    Scaffold(
        topBar={
            TopAppBar(title={Text("Miprimer APp") })
        }// fin topBar

    ) {innerPadding ->
        Column(
            modifier= Modifier
                .padding(innerPadding )
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        )
        {//Aplicar Columna
        Text("!!!!!   Bienvenido  !!!!!!")

            Button(onClick = {/* accion futura */}) {
                Text("Presioname")
            }

            Image(
                painter = painterResource(id= R.drawable.logoduoc),
                contentDescription = "Logo App",
                modifier= Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit

            )

        }// fin //Aplicar Columna



    }//Fin inner

}// Fin HomeScreen


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}