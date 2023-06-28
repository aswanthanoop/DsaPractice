def pair_the_containers(containers):
    containers.sort(reverse=True)
    l = 0
    r = len(containers) - 1
    pairs = []
    while l <= r:
        if l == r:
            pairs.append((containers[l], 0))
            l += 1
        else:
            pairs.append((containers[l], containers[r]))
            l += 1
            r -= 1
    return pairs


if __name__ == "__main__":
    cont = input().split()
    cont = [int(x) for x in cont]
    print(pair_the_containers(cont))

