package in.joshuaaust;

public class DefaultInitialization {

    private boolean defaultBool;
    private byte defaultByte;
    private short defaultShort;
    private int defaultInt;
    private long defaultLong;
    private float defaultFloat;
    private double defaultDouble;
    private char defaultChar;
    private String defaultString;

    public static void printDefaultValues() {
        DefaultInitialization initialization = new DefaultInitialization();
        System.out.println(initialization.isDefaultBool());
        System.out.println(initialization.getDefaultByte());
        System.out.println(initialization.getDefaultShort());
        System.out.println(initialization.getDefaultInt());
        System.out.println(initialization.getDefaultLong());
        System.out.println(initialization.getDefaultFloat());
        System.out.println(initialization.getDefaultDouble());
        System.out.println(initialization.getDefaultChar());
        System.out.println(initialization.getDefaultString());
    }

    public boolean isDefaultBool() {
        return defaultBool;
    }

    public byte getDefaultByte() {
        return defaultByte;
    }

    public short getDefaultShort() {
        return defaultShort;
    }

    public int getDefaultInt() {
        return defaultInt;
    }

    public long getDefaultLong() {
        return defaultLong;
    }

    public float getDefaultFloat() {
        return defaultFloat;
    }

    public double getDefaultDouble() {
        return defaultDouble;
    }

    public String getDefaultChar() {
        return "\\u" + Integer.toHexString(defaultChar);
    }

    public String getDefaultString() {
        return defaultString;
    }
}
