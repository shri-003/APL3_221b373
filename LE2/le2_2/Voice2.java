class Voice2{
    Animal[] animal = new Animal[5];
    
    void prepareVoice() {
        animal[0] = new Cow();
        animal[1] = new Loin();
        animal[2] = new Dog();
        animal[3] = new Goat();
        animal[4] = new Pig();
        System.out.println("Animal Voices prepared");
    }
    
    private void hear() {
        for (Animal animals : animal) {
            if (animals != null) {
                animals.makeVoice(); 
            } else {
                System.out.println("No animal found!");
            }
        }
    }
    
    public void templateMethod() {
        prepareVoice(); 
        hear();         
    }
}