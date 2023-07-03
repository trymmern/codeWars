import java.util.Dictionary

var MorseCode = mapOf<String, String>(
    "-.-.--" to "!", ".-..-." to "\"", "...-..-" to "$", ".-..." to "&", ".----." to "'", "-.--." to "(", "-.--.-" to ")", ".-.-." to "+",
    "--..--" to ",", "-....-" to "-", ".-.-.-" to ".", "-..-." to "/", "-----" to "0", ".----" to "1", "..---" to "2", "...--" to "3",
    "....-" to "4", "....." to "5", "-...." to "6", "--..." to "7", "---.." to "8", "----." to "9", "---..." to ":", "-.-.-." to ";",
    "-...-" to "=", "..--.." to "?", ".--.-." to "@", ".-" to "A", "-..." to "B", "-.-." to "C", "-.." to "D", "." to "E", "..-." to "F",
    "--." to "G", "...." to "H", ".." to "I", ".---" to "J", "-.-" to "K", ".-.." to "L", "--" to "M", "-." to "N", "---" to "O", ".--." to "P",
    "--.-" to "Q", ".-." to "R", "..." to "S", "-" to "T", "..-" to "U", "...-" to "V", ".--" to "W", "-..-" to "X", "-.--" to "Y", "--.." to "Z",
    "..--.-" to "_", "...---..." to "SOS")

fun main(code: String): String {
    var codeList = code.trim().replace("   ", " ? ").split(" ")
    var output = ""
    for (c in codeList) {
        if (c == "?") {
            output += " "
        } else {
            output += MorseCode.getOrDefault(c, "")
        }
    }
    return output
}

fun better(code: String) = code
    .trim()
    .split("   ").joinToString(" ") {
        it.split(" ").joinToString("") {
            MorseCode.getOrDefault(it, "")
        }
    }

println(main(".... . -.--   .--- ..- -.. ."))
println(better(".... . -.--   .--- ..- -.. ."))