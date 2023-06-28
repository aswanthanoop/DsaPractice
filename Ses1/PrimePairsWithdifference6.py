#Python program to print the prime pairs with difference 6.
def prime_pairs(m, n):
    primes = []
    for i in range(m, n+1):
        for j in range(2, int(i**1/2) + 1):
            if i % j == 0:
                break
        if j == int(i**1/2):
            primes.append(i)

    pairs = []
    l = 0
    r = 1
    while r < len(primes):
        diff = primes[r] - primes[l]
        if diff == 6:
            pairs.append((primes[l], primes[r]))
            l += 1
            r += 1
        elif diff < 6:
            r += 1
        else:
            l += 1
    return len(pairs), pairs


if __name__ == "__main__":
    a = 4
    b = 30
    x, y = prime_pairs(a, b)
    print(x)
    print(y)
                   