# reverse an array

''''
tc.:: O(n)
'''

def swap(arr,a,b):
  # print(arr)
  arr[a],arr[b] = arr[b], arr[a]
  return arr

def reverse(arr):
  l = 0
  r = len(arr) - 1
  
  while not l >= r :
    arr = swap(arr, l, r)
    l += 1
    r -= 1
    
  return arr


if __name__ == '__main__':
  arr = list(map(int, input().split()))
  print(reverse(arr))