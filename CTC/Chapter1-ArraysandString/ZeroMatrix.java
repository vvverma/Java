/*
This program is a solution to CTC from chapter number 1 sum number 1.8
We have to find zero in the matrix and apply to the particular and row and
column.

Hint--
Solve using space complexity as O(1)

File related--
ReadArray.java
*/

import static com.ReadArray.ReadArray.*;

class ZeroMatrixClass{
static int [][] input;
static int rowLen;
static int colLen;


public ZeroMatrixClass(int[][] input){
this.input = input;
rowLen = input.length;
colLen = input[0].length;
}

static void nullifyRow(int i){
for(int j = 0 ; j<rowLen ; j++){
input[i][j] = 0;
}
}

static void nullifyCol(int j){
for(int i = 0 ; i<colLen ; i++){
input[i][j] = 0;
}
}


static void setZero(){
boolean rowHasZero = false;
boolean colHasZero = false;

//check if first row has zero
for(int j = 0 ; j<colLen; j++){
	if(input[0][j] == 0)
	rowHasZero = true;
}

//check if first column has zero
for(int i = 0 ; i<rowLen; i++){
	if(input[i][0] == 0)
	colHasZero = true;
}

//check if remaining elements are zero and storing them in first row and col
for(int i = 1 ;i<rowLen ; i++){
for(int j = 1 ; j<colLen ; j++){
if(input[i][j] == 0){
input[i][0] = 0;
input[0][j] = 0;
}
}
}


print2DArray(input);

//nullify the row based on the first row
for(int i = 0 ; i<rowLen ;i++){
 if(input[i][0] == 0){
  nullifyRow(i);
}
}

//nullify the col based on the first col 
for(int j = 0 ; j<colLen; j++){
if(input[0][j] == 0){ 
nullifyCol(j);
}
}

//nullify first row 
 if(rowHasZero){
 nullifyRow(0);
}

//nullify first col 
 if(colHasZero){
 nullifyCol(0);
}

System.out.println("After Setting Zeros");
print2DArray(input);
}
}




class ZeroMatrix{

public static void main(String args[]) {
int[][] inputarr = readArray("InputMatrix.txt");
System.out.println("Before Setting Zeros");
print2DArray(inputarr);
ZeroMatrixClass z = new ZeroMatrixClass(inputarr);
z.setZero();
}
}