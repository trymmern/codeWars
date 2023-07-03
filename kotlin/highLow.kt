fun highAndLow(numbers: String): String {
    val nums = numbers.split(" ");

    val high, low = nums.get(0);
    for (i in 1..nums.size()) {
        val current = nums.get(i)

        if (nums.get(i) > high) {
            high = current;
        }

        if (nums.get(i) < low) {
            low = current;
        }
    }

    return "" + high + " " + low;
}