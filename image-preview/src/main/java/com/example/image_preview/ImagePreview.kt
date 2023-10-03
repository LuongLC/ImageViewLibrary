package com.example.image_preview

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
fun ImagePreview(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = ""
    )
}