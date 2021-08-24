def BubbleSort(ar):
    length = len(ar)-1
    for i in range(length):
        for j in range(length):
            if ar[j] > ar[j+1]:
                temp = ar[j]
                ar[j] = ar[j+1]
                ar[j+1] = temp
        length -= 1
    print(ar)

ar=[5,4,3,2,1]
BubbleSort(ar)