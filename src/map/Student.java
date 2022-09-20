package map;

public class Student {
private String name;
private int age;
private String qualification;
private long aadharNo;

public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getQualify() {
	return qualification;
}
public long getAadhar() {
	return aadharNo;
}
public Student(String n,int a,String q,long aa) {
	name=n;
	age=a;
	qualification=q;
	aadharNo=aa;
}
public String toString() {
	return name+" "+age+" "+qualification+" "+aadharNo;

}

}
