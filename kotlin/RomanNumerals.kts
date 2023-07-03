fun encode(num: Int): String {
    var res = ""
    if (!validate(num)) return res

    var input = num
    while (input >= 1000) {
        res += 'M'
        input -= 1000
    }
    while (input >= 900) {
        res += "CM"
        input -= 900
    }
    while (input >= 500) {
        res += 'D'
        input -= 500
    }
    while (input >= 400) {
        res += "CD"
        input -= 400
    }
    while (input >= 100) {
        res += 'C'
        input -= 100
    }
    while (input >= 90) {
        res += "XC"
        input -= 90
    }
    while (input >= 50) {
        res += 'L'
        input -= 50
    }
    while (input >= 40) {
        res += "XL"
        input -= 40
    }
    while (input >= 10) {
        res += 'X'
        input -= 10
    }
    while (input >= 9) {
        res += "IX"
        input -= 9
    }
    while (input >= 5) {
        res += 'V'
        input -= 5
    }
    while (input >= 4) {
        res += "IV"
        input -= 4
    }
    while (input >= 1) {
        res += 'I'
        input -= 1
    }
    return res
}

fun validate(num: Int): Boolean = num in 1..3999

encode(3999)