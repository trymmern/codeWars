def camel_case(s):
    return ''.join([c[0].upper() + c[1:].lower() for c in s.split()])

print(camel_case("hello man d"))