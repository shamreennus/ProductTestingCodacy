/**
 * Module A04 Data Structures 
 * A04-PA1 Top-Down Merge Sort 
 * Task 1  : Build and Test a StopWatch
 */
package hw_a06_a061;

/**
 * Compute and Execute the Start (or) restarted time for Stopwatch
 * @author Shamreen Basheer
 * @version 1
 */
public class Stopwatch {
	
		//startTime - Records the Initial time , when the watch is started (or) restarted
		private long startTime;

	    /**
	     * Initializes a new Stopwatch.
	     * Starts a stop watch 
	     */
	    public Stopwatch() {
	        startWatch();
	    }

	    /*
	     * startTime - Set to Current time with Milli seconds
	     * This will either used to Start the watch (or) restart the watch
	     */
		public void startWatch() {
			startTime = System.currentTimeMillis();
		} 


	    /**
	     * Elapsed CPU time (in seconds) is calculated since the stopwatch was started or restarted.
	     * @return elapsed CPU time (in seconds) since the stopwatch was created
	     */
	    public long elapsedTime() {
	        return (System.currentTimeMillis() - startTime);
	    }
}
