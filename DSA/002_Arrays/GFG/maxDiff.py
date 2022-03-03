# max difference in array


'''
in an array of n elements, find max difference, a[j] - a[i], where j > i


naive can be o(n^2)

but the efficient is O(n)
'''


def maxDif(arr):
  minVar = arr[0]
  maxDif = None
  
  for i in range(1,len(arr)):
    if maxDif is None:
      maxDif = arr[i] - minVar
      
    maxDif = max(maxDif, arr[i] - minVar)  
    
    if arr[i] < minVar:
      minVar = arr[i]
    
  return maxDif

if __name__ == '__main__':
  arr = list(map(int, input().split()))
  
  print(maxDif(arr))