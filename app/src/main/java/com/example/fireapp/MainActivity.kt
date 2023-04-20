package com.example.fireapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fireapp.FireStore.Firestore
import com.example.fireapp.ui.theme.FireAppTheme
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlin.coroutines.suspendCoroutine

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val auth = firebase.auth
        FirebaseApp.initializeApp(this);
        val db = FirebaseFirestore.getInstance()
        val service = Firestore(db, auth)
        setContent {
            FireAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }

   suspend fun GetCallback(): List<Cookie>{
       return suspendCoroutine { continuation ->
           api.collection("Cookies")
               .get()
               .addOnSuccessLintener{ task


               }
           
       }
        val res =  api.collection("Cookie")
            .get()
            .addOnSuccessLintener{

            }
    }
}
