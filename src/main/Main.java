package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {
        Series s1 = new Series( "Mentaliste", "Netflix");
        Series s2 = new Series(Input.st("Informe o nome da série: "));
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}