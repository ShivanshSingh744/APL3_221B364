class Voice2{
    Animal[] animals= new Animal[5];
    
   
    
   public void prepareVoice(){
        //Animal[] animals= new Animal[5];
        animals[0]= new Cow();
        animals[1]= new Dog();
        animals[2]= new Lion();
        animals[3]= new Pig();
        animals[4]= new Goat();
        
      
    }
    
    public void hear(){
        for(Animal animal:animals)
            animal.makeVoice();
    }
    
    
}