package phonebook.entity;

public class Contact {
    private String name;
    private String number;

    public Contact() {

    }

    public Contact(String name, String number) throws Exception {

        this.name = name;
        this.number = number;
    }

    public void setName(String name) throws Exception {
        if (name.length()<3){
            throw new Exception("Invalid length name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
