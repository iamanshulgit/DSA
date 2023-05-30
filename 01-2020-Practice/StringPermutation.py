'''
Permutation, Given two strings, write a method to check if one is a permutation of the other?
'''

def checkLength(s, t):
    return (len(s) == len(t))


def permutation(s, t):
    if False == checkLength(s, t):
        return False

    flag = 1
    temp = []

    for i in range(len(t)):
        temp.append(s[i])
        if t[i] not in temp:
            return False

    return True


s = input("Enter a string")
t = input("Enter a string")

print(permutation(s, t))