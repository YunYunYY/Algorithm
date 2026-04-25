NFwd = int(input())
NBwd = int(input())
BFwd = int(input())
BBwd = int(input())
steps = int(input())
Nikky =(NFwd-NBwd)* (steps // (NFwd+ NBwd))
Byron =(BFwd-BBwd)* (steps // (BFwd+ BBwd))
Nrem = steps % (NFwd+ NBwd)
Brem = steps % (BFwd+ BBwd)
if (Nrem <= NFwd):
	Nikky += Nrem
else:
	Nikky = Nikky + NFwd - Nrem + NFwd
if (Brem <= BFwd):
	Byron += Brem
else:
	Byron = Byron + BFwd - Brem + BFwd

if (Byron > Nikky):
	print('Byron')
elif (Byron < Nikky):
	print('Nikky')
else:
	print('Tied')