def scramble(s1: str, s2):
    return True if False not in [True if c in s1.replace(s2[i-1], '', 1) else False for i, c in enumerate(s2)] else False

print(scramble('world', 'world'))
print(scramble('katas', 'steak'))
print(scramble('katas', 'steaks'))
print(scramble('brehtkjnmhvfulsmegz', 'stkhgvjebuk'))