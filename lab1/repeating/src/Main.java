public class Main {
    static public void main(String[] args) {
        Temperature temperature1 = new Temperature();
        Temperature temperature2 = new Temperature(12.34);
        Temperature temperature3 = new Temperature(234.455, 'F');

        System.out.println(temperature3.getCelcius());
        System.out.println(temperature3.getFahrenheit());
        System.out.println(temperature3.getScale());
    }
}
