package web.models;

public class Car {
    private String model;
    private String series;
    private String region;

    public Car(String model, String series, String region) {
        this.model = model;
        this.series = series;
        this.region = region;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
