package readerText

import java.io.File
import java.nio.charset.Charset

fun main() {

    println("Читаем содержимое первого файла: simpleText.txt\r\n------------------------_")
    println(File("src/main/resources/simpleText.txt").readText(Charset.forName("UTF-8")))

    println("\r\nЧитаем содержимое второого файла: oneMoreText.txt\r\n-----------------------_-")
    println(File("src/main/resources/oneMoreText.txt").readText(Charset.forName("Windows-1251")))
}

