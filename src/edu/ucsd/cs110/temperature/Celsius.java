package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float newTemp = (float) (this.getValue() * 1.8 + 32);
        return (new Celsius(newTemp));
    }


    public String toString()
        {
            // TODO: Complete this method
            String result = this.getValue() + " " + "C";
            return result;
        }
}
