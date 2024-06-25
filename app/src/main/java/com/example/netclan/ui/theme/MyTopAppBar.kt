package com.example.netclan.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreAppBar(navfun:()->Unit, actionfun: ()->Unit){
    TopAppBar(
        title = {
            Column {
                Text(text = "Howdy Harsh Joshi !!", fontSize = 16.sp, fontWeight = FontWeight.Normal)
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    Icon(Icons.Filled.LocationOn, contentDescription = null, modifier = Modifier.size(12.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "Sector 1, Greater Noida", fontSize = 11.sp, fontWeight = FontWeight.Light)
                }
            }
        },
        navigationIcon = {
            Icon(
                painterResource(id = R.drawable.nav_icon1),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 8.dp, end = 16.dp)
                    .size(40.dp)
                    .clickable {
                        navfun()
                    }
            )
        },
        actions = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painterResource(id = R.drawable.action_icon1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp)
                        .size(28.dp)
                        .clickable {
                            actionfun()
                        }
                )
                Text(text = "Refine", fontSize = 11.sp, fontWeight = FontWeight.Light)
            }
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

@Composable
fun DrawerView(){
    Column {
        Box(modifier = Modifier
            .width(300.dp)
            .height(200.dp)
            .background(
                if(isSystemInDarkTheme()) horizontalGradientBrush
                else horizontalGradientBrush3
            )
        ){
            DrawerNameCard(
                mdf = Modifier
                    .align(Alignment.BottomStart)
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(start = 28.dp)
            )
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
                    .size(36.dp)
            ) {
                Icon(
                    painterResource(id = R.drawable.settings_24),
                    contentDescription = null,
                    tint = NetclanLightBlue
                )
            }
        }
        LazyColumn(
            modifier = Modifier.width(300.dp)
        ) {
            items(drawerItemList) {
                LibraryItem(name = it.title, drawable = it.icon)
            }
        }
    }
}

@Composable
fun DrawerNameCard(mdf: Modifier){
    Column(modifier = mdf) {
        //Image
        Image(
            painter = painterResource(id = R.drawable.face2),
            contentDescription = null,
            Modifier
                .padding(4.dp)
                .border(width = 2.dp, color = Color.White, shape = CircleShape)
                .clip(CircleShape)
                .size(80.dp)

        )
        Spacer(modifier = Modifier.size(4.dp))

        //Text title 24.dp
        Text(text = "Harsh Joshi", fontWeight = FontWeight.Normal, fontSize = 18.sp, color = Color.White)
        Spacer(modifier = Modifier.size(4.dp))

        //Text light 24.dp
        Text(text = "HANOID7suc18h", fontWeight = FontWeight.Light, fontSize = 14.sp, color = Color.White)
        Spacer(modifier = Modifier.size(4.dp))

        //progress bar 100.dp long
        LinearProgressIndicator(
            progress = 0.3f,
            modifier = Modifier
                .width(100.dp)
                .height(12.dp)
                .clip(RoundedCornerShape(40)),
            color = Color.White,
            trackColor = NetlcanGrey
        )
        Spacer(modifier = Modifier.size(8.dp))

        //Text light 16.dp
        Text(text = "Available", fontWeight = FontWeight.Light, fontSize = 14.sp, color = Color.White)
        Spacer(modifier = Modifier.size(16.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryItem(name:String, drawable:Int){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        onClick = {
            /*TODO*/
        }
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Row{
                Icon(painter = painterResource(id = drawable),
                    contentDescription = null,
                    tint = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(text = name, color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue)
            }
            Icon(Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                tint = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

data class MyDrawerItemData(
    val title:String,
    @DrawableRes val icon:Int
)

val drawerItemList = listOf(
    MyDrawerItemData("My Profile", R.drawable.drawerprofile),
    MyDrawerItemData("My Network", R.drawable.twopeople_alt_24),
    MyDrawerItemData("Switch to Services", R.drawable.switchtoservice),
    MyDrawerItemData("Switch to Business", R.drawable.switchtobusiness),
    MyDrawerItemData("Dating", R.drawable.baseline_favorite_24),
    MyDrawerItemData("Matrimony", R.drawable.matrimony),
    MyDrawerItemData("Buy-Sell-Rent", R.drawable.baseline_shopping_bag_24),
    MyDrawerItemData("Jobs", R.drawable.business_center_24),
    MyDrawerItemData("Business Cards", R.drawable.businesscards),
    MyDrawerItemData("Netclan Groups", R.drawable.groups),
    MyDrawerItemData("Notes", R.drawable.notes),
    MyDrawerItemData("Live Location", R.drawable.livelocation),
)