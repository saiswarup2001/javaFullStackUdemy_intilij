package composition.main;

import composition.laptop.components.GraphicCard;
import composition.laptop.components.processor;
import composition.laptop.laptop;

public class Main {
    public static void main(String[] args) {
//        laptop lappi = new laptop();
//        System.out.println(lappi.getProcessor().getBrand());

        //processor obj
        processor Processor = new processor("Intel", "7200u", 7, 8, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");
        GraphicCard graphicCard = new GraphicCard("Nvidia", 1050, "1.5TB");
        laptop gamingLaptop = new laptop(17f,Processor, "DDR4", "2TB", graphicCard, null, "Gaming");
        System.out.println(gamingLaptop);

        System.out.println("---------------------------------------------");
        gamingLaptop.gamingMode();
        System.out.println("Gaming mode on:");
        System.out.println("Current Frequency is: "+gamingLaptop.getProcessor().getFrequency());
    }
}




