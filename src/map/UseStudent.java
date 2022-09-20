package map;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
public static void main(String[] args) {
	Student s1=new Student("Ram",24,"B.E",982000022231l);
	Student s2=new Student("Priya",23,"B.Sc",9820543022231l);
	Student s3=new Student("Ravi",18,"B.TechIT",9820678022231l);
	Student s4=new Student("Aravind",20,"BCA",982890022231l);
	Student s5=new Student("Surya",21,"B.A",989430022231l);
	Student s6=new Student("Sanchana",26,"B.E",989430567331l);
	HashMap<Long,Student>stud=new HashMap<>();
	stud.put(s1.getAadhar(),s1);
	stud.put(s2.getAadhar(),s2);
	stud.put(s3.getAadhar(),s3);
	stud.put(s4.getAadhar(),s4);
	stud.put(s5.getAadhar(),s5);
	stud.put(s6.getAadhar(),s6);
	int max=0;
	String n="";
	/*for(Student x:stud.values()) {
		if(x.getAge()>max) {
			max=x.getAge();
			n=x.getName();
			
		}
	}System.out.println(n);*/
	
	/*for(Long x:stud.keySet()) {//max age using keyset() and get values
		if(stud.get(x).getAge()>max) {
			max=stud.get(x).getAge();
			n=stud.get(x).getName();
			
		}System.out.println(n);
	}*/ 

	/*stud.forEach((x,y)->{  // Doubt in this....
		if(stud.get(x).getAge()>max) {
		System.out.println(stud.get(x));
		}
	});*/
	
  /*  Iterator<Student>ite=stud.values().iterator();
	while(ite.hasNext()) {
		if(ite.next().getAge()%2==0) {
		
			ite.remove();
		}}
		System.out.println(stud);*/
	
	/*Iterator<Student>ite1=stud.values().iterator();
	while(ite1.hasNext()) {
		if(ite1.next().getQualify().equalsIgnoreCase("B.sc")) {
			ite1.remove();
		}}
		System.out.println(stud);*/
	
}
}
