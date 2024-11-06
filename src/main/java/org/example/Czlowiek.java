public class Czlowiek {

    private String name;
    private int age;
    private String gender;

    public Czlowiek(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String checkAge () {
        if(age >= 18) {
            return name + " jest pełnoletni.";
        }
        return  name + " nie jest pełnoletni.";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        if(name.length() >= 10){
            System.out.println("Imie nie może być dluższe niż 10 znaków!");
            return;
        }
        this.name = name;
    }

    public void setAge(int age){
        if(age <= 0){
            System.out.println("Wiek nie może być mniejszy niż 0!");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.equals("Man") && !gender.equals("Woman") && !gender.equals("Other")) {
            System.out.println("Musi być Man, Woman lub Other!");
            return;
        }
        this.gender = gender;
    }
}

