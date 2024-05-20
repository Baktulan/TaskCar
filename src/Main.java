
public class Main {
    public static void main(String[] args) {

        Car tesla= new Tesla("Cybertruck","Red",300 );
        Car tesla1= new Tesla("Model S","Black",280);

        Car toyota= new Toyota("Camry","Gray",280);
        Car toyota1= new Toyota("Avalon","Blue",300);

        tesla.gas();
        tesla.brake();

        toyota.gas();
        toyota.brake();
        }
}
