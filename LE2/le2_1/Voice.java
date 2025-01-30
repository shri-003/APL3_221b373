class Voice{
    Animal[] animal = new Animal[5];
    
    void prepareVoice() {
        animal[0] = new Cow();
        animal[1] = new Loin();
        animal[2] = new Dog();
        animal[3] = new Goat();
        animal[4] = new Pig();
    }
    
    void hear() {
        for(Animal animals : animal){
            animals.makeVoice();
        }
    }
}