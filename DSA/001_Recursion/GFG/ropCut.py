# max pieces a rop of length n can be cut in lenghts a,b,c 

def Cut(n, a, b, c):
  '''
  TC - O(3^n)
  
  PS.: has a better solution in DP.
  '''
  if n < 0:
    return -1
  if n == 0:
    return 0
  
  result = max(Cut(n-a, a, b, c),
  Cut(n-b, a, b, c),
  Cut(n-c, a, b, c)
  )
  
  if result == -1:
    return -1
  
  return result + 1
  


if __name__ == '__main__':
  n = int(input())
  a = int(input())
  b = int(input())
  c = int(input())
  
  print(Cut(n, a, b, c))