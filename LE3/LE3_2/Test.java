interface Testable{
    void display();
}

class Test implements Testable{
    public void display(){
        System.out.println("Display method in Test class.");
    }
}