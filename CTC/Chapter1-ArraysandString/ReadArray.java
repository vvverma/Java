/*
This program demonstrates a program to read any MXN array from the text file
with numbers seperated by spaces

*/
package com.ReadArray;
import java.io.*;
import java.util.*;


public class ReadArray{
public static int[][] readArray(String fileName) {
int[][] inputarr= {{0},{0}};
try{
FileReader fstream = new FileReader(fileName);
BufferedReader br = new BufferedReader(fstream);
StringBuilder lines = new StringBuilder();
int col = 0, row = 0;
String line, countCol = null ;

while((line = br.readLine()) != null){
countCol = line;
lines.append(line);
lines.append(" ");
row++;
}
br.close();
fstream.close();

String[] arr = countCol.split(" ");
col = arr.length;
inputarr = new int[row][col];
arr = lines.toString().split(" ");
for(int i = 0; i<row ; i++){
for(int j=0 ; j<col ; j++){
inputarr[i][j] = Integer.parseInt(arr[(i*col)+j]);
}
}

}
catch(Exception e){
e.printStackTrace();
}
return inputarr;

}

public static void print2DArray(int [][] ogMatrix){
System.out.println("Printing 2-D Array");
for(int i= 0 ; i<ogMatrix.length ; i++){
for(int j=0; j<ogMatrix.length;j++){
System.out.print(ogMatrix[i][j]+ " ");
}
System.out.println();
}
}



}