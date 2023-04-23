import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.HTMLButtonElement

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            FloatingActionButton("remove") { onClick { count -= 1 } }

            Span({ style { padding(15.px) } }) {
                Text("$count")
                Img(
                    src = "https://github.com/DaiShiba/DaiShiba.github.io/blob/main/docs/koro.png"
                )
            }

            FloatingActionButton("add") { onClick { count += 1 } }


        }
    }
}

@Composable
fun FloatingActionButton(
    icon: String,
    attrs: AttrBuilderContext<HTMLButtonElement>? = null,
) = Button(attrs = {
    classes("btn-floating", "waves-effect", "waves-light")
    attrs?.invoke(this)
}) {
    I(attrs = {
        classes("material-icons")
    }) { Text(icon) }
}
