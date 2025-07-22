<img width="473" height="416" alt="image" src="https://github.com/user-attachments/assets/276210f5-1afb-4fe7-9cd9-966b911e3651" />

<img width="476" height="412" alt="image" src="https://github.com/user-attachments/assets/87592e06-3d0e-4680-bf40-798ada474a1a" />

<img width="473" height="413" alt="image" src="https://github.com/user-attachments/assets/63b33169-b201-42b7-ba1f-bce750229513" />

<img width="472" height="416" alt="image" src="https://github.com/user-attachments/assets/cf460bad-99d1-4de9-93cc-255cd5a91005" />

<img width="472" height="323" alt="image" src="https://github.com/user-attachments/assets/d0bc35cd-3cb5-40dc-9a9d-22fcffcbd0fb" />

<img width="473" height="410" alt="image" src="https://github.com/user-attachments/assets/32271700-499e-4e9b-8d8e-0ecc965340b7" />

<img width="469" height="313" alt="image" src="https://github.com/user-attachments/assets/a25acbd2-01bd-4259-a3b0-dbbeea7d8b1c" />

```
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'mostBalancedPartition' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY parent
#  2. INTEGER_ARRAY files_size
#
from collections import defaultdict
def mostBalancedPartition(parent, files_size):
    n = len(parent)
    tree = defaultdict(list)

    # Step 1: Build the tree
    for child in range(1, n):
        tree[parent[child]].append(child)

    total_size = [0] * n

    # Step 2: DFS to compute subtree sizes
    def dfs(node):
        size = files_size[node]
        for child in tree[node]:
            size += dfs(child)
        total_size[node] = size
        return size

    overall_total = dfs(0)

    # Step 3: Try cutting each edge and compute the difference
    min_diff = float('inf')
    best_cut = None

    for child in range(1, n):  # node 0 is root, has no parent
        part1 = total_size[child]
        part2 = overall_total - part1
        diff = abs(part1 - part2)

        if diff < min_diff:
            min_diff = diff
            best_cut = (parent[child], child)  # (u, v) — the edge being cut

    return min_diff
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    parent_count = int(input().strip())

    parent = []

    for _ in range(parent_count):
        parent_item = int(input().strip())
        parent.append(parent_item)

    files_size_count = int(input().strip())

    files_size = []

    for _ in range(files_size_count):
        files_size_item = int(input().strip())
        files_size.append(files_size_item)

    result = mostBalancedPartition(parent, files_size)

    fptr.write(str(result) + '\n')

    fptr.close()

```






