def permutaions(string):
    perm =[]
    if len(string)==2:
        return [string, string[::-1]]
    else:
        for i in range (len(string)):
 