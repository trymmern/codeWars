"""
secret = "whatisup"
triplets = [
  ['t','u','p'],
  ['w','h','i'],
  ['t','s','u'],
  ['a','t','s'],
  ['h','a','p'],
  ['t','i','s'],
  ['w','h','s']
]
"""

def recoverSecret(triplets):
    weights = {triplets[0][0]: 0, triplets[0][1]: 1, triplets[0][2]: 2}
    print(weights.values())
    for t in triplets:
        print(weights)
        w = len(weights)-1
        for i, c in enumerate(t):
            if weights.get(c) != None:
                w = weights[c]
            else:
                weights[c] = w + 1
    return weights


triplets = [
  ['t','u','p'],
  ['w','h','i'],
  ['t','s','u'],
  ['a','t','s'],
  ['h','a','p'],
  ['t','i','s'],
  ['w','h','s']
]
print(recoverSecret(triplets))