package com.company;

import java.util.Scanner;
/*
Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl: ");
        int yil = sc.nextInt();
        if (yil % 4 == 0)
            System.out.print(yil + " " + " bir Artık Yıl");
        else if (yil == yil * 100 && yil % 400 == 0)
            System.out.print(yil + "bir artık yıldır");
        else
            System.out.print(yil + " " + "bir artık yıl degildir!!!");

    }
}
