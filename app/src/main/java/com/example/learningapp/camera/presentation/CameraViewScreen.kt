package com.example.learningapp.camera.presentation

import android.content.ActivityNotFoundException
import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.app.ActivityCompat.startActivityForResult

@Composable
fun CameraViewScreen() {

    CameraViewContent()

}

@Composable
fun CameraViewContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

    }
}

