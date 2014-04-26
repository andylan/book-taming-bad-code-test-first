package tbc.testfirst;

import org.junit.Test;

import java.time.zone.ZoneOffsetTransitionRule;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-4-25.
 */
public class HotelWorldClocksTest {
    @Test
    public void the_time_of_clock_London_and_Moscow_should_be_1_and_5_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock("London", 0);
        CityClock moscowClock = new CityClock("Moscow", 4);
        List hotelWorldClocks = new ArrayList<CityClock>();
        hotelWorldClocks.add(londonClock);
        hotelWorldClocks.add(moscowClock);
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setHotelWorldClocks(hotelWorldClocks);

        // Act
        phoneClock.setLocalTime(9);

        // Assert
        assertEquals(1, londonClock.getLocalTime());
        assertEquals(5, moscowClock.getLocalTime());
    }
}
