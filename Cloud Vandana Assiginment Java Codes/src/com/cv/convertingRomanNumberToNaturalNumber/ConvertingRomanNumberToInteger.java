package com.cv.convertingRomanNumberToNaturalNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertingRomanNumberToInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Roman Number ");
		String roman = scan.next();
		
		int result = romanToInt(roman);
		System.out.println("The integer value for " + roman + " is " + result);
		scan.close();
	}
	
	public static int romanToInt(String s) {
		s = s.toUpperCase();
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
	}
}
