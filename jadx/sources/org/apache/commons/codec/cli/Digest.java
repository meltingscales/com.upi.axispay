package org.apache.commons.codec.cli;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import myunmn.C0059ao;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Digest {
    private final String algorithm;
    private final String[] args;
    private final String[] inputs;

    private Digest(String[] strArr) {
        if (strArr != null) {
            if (strArr.length != 0) {
                this.args = strArr;
                this.algorithm = strArr[0];
                if (strArr.length <= 1) {
                    this.inputs = null;
                    return;
                }
                String[] strArr2 = new String[strArr.length - 1];
                this.inputs = strArr2;
                System.arraycopy(strArr, 1, strArr2, 0, strArr2.length);
                return;
            }
            throw new IllegalArgumentException(String.format(C0059ao.a(14863), Digest.class.getName()));
        }
        throw new IllegalArgumentException(C0059ao.a(14864));
    }

    public static void main(String[] strArr) throws IOException {
        new Digest(strArr).run();
    }

    private void println(String str, byte[] bArr) {
        println(str, bArr, null);
    }

    private void run() throws IOException {
        if (!this.algorithm.equalsIgnoreCase(C0059ao.a(14867)) && !this.algorithm.equals(C0059ao.a(14868))) {
            MessageDigest digest = DigestUtils.getDigest(this.algorithm, null);
            String a = C0059ao.a(14869);
            if (digest != null) {
                run(a, digest);
                return;
            } else {
                run(a, DigestUtils.getDigest(this.algorithm.toUpperCase(Locale.ROOT)));
                return;
            }
        }
        run(MessageDigestAlgorithms.values());
    }

    public String toString() {
        return String.format(C0059ao.a(14871), super.toString(), Arrays.toString(this.args));
    }

    private void println(String str, byte[] bArr, String str2) {
        String a;
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(Hex.encodeHexString(bArr));
        if (str2 != null) {
            a = C0059ao.a(14865) + str2;
        } else {
            a = C0059ao.a(14866);
        }
        sb.append(a);
        printStream.println(sb.toString());
    }

    private void run(String[] strArr) throws IOException {
        for (String str : strArr) {
            if (DigestUtils.isAvailable(str)) {
                run(str + C0059ao.a(14870), str);
            }
        }
    }

    private void run(String str, MessageDigest messageDigest) throws IOException {
        String[] strArr = this.inputs;
        if (strArr == null) {
            println(str, DigestUtils.digest(messageDigest, System.in));
            return;
        }
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.isFile()) {
                println(str, DigestUtils.digest(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    run(str, messageDigest, listFiles);
                }
            } else {
                println(str, DigestUtils.digest(messageDigest, str2.getBytes(Charset.defaultCharset())));
            }
        }
    }

    private void run(String str, MessageDigest messageDigest, File[] fileArr) throws IOException {
        for (File file : fileArr) {
            if (file.isFile()) {
                println(str, DigestUtils.digest(messageDigest, file), file.getName());
            }
        }
    }

    private void run(String str, String str2) throws IOException {
        run(str, DigestUtils.getDigest(str2));
    }
}
