fun solve(input: String): Boolean {
    var count = 0;

    for (c in input.toCharArray()) {
        if (c == '(') count++
        if (c == ')') count--

        if (count < 0) return false
    }

    if (count == 0) return true
    else return false
}

solve(")((()))(")