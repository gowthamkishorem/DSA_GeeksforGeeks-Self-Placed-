'''
TC.:: O(n)
'''


if __name__ == '__main__':
  arr = list(map(int, input().split()))
  res = arr[0]
  for n in arr:
    res = max(res, n)
  
  print(res)