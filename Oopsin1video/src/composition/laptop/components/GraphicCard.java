package composition.laptop.components;

public class GraphicCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicCard() {
        this.brand = "AMD";
        this.series =  940;
        this.memory = "2GB";
    }

    public GraphicCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}
