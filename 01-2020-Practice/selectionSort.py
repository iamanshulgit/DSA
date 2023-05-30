def selectionSort():
    b = [5, 4, 3, 2, 1]
    a = [4, 5, 3, 1, 2]
    length = len(a) - 1
    pos = 0
    while length >= 0:
        max = a[0]
        pos = 0
        for i in range(1, length + 1):
            if max < a[i]:
                max = a[i]
                pos = i
        a = swap(a, pos, length)
        length -= 1
    print(a)


def swap(a, pos, length):
    temp = a[pos]
    a[pos] = a[length]
    a[length] = temp
    return a


selectionSort()