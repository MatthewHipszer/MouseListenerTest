import java.awt.EventQueue
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JFrame


class Main(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(1000, 500)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {

    val frame = Main("Simple")
    frame.isVisible = true
    frame.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            println("clicked at " + e.point + ".")
        }
    })

    frame.addKeyListener(object : KeyAdapter() {
        override fun keyPressed(e: KeyEvent) {
        println(e.keyChar + " was pressed.")
        }
    })
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}