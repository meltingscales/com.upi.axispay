package in.org.npci.commonlibrary;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public enum d {
    KEY_CODE_EMPTY(1001, "Your organization key is empty. Please provide a organization key."),
    KEY_CODE_INVALID(1002, "Your organization key is invalid. Please contact your system administrator or UPI support team."),
    PUBLICKEY_NOT_FOUND(1003, "Public key file not found please contact your system administrator UPI support team"),
    PARSER_MISCONFIG(1004, "XML Parser configuration error.Keys.xml may not be formatted correctly."),
    XML_PATH_ERROR(1005, "XML File is not found or cannot be read."),
    KEYS_NOT_VALID(1006, "Keys are not valid. Please contact your system administrator UPI support team"),
    UNKNOWN_ERROR(1007, "Unknown error occurred."),
    TRUST_NOT_VALID(1008, "Trust is not valid");
    
    public final int b;
    public final String c;

    d(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.b + ": " + this.c;
    }
}
