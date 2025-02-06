Given a matrix of RxC, the program must consider prime number in every row and print the sum of surrounding values around the prime number, If particular number is
already considered in sum, then the number must not be considered again!

def checkPrime(n): 
    cnt = 0
    for i in range(1,n+1):
        if n%i == 0: 
            cnt+=1 
    if cnt == 2: 
        return True
    else:
        return False

def checkIndexes(i,j,rows,cols,usedNos,usedIndex,matrix): 
    if 0 <= i < rows and 0 <= j < cols:
        if (i,j) not in usedIndex:
            return True
    else: 
        return False


rows = int(input())
cols = int(input())
usedNos = []
usedIndex = []
totalValue = 0
matrix = []
for _ in range(rows):
    matrix.append(list(map(int, input().split())))

for i in range(len(matrix)): 
    for j in range(len(matrix[0])): 
        if checkPrime(matrix[i][j]): 
            adjValues = []
            if(checkIndexes(i,j-1,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i][j-1])
                usedIndex.append((i,j-1))
                adjValues.append(matrix[i][j-1])
            
            if(checkIndexes(i,j+1,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i][j+1])
                usedIndex.append((i,j+1))
                adjValues.append(matrix[i][j+1])
            
            if(checkIndexes(i+1,j,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i+1][j])
                usedIndex.append((i+1,j))
                adjValues.append(matrix[i+1][j])
            
            if(checkIndexes(i-1,j,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i-1][j])
                usedIndex.append((i-1,j))
                adjValues.append(matrix[i-1][j])
            
            if(checkIndexes(i-1,j-1,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i-1][j-1])
                usedIndex.append((i-1,j-1))
                adjValues.append(matrix[i-1][j-1])
                
            if(checkIndexes(i-1,j+1,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i-1][j+1])
                usedIndex.append((i-1,j+1))
                adjValues.append(matrix[i-1][j+1])
                
            if(checkIndexes(i+1,j-1,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i+1][j-1])
                usedIndex.append((i+1,j-1))
                adjValues.append(matrix[i+1][j-1])
                
            if(checkIndexes(i+1,j+1,rows,cols,usedNos,usedIndex,matrix)):
                usedNos.append(matrix[i+1][j+1])
                usedIndex.append((i+1,j+1))
                adjValues.append(matrix[i+1][j+1])
            print("Matrix Value: "+str(matrix[i][j])+"Index Value: "+str(adjValues)+"==>"+str(sum(adjValues)))
            totalValue += sum(adjValues)
print(totalValue)


Sample IP and OP: 

5
4

5 19 20 19
2 5 8 13
25 13 17 1
4 14 26 22
28 18 2 17
Matrix Value: 5Index Value: [19, 2, 5]==>26
Matrix Value: 19Index Value: [5, 20, 8]==>33
Matrix Value: 19Index Value: [13]==>13
Matrix Value: 2Index Value: [25, 13]==>38
Matrix Value: 5Index Value: [17]==>17
Matrix Value: 13Index Value: [1, 19]==>20
Matrix Value: 13Index Value: [14, 4, 26]==>44
Matrix Value: 17Index Value: [22]==>22
Matrix Value: 2Index Value: [18, 17]==>35
Matrix Value: 17Index Value: [2]==>2
250
