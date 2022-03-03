def Sum(n):
  '''
    TC O(n) n is num of digits
  '''
  
  # if n == 0:
    # return 0
    
  # we can reduce a function call by
  if n < 10:
    return n
  
  return n % 10 + Sum(n//10)


if __name__ == '__main__':
  n = int(input())
  print(Sum(n))