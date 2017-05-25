/*
This program demonstrates a program to rotate the matrix, the question is
from CTC chapter 1 ,1.7

Related File--
ReadArray.java
*/
import static com.ReadArray.ReadArray.*;
class RotateMatrix{
public static int[][] rotateMatrix(int[][] ogMatrix){
if((ogMatrix.length ==0) || (ogMatrix[0].length == 0))
return null;


int n = ogMatrix.length;
for(int layer = 0 ; layer< n/2; layer++){
int first = layer ;
int last = n - 1 -layer;

for(int i = first ; i<last ; i++){
int offset = i - first;

//saving top;
int top =  ogMatrix[first][i];

//left->top
ogMatrix[first][i] = ogMatrix[last-offset][first];

//bottom->left
ogMatrix[last-offset][first] = ogMatrix[last][last-offset]; 


//right -> bottom
ogMatrix[last][last-offset] = ogMatrix[i][last];

//top->right

ogMatrix[i][last]=top; 


}

}



return ogMatrix;

}


public static void main(String args[]){

print2DArray(readArray("InputMatrix.txt"));
int[][] rotatedMatrix = rotateMatrix(readArray("InputMatrix.txt"));
print2DArray(rotatedMatrix);

}

}