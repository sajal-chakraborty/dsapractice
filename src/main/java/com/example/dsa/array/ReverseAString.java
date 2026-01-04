package com.example.dsa.array;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println("I am exciting to implement reverse a given String.");
        String str = "ABCDEFGH";
        char [] charArray = str.toCharArray();

        for(int i = 0, j=charArray.length-1; i < charArray.length;i++, j--){
            System.out.println("i: "+charArray[i]);
            System.out.println("j: "+charArray[j]);
            charArray[i] = charArray[j];
        }
        System.out.println("Reversed String : " + String.valueOf(charArray));

        char [] charArray1 = str.toCharArray();
        char [] charArray1reversed = new char[charArray1.length];
        for (int i = charArray1.length-1; i >=0 ; i--) {
//            System.out.println(i);
//            System.out.println(charArray1rArray1.length-1-i);
            charArray1reversed[charArray1.length-1-i]=charArray1[i];
        }
        System.out.println(String.valueOf(charArray1reversed));
    }
}
