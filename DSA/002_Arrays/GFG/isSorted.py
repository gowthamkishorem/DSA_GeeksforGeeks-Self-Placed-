'''
TC .:: O(n)
'''

def isSorted(arr):
  for i in range(1, len(arr)):
    if arr[i-1] > arr[i]:
      return False
  return True


if __name__ == '__main__':
  arr = list(map(int, input().split()))
  
  print(isSorted(arr))
  