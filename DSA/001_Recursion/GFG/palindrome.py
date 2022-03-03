def check(n,l,r):
  '''
    s...s1...s2...sn-1..sn
    in palindrome the corner characters are same.
    so we check from edges
    
    TC - O(n), because we check the len of hte string
  '''
  if l >= r :
    return True
  return n[l] == n[r] and check(n, l+1, r-1)

if __name__ == '__main__':
  n = input()
  print(check(n, 0, len(n) - 1))