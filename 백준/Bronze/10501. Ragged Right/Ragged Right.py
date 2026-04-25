
import sys

L =[]
for line in sys.stdin:
    	L.append(len(line))

mm = max(L)
rr = 0
for i in range(len(L)-1):
	rr += (mm-L[i]) *(mm-L[i])
print(rr)