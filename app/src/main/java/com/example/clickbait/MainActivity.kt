package com.example.clickbait

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.clickbait.data.DataSource
import com.example.clickbait.ui.theme.ClickbaitTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.clickbait.model.Bait


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickbaitTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BaitApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaitTopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.headline),
                modifier = Modifier.padding(start = 0.dp)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun BaitApp() {
    Scaffold(
        topBar = {
            BaitTopAppBar()
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = paddingValues,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            items(DataSource.baits) { bait ->
                BaitCard(bait)
            }
        }
    }
}

@Composable
fun BaitCard(bait: Bait) {
    Card {
        Column{
            Image(
                painter = painterResource(id = bait.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Text(
                text = stringResource(id = bait.name),
                style = MaterialTheme.typography.labelLarge,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(
                    start = 20.dp,
                    top = 8.dp,
                    bottom = 4.dp,
                    end = 20.dp
                )
            )
            Text(
                text = stringResource(id = bait.description),
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 16.sp,
                maxLines = 4,  // Limit to 4 lines
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(
                    start = 20.dp,
                    top = 4.dp,
                    bottom = 4.dp,
                    end = 22.dp
                )
            )
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp)
            )
            Text(
                text = "${bait.time} ago",
                style = MaterialTheme.typography.labelMedium,
                fontSize = 12.sp,
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 2.dp,
                    bottom = 8.dp,
                    end = 4.dp
                )
            )
        }
    }
}

@Preview
@Composable
fun BaitCardPreview(){
    ClickbaitTheme(darkTheme = true) {
        BaitCard(bait = DataSource.baits[0])
    }
}


