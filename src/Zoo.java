public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    public Zoo() {
        this.animals = new Animal[25];
    }
    public  Zoo(String N, String C,int nbrC){
        this.animals = new Animal[nbrC];
        this.name = N;
        this.city = C;
        this.nbrCages = nbrC;
    }
}
