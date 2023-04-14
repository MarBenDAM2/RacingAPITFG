package com.example.racingapitfg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            //Ejercicio1()
            Ejercicio2()
        }
    }
}
@Preview
@Composable
fun Ejercicio1(){
    Column(
        //Fondo a blanco
        modifier = Modifier
            .background(Color.White)
            .wrapContentWidth()

    ) {

        //Imagen de cabecera
        Image(
            painter = painterResource(id = R.mipmap.imagen),
            contentDescription = "Imagen de fondo",
            modifier = Modifier
                .fillMaxWidth()
        )
        //Titulo
        Text("Jetpack Compose Tutorial", modifier = Modifier.padding(10.dp), style = TextStyle(
            fontSize = 20.sp
            )
        )

        //Subtitulo
        Text("Jetpack Compose is a modern toolkit for building native Android UI. Compose " +
                "simplifies and accelerates UI development on Android with less code, powerful tools" +
                "and intuitive Kotlin APIs",
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
            style = TextStyle(textAlign = TextAlign.Justify)
        )

        //Desarrollo
        Text("In this tutorial, you build a simple UI component with declarative functions. " +
                "You call Compose functions to say what elements you want and the Compose compiler " +
                "does the rest. Compose is built around Composable functions. These functions let " +
                "you define your app\\'s UI programmatically because they let you describe how it " +
                "should look and provide data dependencies, rather than focus on the process of the " +
                "UI\\'s construction, such as initializing an element and then attaching it to a " +
                "parent. To create a Composable function, you add the @Composable annotation " +
                "to the function name.",
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                style = TextStyle(textAlign = TextAlign.Justify)
        )

    }

}
//Ejercicio2
@Preview
@Composable
fun Ejercicio2(){
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxHeight(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.mipmap.imgcheck),
            contentDescription = "Img_Check",
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(text = "All tasks completed!", Modifier.padding(top = 28.dp, bottom = 8.dp), fontWeight = FontWeight.Bold)
        Text(text = "Nice work!", fontSize = 16.sp)
    }
}
//Ejercicio3
@Preview
@Composable
fun Ejercicio3(){
    Column(Modifier.fillMaxWidth()) {
        //Linea 1 para columna de datos 1
        Row(Modifier.weight(1f)) {
            //Columna de datos 1
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Green)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }
            //Columna de datos 2
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify
                )
            }
        }
        //Linea 2 para columna de datos 3 y 4
        Row(
            Modifier.weight(1f)
        ) {
            //Columna de datos 3
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Cyan)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}