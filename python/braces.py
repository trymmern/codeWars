open_list = ["[","{","("]
close_list = ["]","}",")"]

def valid_braces(string):
    stack = []

    for x in string:
        if x in open_list:
            stack.append(x)
        elif x in close_list:
            pos = close_list.index(x)
            if (len(stack) > 0) and (open_list[pos] == stack[len(stack) - 1]):
                stack.pop()
            else:
                return False
    
    return len(stack) == 0

print(valid_braces("(){}[]"))
print(valid_braces("([{}])"))
print(valid_braces("(}"))
print(valid_braces("[(])"))
print(valid_braces("[({})](]"))