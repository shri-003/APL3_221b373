
class setget{
    private String name ;
    private int age ;
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName; 
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    setget obj = new setget();
	    obj.setName("Shrinu");
	    obj.setAge(20);
	    System.out.println("Name = " + obj.getName());
	    System.out.println("Age = " + obj.getAge());
	}
}