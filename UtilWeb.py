#Replace " " with "%20" in the String?
def UtilWeb(s):
    list = s.split(" ")
    s = ""
    for i in range(len(list) - 1):
        s += list[i]
        s += "%20"
    s += list[len(list) - 1]
    print(s)


s = input("Please enter the string: ")
UtilWeb(s)