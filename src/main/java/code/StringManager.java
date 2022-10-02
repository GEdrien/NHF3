package code;

public class StringManager {
    private String my_string;

    public StringManager(){
        String my_string;
    }

    public String getMy_string(){
        return this.my_string;
    }

    public void setMy_string(String my_string){
        this.my_string = my_string;
    }

    public void SayHi(){
        String[] arrayOfString = my_string.split(" ",2);
        if(arrayOfString.length == 1){
            System.out.println("Szia "+ arrayOfString[0] + "!");
        }
        else {
            switch (arrayOfString[1]) {
                case "hun":
                    System.out.println("Szia " + arrayOfString[0] + "!");
                    break;
                case "eng":
                    System.out.println("Hi " + arrayOfString[0] + "!");
                    break;
                case "ita":
                    System.out.println("Ciao " + arrayOfString[0] + "!");
                    break;
                default:
                    System.out.println("Error, unrecognized language!");
            }
        }
    }
}
