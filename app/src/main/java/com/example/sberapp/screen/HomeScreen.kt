package com.example.sberapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sberapp.component.ItemRow
import com.example.sberapp.data.Item
import com.example.sberapp.data.generateItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {

    val generateItems: List<Item> = generateItems(100)

    Scaffold() {
        Column(modifier = Modifier.padding(it)) {


            Text(text = "Smallbusiness online", fontSize = 20.sp)

            Spacer(modifier = Modifier.height(50.dp))

            LazyVerticalGrid(columns = GridCells.Fixed(3), content = {
                items(generateItems) { item ->

                    ItemRow(item) {
                        navController.navigate("detail/${item.id}")
                    }
                }
            })
        }
    }
}