# Given a sstring, generate its subsets

'''
start from null, you add don't add the character and add the character, which gives 2 branches for each decision

TC - O(2^n)
'''

def Subset(string,curr, index, length, subset):
  if index == length:
    subset.append(curr)
    return
  
  Subset(string, curr, index + 1, length, subset)
  Subset(string, curr + string[index], index + 1, length, subset)
  
  return subset

if __name__ == '__main__':
  string = input()
  print(Subset(string,"", 0, len(string), []))