# move zeros to end of the array


'''
we simply maintain a count of non zero elements and swap the next occuring non zero to the count index

TC.:: o(n)
'''

def move(arr):
  count = 0
  for i in range(len(arr)):
    if arr[i] != 0:
      arr[i], arr[count] = arr[count], arr[i]
      count += 1
      
  return arr


if __name__ == '__main__':
  arr = list(map(int, input().split()))
  print(move(arr))