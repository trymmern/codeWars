def spin_words(sentence):
    return ' '.join([''.join(reversed(w)) if len(w) >= 5 else w for w in sentence.split()])

print(spin_words("Hey fellow warriors"))
print(spin_words("This is a test"))
print(spin_words("This is another test"))