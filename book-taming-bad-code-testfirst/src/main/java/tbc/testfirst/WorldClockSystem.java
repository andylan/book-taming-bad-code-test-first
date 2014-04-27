package tbc.testfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benwu on 14-4-27.
 */
public class WorldClockSystem {
    private List<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(CityClock cityClock) {
        cityClocks.add(cityClock);
    }
}
