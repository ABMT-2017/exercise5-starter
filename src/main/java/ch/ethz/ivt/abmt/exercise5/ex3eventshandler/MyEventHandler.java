package ch.ethz.ivt.abmt.exercise5.ex3eventshandler;

import org.apache.log4j.Logger;
import org.matsim.api.core.v01.events.ActivityEndEvent;
import org.matsim.api.core.v01.events.ActivityStartEvent;
import org.matsim.api.core.v01.events.handler.ActivityEndEventHandler;
import org.matsim.api.core.v01.events.handler.ActivityStartEventHandler;
import org.matsim.core.controler.events.AfterMobsimEvent;
import org.matsim.core.controler.listener.AfterMobsimListener;

public class MyEventHandler implements ActivityStartEventHandler, ActivityEndEventHandler, AfterMobsimListener {
	private static final Logger log = Logger.getLogger( MyEventHandler.class );

	public void handleEvent(ActivityEndEvent event) {
		// you should update a counter of activity ends
	}

	public void handleEvent(ActivityStartEvent event) {
		// you should update a counter of activity starts
	}

	public void notifyAfterMobsim(AfterMobsimEvent event) {
		// you should print the stored value for the counters of activity starts and ends
	}

	public void reset(int iteration) {
		// you should reset the counters (the same event handler is used in every iteration)
	}
}
