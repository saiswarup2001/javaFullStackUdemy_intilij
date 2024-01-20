package composition.laptop.components;

public class processor {
    private String brand;
    private String series;
    private int gen;
    private int core;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String MinFrequency;
    private String MaxFrequency;


    //default constructor
    public processor(){
        this.brand = "INTEL";
        this.series = "i5 7200u";
        this.gen = 7;
        this.core = 8;
        this.threads = 4;
        this.cacheMemory = "3MB";
        this.frequency = "3.5Ghz";
        MinFrequency = "2.5Ghz";
        MaxFrequency = "3.1Ghz";
    }
    public processor(String brand, String series, int gen, int core, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.gen = gen;
        this.core = core;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        MinFrequency = minFrequency;
        MaxFrequency = maxFrequency;
    }

    @Override
    public String toString() {
        return "processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", gen=" + gen +
                ", core=" + core +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", MinFrequency='" + MinFrequency + '\'' +
                ", MaxFrequency='" + MaxFrequency + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGen() {
        return gen;
    }

    public int getCore() {
        return core;
    }

    public int getThreads() {
        return threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return MinFrequency;
    }

    public String getMaxFrequency() {
        return MaxFrequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
