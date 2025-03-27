abstract class Beverage{
    private void powr(int qty){
        System.out.println("Powr " + qty + "ML of beverage in a glass.");
    }
    protected abstract void addCondinment();
    
    protected void Stir(){ } //hock
    
    private void Serve(){
        System.out.println("Serve through a Watier");
    }
    
    public void templateMethod(int qty){
        powr(qty);
        addCondinment();
        Stir();
        Serve();
    }
}