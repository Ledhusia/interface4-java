package app;

import entities.Combo;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConcretePrinter p = new ConcretePrinter("1000");
        p.processDoc("Text");
        p.print("Text");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2000");
        s.processDoc("Document");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
		Combo c = new Combo("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
    }
}
