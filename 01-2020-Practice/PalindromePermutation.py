#Question: Write a program to show the string is palindrome if we shuffle the alphabets?

def palin(s):
    ch = []
    ch.extend(s)
    last = len(s)
    for i in range(last):
        for j in range(i + 1, last):
            if ch[j].upper() == ch[i].upper():
                p = ch[j]
                ch[j] = ch[last - 1]
                ch[last - 1] = p
                last -= 1
                break

    last = len(s)
    for i in range(len(ch)):
        if ch[i] == ' ' or ch[last - 1] == ' ':
            last -= 1
            break
        elif ch[i].upper() != ch[last - 1].upper():
            return False
        last -= 1
    print(ch)
    return True


s = input("Please enter the string: ")
print(palin(s))