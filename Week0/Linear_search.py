list=[]
n=int(input("Enter the no. of elments in list "))
for i in range(0,n):
    a=int(input())
    list.append(a)

m=int(input("Enter the number to be found"))
comp=0
t=0
for i in list:
    if(i==m):
        comp+=1
        t=1
        break
    comp+=1

if(t==0):
    print("Element not found")
    print("Number of comparisions ",comp)
else:
    print("Element found at",comp,"position")
    print("Number of comparisions ",comp)
