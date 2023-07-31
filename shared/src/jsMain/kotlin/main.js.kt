import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Web"

@Composable fun MainView() = App()

//@Preview
@Composable
fun AppPreview() {
    App()
}