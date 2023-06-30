package com.example.sberapp.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.sberapp.R
import com.example.sberapp.data.Item

@Composable
fun ItemRow(item: Item, onItemClicked: () -> Unit) {
    Log.d("ItemRow", item.image)

    Column(
        modifier = Modifier
            .clickable { onItemClicked.invoke() }
            .fillMaxWidth()
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = "https://fastly.picsum.photos/id/409/200/300.jpg?hmac=DMEn4qNc0DsvxlQ4NSDPOesRyq8VhhGEi6IXy2DblLk",
            contentDescription = item.name
        )

        Text(text = item.name)
        Text(text = buildAnnotatedString {
            append("$")
            append(item.price.toString())
        }, fontWeight = FontWeight.Bold, modifier = Modifier.padding(end = 20.dp))

    }
}