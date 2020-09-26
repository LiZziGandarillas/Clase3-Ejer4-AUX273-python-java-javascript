n=int(input())
a=1
b=0
c=0
suma=0
for i in range(n):
	suma=suma+c
	c=a+b
	a=b
	b=c
print(suma)
