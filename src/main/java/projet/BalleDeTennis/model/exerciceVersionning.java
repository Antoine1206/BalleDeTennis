package projet.BalleDeTennis.model;

import java.util.Date;

public class exerciceVersionning {


    private Long id;
    private Long age;
    private Date dateNaissance;

    public exerciceVersionning(Long id, Long age, Date dateNaissance) {
        this.id = id;
        this.age = age;
        this.dateNaissance = dateNaissance;
    }



    public void methode1 {
        System.out.println("Methode1");
    }


    public void methode2 {
        System.out.println("Methode");
    }


    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
