package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int A;

        System.out.println("Inputkan Jumlah Data Yang Ingin Diproses : ");

        A = input.nextInt();
        int[] array = new int[ A ];

        System.out.println("Input "+ A +" Data Tersebut : ");

        for (int B = 0; B < A; B++)
            array[B] = input.nextInt();

        HeapSort.sort(array);
        System.out.println("Berikut Ini Adalah Hasil Akhir Setelah Pemrosesan Data : ");

        for (int B = 0; B < A; B++)
            System.out.println(array[B]+" ");
        System.out.println();
    }
}