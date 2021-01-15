public class GradeException extends Exception {
    public static final char[] VALID_ALPHA_GRADES = {'A','B','C','D','F',
'I'}; // i is invalid 
    public GradeException(String mes) {
    super(mes);
    }
}
