package tbc.testfirst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-4-25.
 */
public class HotelWorldClocksTest {
    private PhoneClock phoneClock;
    private WorldClockSystem worldClockSystem;

    @Before
    public void initialization() {
        phoneClock = new PhoneClock(8);
        worldClockSystem = new WorldClockSystem();
        phoneClock.setWorldClockSystem(worldClockSystem);
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock("London", 0);
        worldClockSystem.attach(londonClock);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(1, londonClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock moscowClock = new CityClock("Moscow", 4);
        worldClockSystem.attach(moscowClock);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(5, moscowClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock("NewYork", -5);
        worldClockSystem.attach(newYorkClock);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(20, newYorkClock.getLocalTime());
    }

    @Test
    public void the_time_of_phone_clock_should_be_9_after_it_is_set_to_9_Beijing_time() {
        // Arrange, Act
        phoneClock.setLocalTime(9);
        // Assert
        assertEquals(9, phoneClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_Beijing_should_be_9_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock beijingClock = new CityClock("Beijing", 8);
        worldClockSystem.attach(beijingClock);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(9, beijingClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_Sydney_should_be_11_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock sydneyClock = new CityClock("Sydney", 10);
        worldClockSystem.attach(sydneyClock);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(11, sydneyClock.getLocalTime());
    }

}
