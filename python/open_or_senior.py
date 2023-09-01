def open_or_senior(input):
    output = []

    for x in input:
        if x[0] >= 55 and x[1] >= 7:
            output.append("Senior")
        else:
            output.append("Open")
    return output

def short(input):
    return ["Senior" if x[0] >= 55 and x[1] > 7 else "Open" for x in input]

print(open_or_senior([[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]))
print(short([[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]))
print(short([(64, 4), (64, 7), (45, 2), (74, 9), (10, 11), (30, 22), (19, 10), (62, 23)]))