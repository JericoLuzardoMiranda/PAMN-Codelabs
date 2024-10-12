package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingImage(
                        name = stringResource(R.string.name_text),
                        profession = stringResource(R.string.profession_text),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(name: String, profession: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    val backgroundImage = painterResource(R.drawable.background_card)
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(120.dp)
                    .size(80.dp)
            )
            GreetingText(
                name = name,
                profession = profession,
                modifier = Modifier
                    .padding(10.dp)
            )

            ContactInformation(modifier = Modifier.padding(top = 40.dp))
        }
    }
}

@Composable
fun GreetingText(name: String, profession: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 25.sp,
            color = Color(0xFFFFFFFF),
            modifier = modifier
        )
        Text(
            text = profession,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84),
            modifier = Modifier.padding(bottom = 8.dp)
        )
    }
}

@Composable
fun ContactInformation(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 25.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = "Phone",
                tint = Color(0xFF3ddc84),
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = stringResource(R.string.number_phone_text),
                color = Color(0xFFFFFFFF),
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Person",
                tint = Color(0xFF3ddc84),
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = stringResource(R.string.person_text),
                color = Color(0xFFFFFFFF),
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = "Email",
                tint = Color(0xFF3ddc84),
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = stringResource(R.string.correo_text),
                color = Color(0xFFFFFFFF),
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true, name = "My Preview")
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        GreetingImage("Jericó Luzardo Miranda", "Ingeniero Informático")
    }
}
