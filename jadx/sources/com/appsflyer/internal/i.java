package com.appsflyer.internal;

import android.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: ǃ  reason: contains not printable characters */
    private byte[] f288;

    /* renamed from: ɩ  reason: contains not printable characters */
    public String f289;

    /* renamed from: Ι  reason: contains not printable characters */
    public String f290;

    /* renamed from: ι  reason: contains not printable characters */
    public String f291;

    public i() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final byte[] m205() {
        return this.f288;
    }

    public i(String str, byte[] bArr, String str2) {
        this.f290 = str;
        this.f288 = bArr;
        this.f289 = str2;
    }

    public i(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith(C0059ao.a(11864))) {
                this.f290 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith(C0059ao.a(11865))) {
                this.f289 = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile(C0059ao.a(11866)).matcher(this.f289);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith(C0059ao.a(11867))) {
                String trim = nextLine.substring(5).trim();
                this.f288 = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            }
        }
        scanner.close();
    }
}
