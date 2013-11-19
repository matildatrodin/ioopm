package TrafficSimulation;

import TrafficSimulation.Car;
import customExceptions.OverflowException;

public interface LaneInterface{

    /** Moves all the cars one position forward in the lane, if possible.  
     */

    public void step();

    
    /** Removes and returns the first car in the lane.
     *
     *  @return Returns the first car in the Lane.
     */

    public CarInterface getFirst();

    
    /**  Gets the first car in the lane without removing it. If the first position is empty,
     *   it returns null.
     *
     * @return Returns the first car in the lane, if the first position is empty, it returns null.  
     */

    public CarInterface firstCar();
    

    /** Returns true if the last position in the lane is free, else false.
     *
     *  @return Returns true if there is null stored in the last postion of the lane, else false.
     */

    public boolean lastFree();


    /** Inserts a car at the last position of a Lane if the spot is free.
     *
     * @param c a car which will be placed at the last position of the lane.
     * @throws OverflowException is thrown when a car wants to go into a lane but the last
     * position is occupied.
     */

    public void putLast(CarInterface c) throws OverflowException;


    /** Gets the lenght of the Lane.
     *
     * @return Returns the lenght of the Lane.
     */

    public int getLength();


    /** Builds a representation of the lane as a String.
     *
     * @return Returns a string which contains a representation of the lane as a String.
     */

    public String toString();
}