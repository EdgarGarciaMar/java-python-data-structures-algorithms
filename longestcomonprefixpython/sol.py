"""
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

"""


"""class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        first_word = strs[0]
        for i, char in enumerate(first_word):
            # Compare this character with every word 
            for word in strs: 
                # If the word is too short or characters don't match 
                if i >= len(word) or word[i] != char: 
                    return first_word[:i] 
                # If we checked every character successfully, 
                # the entire first word is the common prefix 
            return first_word"""


class Solution:
    def longestCommonPrefix(self, strs):
        
        # If the list is empty
        if not strs:
            return ""
        
        # Use the first word as our reference
        first_word = strs[0]
        
        # Check every character in the first word
        for i, char in enumerate(first_word):
            
            # Compare this character with every word
            for word in strs:
                
                # If the word is too short or characters don't match
                if i >= len(word) or word[i] != char:
                    return first_word[:i]
        
        # If we checked every character successfully,
        # the entire first word is the common prefix
        return first_word





p = Solution()
print(p.longestCommonPrefix(["flower","flow","flight"]))
print(p.longestCommonPrefix(["dog","racecar","car"]))

        