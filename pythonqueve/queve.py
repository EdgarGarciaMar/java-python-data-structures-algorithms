"""
A deque stands for Double-Ended Queue. It is a type of data structure that allows to add and remove elements from both ends efficiently.
https://www.geeksforgeeks.org/python/deque-in-python/ 
"""
from collections import deque 
d = deque(['name','age','DOB']) 
print(d)
#by index
print(d[0])
#append
d.append(90)
d.appendleft(100)
print(d)
# extend
d.extend([40, 50, 60])
print(d)
#delete
d.remove(40) #remove first ocurrence
d.pop() #removes elemtent from the right end
d.popleft() #removes element from the left end
print(d)
# rotate
d.rotate(1)
# reverse
d.reverse()
print(d)