# rotation of array in counterclockwise by one

''''
TC.:: O(n)

'''

def rotate(arr):
  temp = arr[0]
  for i in range(1,len(arr)):
    arr[i-1] = arr[i]
    
  arr[len(arr) - 1] = temp
  return arr

if __name__ == '__main__':
  arr = list(map(int, input().split()))
  
  print(rotate(arr))