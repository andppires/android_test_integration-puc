package com.example.myapplication

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(val title: String, val icon: ImageVector)

@Composable
fun BottomNavigationBar() {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf(
        NavigationItem("Proventos", Icons.Filled.AttachMoney),
        NavigationItem("Carteira", Icons.Filled.Wallet)
    )

    NavigationBar(
        containerColor = Color(0xFF1E1EFF),
        contentColor = Color.White
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = Color.White,
                    unselectedTextColor = Color.Gray
                )
            )
        }
    }
}
