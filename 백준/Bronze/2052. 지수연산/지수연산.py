a=int(input())
b= "%.250f"% (2**(-a))
last=len(b)
for i in range(last-1, 1, -1):
    if b[i]!='0':
        last=i
        break
print(b[:last+1])