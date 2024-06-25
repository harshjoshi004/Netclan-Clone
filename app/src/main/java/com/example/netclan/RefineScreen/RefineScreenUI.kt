package com.example.netclan.RefineScreen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.example.netclan.ui.theme.ExploreAppBar
import com.example.netclan.ui.theme.NetclanLightBlue
import com.example.netclan.ui.theme.NetclanTheme
import com.example.netclan.ui.theme.NetlcanGrey
import com.example.netclan.ui.theme.fbFontFamily
import com.example.netclan.ui.theme.horizontalGradientBrush
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.netclan.R
import com.example.netclan.ui.theme.NetclanDarkBlue
import com.example.netclan.ui.theme.NetclanGolden

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RefineUI( navcon : NavHostController ){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Refine")
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 8.dp, end = 16.dp)
                            .size(40.dp)
                            .clickable {
                                navcon.navigateUp()
                            }
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = NetclanDarkBlue,
                    scrolledContainerColor = NetclanLightBlue,
                    actionIconContentColor = Color.White,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                )
            )
        }
    ) {pv->
        Column(
            Modifier
                .padding(pv)
                .padding(start = 16.dp, end = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.size(16.dp))
        //Select Availability
            Text(
                text = "Select Your Availability",
                color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.size(8.dp))
            OutlinedTextField(
                value = "Available | Hey Let Us Connect",
                onValueChange = {},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(16.dp))
        //Add your Status
            Text(text = "Add your Status", color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(8.dp))
            OutlinedTextField(
                value = "Hi Community! I am open to new Connections \"\uD83D\uDE0A\"",
                onValueChange = {},
                minLines = 3,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth(),
                supportingText = {
                    Text(
                        text = "47/250",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.End,
                        color = NetlcanGrey
                    )
                }
            )

            Spacer(modifier = Modifier.size(16.dp))
        //Select Hyper Local Distance (my slider)
            Text(
                text = "Select Hyper Local Distance",
                color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.size(8.dp))
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopCenter
            ){
                SliderM3()
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)) {
                    Text(text = "1 Km", color = NetlcanGrey, fontSize = 12.sp)
                    Text(text = "100 Km", color = NetlcanGrey, fontSize = 12.sp)
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
        //Select purpose (staggered horizontal grid)
            Text(text = "Select Purpose", color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(8.dp))
            LazyHorizontalStaggeredGrid(
                rows = StaggeredGridCells.Fixed(3),
                modifier = Modifier.height(160.dp),
                verticalArrangement = Arrangement.Top
            ) {
                items(3) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = NetclanLightBlue,
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .wrapContentHeight()
                            .padding(4.dp)
                    ) {
                        Text(text = "Coffee", fontSize = 12.sp)
                    }
                }
                items(2) {
                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .wrapContentHeight()
                            .padding(4.dp)
                    ) {
                        Text(text = "Coffee", fontSize = 12.sp, color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue)
                    }
                }
                items(2) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = NetclanLightBlue,
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .wrapContentHeight()
                            .padding(4.dp)
                    ) {
                        Text(text = "Coffee", fontSize = 12.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(onClick = { /*TODO*/ },colors = ButtonDefaults.buttonColors(
                    containerColor = NetclanLightBlue,
                    contentColor = Color.White
                )) {
                    Text(text = "Save & Explore")
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderM3(){
    var sliderPosition by remember {
        mutableFloatStateOf(0f)
    }
    Slider(
        modifier = Modifier.fillMaxWidth(),
        value = sliderPosition,
        onValueChange = {
            sliderPosition = it
        },
        valueRange = 0f..100f,
        thumb = {
            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .height(80.dp)
                    .width(40.dp)
            ){
                Icon(
                    painterResource(id = R.drawable.tooltip_svgrepo_com),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = NetclanLightBlue,
                )
                Text(
                    text = sliderPosition.toInt().toString(),
                    color = Color.White,
                    modifier = Modifier.padding(6.dp)
                )
            }
        },
        colors = SliderDefaults.colors(
            activeTrackColor = NetclanLightBlue,
            inactiveTrackColor = NetlcanGrey
        )
    )
}



