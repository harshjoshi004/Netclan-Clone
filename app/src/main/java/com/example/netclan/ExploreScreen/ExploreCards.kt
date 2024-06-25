package com.example.netclan.ExploreScreen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import com.example.netclan.ui.theme.BusinessColor
import com.example.netclan.ui.theme.BusinessColorDark
import com.example.netclan.ui.theme.CoffeeColor
import com.example.netclan.ui.theme.CoffeeColorDark
import com.example.netclan.ui.theme.FriendshipColor
import com.example.netclan.ui.theme.FriendshipColorDark
import com.example.netclan.ui.theme.NetclanDarkBlue
import com.example.netclan.ui.theme.NetclanGolden
import com.example.netclan.ui.theme.NetclanLightBlue
import com.example.netclan.ui.theme.NetlcanGrey
import com.example.netclan.ui.theme.horizontalGradientBrush
import com.example.netclan.ui.theme.horizontalGradientBrush2
import com.example.netclan.ui.theme.horizontalGradientBrush3

@Composable
fun PersonalExploreCard(@DrawableRes drawable:Int){
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
    ){

        Box(
            modifier = Modifier
                .padding(top = 16.dp, end = 8.dp, bottom = 16.dp)
                .border(
                    1.dp,
                    if (isSystemInDarkTheme()) horizontalGradientBrush2 else horizontalGradientBrush,
                    RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.background)
                .height(200.dp)
                .width(300.dp)
                .align(Alignment.BottomEnd)
        ){
            // Name Column
            Column(
                modifier = Modifier
                    .padding(top = 8.dp, end = 8.dp)
                    .wrapContentHeight()
                    .wrapContentWidth()
                    .align(Alignment.TopEnd)
            ) {
                Text(
                    text = "Aryan Srivastava",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Delhi | Student",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = "Within 1 KM",
                    fontSize = 12.sp,
                    color = NetlcanGrey,
                    fontWeight = FontWeight.Medium
                )

                Row(
                    modifier = Modifier.wrapContentSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LinearProgressIndicator(
                        progress = 0.3f,
                        modifier = Modifier
                            .width(100.dp)
                            .height(8.dp)
                            .clip(RoundedCornerShape(40)),
                        color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                        trackColor = if(isSystemInDarkTheme()) NetclanLightBlue else NetlcanGrey
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    Text(
                        text = "ProfileScore - 18%",
                        fontSize = 11.sp,
                        color = NetlcanGrey,
                        fontWeight = FontWeight.Light
                    )

                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
            // Status Column
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .align(Alignment.BottomCenter)
            ) {
                //Coffee Shoffee
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.coffee_24),
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = if(isSystemInDarkTheme()) CoffeeColorDark else CoffeeColor,
                    )

                    Spacer(modifier = Modifier.size(4.dp))

                    Text(
                        text = "Coffee",
                        fontSize = 11.sp,
                        color = if(isSystemInDarkTheme()) CoffeeColorDark else CoffeeColor,
                    )

                    Text(
                        text = " | ",
                        fontSize = 11.sp,
                        color = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.business_center_24),
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = if(isSystemInDarkTheme()) BusinessColorDark else BusinessColor,
                    )

                    Spacer(modifier = Modifier.size(4.dp))

                    Text(
                        text = "Business",
                        fontSize = 11.sp,
                        color = if(isSystemInDarkTheme()) BusinessColorDark else BusinessColor,
                    )

                    Text(
                        text = " | ",
                        fontSize = 11.sp,
                        color = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.twopeople_alt_24),
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = if(isSystemInDarkTheme()) FriendshipColorDark else FriendshipColor
                    )

                    Spacer(modifier = Modifier.size(4.dp))

                    Text(
                        text = "Friendship",
                        fontSize = 11.sp,
                        color = if(isSystemInDarkTheme()) FriendshipColorDark else FriendshipColor,
                    )
                }
                Spacer(modifier = Modifier.size(4.dp))
                //status
                Text(
                    text = "Hi Community! I am open to new Connections \"\uD83D\uDE0A\"",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(4.dp)//.width(200.dp)
                )
            }

            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.TopEnd)
            ) {
                Text(
                    text = "+INVITE",
                    fontSize = 16.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }

        Image(
            painter = painterResource(id = drawable),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)
                .align(Alignment.TopStart)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

@Composable
fun ServiceExploreCard(@DrawableRes drawable:Int){
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
    ){

        Box(
            modifier = Modifier
                .padding(top = 16.dp, end = 8.dp, bottom = 16.dp)
                .border(
                    1.dp,
                    if (isSystemInDarkTheme()) horizontalGradientBrush2 else horizontalGradientBrush,
                    RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.background)
                .wrapContentHeight()
                .width(300.dp)
                .align(Alignment.BottomEnd)
        ){
            // Name Column
            Column(
                modifier = Modifier
                    .padding(top = 8.dp, end = 8.dp)
                    .wrapContentHeight()
                    .wrapContentWidth()
                    .align(Alignment.TopEnd)
            ) {
                Text(
                    text = "Priya Tripathi",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Ghaziabad",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = "Within 1 KM",
                    fontSize = 12.sp,
                    color = NetlcanGrey,
                    fontWeight = FontWeight.Medium
                )

                Row(
                    modifier = Modifier.wrapContentSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LinearProgressIndicator(
                        progress = 0.3f,
                        modifier = Modifier
                            .width(100.dp)
                            .height(8.dp)
                            .clip(RoundedCornerShape(40)),
                        color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                        trackColor = if(isSystemInDarkTheme()) NetclanLightBlue else NetlcanGrey
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    Text(
                        text = "ProfileScore - 18%",
                        fontSize = 11.sp,
                        color = NetlcanGrey,
                        fontWeight = FontWeight.Light
                    )

                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
            // Status Column
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp, top = 100.dp)
                    .align(Alignment.BottomCenter)
            ) {
                //Coffee Shoffee
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    //Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        Icons.Rounded.AccountCircle,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        Icons.Rounded.AddCircle,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                }
                //Job Title
                //Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "Interaction Designer | 1 years of service",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp)//.width(200.dp)
                )

                //status
                //Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "Hi Community! I am available at your service!",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(4.dp)//.width(200.dp)
                )
            }

            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.TopEnd)
            ) {
                Text(
                    text = "+INVITE",
                    fontSize = 16.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }

        Image(
            painter = painterResource(id = drawable),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)
                .align(Alignment.TopStart)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

@Composable
fun BusinessExploreCard(@DrawableRes drawable:Int){
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
    ){

        Box(
            modifier = Modifier
                .padding(top = 16.dp, end = 8.dp, bottom = 16.dp)
                .border(
                    1.dp,
                    if (isSystemInDarkTheme()) horizontalGradientBrush2 else horizontalGradientBrush,
                    RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.background)
                .wrapContentHeight()
                .width(300.dp)
                .align(Alignment.BottomEnd)
        ){
            // Name Column
            Column(
                modifier = Modifier
                    .padding(top = 8.dp, end = 8.dp)
                    .wrapContentHeight()
                    .wrapContentWidth()
                    .align(Alignment.TopEnd)
            ) {
                Text(
                    text = "The Brand Gallery",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Greater Noida | Sector 1",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = "Within 1 KM",
                    fontSize = 12.sp,
                    color = NetlcanGrey,
                    fontWeight = FontWeight.Medium
                )

                Row(
                    modifier = Modifier.wrapContentSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LinearProgressIndicator(
                        progress = 0.3f,
                        modifier = Modifier
                            .width(100.dp)
                            .height(8.dp)
                            .clip(RoundedCornerShape(40)),
                        color = if(isSystemInDarkTheme()) NetclanGolden else NetclanLightBlue,
                        trackColor = if(isSystemInDarkTheme()) NetclanLightBlue else NetlcanGrey
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    Text(
                        text = "ProfileScore - 18%",
                        fontSize = 11.sp,
                        color = NetlcanGrey,
                        fontWeight = FontWeight.Light
                    )

                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
            // Status Column
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp, top = 100.dp)
                    .align(Alignment.BottomCenter)
            ) {
                //Coffee Shoffee
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    //Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        Icons.Rounded.AccountCircle,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        Icons.Rounded.AddCircle,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        Icons.Rounded.LocationOn,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = if(isSystemInDarkTheme()) NetlcanGrey else NetclanLightBlue,
                    )
                }
                //Business Summary
                //Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "Hi Community we have amazing deals for you! Check us out!",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) NetclanGolden else NetclanDarkBlue,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp)//.width(200.dp)
                )

                //Business Name
                //Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "Women's Clothing store",
                    fontSize = 14.sp,
                    color = if(isSystemInDarkTheme()) Color.White else NetclanLightBlue,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(4.dp)//.width(200.dp)
                )
            }
        }

        Image(
            painter = painterResource(id = drawable),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)
                .align(Alignment.TopStart)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

val dummyPersonal = listOf(
    R.drawable.face14,
    R.drawable.face10,
    R.drawable.face15,
    R.drawable.face11,
    R.drawable.face16,
    R.drawable.face3,
    R.drawable.face4,
    R.drawable.face6,
    R.drawable.face7,
    R.drawable.face8,
    R.drawable.face5,
    R.drawable.face9,
)

val dummyServices = listOf(
    R.drawable.face11,
    R.drawable.face3,
    R.drawable.face4,
    R.drawable.face6,
    R.drawable.face7,
    R.drawable.face8,
    R.drawable.face5,
    R.drawable.face9,
    R.drawable.face10,
    R.drawable.face15,
    R.drawable.face1,
    R.drawable.face16,
)

val dummyBusinesses = listOf(
    R.drawable.face1,
    R.drawable.face13,
    R.drawable.face8,
    R.drawable.face12,
    R.drawable.face16,
    R.drawable.face3,
    R.drawable.face4,
    R.drawable.face6,
    R.drawable.face7,
    R.drawable.face8,
    R.drawable.face5,
    R.drawable.face9,
)