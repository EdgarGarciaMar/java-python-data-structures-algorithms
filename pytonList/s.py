"""
List is a built-in data structure used to store an ordered collection of items. They are dynamic, resizable and capable of storing multiple data types.

Mutable: list elements can be changed, updated, added, or removed after the list is created.
Ordered: elements maintain the order in which they are inserted.
Index-based: elements are accessed using their position, starting from index 0

https://www.geeksforgeeks.org/python/python-lists/
"""

a = [1, 2, 3]
print(a)

b = ["apple", "banana"]
print(b)

#List as constructor

af = list((1, 2, 3, 'apple', 4.5))  
print(af)

bf = list("GFG")
print(bf)

#List with repited elements
ac = [2]*6
print(ac)


#Accessing elements

ap = [10, 20, 30]
print(ap[0]) #begin
print(ap[-1]) #last
ap.append(44) #adding elements
print(ap)
ap[0]=33 #update
print(ap)
ap.remove(20) #remove the element 20
print(ap)
ap.pop() #remove the last element
print(ap)

#Nested lists (used to reprecent matix)

at = [[1, 2], [3, 4]]
print(at[0])
print(at[1][0])