
def functon(s):
    zero_count = 0
    new_string = ""
for i in s:
    if i == z:
        new_string = str(i)
    else:
        zero_count += 1
        new_string = "0"*zero_count + new_string

    return new_string
if __name__ == "__main__":
    inp = input().split("")
    print (functon(inp))












