
package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Project2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File file_input = new File("input.txt");
        PrintWriter file_output = new PrintWriter("output.txt");
        Scanner input = new Scanner(file_input);
 
        while (input.hasNextInt()) {
            int x = input.nextInt();
            int y = input.nextInt();
            int[][] A = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    A[i][j] = input.nextInt();
                }
            }

            System.out.println("");
            x = input.nextInt();
            y = input.nextInt();
            int[][] B = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    B[i][j] = input.nextInt();
                }
            }

            String str1 = input.nextLine();
            String str = input.nextLine().trim();
            
            
            
        }
        
    }
    public static void k(String str,int[][] A, int[][] B) throws FileNotFoundException, InterruptedException {
        PrintWriter file_output = new PrintWriter("output.txt");
        switch (str) {
                case "SUM A B"     : printArray(SUM_A_B(A, B));p(SUM_A_B(A, B));break; 
                case "SUBT A B"    : printArray(SUBT_A_B(A, B));p(SUBT_A_B(A, B));break; 
                case "SUBT B A"    : printArray(SUBT_B_A(A, B));p(SUBT_B_A(A, B));break; 
                case "MUL A B"     : file_output.print(MUL_A_B(A, B));System.out.println(MUL_A_B(A, B));break;
                case "MUL B A"     : file_output.print(MUL_B_A(A, B));System.out.println(MUL_B_A(A, B));break;
                case "Transpose A" : printArray(Transpose(A));p(Transpose(A));break;
                case "Transpose B" : printArray(Transpose(B));p(Transpose(B));break;
                case "Det A"       : file_output.print(Det(A));System.out.println(Det(A));break;
                case "Det B"       : file_output.print(Det(B));System.out.println(Det(B));break;
        }
        file_output.close();
    }
    public static int Det(int[][] M) {
        int det =0;
        return det;
    }
    public static int MUL_A_B(int[][] A, int[][] B) {
        int m =0;
        return m;
    }
    public static int MUL_B_A(int[][] A, int[][] B) {
        int m =0;
        return m;
    }
    public static int[][] Transpose(int[][] M) {
        int[][] m = new int[M[0].length][M.length];
        return m;
    }
    public static int[][] SUBT_A_B(int[][] A, int[][] B) {
        int[][] subAB = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                subAB[i][j] = A[i][j] - B[i][j];
            } 
        }

        return subAB;
    }
    public static int[][] SUBT_B_A(int[][] A, int[][] B) {
        int[][] subAB = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                subAB[i][j] = B[i][j] - A[i][j];
            } 
        }

        return subAB;
    }
    public static int[][] SUM_A_B(int[][] A, int[][] B) {
        int[][] subAB = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                subAB[i][j] = A[i][j] + B[i][j];
            } 
        }

        return subAB;
    }
    public static void printArray(int[][] m) throws FileNotFoundException, InterruptedException {
        PrintWriter file_output = new PrintWriter("output.txt");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                file_output.print(m[i][j] + " ");
            }
            file_output.println();
        }
        file_output.println();
        //file_output.close();
        
        
    }
    public static int[][] scannerArray() throws FileNotFoundException {
        File file_input = new File("input.txt");
        Scanner input = new Scanner(file_input);
        int x = input.nextInt();
        int y = input.nextInt();
        int[][] m = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    public static void p(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(java.util.Arrays.toString(m[i]));
        }
    }
    
}
