public class Tesla extends Car{
    public Tesla() {
    }

    public Tesla(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Tesla gas method");
    }

    @Override
    public void brake() {
        System.out.println("Tesla brake method");
    }
}
