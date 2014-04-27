package tbc.testfirst;

import org.junit.Before;
import org.junit.Test;

import java.time.zone.ZoneOffsetTransitionRule;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-4-25.
 */
public class HotelWorldClocksTest {
    private List<CityClock> hotelWorldClocks;
    private PhoneClock phoneClock;

    @Before
    public void initialization() {
        hotelWorldClocks = new ArrayList<CityClock>();
        phoneClock = new PhoneClock(8);
        phoneClock.setHotelWorldClocks(hotelWorldClocks);
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock("London", 0);
        hotelWorldClocks.add(londonClock);

        WorldClockSystem worldClockSystem =new WorldClockSystem();
        worldClockSystem.attach(londonClock);
        phoneClock.setWorldClockSystem(worldClockSystem);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(1, londonClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock moscowClock = new CityClock("Moscow", 4);
        hotelWorldClocks.add(moscowClock);

        WorldClockSystem worldClockSystem =new WorldClockSystem();
        worldClockSystem.attach(moscowClock);
        phoneClock.setWorldClockSystem(worldClockSystem);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(5, moscowClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock("NewYork", -5);
        hotelWorldClocks.add(newYorkClock);

        WorldClockSystem worldClockSystem =new WorldClockSystem();
        worldClockSystem.attach(newYorkClock);
        phoneClock.setWorldClockSystem(worldClockSystem);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(20, newYorkClock.getLocalTime());
    }
}
