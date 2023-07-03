fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    if (n == 0) {
        return doubleArrayOf();
    }

    val result = DoubleArray(n);
    result.set(0, signature.get(0));
    result.set(1, signature.get(1));
    result.set(2, signature.get(2));

    for (i in 3..n-1) {
        result.set(i, result.get(i-1) + result.get(i-2) + result.get(i-3));
    }

    return result;
}
