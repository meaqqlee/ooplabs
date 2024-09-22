public class Temperature {
    private double temperature;
    private char scale;

    public Temperature() {
        this(0, 'C');
    }
    public Temperature(double temperature) {
        this(temperature, 'C');
    }
    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    //getters
    public double getCelcius() {
        if(scale == 'C') {
            return temperature;
        }
        else {
            return 5*(temperature - 32)/9;
        }
    }
    public double getFahrenheit() {
        if(scale == 'F') {
            return temperature;
        }
        else {
            return (9 * (temperature/5)) - 32;
        }
    }

    //setters
    public void setBoth(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setScale(char scale) {
        this.scale = scale;
    }

    //get scale

    public char getScale() {
        return scale;
    }
}
