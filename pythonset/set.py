"""
Set
Sets are used to store multiple items in a single variable.

Set is one of 4 built-in data types in Python used to store collections of data, the other 3 are List, Tuple, and Dictionary, all with different qualities and usage.

A set is a collection which is unordered, unchangeable*, and unindexed.

https://www.w3schools.com/python/python_sets.asp

"""
thisset = {"apple", "banana", "cherry", True, 1, 2}

print(thisset)


class dog():
    def __init__(self,name, age):
        self.name = name
        self.age = age

    def printName(self):
        print(f'{self.name}, {self.age}')


p = dog("bonbon",14)

p.printName()
