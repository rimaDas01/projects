package labassignment;

class Emplo{
    int id;
    String name;
 
    Emplo(){
        this(0,null);
    }
    Emplo(int id){
        this(id,null);
    }
    Emplo(String name){
        this(0,name);
    }
    Emplo(int id, String name){
        this.id=id;
        this.name=name;
    }
}

class Managerr extends Emplo{
    double bonus;
    Managerr(int id, String name, double bonus){
        super(id,name);
        //super.id=id;
        //super.name=name;
        this.bonus=bonus;
    }
    void showOff() {
    	System.out.println(id+" "+name+" "+bonus);
    }
}
 

public class ThisSuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Emplo e = new Emplo();
		e.id=9;
		e.name="Rima";*/
		Managerr m = new Managerr(12,"Ive",1111.997);
		m.showOff();
		
	}

}
