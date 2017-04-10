package id.co.garena.dagger2course.indomiesample;

/**
 * Created by ibnumuzzakkir on 10/04/2017.
 * Android Developer
 * Garena Indonesia
 */

public class KomporGas implements Kompor {
    boolean panas;
    @Override
    public void on() {
        System.out.println("Kompor dinyalakan");
        this.panas = true;
    }

    @Override
    public void off() {
        this.panas = false;
    }

    @Override
    public boolean sudahMendidih() {
        return panas;
    }
}
