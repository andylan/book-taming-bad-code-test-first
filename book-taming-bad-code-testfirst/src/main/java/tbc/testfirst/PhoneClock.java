package tbc.testfirst;

/**
 * Created by benwu on 14-4-25.
 */
public class PhoneClock {

    private final int utcOffset;
    private WorldClockSystem worldClockSystem;
    private int localTime;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        worldClockSystem.updateAllClockTime(localTime - utcOffset);
    }

    public void setWorldClockSystem(WorldClockSystem worldClockSystem) {
        this.worldClockSystem = worldClockSystem;
    }

    public int getLocalTime() {
        return this.localTime;
    }
}
