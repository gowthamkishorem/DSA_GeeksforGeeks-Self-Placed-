# leaders in an array

'''
a leader is an element which has no elements larger than it on its right hand side


the efficient solution of this can be found if we traverse from left to right and we check if the new element is greater than prev leader or not.

tc.:: O(n)
'''


def leaders(arr):
  i = len(arr) - 1
  prevLeader = None
  while i >= 0:
    if prevLeader is None:
      prevLeader = arr[i]
      print(prevLeader)
      i -= 1
    
    if arr[i] > prevLeader:
      prevLeader = arr[i]
      print(prevLeader)
      
    i -= 1
    
if __name__ == '__main__':
  arr = list(map(int,input().split()))
  leaders(arr)

