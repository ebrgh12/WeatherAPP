package com.example.girish.weatherapp.ParsingModel;

/**
 * Created by Girish on 7/12/2017.
 */

public class Result {

    /* tempi

       hum

       pressurei

       windchilli

       heatindexi
    */

    private int tempi;
    private int hum;
    private int pressurei;
    private int windchilli;
    private int heatindexi;

    public int getTempi() {
        return tempi;
    }

    public void setTempi(int tempi) {
        this.tempi = tempi;
    }

    public int getHum() {
        return hum;
    }

    public void setHum(int hum) {
        this.hum = hum;
    }

    public int getPressurei() {
        return pressurei;
    }

    public void setPressurei(int pressurei) {
        this.pressurei = pressurei;
    }

    public int getWindchilli() {
        return windchilli;
    }

    public void setWindchilli(int windchilli) {
        this.windchilli = windchilli;
    }

    public int getHeatindexi() {
        return heatindexi;
    }

    public void setHeatindexi(int heatindexi) {
        this.heatindexi = heatindexi;
    }

    @Override
    public String toString() {
        return "Result{" +
                "tempi=" + tempi +
                ", hum=" + hum +
                ", pressurei=" + pressurei +
                ", windchilli=" + windchilli +
                ", heatindexi=" + heatindexi +
                '}';
    }
}
