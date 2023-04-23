import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Div( {
            style {
                padding(40.px)
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
                width(100.vw)
                height(100.vh)
                background("#F1F1F1")
            }
        }) {
            Span {
                Img(attrs = {
                    style {
                        width(60.px)
                        height(60.px)
                    }
                }, src = "https://github.com/DaiShiba/DaiShiba.github.io/blob/main/docs/koro.png?raw=true")
            }
        }
    }
}
