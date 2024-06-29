package Buoi4;

public class AccessModifier {
    private String access1;
    String access2;
    protected String access3;
    public String access4;
    public static String staticString = "ITPLUS";

    public AccessModifier(String access1, String access2, String access3, String access4) {
        this.access1 = access1;
        this.access2 = access2;
        this.access3 = access3;
        this.access4 = access4;
    }

    public AccessModifier(String access1, String access2, String access3, String access4, String staticString) {
        this.access1 = access1;
        this.access2 = access2;
        this.access3 = access3;
        this.access4 = access4;
        this.staticString = staticString;
    }

}
