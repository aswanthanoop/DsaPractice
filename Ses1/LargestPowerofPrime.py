import math

def largest_power_of_prime(n, prime):
    power = 0
    while n > 0:
        n //= prime
        power += n
    return power

def main():
    n = int(input("Enter the value of n: "))
    prime = int(input("Enter the prime number: "))

    if prime < 2:
        print("Invalid prime number.")
        return

    if n < prime:
        print("Prime number is greater than n.")
        return

    power = largest_power_of_prime(n, prime)
    print("The largest power of", prime, "that divides", n, "! is", power)

if __name__ == "__main__":
    main()

