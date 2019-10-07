package academy.learnprogramming;

public class Wall {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double setWidth(double width) {
        this.width = width;
        if (width <= 0) {
            return 0;
        }else{
            return width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        this.height = height;
        if (height <= 0) {
            return 0;
        }else{
            return height;
        }
    }

    public double getArea() {
        return height * width;

    }
}
