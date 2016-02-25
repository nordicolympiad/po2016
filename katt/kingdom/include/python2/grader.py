import grader
import kingdom
import sys

_parts = []

def part(R):
  _parts.append(R)


def _grader_init():
  N, P = map(int, sys.stdin.readline().split())
  C = [ int(t) for t in sys.stdin.readline().strip().split() ]
  F = [ int(t) for t in sys.stdin.readline().strip().split() ]
  T = [ int(t) for t in sys.stdin.readline().strip().split() ]

  print(kingdom.division(N, K, F, T))
  print(len(_parts))
  for part in _parts:
    sys.stdout.write(str(len(part)))
    for i, e in enumerate(part):
      if i != 0:
        sys.stdout.write(" ")
      sys.stdout.write(str(e))
    sys.stdout.write("\n")

if __name__ != "__main__":                                                          
  grader._grader_init()
