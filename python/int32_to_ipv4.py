def int32_to_ip(int32):
    b = f'{int32:032b}'
    return '.'.join([str(int(b[i:i+8], 2)) for i in range(len(b)) if i % 8 == 0])

print(int32_to_ip(2149583361))
print(int32_to_ip(32))