package tbc.testfirst;

import org.junit.Test;

import java.time.zone.ZoneOffsetTransitionRule;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-4-25.
 */
public class HotelWorldClocksTest {
    @Test
    public void the_time_of_London_clock_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        CityClock londonClock = new CityClock("London", 0);
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setHotelWorldClock(londonClock);

        phoneClock.setLocalTime(9);

        assertEquals(1, londonClock.getLocalTime());
    }

    @Test
    public void the_time_of_clock_London_and_Moscow_should_be_1_and_5_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {
        assertEquals(1, londonClock.getLocalTime());
        assertEquals(5, moscowClock.getLocalTime());
    }
}
