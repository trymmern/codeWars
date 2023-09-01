def narcissistic(value: int) -> bool:
    valueStr = str(value)
    sum: int = 0
    for n in valueStr:
        sum += pow(int(n), len(valueStr))

    if sum == value:
        return True
    return False

# Shorter more sexy version of the above
def narcissistic_short(value: int) -> bool:
    return value == sum(int(x) ** len(str(value)) for x in str(value));

print(narcissistic(153))
print(narcissistic_short(153))