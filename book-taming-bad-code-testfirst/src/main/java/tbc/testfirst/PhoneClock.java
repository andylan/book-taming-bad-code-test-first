package tbc.testfirst;

import java.util.List;

/**
 * Created by benwu on 14-4-25.
 */
public class PhoneClock {

    private final int utcOffset;
    private List<CityClock> hotelWorldClocks;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setLocalTime(int localTime) {
        for (CityClock cityClock : this.hotelWorldClocks) {
            cityClock.setUtcZeroTime(localTime - utcOffset);
        }
    }

    public void setHotelWorldClocks(List hotelWorldClocks) {
        this.hotelWorldClocks = hotelWorldClocks;
    }
}
