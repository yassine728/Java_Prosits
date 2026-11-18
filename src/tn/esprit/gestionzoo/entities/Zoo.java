package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo name cannot be empty!");
        }
    }
    public String getName() {
        return name;
    }
    public Zoo() {
        this.animals = new Animal[nbrCages];
    }
    public  Zoo(String N, String C){
        this.animals = new Animal[nbrCages];
        setName(N);
        this.city = C;
    }
    public boolean isZooFull(){
        for (int i=0 ; i<animals.length ; i++){
            if (animals[i] == null){
                return false;
            }
        }
        return true;
    }
    public int countAnimals(){
        int count = 0;
        for(int i = 0; i < animals.length; i++){
            if(animals[i]!=null){
                count++;
            }
        }
        return count;
    }
    Zoo compareZoo(Zoo z1,Zoo z2){
        if(z1.countAnimals() >= z2.countAnimals()){
            return z1;
        }
        else {
            return z2;
        }
    }
    public void addAnimals(Animal a){
        if(isZooFull()){
            System.out.println("the zoo is full");
        }
        for(int i = 0; i < animals.length; i++){
            if(animals[i] == null){
                animals[i] = a;
                break;
            }
        }
    }
}

