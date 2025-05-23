package com.dalamilla.diceroller

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview()
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center))
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableIntStateOf(1) }
    val drawableResource =
        mapOf(
            1 to R.drawable.dice_1,
            2 to R.drawable.dice_2,
            3 to R.drawable.dice_3,
            4 to R.drawable.dice_4,
            5 to R.drawable.dice_5,
            6 to R.drawable.dice_6,
        )
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        drawableResource[result]?.let {
            Image(painter = painterResource(it), contentDescription = result.toString())
        }
        Button(onClick = { result = (1..6).random() }) {
            Text(text = stringResource(R.string.roll), fontSize = 25.sp)
        }
    }
}
