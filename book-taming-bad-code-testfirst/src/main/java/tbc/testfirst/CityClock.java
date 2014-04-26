package tbc.testfirst;

/**
 * Created by benwu on 14-4-25.
 */
public class CityClock {
    private final String cityName;
    private final int utcOffset;
    private int utcZeroTime;

    public CityClock(String cityName, int utcOffset) {
        this.cityName = cityName;
        this.utcOffset = utcOffset;
    }

    public int getLocalTime() {
        return 1;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
