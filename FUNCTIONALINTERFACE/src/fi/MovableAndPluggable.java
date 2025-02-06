package fi;


@FunctionalInterface
interface IMovable{
    void move();
}
@FunctionalInterface
interface IPluggable{
    void plug();
}
class MovableAndPluggable{
    public static void main(String[]args){
    	
    	//
        IMovable movable=new IMovable(){   
            public void move(){
                System.out.println("It's moving!!!");  
            }
        };
        IPluggable pluggable=new IPluggable(){
            public void plug(){
                System.out.println("Plug it!");
            }
        };
        movable.move();
        pluggable.plug();
    }
}
