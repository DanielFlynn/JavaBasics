package academy.learnprogramming;

public class Car {

    private int doors;
    private  int wheels;
    private String model;
    private String engine;
    private  String colour;

    public void setEngine (String engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("mondeo") || validModel.equals("bmw")) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public String getEngine() {
        return this.engine;
    }

    public  String getModel() {
        return this.model;
    }
}

