//////////////////////////////////
//Ken Grenstedt
//9/4/2015
//lab02
//Cyclometer.java Program
//
//Assignment:
//My bicycle cyclometer (meant to measure speed, distance, etc.) 
//records two kinds of data, the time elapsed in seconds, and the 
//number of rotations of the front wheel during that time.
//
//For two trips, given time and rotation count, the program should
//a) print the number of minutes for each trip
//b) print the number of counts for each tirp
//c) print the distance of each trip in miles
//d) print the distance for the two trips combined


// always class first
public class Cyclometer {
    
        //main method 
    public static void main(String[] args) {
        
        //our input data. Documenting variables
        int secsTrip1=480;   //time for trip1
        int secsTrip2=3220;  //time for trip2
        int countsTrip1=1561;   //counts for trip1
        int countsTrip2=9037;   //counts for trip2
        
        //our intermediate variables and output data.
        double wheelDiameter=27;    //bicycle wheel diamter
        double PI=3.14159;          //value of pi
        double feetPerMile=5280;    //conversion factor from feet to miles
        double inchesPerFoot=12;    //conversion factor from inches to feet      
        double secondsPerMinute=60; //conversion factor from seconds to minutes    
        double distanceTrip1;       //distance of trip1
        double distanceTrip2;       //distance of trip2 
        double totalDistance;       //total distance (in miles)
        
        //Print out output data
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes and had "+ countsTrip2+" counts.");
        
        
        
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diamter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;   //Gives distance in miles
        
        //same as 2 lines of code above but combined for trip2 to save space
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;   
        
        
        //total distance traveled (adding distance of trip 1 & 2)
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

        
    }   //end of main method
}   //end of class  