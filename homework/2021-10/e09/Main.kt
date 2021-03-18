import java.nio.file.*

fun main(args: Array<String>) {
    for (i : String in args) {
        var content : List<String> = Files.readAllLines(Paths.get(i))
        content.filter { it.contains('\t') }
            .map { it.replace("\t", "____") }
            .forEach { println(it) }
    }
}