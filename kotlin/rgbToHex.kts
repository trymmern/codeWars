fun rgb(r: Int, g: Int, b: Int): String {
    var rv = validate(r)
    var gv = validate(g)
    var bv = validate(b)

    var hex = rv.toString(16) + gv.toString(16) + bv.toString(16)
    return hex
}

fun validate(value: Int): Int {
    if (value < 0) return 0
    if (value > 255) return 255
    return value
}

rgb(255, 255, 255)