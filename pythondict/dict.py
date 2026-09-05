"""
Dictionary
Dictionary is a data structure that stores information in key-value pairs. While keys must be unique and immutable (like strings or numbers), values can be of any data type, whether mutable or immutable. This makes dictionaries ideal for accessing data by a specific name rather than a numeric position like in list.

https://www.geeksforgeeks.org/python/python-dictionary/
"""

dicts = {"name": "Edgar", 
        "age": 24
        }

print (dicts)

#with constructor
b = dict(name="Sam", age=20)
print(b)

#accessing dictionary

d = {"name": "Kat", "age": 21}

print(d["name"])     # Access using key
print(d.get("age"))  # Access using get()

del d["name"] #delete operation
print(d)

#iteration across the elements
ds = {"a": 1, "b": 2}
for key, value in ds.items():
    print(key, value)


#nested dictionaries
dp = {
    "student": {
        "name": "Sam",
        "age": 20
    }
}

print(dp["student"]["name"])