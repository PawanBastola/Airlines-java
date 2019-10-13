




public class TxtCompare {
    public static boolean compare(String text,String test){
        //Email
        switch (test) {
            case "E":
                return text.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            case "a":
                return text.matches("^[a-z]+$");
            case "as":
                return text.matches("^[ a-z]+$");
            case "A":
                return text.matches("^[A-Z]+$");
                case "As":
                return text.matches("^[ A-Z]+$");
            case "Aa":
                return text.matches("^[A-Za-z]+$");
            case "Aas":
                return text.matches("^[ A-Za-z]+$");
            case "N":
                return text.matches("^[0-9]+$");
            case "AaN":
                return text.matches("^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]+$");
            default:
                break;
        }
        return false;
    }
}
