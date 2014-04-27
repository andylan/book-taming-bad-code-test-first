package tbc.testfirst;

/**
 * Created by benwu on 14-4-25.
 */
public class PhoneClock {

    private final int utcOffset;
    private WorldClockSystem worldClockSystem;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setLocalTime(int localTime) {
        // TODO: The local time of the PhoneClock object should be set. Add a test for it at first.
        worldClockSystem.updateAllClockTime(localTime - utcOffset);
    }

    public void setWorldClockSystem(WorldClockSystem worldClockSystem) {
        this.worldClockSystem = worldClockSystem;
    }
}
