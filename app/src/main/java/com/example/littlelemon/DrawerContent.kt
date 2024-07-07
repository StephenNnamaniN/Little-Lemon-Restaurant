package com.example.littlelemon

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerContent(navController: NavController) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.menu_item_1),
            modifier = Modifier
                .clickable { navController.navigate(Home.route) }
                .padding(8.dp)
        )
        Text(
            text = stringResource(id = R.string.menu_item_2),
            modifier = Modifier
                .clickable {  }
                .padding(8.dp)






        )
        Text(
            text = stringResource(id = R.string.menu_item_3),
            modifier = Modifier
                .clickable { /* Handle navigation or actions */ }
                .padding(8.dp)
        )
        Text(
            text = stringResource(id = R.string.menu_item_4),
            modifier = Modifier
                .clickable { /* Handle navigation or actions */ }
                .padding(8.dp)
        )
    }
}