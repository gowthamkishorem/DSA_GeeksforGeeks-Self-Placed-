# Joseph's problem

'''
in a closed circle of people, starting from an index, we kill people k places from them, then so on in a loop. Last man standing wins

TC.: O(n)

'''


def solve(index, arr, k):
  if len(arr) == 1:
    return arr
  
  to_die = (index + k - 1) % len(arr)
  
  print("to die", to_die, arr[to_die])
  del arr[to_die]
  
  solve(to_die, arr, k)
  
  return arr

if __name__ == '__main__':
  n = int(input())
  arr = [i for i in range(n)]
  print(arr)
  k = int(input())
  
  print(solve(0, arr, k))