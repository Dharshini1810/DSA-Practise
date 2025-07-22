<img width="476" height="407" alt="image" src="https://github.com/user-attachments/assets/a2d2be84-cd96-4fda-9473-f46a2c360b90" />

<img width="475" height="410" alt="image" src="https://github.com/user-attachments/assets/52c08fae-a250-4947-af06-10a1291b768e" />

<img width="487" height="413" alt="image" src="https://github.com/user-attachments/assets/eb352015-56dc-4415-a400-01d1eae16e57" />

<img width="473" height="412" alt="image" src="https://github.com/user-attachments/assets/b407266a-cf43-4454-a53c-34dd86e6b2ca" />

```
!/bin/python3

import math
import os
import random
import re
import sys

 Complete the 'getMinCost' function below.

 The function is expected to return a LONG_INTEGER.
 The function accepts following parameters:
  1. INTEGER_ARRAY crew_id
  2. INTEGER_ARRAY job_id

def getMinCost(crew_id, job_id):
    # print(crew_id)
    crew_id.sort()
    job_id.sort()
    s = 0
    for i in range(len(crew_id)):
        s+=abs(job_id[i] - crew_id[i])
    return s 

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    crew_id_count = int(input().strip())

    crew_id = []

    for _ in range(crew_id_count):
        crew_id_item = int(input().strip())
        crew_id.append(crew_id_item)

    job_id_count = int(input().strip())

    job_id = []
    for _ in range(job_id_count):
        job_id_item = int(input().strip())
        job_id.append(job_id_item)
    
    # print(crew_id)
    result = getMinCost(crew_id, job_id)

    fptr.write(str(result) + '\n')

    fptr.close()
```



