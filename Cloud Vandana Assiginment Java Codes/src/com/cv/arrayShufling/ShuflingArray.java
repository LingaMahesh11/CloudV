package com.cv.arrayShufling;

import java.util.Random;
import java.util.Scanner;

public class ShuflingArray {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter array size");
    	
    	int[] arr = new int[scan.nextInt()];
    	
    	System.out.println("Enter array elements ");
    	for(int i =0;i<arr.length;i++) {
    		System.out.print((i+1) + " Element = ");
    		arr[i] = scan.nextInt();
    	}
    	
    	shuffleArray(arr);
    	
    	System.out.print("Shuffled Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
        
    }
    
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap array[i] and array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
