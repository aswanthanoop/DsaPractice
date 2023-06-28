def isPrime(n):
    for i in range(2, int(n**1/2)+1):
        if n%i ==0:
            return False
        return True
    
def nearest_prime(n):
    for i in range(1,n):
        if isPrime(n - 1):
            return n-1
        elif isPrime(n+1):
            return n+1
    return 0

if __name__ == "__main__":
    num = int(input("Enter the number :"))
    print (nearest_prime(num))

