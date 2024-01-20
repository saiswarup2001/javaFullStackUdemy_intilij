package composition.laptop;

import composition.laptop.components.GraphicCard;
import composition.laptop.components.processor;
public class laptop {
    private float screen;
    private processor Processor;
    private String ram;
    private String hardDrive;
    private GraphicCard gCard;
    private String optionalDriver;
    private String keyboard;

    //default constructor
    public laptop(){
        this.screen = 15.6f;
        this.Processor = new processor();
        this.ram = "DDR4";
        this.hardDrive = "2TB";
        this.gCard = new GraphicCard();
        this.optionalDriver = "MLT Layer";
        this.keyboard = "Backled";
    }

    public laptop(float screen, processor Processor, String ram, String hardDrive, GraphicCard gCard, String optionalDriver, String keyboard) {
        this.screen = screen;
        this.Processor = Processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.gCard = gCard;
        this.optionalDriver = optionalDriver;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "screen=" + screen +
                ", Processor=" + Processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", gCard=" + gCard +
                ", optionalDriver='" + optionalDriver + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public processor getProcessor() {
        return Processor;
    }

    public float getScreen() {
        return screen;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public GraphicCard getgCard() {
        return gCard;
    }

    public String getOptionalDriver() {
        return optionalDriver;
    }

    public String getKeyboard() {
        return keyboard;
    }


    public String gamingMode(){
        Processor.setFrequency(Processor.getMaxFrequency());
        return "Success";
    }
}
