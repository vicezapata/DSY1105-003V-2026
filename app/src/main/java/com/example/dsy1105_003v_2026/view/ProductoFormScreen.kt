package com.example.dsy1105_003v_2026.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dsy1105_003v_2026.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun productoFormScreen(
    navController: NavController,
    nombre:String,
    precio:String

){//inicio product

    var cantidad by remember{ mutableStateOf(TextFieldValue("")) }
    var direccion by remember{ mutableStateOf(TextFieldValue("")) }

    var conPapas  by remember{ mutableStateOf(false) }
    var agrandarBebida  by remember{ mutableStateOf(false) }

    Scaffold(
        bottomBar = {
            BottomAppBar {
                //contenido
                TopAppBar(title = {Text(" Kentucky")})
            }
        }
    ) //fin Scaffo
    {
        innerPadding ->
        Column(
            modifier= Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {//inicio Contenido
            Image(
                painter= painterResource(id= R.drawable.hamburguesa),
                contentDescription = "Imagen Producto",
                modifier= Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )//fin imagen

Spacer(modifier=Modifier.height(16.dp))


        }//fin contenido



    }//fin inner


}//fin inicio product



@Preview(showBackground =true)
@Composable

fun PreviewProductoFormScreen(){

    productoFormScreen(
        navController= rememberNavController(),
        nombre="Producto Ejemplo",
        precio="$10.000"
    )

}