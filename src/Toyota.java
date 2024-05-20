public class Toyota extends  Car{
    public Toyota() {
    }

    public Toyota(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Toyota gas method");
    }

    @Override
    public void brake() {
        System.out.println("Toyota brake method");

    }
}
