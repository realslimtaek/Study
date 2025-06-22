


interface KeyBoard {
    val name: String
    fun connect()
    fun type() {
        println("typing...")
    }
}

interface Mouse {
    val name: String
    fun connect()
    fun click() {
        println("clicking...")
    }
}


interface Machine {
    fun operate()
}

class WiredKeyBoard(override val name: String) : KeyBoard {
    override fun connect() {
        println("connected with wire")
    }
}

class WiredMouse(override val name: String): Mouse {
    override fun connect() {
        println("connected with wire Mouse")
    }
}

class WirelessKeyboard(override val name: String) : KeyBoard {
    override fun connect() {
        println("connected with wireless like Bluetooth..")
    }
}

class WirelessMouse(override val name: String): Mouse {
    override fun connect() {
        println("connected with wireless Mouse")
    }
}

class Tablet(val keyboard: KeyBoard, val mouse:Mouse) : Machine {
    override fun operate() {
        println("connecting with... \n keyboard: ${keyboard.name} \n mouse: ${mouse.name}")
    }
}

class Computer(val keyboard: KeyBoard, val mouse: Mouse) : Machine {
    override fun operate() {
        println("connecting with... \n keyboard: ${keyboard.name} \n mouse: ${mouse.name}")
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val wirelessKeyboard = WirelessKeyboard("MagicKeyboard")
    val wirelessMouse = WirelessMouse("Logitech G302")

    val wiredMouse = WiredMouse("Logitech G102")
    val wiredKeyboard = WiredKeyBoard("Membrain")

    val ipad = Tablet(wirelessKeyboard, wirelessMouse)
    val computer = Computer(wiredKeyboard, wiredMouse)


    ipad.operate()
    println("=========================================")
    computer.operate()

}