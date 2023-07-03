fun longestConsec(strarr:Array<String>, k:Int): String {
    if (strarr.size == 0 || k > strarr.size || k <= 0) return ""

    var maxSizeStr = ""
    for (i in k-1..strarr.size-1) {
        var str = ""
        for (j in i-(k-1)..i) {
            str += strarr[j]
        }
        if (str.length > maxSizeStr.length) maxSizeStr = str
    }

    return maxSizeStr
}

longestConsec(arrayOf<String>("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"), 3)