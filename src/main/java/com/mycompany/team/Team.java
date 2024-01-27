/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.team;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class Team {

    public static void main(String[] args) {
        int n, inserter, sum1 = 0, sum2 = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            for (int j = 0; j < 3; j++) {
                inserter = scan.nextInt();
                sum1 += inserter;
            }
            if (sum1 > 1) {
                sum2++;
            }
        }
        System.out.println(sum2);

    }
}
