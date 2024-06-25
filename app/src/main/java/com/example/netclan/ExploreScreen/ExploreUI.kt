package com.example.netclan.ExploreScreen

import com.example.netclan.R
import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.netclan.Screens
import com.example.netclan.ui.theme.DrawerView
import com.example.netclan.ui.theme.ExploreAppBar
import com.example.netclan.ui.theme.NetclanDarkBlue
import com.example.netclan.ui.theme.NetclanGolden
import com.example.netclan.ui.theme.NetclanLightBlue
import com.example.netclan.ui.theme.NetclanTheme
import com.example.netclan.ui.theme.NetlcanGrey
import com.example.netclan.ui.theme.fbFontFamily
import com.example.netclan.ui.theme.horizontalGradientBrush
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExploreUI( navcon : NavHostController){
    val viewModel:ExploreScreenViewModel = viewModel()

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState { viewModel.tabs.size }
    
    LaunchedEffect(viewModel.selectedTabIndex){
        pagerState.animateScrollToPage(viewModel.selectedTabIndex.intValue)
    }

    LaunchedEffect(pagerState.currentPage){
        viewModel.selectedTabIndex.intValue = pagerState.currentPage
    }
    
    NetclanTheme {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet { DrawerView() }
            },
            gesturesEnabled = true
        ) {
            Scaffold(
                topBar = { ExploreAppBar(actionfun = { navcon.navigate(Screens.Refine.route) }, navfun = {
                    scope.launch {
                        drawerState.apply {
                            if (isClosed) open() else close()
                        }
                    } })
                },
                floatingActionButton = {
                       Box(
                           modifier = Modifier
                               .clip(CircleShape)
                               .size(50.dp)
                               .background(NetclanLightBlue),
                           contentAlignment = Alignment.Center,
                       ) {
                           Icon(
                               Icons.Filled.Add,
                               contentDescription = null,
                               tint = Color.White,
                               modifier = Modifier.size(28.dp)
                           )
                       }
                },
                bottomBar = {
                    NavigationBar {
                        viewModel.list.forEachIndexed { index, it ->
                            val selected = index == viewModel.selectedScreenIndex.intValue
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 8.dp, bottom = 8.dp)
                                    .weight(1f)
                                    .clip(RoundedCornerShape(8.dp))
                                    .clickable {
                                        viewModel.setSelectedScreen(index)
                                        //viewModel.selectedScreenIndex.intValue = index
                                    }
                            ) {
                                Icon(
                                    modifier = Modifier.size(32.dp),
                                    painter = painterResource(id = it.selectedIcon),
                                    contentDescription = null,
                                    tint = if (selected) {
                                        if (isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue
                                    } else NetlcanGrey
                                )
                                Text(
                                    color = if (selected) {
                                        if (isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue
                                    } else NetlcanGrey,
                                    text = it.title,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            ) { pv ->
                Column(
                    Modifier.padding(pv)
                ) {
                    // TabRow and Pager
                    TabRow(
                        selectedTabIndex = viewModel.selectedTabIndex.intValue,
                        containerColor = NetclanLightBlue,
                        indicator = { tabPositions ->
                            TabRowDefaults.Indicator(
                                modifier = Modifier.tabIndicatorOffset(tabPositions[viewModel.selectedTabIndex.intValue]),
                                color = if (isSystemInDarkTheme()) NetclanGolden else Color.White
                            )
                        }
                    ) {
                        viewModel.tabs.forEachIndexed { index, s ->
                            val selected = viewModel.selectedTabIndex.intValue == index
                            Text(
                                text = s,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .padding(top = 8.dp, bottom = 16.dp)
                                    .fillMaxWidth()
                                    .clickable(!selected) {
                                        viewModel.setSelectedTab(index)
                                        //selectedTabIndex.intValue = index
                                    },
                                color = if (selected) {
                                    if (isSystemInDarkTheme()) NetclanGolden else Color.White
                                } else Color.Gray,
                            )
                        }
                    }
                    HorizontalPager(
                        state = pagerState,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) { index ->
                        when(index){
                            0->{
                                PersonalFragment()
                            }
                            1->{
                                ServicesFragment()
                            }
                            else->{
                                BusinessesFragment()
                            }
                        }
                    }
                }
            }
        }
    }
}