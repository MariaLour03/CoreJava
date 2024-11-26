package com.perscholas.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreateAnArray {
    //Print each array element
    public void printArray() {
        int[] arr = {1,2,3};
        System.out.println("Array element arr[0] : " + arr[0]);
        System.out.println("Array element arr[1] : " + arr[1]);
        System.out.println("Array element arr[2] : " + arr[2]);
    }

    // Find middle element of an array
    public void findMiddleElementOfArray() {
        int[] num1 = {13,5,7,68,2};
        int arraySize = num1.length;
        int middle = num1[arraySize / 2];

        System.out.printf("Middle element of array : %d\n",middle);
    }

    //Using clone() method
    public void useCloneMethod(){
        String[] originalArray = {"red", "green", "blue", "yellow"};
        String[] newArray = new String[originalArray.length];

        System.out.println("Original array length : " + originalArray.length);
        newArray = originalArray.clone();
        System.out.println("New array elements: " + Arrays.toString(newArray));
    }

    // Raises an Exception
    public void raisesException(){
        int[] num2 = {10,20,30,40,50};
        //num[5] = 60; //Raises an exception ->ArrayIndexOutOfBoundsException
        System.out.println("Value of First index : " + num2[0]);
        System.out.println("Value of Last index : " + num2[num2.length-1]);
        //Raises an exception ->ArrayIndexOutOfBoundsException
        //System.out.println("Value of index->num.length : " + num[num.length]);
    }

    // Display the loop variable -> i value
    public void loopThruArray() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.out.printf("Array element num[%d] : %d\n", i, num[i]);
        }
    }

    // Display the loop variable -> i*2 value
    public void loopThruArray2() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i*2;
            System.out.printf("Array element num[%d] : %d\n", i, num[i]);
        }
    }

    // Display the array elements except for the middle index value
    public void displayArrayElements() {
        int[] num2 = {10,20,30,40,50};
        int middleIndex =  num2.length / 2;

        for (int i = 0;i<=num2.length-1; i++) {
            if (i == middleIndex)
               continue;

            System.out.println("Array Element " + num2[i]);
       }
    }

    //Swap first array element with the middle element
    public void swapArrayElements() {
        String[] str = {"dog", "cat", "sheep", "cow", "rabbit"};
        int middleIndex = str.length / 2;
        String swap = str[0]; //Assign first element to swap string variable
        for (int i = 0; i <= str.length-1; i++) {
            if (i == 0) {
                str[i] = str[middleIndex];
                str[middleIndex] = swap;
            }
            System.out.println("Array Element " + String.valueOf(str[i]));
        }
    }

    //Print array elements in ascending order, smallest and largest element of array
    public void sortArray() {
        int[] numArray = {4,2,9,13,1,0};
        Arrays.sort(numArray); //sort the array elements
        System.out.println("Array in ascending order : " + Arrays.toString(numArray));
        int smallest = numArray[0]; // assign first array element to smallest
        int largest = numArray[0];  // assign first array element to largest

        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > largest)
                largest = numArray[i];
            if (numArray[i] < smallest)
                smallest = numArray[i];
        }
        System.out.println("The smallest number is : " + smallest);
        System.out.println("The biggest number is : " + largest);
    }

    //Print the array with elements of different datatypes
    public void displayArrayOfDifferentDataTypes(){
        Object[] arr = {10,"Smith","Mike","Joe",35.58}; //Object array that hold different datatypes

        System.out.println(Arrays.toString(arr));
    }

     //Display the favorite things
    public void displayFavoriteThings(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        int n = input.nextInt();
        String[] favoriteThings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your thing : ");
            favoriteThings[i] = input.next();
        }
        System.out.println("Your favorite things are: ");
        System.out.println(Arrays.toString(favoriteThings));
    }
}



