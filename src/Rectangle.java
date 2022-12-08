class Rectangle implements Shape, TTT {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double bbb() {
        return 0;
    }
}