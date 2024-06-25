package com.example.netclan.ExploreScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan.R
import com.example.netclan.ui.theme.NetclanDarkBlue
import com.example.netclan.ui.theme.NetclanGolden
import com.example.netclan.ui.theme.NetclanLightBlue
import com.example.netclan.ui.theme.horizontalGradientBrush
import com.example.netclan.ui.theme.verticalGradientBrush
import java.security.Provider.Service

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalFragment () {
    val searchQuery = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = searchQuery.value,
                onValueChange = { searchQuery.value = it },
                placeholder = {
                    Text(
                        text = "Search",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(55.dp)
                    .width(270.dp)
                    .padding(top = 8.dp, start = 16.dp)
                    .border(
                        BorderStroke(
                            width = 1.dp,
                            if (isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue
                        ),
                        shape = RoundedCornerShape(30)
                    )
                    )

            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                Icon(painterResource(
                    id = R.drawable.tune_24),
                    contentDescription = null,
                    tint = if (isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                    modifier = Modifier.size(48.dp)
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ){
            items(dummyPersonal) {it->
                PersonalExploreCard(it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServicesFragment () {
    val searchQuery = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = searchQuery.value,
                onValueChange = { searchQuery.value = it },
                placeholder = {
                    Text(
                        text = "Search",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(55.dp)
                    .width(270.dp)
                    .padding(top = 8.dp, start = 16.dp)
                    .border(
                        BorderStroke(
                            width = 1.dp,
                            if (isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue
                        ),
                        shape = RoundedCornerShape(30)
                    )
            )

            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                Icon(painterResource(
                    id = R.drawable.tune_24),
                    contentDescription = null,
                    tint = if (isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                    modifier = Modifier.size(48.dp)
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ){
            items(dummyServices) { it->
                ServiceExploreCard(it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusinessesFragment () {
    val searchQuery = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = searchQuery.value,
                onValueChange = { searchQuery.value = it },
                placeholder = {
                    Text(
                        text = "Search",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(55.dp)
                    .width(270.dp)
                    .padding(top = 8.dp, start = 16.dp)
                    .border(
                        BorderStroke(
                            width = 1.dp,
                            if (isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue
                        ),
                        shape = RoundedCornerShape(30)
                    )
            )

            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                Icon(painterResource(
                    id = R.drawable.tune_24),
                    contentDescription = null,
                    tint = if (isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                    modifier = Modifier.size(48.dp)
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ){
            items(dummyBusinesses) { it->
                BusinessExploreCard(drawable = it)
            }
        }
    }
}