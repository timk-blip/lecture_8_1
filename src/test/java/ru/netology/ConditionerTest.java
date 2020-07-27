package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int inceCurrent = conditioner.getCurrentTemperature();
        String expected = "KoHb";
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());

        boolean on = true;
        conditioner.setOn(on);
        assertEquals(on, conditioner.isOn());

        conditioner.increaseCurrentTemperature();
        assertEquals(inceCurrent + 1, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner setCurrentTempyr = new Conditioner();
        int inceCurrente = setCurrentTempyr.getCurrentTemperature();
        setCurrentTempyr.decreaseCurrentTemperature();
        assertEquals(inceCurrente - 1, setCurrentTempyr.getCurrentTemperature());

        boolean on = true;
        setCurrentTempyr.setOn(on);
        assertEquals(on, setCurrentTempyr.isOn());
    }

    @Test
    void shouldIncreaseCurrentMaxTemperature() {
        Conditioner currentMax = new Conditioner();
        currentMax.setCurrentTemperature(currentMax.getMaxTemperature());
        currentMax.increaseCurrentTemperature();
        assertEquals(currentMax.getMaxTemperature(), currentMax.getCurrentTemperature());

        boolean on = true;
        currentMax.setOn(on);
        assertEquals(on, currentMax.isOn());
    }

    @Test
    void shouldDecreaseCurrentMinTemperature() {
        Conditioner currentMin = new Conditioner();
        currentMin.setCurrentTemperature(currentMin.getMinTemperature());
        currentMin.decreaseCurrentTemperature();
        assertEquals(currentMin.getMinTemperature(), currentMin.getCurrentTemperature());

        boolean on = true;
        currentMin.setOn(on);
        assertEquals(on, currentMin.isOn());

    }

    @Test
    void shouldSetCurrentTemperatureUpBranchElse() {
        Conditioner conditioner = new Conditioner();
        boolean on = true;
        conditioner.setOn(on);
        assertEquals(on, conditioner.isOn());

        conditioner.setCurrentTemperature(26);
        assertEquals(25, conditioner.getMaxTemperature());
    }

    @Test
    void shouldSetCurrentTemperatureDownBranchElse() {
        Conditioner conditioner = new Conditioner();
        boolean on = true;
        conditioner.setOn(on);
        assertEquals(on, conditioner.isOn());

        conditioner.setCurrentTemperature(9);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getMinTemperature());


    }

}