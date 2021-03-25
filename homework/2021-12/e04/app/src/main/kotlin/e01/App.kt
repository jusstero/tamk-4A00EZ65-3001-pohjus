/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */

package e01

import org.apache.commons.io.FileUtils
import java.nio.file.*
import java.io.File


fun readFile(path: String, format: String, callback: (String) -> Unit) {
    Thread() {
        var content = FileUtils.readFileToString(File(path), format)
        callback(content)
    }.start()
}

fun saveFile(file: String, data: String, format: String, callback: (Boolean)-> Unit) {
    var myFile = File(file)
    if(myFile.exists()) {
        callback(false)
    } else {
        try {
            Thread() {
            FileUtils.writeStringToFile(File(file), data, format)
            callback(true)
            }.start()
        } catch (e: Error) {
            callback(false)
        }
    }
}

fun main(args: Array<String>) {
        println("A")
        if(args.size > 0) {
            readFile(args[0], "utf-8") {
                var content = it
                saveFile(args[1], content, "utf-8", {println(if(it) "success" else "problem")})
            }
        }
        println("B")
}