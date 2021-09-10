package model;

public class PersonDTO {

    private String nom;
    private int age;

    public PersonDTO(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
