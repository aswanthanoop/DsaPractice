"""
Find the number of handShakes possible by the n persons given as input.

 """

def num_of_handshakes(n):
    k = n -1
    return (k * (k + 1)) /2


a=int(input("Enter the number of people in the room :"))
print("The number of Handshakes possible is" + num_of_handshakes(a))

