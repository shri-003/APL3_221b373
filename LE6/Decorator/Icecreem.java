class Icecreem extends Decorator{
    Icecreem(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return offering.getName() + " with Icecreem";
    }
    int getPrice(){
        return offering.getPrice() + 35;
    }
}