vals = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

def solution(roman):
    return sum([-vals[roman[i]] if i+1 < len(roman) and vals[roman[i]] < vals[roman[i+1]] else vals[roman[i]] for i in range(len(roman))])

print(solution('XXI'))
print(solution('I'))
print(solution('IV'))
print(solution('MMVIII'))
print(solution('MDCLXVI'))