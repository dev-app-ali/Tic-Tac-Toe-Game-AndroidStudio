package com.example.tictactoe.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import com.example.tictactoe.ui.theme.Aqua
import com.example.tictactoe.ui.theme.BlueCustom
import com.example.tictactoe.ui.theme.GreenishYellow

@Composable
fun BoardBase() {

    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(10.dp)
    ) {
        drawLine(
            color = BlueCustom,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width * 1 / 3, y = 0f),
            end = Offset(x = size.width * 1 / 3, y = size.height)
        )

        drawLine(
            color = BlueCustom,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width * 2 / 3, y = 0f),
            end = Offset(x = size.width * 2 / 3, y = size.height)
        )

        drawLine(
            color = BlueCustom,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.width * 1 / 3),
            end = Offset(x = size.height, y = size.width * 1 / 3)
        )
        drawLine(
            color = BlueCustom,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.width * 2 / 3),
            end = Offset(x = size.height, y = size.width * 2 / 3)
        )


    }
}

@Composable
fun Cross() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ) {

        drawLine(

            color = GreenishYellow,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height)
        )

        drawLine(

            color = GreenishYellow,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }

}


@Composable
fun Circle() {
    Canvas(modifier = Modifier
        .size(60.dp)
        .padding(5.dp)) {
        drawCircle(
            color = Aqua,
            style = Stroke(width = 20f)
        )

    }

}


@Composable
fun WinHorizontalLine1() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset( x = 0f, y =size.height*1/6 ),
            end = Offset( x = size.width, y = size.height*1/6),
        )

    }

}



@Composable
fun WinHorizontalLine2() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset( x = 0f, y =size.height*3/6 ),
            end = Offset( x = size.width, y = size.height*3/6),
        )

    }

}

@Composable
fun WinHorizontalLine3() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset( x = 0f, y =size.height*5/6 ),
            end = Offset( x = size.width, y = size.height*5/6),
        )

    }

}


@Composable
fun WinVerticalLine1() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset( x = size.width*1/6, y =0f),
            end = Offset( x = size.width*1/6, y = size.height)
        )

    }

}

@Composable
fun WinVerticalLine2() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset( x = size.width*3/6, y =0f),
            end = Offset( x = size.width*3/6, y = size.height)
        )

    }

}

@Composable
fun WinVerticalLine3() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset( x = size.width*5/6, y =0f),
            end = Offset( x = size.width*5/6, y = size.height)
        )

    }



}



@Composable
fun WinDiagonalLine1() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width , y = size.height)
        )

    }

}
@Composable
fun WinDiagonalLine2() {
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            start = Offset(x = 0f, y =size.height),
            end = Offset(x = size.width , y = 0f)
        )

    }

}



@Preview
@Composable
fun Prev1() {
    WinHorizontalLine1()
    WinHorizontalLine2()
    WinHorizontalLine3()
    WinVerticalLine1()
    WinVerticalLine2()
    WinVerticalLine3()
    WinDiagonalLine1()
    WinDiagonalLine2()
}