import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBox()
        }
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier
            .size(100.dp).aspectRatio(1f)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(30.dp)
            )
            .background(Color.Blue,
                )

    )
}

@Preview(showBackground = true)
@Composable
fun MyBoxPreview() {
    MyBox()
}