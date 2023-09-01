from string import ascii_lowercase


def is_pangram(s):
    for c in ascii_lowercase:
        if c not in s.lower():
            return False
    return True
        
print(is_pangram("the quick brown fox jumps over the lazy dog"))