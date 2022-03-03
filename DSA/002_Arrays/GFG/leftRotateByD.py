## counter clockwise rotation by d elements

'''
naive here can be calling the "leftrotate by one" d times, so the naive tc will be O(n * d).

but we can reverse the first d elements, then reverse the d to n-1 and reverse the whole array to achieve the rotation by d

the tc will be O(n)

'''

def reverse(arr, l, r):
  while l < r:
    arr[l], arr[r] = arr[r], arr[l]
    l += 1
    r -= 1
  
  return arr

def rotateByReversalAlg(arr,d):
  l = len(arr)
  arr = reverse(arr, 0, d - 1)
  arr = reverse(arr, d, l - 1)
  arr = reverse(arr, 0, l - 1)
  
  return arr

if __name__ == '__main__':
  arr = list(map(int, input("Enter the array els\n").split()))
  d = int(input("enter the rotation metric\n"))
  print("rotate by reversal alg\nTC.:: O(n)\t", rotateByReversalAlg(arr,d))