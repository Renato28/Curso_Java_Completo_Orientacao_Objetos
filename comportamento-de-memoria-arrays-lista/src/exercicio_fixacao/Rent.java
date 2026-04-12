package exercicio_fixacao;

public class Rent {

    private String name;
    private String email;
    private int room;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public String toString(){
        return name + ", " + email;
    }
}
