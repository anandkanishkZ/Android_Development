package com.natrajtechnology.myapp//package com.natrajtechnology.myapp
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.KeyboardArrowDown
//import androidx.compose.material.icons.filled.MoreHoriz
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.natrajtechnology.myapp.ui.theme.MyappTheme
//import androidx.compose.ui.tooling.preview.Preview
//import coil.compose.AsyncImage
//import androidx.compose.ui.layout.ContentScale
//
//class ProfileActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyappTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    InstagramProfileScreen(
//                        modifier = Modifier.padding(innerPadding),
//                        onBackClick = { finish() }
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun InstagramProfileScreen(
//    modifier: Modifier = Modifier,
//    onBackClick: () -> Unit = {}
//) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .background(MaterialTheme.colorScheme.background)
//            .padding(horizontal = 16.dp, vertical = 8.dp),
//        verticalArrangement = Arrangement.Top
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 8.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            IconButton(onClick = onBackClick) {
//                Icon(
//                    imageVector = Icons.Default.ArrowBack,
//                    contentDescription = "Back",
//                    tint = MaterialTheme.colorScheme.onBackground,
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//
//            Box(
//                modifier = Modifier
//                    .weight(1f),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = "ANAND KANISHK",
//                    fontSize = 16.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = MaterialTheme.colorScheme.onBackground,
//                    textAlign = TextAlign.Center
//                )
//            }
//
//            IconButton(onClick = {  }) {
//                Icon(
//                    imageVector = Icons.Default.MoreHoriz,
//                    contentDescription = "More options",
//                    tint = MaterialTheme.colorScheme.onBackground,
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp),
//            verticalAlignment = Alignment.Top
//        ) {
//            Box(
//                modifier = Modifier
//                    .size(80.dp)
//                    .clip(CircleShape)
//                    .border(2.dp, MaterialTheme.colorScheme.onBackground, CircleShape)
//            ) {
//                AsyncImage(
//                    model = "https://madheshlibrary.com/wp-content/uploads/2021/05/Anand-KanishkZ.jpg",
//                    contentDescription = "Profile picture",
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .clip(CircleShape),
//                    contentScale = ContentScale.Crop
//                )
//            }
//
//            Spacer(modifier = Modifier.width(32.dp))
//
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceEvenly
//            ) {
//                StatItem(count = "265", label = "Posts")
//                StatItem(count = "974K", label = "Followers")
//                StatItem(count = "444", label = "Following")
//            }
//        }
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp)
//        ) {
//            Text(
//                text = "ANAND KANISHK",
//                fontSize = 16.sp,
//                fontWeight = FontWeight.Bold,
//                color = MaterialTheme.colorScheme.onBackground
//            )
//
//            Text(
//                text = "A Learner - Observer",
//                fontSize = 14.sp,
//                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
//                modifier = Modifier.padding(top = 2.dp)
//            )
//
//            Text(
//                text = "Journalist at NewsBureau Nepal by Line : @anandkanishkZ",
//                fontSize = 14.sp,
//                color = MaterialTheme.colorScheme.onBackground,
//                modifier = Modifier.padding(top = 4.dp)
//            )
//
//            Text(
//                text = "Followed by viveksim, Birendra_mukhiya, and 50 others",
//                fontSize = 14.sp,
//                color = MaterialTheme.colorScheme.onSurfaceVariant,
//                modifier = Modifier.padding(top = 4.dp)
//            )
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp),
//            horizontalArrangement = Arrangement.spacedBy(8.dp)
//        ) {
//            Button(
//                onClick = {  },
//                modifier = Modifier
//                    .weight(1f)
//                    .height(36.dp),
//                shape = RoundedCornerShape(20.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color(0xFF0095F6)
//                )
//            ) {
//                Text(
//                    text = "Follow",
//                    color = Color.White,
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//
//            Button(
//                onClick = {  },
//                modifier = Modifier
//                    .weight(1f)
//                    .height(36.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = MaterialTheme.colorScheme.surfaceVariant
//                )
//            ) {
//                Text(
//                    text = "Message",
//                    color = MaterialTheme.colorScheme.onSurface,
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//
//            Button(
//                onClick = {  },
//                modifier = Modifier
//                    .weight(1f)
//                    .height(36.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = MaterialTheme.colorScheme.surfaceVariant
//                )
//            ) {
//                Text(
//                    text = "Email",
//                    color = MaterialTheme.colorScheme.onSurface,
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//
//            OutlinedButton(
//                onClick = {  },
//                modifier = Modifier
//                    .size(36.dp),
//                border = BorderStroke(1.dp, Color.Black),
//                colors = ButtonDefaults.outlinedButtonColors(
//                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
//                    contentColor = Color.Black
//                ),
//                contentPadding = PaddingValues(0.dp)
//            ) {
//                Icon(
//                    imageVector = Icons.Default.KeyboardArrowDown,
//                    contentDescription = "Expand",
//                    modifier = Modifier
//                        .size(20.dp)
//                        .align(Alignment.Center),
//                    tint = Color.Black
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun StatItem(count: String, label: String) {
//    Column(horizontalAlignment = Alignment.CenterHorizontally) {
//        Text(
//            text = count,
//            fontSize = 16.sp,
//            fontWeight = FontWeight.Bold,
//            color = MaterialTheme.colorScheme.onBackground
//        )
//        Text(
//            text = label,
//            fontSize = 14.sp,
//            color = MaterialTheme.colorScheme.onBackground
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun InstagramProfileScreenPreview() {
//    MyappTheme {
//        InstagramProfileScreen()
//    }
//}