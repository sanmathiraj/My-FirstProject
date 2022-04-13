package com.training.java;

public class Employee implements Comparable{
	String Ename;
	int Eid;
	Employee(String Ename,int Eid){
		this.Ename=Ename;
		this.Eid=Eid;
	}
public String toString() {
	return Ename+"...."+Eid;
}
	@Override
	public int compareTo(Object obj) {
		int Eid1=this.Eid;
		Employee e=(Employee)obj;
		
		int Eid2=e.Eid;
		if(Eid1<Eid2) {
			return-1;
		}
		else if(Eid1>Eid2) {
			return+1;
		}
		return 0;
	}

}
