# Tower of Hanoi

'''

TC.: O(2^n)

'''

def TOH(n, A, B, C):
  if n == 1:
    print('Move 1 from',A,"to",C)
    return
  
  TOH(n-1,A,C,B) # moving n-1 disks from A to C, using B as auxilary
  print('Move {} from {} to {}'.format(n,A,C))
  TOH(n-1,B,C,A) # moving n-1 disks from prev aux B to C, using A as auxilary
  


if __name__ == "__main__":
  n = int(input())
  
  TOH(n, 'A', 'B', 'C')