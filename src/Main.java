import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Caiet caiet = new Caiet("patratele", "negru", 48.0, "mare");

        System.out.println(caiet.toString());

        Scanner scanner = new Scanner(System.in);
        String culoare = scanner.next();
        caiet.setCuloare(culoare);
        System.out.println(caiet.getCuloare());
        System.out.println(caiet.toString());

        System.out.println();

        Parfum parfum = new Parfum("dulce", "roz", "feminin", 500.0, "Chanell");

        System.out.println(parfum.toString());

        String mirosul = scanner.next();
        parfum.setMirosul(mirosul);
        System.out.println(parfum.getMirosul());
        System.out.println(parfum.toString());

        System.out.println();

        Masina masina = new Masina("Toyota" , "negru" , 2019 , "Crossover");

        System.out.println(masina.toString());

        String modelul = scanner.next();
        masina.setModelul(modelul);
        System.out.println(masina.getModelul());
        System.out.println(masina.toString());

        System.out.println();

        Frigider frigider = new Frigider("Samsung" , "alb" , 2022 , 1.5);

        System.out.println(frigider.toString());

        double dimensiuni = scanner.nextDouble();
        frigider.setDimensiuni(dimensiuni);
        System.out.println(frigider.getDimensiuni());
        System.out.println(frigider.toString());

    }
}
