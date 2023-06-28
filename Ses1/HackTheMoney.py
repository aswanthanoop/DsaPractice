"""You are a bank account hacker >Initially you have 1 rupee in your A/c and you want N rupees in your A/c. You have 2 hacks, 1st hack can
multiply the amount of money you own by 10. while the 2nd can multiply with the 20. These hacks can be used any number of times.
Can you achieve the money using these hacks.


Constrains 
1 <= N <= 10^12
input          o/p

1               yes
2               no
10              yes
25              no    
200             yes"""

def moneyHack(n):
    if n == 1:
        return True
    elif n%10 != 0:
        return False
    else:
        while n>1:
            if n%10 != 10:
                return False
            