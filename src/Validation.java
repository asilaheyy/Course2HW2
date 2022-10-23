public class Validation {
    public static String validOrDeafult(String value, String defaultValue){
        return value == null && value.isBlank() ? defaultValue : value;
    }
}
