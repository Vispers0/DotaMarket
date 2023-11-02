package ru.stepanov.dota_market

import android.hardware.camera2.params.ColorSpaceTransform
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.stepanov.dota_market.ui.theme.Dota_marketTheme

val montserratFamily = FontFamily(
    Font(R.font.montserrat_medium, FontWeight.Medium)
)

class MainActivity : ComponentActivity() {
    private val background = Color(0xFF050B18)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dota_marketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = background//MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val skModernistFamily = FontFamily(
        Font(R.font.sk_modernist_regular, FontWeight.Normal),
        Font(R.font.sk_modernist_mono, FontWeight.ExtraBold),
        Font(R.font.sk_modernist_bold, FontWeight.Bold)
    )

    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Box(modifier = Modifier
            .fillMaxSize()
            .absoluteOffset(y = (-18).dp)
            .background(
                Color(0xFF050B18),
                shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp)
            ))
        {
            Column(modifier = Modifier.padding(horizontal = 12.dp)) {
                Row (modifier = Modifier
                    .fillMaxWidth()){
                    Box(modifier = Modifier
                        .size(88.dp)
                        .absoluteOffset(y = (-22).dp)
                        .background(
                            Color(0xFF000000),
                            shape = RoundedCornerShape(14.dp)
                        )
                        .border(
                            width = 3.dp,
                            color = Color(0xFF1F2430),
                            shape = RoundedCornerShape(14.dp)
                        ))
                    {
                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(54.dp),
                            painter = painterResource(id = R.drawable.icon),
                            contentDescription = null,
                            contentScale = ContentScale.Crop)
                    }

                    Column (modifier = Modifier
                        .padding(start = 12.dp, top = 4.dp)) {
                        Text(text = "DoTA 2",
                            color = Color(0xFFFFFFFF),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = skModernistFamily
                        )

                        Row(modifier = Modifier.padding(top = 12.dp)){
                            Image(
                                painter = painterResource(id = R.drawable.rating_stars),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(76.dp)
                                    .height(12.dp))
                            Text(text = "70M",
                                fontSize = 12.sp,
                                fontFamily = skModernistFamily,
                                fontWeight = FontWeight.Normal,
                                color = Color(0xFF45454D),
                                modifier = Modifier.padding(start = 8.dp))
                        }
                    }

                }

                Row(modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .padding(top = 4.dp)){
                    Box(modifier = Modifier
                        .background(
                            color = Color(0x4444A9F4),
                            shape = RoundedCornerShape(100.dp)
                        ))
                    {
                        Text(text = "MOBA",
                            color = Color(0xFF44A9F4),
                            fontFamily = montserratFamily,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 12.dp,
                                vertical = 4.dp)
                        )

                    }
                    Box(modifier = Modifier
                        .padding(start = 12.dp)
                        .background(
                            color = Color(0x4444A9F4),
                            shape = RoundedCornerShape(100.dp)
                        ))
                    {
                        Text(text = "MULTIPLAYER",
                            color = Color(0xFF41A0E7),
                            fontFamily = montserratFamily,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 12.dp,
                                vertical = 4.dp)
                        )

                    }
                    Box(modifier = Modifier
                        .padding(start = 12.dp)
                        .background(
                            color = Color(0x4444A9F4),
                            shape = RoundedCornerShape(100.dp)
                        ))
                    {
                        Text(text = "STRATEGY",
                            color = Color(0xFF41A0E7),
                            fontFamily = montserratFamily,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 12.dp,
                                vertical = 4.dp)
                        )

                    }
                }

                Text(text = stringResource(id = R.string.desc),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = Color(0xBBEEF2FB),
                    modifier = Modifier.padding(top = 36.dp)
                )

                Row(modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .padding(top = 12.dp)){
                    Box(modifier = Modifier
                        .width(240.dp)
                        .height(128.dp)
                        .clip(shape = RoundedCornerShape(8.dp)))
                    {
                        Image(painter = painterResource(id = R.drawable.vid_preview1),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Alignment.Center))
                    }

                    Box(modifier = Modifier
                        .padding(start = 12.dp)
                        .width(240.dp)
                        .height(128.dp)
                        .clip(shape = RoundedCornerShape(8.dp)))
                    {
                        Image(painter = painterResource(id = R.drawable.vid_preview2),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Alignment.Center))
                    }
                }

                Text(text = stringResource(id = R.string.review_n_ratings),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color(0xFFEEF2FB),
                    modifier = Modifier.padding(top = 18.dp))

                Row(modifier = Modifier.padding(top = 8.dp)) {
                    Text(text = "4.9",
                        fontFamily = skModernistFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 48.sp,
                        color = Color(0xFFFFFFFF))
                    Column(modifier = Modifier.padding(top = 14.dp, start = 12.dp)) {
                        Image(painter = painterResource(id = R.drawable.stars_rating_var),
                            contentDescription = null,
                            modifier = Modifier
                                .width(76.dp)
                                .height(12.dp))
                        Text(text = stringResource(id = R.string.rev_quant),
                            fontFamily = skModernistFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color(0xFFA8ADB7),
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }

                Box(modifier = Modifier
                    .padding(top = 36.dp)){
                    Column {
                        Row {
                            Image(painter = painterResource(id = R.drawable.man_1),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(36.dp))

                            Column(modifier = Modifier
                                .padding(start = 16.dp)) {
                                Text(text = stringResource(id = R.string.man1_name),
                                    fontFamily = skModernistFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 16.sp,
                                    color = Color(0xFFFFFFFF))
                                Text(text = stringResource(id = R.string.man1_date),
                                    fontFamily = skModernistFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = Color(0x77FFFFFF),
                                    modifier = Modifier
                                        .padding(top = 8.dp))
                            }
                        }
                        Text(text = stringResource(id = R.string.comment),
                            fontFamily = skModernistFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color(0xFFA8ADB7),
                            modifier = Modifier
                                .padding(top = 16.dp)
                        )
                    }
                }

                Box(modifier = Modifier
                    .padding(top = 36.dp)){
                    Column {
                        Row {
                            Image(painter = painterResource(id = R.drawable.man_2),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(36.dp))

                            Column(modifier = Modifier
                                .padding(start = 16.dp)) {
                                Text(text = stringResource(id = R.string.man2_name),
                                    fontFamily = skModernistFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 16.sp,
                                    color = Color(0xFFFFFFFF))
                                Text(text = stringResource(id = R.string.man1_date),
                                    fontFamily = skModernistFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = Color(0x77FFFFFF),
                                    modifier = Modifier
                                        .padding(top = 8.dp))
                            }
                        }
                        Text(text = stringResource(id = R.string.comment),
                            fontFamily = skModernistFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color(0xFFA8ADB7),
                            modifier = Modifier
                                .padding(top = 16.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(36.dp))

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(70.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4D144)))
                {
                    Text(text = "Install",
                        fontFamily = skModernistFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFF050B18)
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Dota_marketTheme {
        Greeting("Android")
    }
}