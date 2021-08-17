#Question: Find Single element in an Array of Duplicates?
def SingleEle(ar):
    a = []
    for i in ar:
        if i in a:
            a.remove(i)
        else:
            a.append(i)
    return a


ar = [3, 4, 4, 5, 6, 6, 5]
print(SingleEle(ar))