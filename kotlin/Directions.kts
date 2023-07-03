fun dirReduc(arr: Array<String>): Array<String> {
    var dirs = arr.asList().toMutableList()
    var isReducing = true
    while (isReducing) {
        var toRemove = mutableListOf<Int>()
        val len = dirs.size
        for (i in 1..len-1) {
            if (opposites().get(dirs[i-1]) == dirs[i] && i !in toRemove) {
                toRemove.addAll(listOf(i-1, i))
            }
        }

        toRemove.sortDescending()
        for (i in toRemove.distinct()) {
            dirs.removeAt(i)
        }


        if (dirs.size == len) {
            isReducing = false
        }
    }
    println(dirs)
    return dirs.toTypedArray()
}

fun opposites(): Map<String, String> = mapOf<String, String>("NORTH" to "SOUTH", "SOUTH" to "NORTH", "EAST" to "WEST", "WEST" to "EAST")

dirReduc(arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"))