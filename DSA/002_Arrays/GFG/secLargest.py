# Second largest element in an array
'''
should return -1 if no 2nd largest is found

cases - 

20 10 20 8 12
12

10 10 10 
-1

TC.: O(n)
'''

def findLargest(arr, prevLarge=None):
  res = 0
  if prevLarge is None:
    for i in range(len(arr)):
      if arr[res] < arr[i]:
        res = i
  else:
    res = 0
    for i in range(len(arr)):
      if arr[i] != prevLarge and arr[res] < arr[i]:
        res = i
  return res


if __name__ == '__main__':
  arr = list(map(int, input().split()))
  index_of_first_largest = findLargest(arr)
  prevLarge = arr[index_of_first_largest]
  del arr[index_of_first_largest]
  res = arr[findLargest(arr, prevLarge=prevLarge)]
  if res != prevLarge:
    print(res)
  else:
    print(-1)  