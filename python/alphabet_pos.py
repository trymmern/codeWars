from string import ascii_lowercase


def alphabet_position(text):
    return ' '.join(str(ascii_lowercase.index(c.lower()) + 1) for c in filter(lambda c: c.isalpha(), text))

print(alphabet_position("The sunset sets at twelve o' clock."))