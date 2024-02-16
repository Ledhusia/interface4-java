package app;

import entities.Printer;
import entities.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Printer p = new Printer("1000");
        p.processDoc("Text");
        p.print("Text");

        Scanner s = new Scanner("2000");
        s.processDoc("Document");
        System.out.println("Scan result: " + s.scan());
    }
}
