package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public Animal(){};
    public Animal(String f, String n, int a, boolean isM) {
        this.family = f;
        this.name = n;
        setAge(a);
        this.isMammal = isM;
    }



}
