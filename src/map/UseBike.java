package map;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
public static void main(String[] args) {
	Bike b1=new Bike("Honda",5432,"Red",100000,true);
	Bike b2=new Bike("Jawa",5455,"Meroon",200000,true);
	Bike b3=new Bike("Honda",6432,"Black",150000,false);
    Bike b4=new Bike("RoyalEnfield",4543,"Blue",250000,true);	
    Bike b5=new Bike("Pulsar",5676,"Black",170000,false);
    Bike b6=new Bike("Suzuki",2701,"White",120000,false);
    HashMap<Integer,Bike>bikes=new HashMap<>();
    bikes.put(b1.getRegis(),b1);
    bikes.put(b2.getRegis(),b2);
    bikes.put(b3.getRegis(),b3);
    bikes.put(b4.getRegis(),b4);
    bikes.put(b5.getRegis(),b5);
    bikes.put(b6.getRegis(),b6);
   // System.out.println(bikes);
   // System.out.println(bikes.keySet());
   // System.out.println(bikes.values());
   /* for(Integer x:bikes.keySet()) {//key Iteration
    	System.out.println(x);
    }*/
    
   /* for(Bike x:bikes.values()) {//values Iteration
    	System.out.println(x);
    }*/
   /* for(Integer x:bikes.keySet()) {//values using keySet
    	System.out.println(bikes.get(x));
    }*/
   // bikes.forEach((x,y)->System.out.println(bikes.get(x)));
   Iterator<Bike>b=bikes.values().iterator();
    while(b.hasNext()) {
    	if(b.next().getBrand().startsWith("S")) {
    		b.remove();
    	}
    }
    System.out.println(bikes);
  /* Iterator<Integer>b=bikes.keySet().iterator();
    while(b.hasNext()) {
    	if(b.next()%2==0) {
    		b.remove();
    	}
    }*/
   // System.out.println(bikes);
    



}
}
