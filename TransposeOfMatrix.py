def transpose(lst):
    tp = []
    for i in range(len(lst)):
        row = []
        for j in range(len(lst[0])):
            row.append(lst[j][i])
        tp.append(row)
    return tp


if _name_ == "_main_":
    l = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(transpose(l))
    