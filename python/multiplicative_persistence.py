from functools import reduce

count = 0

def persistence(n) -> int:
    global count

    if len(str(n)) == 1:
        return count

    sum = 1
    for x in str(n):
        sum *= int(x)

    count += 1
    if len(str(sum)) == 1:
        final = count
        count = 0
        return final
    else:
        return persistence(sum)

# Short lambda version of the above function
persistence_short = lambda n,c=0: persistence_short(reduce(lambda x,y:int(x)*int(y),str(n)),c+1) if n >=10 else c

assert persistence_short(39) == 3, "should be 3"
assert persistence_short(4) == 0, f"should be 0, but got {persistence(4)}"
assert persistence_short(25) == 2, "should be 2"
assert persistence_short(999) == 4, "should be 4"