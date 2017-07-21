

/**
 * Created by cosminciocan on 17/07/2017.
 */
public abstract class Elev {
    private String nume;
    private String prenume;
    private int age;
    private float nota;

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setNume(String nume) {
        this.nume=nume;
    }
    public String getNume(){
        return nume;
    }


}

