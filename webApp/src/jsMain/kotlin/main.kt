import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main()  {

    onWasmReady {
        //All resizing window features are supported now in CanvasBasedWindow , no need to use custom BrowserViewportWindow
        @OptIn(ExperimentalComposeUiApi::class)
        CanvasBasedWindow("Compose Multiplatform App Template") {
            App()
        }
    }

}