package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner setCurrentTemp = new Conditioner();
        Conditioner onConditioner = new Conditioner();
        int inceCurrent = setCurrentTemp.getCurrentTemperature();
        boolean onCon = onConditioner.isOn();
        setCurrentTemp.increaseCurrentTemperature();
        onConditioner.setOn(onConditioner.isOn());
        assertEquals(inceCurrent + 1, setCurrentTemp.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner setCurrentTempyr = new Conditioner();
        int inceCurrente = setCurrentTempyr.getCurrentTemperature();
        setCurrentTempyr.decreaseCurrentTemperature();
        assertEquals(inceCurrente - 1, setCurrentTempyr.getCurrentTemperature());
    }
    @Test
    void increaseCurrentMaxTemperature() {
        Conditioner currentMax = new Conditioner();
        currentMax.setCurrentTemperature(currentMax.getMaxTemperature());
        currentMax.increaseCurrentTemperature();
        assertEquals(currentMax.getMaxTemperature(), currentMax.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentMinTemperature() {
        Conditioner currentMin = new Conditioner();
        currentMin.setCurrentTemperature(currentMin.getMinTemperature());
        currentMin.decreaseCurrentTemperature();
        assertEquals(currentMin.getMinTemperature(), currentMin.getCurrentTemperature());
    }


}