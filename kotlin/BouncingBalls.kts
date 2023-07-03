fun solve(h: Double, bounce: Double, window: Double): Int {
    var bounceValid = 0.toDouble() < bounce && bounce < 1.toDouble()
    if (h <= 0 || !bounceValid || window >= h) return -1

    var isHigher = true
    var count = 0
    var height = bounce * h
    while (isHigher) {
        count++

        if (height > window) count++
        else isHigher = false

        height = height * bounce
    }

    return count
}

solve(3.0, 0.66, 1.5)
solve(30.0, 0.66, 1.5)