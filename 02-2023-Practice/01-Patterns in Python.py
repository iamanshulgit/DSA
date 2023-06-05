# Patterns in Python


def get_num() -> int:
    n = int(input("Enter a number: "))
    return n

n = get_num()
#-----------------------------------------
'''
111
222
333

i = 1
while i <= n:
    j = 1
    while j <= n:
        print(i, end=" ")
        j += 1
    i+=1
    print()
'''

#-----------------------------------------
'''
123
123
123


n = get_num()
i = 1
while i <= n:
    j = 1
    while j <= n:
        print(j, end=" ")
        j += 1
    i += 1
    print()
'''
#-----------------------------------------
'''
1
22
333
4444


i = 1
while i<=n:
    j = 1
    while j <= i:
        print(i, end=" ")
        j += 1

    i += 1
    print()
'''
#-----------------------------------------
'''
*
* *
* * *

i = 1
while i <= n:
    j = 1
    while j <= i:
        print("*", end=" ")
        j += 1
    i += 1
    print()
'''
#-----------------------------------------
'''
1
22
333
4444

i = 1
while i <=n :
    j = 1
    while j<=i:
        print(str(i), end=" ")
        j += 1
    i += 1
    print()
'''
#-----------------------------------------
'''
1
23
456

i = 1
count = 1
while i<=n:
    j=1
    while j<=i:
        print(str(count), end=" ")
        j += 1
        count += 1
    i += 1
    print()
'''
#-----------------------------------------
'''
1
21
321
4321

i = 1
while i <= 4:
    j = 1
    tp = i
    while j<=tp:
        print(tp, end=" ")
        tp -= 1
    i += 1
    print()
'''
#-----------------------------------------
'''
AAA
BBB
CCC

ch = 'A'
i = 1
while i <= n:
    j = 1
    while j <= n:
        print(ch, end="")
        j += 1      
    i += 1
    ch = chr(ord(ch[0])+ 1)
    print()
'''
#-----------------------------------------
# A
# BC
# CDE
# DEFG

# ch = 'A'
# i = 1
# while i <= n:
#     j = 1
#     while j<=i:
#         print(ch, end="")
#         j += 1
#         ch = chr(ord(ch[0]) + 1)
#     i += 1
#     print()

#-----------------------------------------    
# D
# CD
# BCD
# ABCD

# ch = 'A'
# ch = chr(ord(ch[0]) + n)
# i = 1
# while i <= n:
#     j = 1
#     tp = chr(ord(ch[0]) - i)
#     while j <= i:
#         print(tp, end="")
#         j += 1
#         tp = chr(ord(tp[0]) + 1)
#     i += 1
#     print()
#----------------------------------------- 
#    *
#   **
#  ***
# ****

# i = 1
# while i<=n:
#     k = n
#     while k>=i:
#         print(" ", end=" ")
#         k -= 1
#     j = 1
#     while j <=i:
#         print("*", end=" ")
#         j += 1
#     print()
#     i += 1

#----------------------------------------- 
# ***
# **
# *

# i = 1
# k = n
# while i <= n:
#     j = k
#     while j >= 1:
#         print("*", end=" ")
#         j -= 1
#     i += 1
#     k -= 1
#     print()

#----------------------------------------- 

# ****
#  ***
#   **
#    *

# i = 1
# while i <= n:
#     k = 1
#     while k <= i:
#         print(f" ", end=" ")
#         k += 1
#     j = i
#     while j <= n:
#         print(f"*", end=" ")
#         j += 1
#     i += 1
#     print()

#----------------------------------------- 

#    1
#   121
#  12321
# 1234321

# i = 1
# while i<=n:
#     k = i
#     while k <= n:
#         print(" ", end=" ")
#         k += 1
#     j = 1
#     while j <= i:
#         print(j, end=" ")
#         j += 1
#     l = j - 2
#     while l >= 1:
#         print(l, end=" ")
#         l -= 1
#     i += 1
#     print()

#----------------------------------------- 

# 12344321
# 123**321
# 12****21
# 1******1

i = 1
while i<=n:
    j = 1
    while j <= n-i+1:
        print(j, end=" ")
        j +=1

    k = 0
    while k < i*2-2:
        print("*", end=" ")
        k+=1

    l = n-i+1
    while l >= 1:
        print(l,end=" ")
        l-=1
    i+=1
    print()
    



















