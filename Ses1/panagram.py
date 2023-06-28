def panagram(string: str):
    string = list(string.lower())
    for i in string:
        if not i.isalpha():
            string.remove(i)
    s = set(string)
    if len(s) == 26:
        return True
    else:
        return False

if "__name__" == "__main__":
    print(panagram("I am Aswanth Anoop"))