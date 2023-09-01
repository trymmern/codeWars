def order(sentence: str) -> str:
    return '' if sentence == '' else ' '.join(map(lambda x: x[1], sorted([get_tuple(x) for x in sentence.split()])))

def get_tuple(s):
    for c in s:
        try:
            return (int(c) - 1, s)
        except:
            continue

print(order("is2 Thi1s T4est 3a"))
print(order("4of Fo1r pe6ople g3ood th5e the2"))