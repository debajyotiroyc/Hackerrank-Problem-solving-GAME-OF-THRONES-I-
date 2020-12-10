#this code checks whether any word given by the user can be made into a palindrome word or not.
wrd=input("Enter the string to check if it can be represented as a palindrome word: \n")
wrd=wrd.upper()
alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
freq=[]
c=0
for i in alpha:
    n=wrd.count(i)
    if n != 0:
        freq.append(n)
    n=0

odd_check=0

for i in freq:
    if i%2!=0:
        odd_check+=1
    else:
        pass

if len(wrd)%2==0 and odd_check==0:
    print("Yes, the string can be represented as a palindrome")
elif len(wrd)%2!=0 and odd_check==1:
    print("Yes, the string can be represented as a palindrome")
else:
    print("No, the string cannot be represented as a palindrome")


