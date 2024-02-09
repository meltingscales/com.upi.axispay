package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: ki  reason: default package */
/* loaded from: classes.dex */
public final class ki {
    public static final Set<File> a;
    public static final boolean b;

    /* compiled from: AxisPay */
    /* renamed from: ki$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int b = 4;
        public final InterfaceC0029a a;

        /* compiled from: AxisPay */
        /* renamed from: ki$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0029a {
            Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* compiled from: AxisPay */
        /* renamed from: ki$a$b */
        /* loaded from: classes.dex */
        public static class b implements InterfaceC0029a {
            public final Constructor<?> a;

            static {
                C0095z.a();
            }

            public b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // defpackage.ki.a.InterfaceC0029a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ki$a$c */
        /* loaded from: classes.dex */
        public static class c implements InterfaceC0029a {
            public final Constructor<?> a;

            static {
                C0095z.a();
            }

            public c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // defpackage.ki.a.InterfaceC0029a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.a.newInstance(file, file, dexFile);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ki$a$d */
        /* loaded from: classes.dex */
        public static class d implements InterfaceC0029a {
            public final Constructor<?> a;

            static {
                C0095z.a();
            }

            public d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // defpackage.ki.a.InterfaceC0029a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        static {
            C0095z.a();
        }

        public a() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
            InterfaceC0029a dVar;
            Class<?> cls = Class.forName(new String(a((1434525182 - 593055801) + 126)).intern());
            try {
                try {
                    dVar = new b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.a = dVar;
        }

        public static void a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            char[] cArr = {(char) (25155 ^ 25139), (char) (cArr[0] ^ 17), (char) (cArr[6] ^ 7), (char) (cArr[2] ^ 28), (char) (cArr[5] ^ '%'), (char) (cArr[6] ^ 26), (char) (cArr[0] ^ 3), (char) (cArr[0] ^ 4)};
            Object obj = ki.g(classLoader, new String(cArr).intern()).get(classLoader);
            Object[] b2 = new a().b(list);
            try {
                char[] cArr2 = {(char) (cArr2[6] ^ '\t'), (char) (cArr2[0] ^ 1), (char) (cArr2[1] ^ 29), (char) (cArr2[9] ^ '1'), (char) (cArr2[2] ^ 20), (char) (cArr2[2] ^ 29), (char) (417 ^ 460), (char) (cArr2[8] ^ 11), (char) (cArr2[0] ^ '\n'), (char) (cArr2[0] ^ 16), (char) (cArr2[9] ^ 7)};
                ki.f(obj, new String(cArr2).intern(), b2);
            } catch (NoSuchFieldException e) {
                char[] cArr3 = {(char) (cArr3[1] ^ '8'), (char) ((-18777) ^ (-18734)), (char) (cArr3[3] ^ 24), (char) (cArr3[1] ^ 1), (char) (cArr3[1] ^ 28), (char) (cArr3[1] ^ '1'), (char) (cArr3[5] ^ '!'), (char) (cArr3[5] ^ '<')};
                String intern = new String(cArr3).intern();
                char[] cArr4 = {(char) (cArr4[1] ^ '\''), (char) (cArr4[34] ^ 21), (char) (cArr4[44] ^ 25), (char) (cArr4[25] ^ 1), (char) (cArr4[7] ^ 3), (char) (cArr4[26] ^ 1), (char) (cArr4[29] ^ 'S'), (char) (cArr4[31] ^ 'F'), (char) (cArr4[23] ^ 5), (char) (cArr4[54] ^ 26), (char) (cArr4[39] ^ '\r'), (char) (cArr4[23] ^ 'L'), (char) (cArr4[39] ^ 15), (char) (cArr4[54] ^ 29), (char) (cArr4[22] ^ ' '), (char) (cArr4[44] ^ 28), (char) (cArr4[44] ^ 20), (char) (cArr4[35] ^ 'E'), (char) (cArr4[55] ^ 'T'), (char) (cArr4[28] ^ 16), (char) (cArr4[46] ^ 17), (char) (cArr4[7] ^ 30), (char) (cArr4[39] ^ ','), (char) (cArr4[29] ^ 31), (char) (cArr4[20] ^ 0), (char) (cArr4[6] ^ 'M'), (char) (cArr4[1] ^ 4), (char) (cArr4[30] ^ 'I'), (char) (cArr4[55] ^ 7), (char) (cArr4[39] ^ 26), (char) (cArr4[55] ^ 'T'), (char) (cArr4[36] ^ 'M'), (char) (cArr4[5] ^ 5), (char) (cArr4[44] ^ 4), (char) (cArr4[53] ^ 26), (char) (cArr4[22] ^ ' '), (char) (cArr4[39] ^ 4), (char) (cArr4[9] ^ 30), (char) (cArr4[12] ^ 18), (char) (cArr4[40] ^ 7), (char) ((-1414) ^ (-1516)), (char) (cArr4[53] ^ '\t'), (char) (cArr4[31] ^ 0), (char) (cArr4[52] ^ 'B'), (char) (cArr4[1] ^ 17), (char) (cArr4[4] ^ 4), (char) (cArr4[56] ^ 'S'), (char) (cArr4[43] ^ 'O'), (char) (cArr4[44] ^ '5'), (char) (cArr4[50] ^ '\t'), (char) (cArr4[40] ^ 11), (char) (cArr4[49] ^ 1), (char) (cArr4[39] ^ '\f'), (char) (cArr4[40] ^ 0), (char) (cArr4[42] ^ 'T'), (char) (cArr4[34] ^ 7), (char) (cArr4[54] ^ 'S')};
                Log.w(intern, new String(cArr4).intern(), e);
                char[] cArr5 = {(char) (cArr5[5] ^ 28), (char) (cArr5[2] ^ 21), (char) (cArr5[9] ^ 26), (char) (cArr5[2] ^ 28), (char) (cArr5[9] ^ '+'), (char) (cArr5[2] ^ 24), (char) (cArr5[0] ^ 21), (char) (cArr5[11] ^ 30), (char) (cArr5[2] ^ 17), (char) (5496 ^ 5398), (char) (cArr5[5] ^ 24), (char) (cArr5[5] ^ 31)};
                ki.f(obj, new String(cArr5).intern(), b2);
            }
        }

        private static char[] a(int i) {
            char[] cArr = {(char) (cArr[27] ^ '\b'), (char) (cArr[22] ^ '\b'), (char) (cArr[18] ^ '\r'), (char) (cArr[18] ^ 23), (char) (cArr[30] ^ '\f'), (char) (cArr[12] ^ 6), (char) (cArr[21] ^ 'b'), (char) (cArr[15] ^ 22), (char) (cArr[23] ^ '\n'), (char) (cArr[11] ^ 22), (char) (cArr[7] ^ 7), (char) (cArr[7] ^ 22), (char) (cArr[7] ^ 30), (char) (cArr[12] ^ 'C'), (char) (cArr[15] ^ '!'), (char) ((-12762) ^ i), (char) (cArr[2] ^ 20), (char) (cArr[26] ^ 21), (char) (cArr[10] ^ 21), (char) (cArr[24] ^ 0), (char) (cArr[5] ^ 3), (char) (cArr[5] ^ '\''), (char) (cArr[7] ^ 26), (char) (cArr[32] ^ 7), (char) (cArr[5] ^ 31), (char) (cArr[6] ^ '\n'), (char) (cArr[13] ^ 'k'), (char) (cArr[15] ^ '\t'), (char) (cArr[18] ^ 4), (char) (cArr[18] ^ '\f'), (char) (cArr[12] ^ '\b'), (char) (cArr[9] ^ 29), (char) (cArr[28] ^ 17)};
            return cArr;
        }

        public static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(name.substring(0, name.length() - b));
            char[] cArr = {(char) (cArr[1] ^ 'J'), (char) (27330 ^ 27302), (char) (cArr[1] ^ 1), (char) (cArr[2] ^ 29)};
            sb.append(new String(cArr).intern());
            return new File(parentFile, sb.toString()).getPath();
        }

        public final Object[] b(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                objArr[i] = this.a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ki$b */
    /* loaded from: classes.dex */
    public static final class b {
        static {
            C0095z.a();
        }

        public static void a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            char[] cArr = {(char) (cArr[7] ^ 4), (char) (cArr[6] ^ 18), (char) (cArr[1] ^ 21), (char) (cArr[0] ^ 24), (char) (cArr[1] ^ '-'), (char) (cArr[3] ^ 1), (char) (5787 ^ 5864), (char) (cArr[6] ^ 7)};
            Object obj = ki.g(classLoader, new String(cArr).intern()).get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] b = b(obj, new ArrayList(list), file, arrayList);
            char[] cArr2 = {(char) (cArr2[1] ^ 1), (char) (cArr2[10] ^ 22), (char) (cArr2[4] ^ 20), (char) (cArr2[7] ^ ' '), (char) (cArr2[9] ^ 24), (char) (264 ^ 365), (char) (cArr2[5] ^ '\b'), (char) (cArr2[10] ^ 22), (char) (cArr2[10] ^ 29), (char) (cArr2[1] ^ 17), (char) (cArr2[5] ^ 22)};
            ki.f(obj, new String(cArr2).intern(), b);
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    char[] cArr3 = {(char) (cArr3[7] ^ '5'), (char) (cArr3[2] ^ 25), (char) ((-16277) ^ (-16377)), (char) (cArr3[2] ^ 24), (char) (cArr3[7] ^ 17), (char) (cArr3[0] ^ '\t'), (char) (cArr3[4] ^ '\f'), (char) (cArr3[3] ^ '\f')};
                    String intern = new String(cArr3).intern();
                    char[] cArr4 = {(char) (cArr4[6] ^ ','), (char) (cArr4[15] ^ 19), (char) (cArr4[22] ^ 6), (char) (cArr4[6] ^ '\f'), (char) (cArr4[12] ^ 'P'), (char) (cArr4[15] ^ 31), (char) (cArr4[2] ^ '\n'), (char) (cArr4[15] ^ 4), (char) (cArr4[14] ^ 15), (char) (cArr4[2] ^ 'C'), (char) (cArr4[20] ^ ','), (char) (cArr4[3] ^ 11), (char) (cArr4[15] ^ 'K'), (char) (cArr4[14] ^ '\f'), (char) (cArr4[5] ^ 21), (char) (cArr4[22] ^ 14), (char) (cArr4[12] ^ 'E'), (char) (cArr4[7] ^ '+'), (char) (cArr4[25] ^ 11), (char) (cArr4[11] ^ 22), (char) (cArr4[2] ^ '&'), (char) (cArr4[3] ^ '\t'), (char) ((-7536) ^ (-7435)), (char) (cArr4[18] ^ '\b'), (char) (cArr4[5] ^ 17), (char) (cArr4[2] ^ '\r'), (char) (cArr4[6] ^ 29)};
                    Log.w(intern, new String(cArr4).intern(), (IOException) it.next());
                }
                char[] cArr5 = {(char) (cArr5[2] ^ 28), (char) (cArr5[2] ^ 29), (char) ((-19899) ^ (-19907)), (char) (cArr5[11] ^ 22), (char) (cArr5[22] ^ 20), (char) (cArr5[21] ^ ' '), (char) (cArr5[25] ^ 29), (char) (cArr5[1] ^ 0), (char) (cArr5[2] ^ 22), (char) (cArr5[25] ^ 4), (char) (cArr5[24] ^ 22), (char) (cArr5[2] ^ '+'), (char) (cArr5[10] ^ 6), (char) (cArr5[10] ^ 3), (char) (cArr5[30] ^ 3), (char) (cArr5[5] ^ 23), (char) (cArr5[14] ^ 21), (char) (cArr5[2] ^ 11), (char) (cArr5[17] ^ 0), (char) (cArr5[13] ^ 21), (char) (cArr5[17] ^ 23), (char) (cArr5[17] ^ '6'), (char) (cArr5[11] ^ '+'), (char) (cArr5[8] ^ '\r'), (char) (cArr5[8] ^ 11), (char) (cArr5[2] ^ '\b'), (char) (cArr5[17] ^ 7), (char) (cArr5[8] ^ 7), (char) (cArr5[4] ^ 3), (char) (cArr5[17] ^ 29), (char) (cArr5[8] ^ 29)};
                Field g = ki.g(obj, new String(cArr5).intern());
                IOException[] iOExceptionArr2 = (IOException[]) g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                g.set(obj, iOExceptionArr);
                char[] cArr6 = {(char) (cArr6[22] ^ '('), (char) (cArr6[33] ^ 'A'), (char) (cArr6[33] ^ '!'), (char) (cArr6[29] ^ 'L'), (char) (cArr6[29] ^ '\t'), (char) (cArr6[32] ^ 29), (char) (cArr6[7] ^ 6), (char) (cArr6[29] ^ '\t'), (char) (cArr6[10] ^ 25), (char) (cArr6[29] ^ 24), (char) (cArr6[33] ^ 7), (char) (cArr6[28] ^ '*'), (char) (cArr6[29] ^ 2), (char) (cArr6[21] ^ 'M'), (char) (cArr6[33] ^ '\n'), (char) (cArr6[7] ^ 16), (char) (cArr6[12] ^ 28), (char) (cArr6[32] ^ '\f'), (char) (cArr6[27] ^ 22), (char) (cArr6[29] ^ 11), (char) (cArr6[26] ^ 'E'), (char) (cArr6[12] ^ 3), (char) (cArr6[33] ^ 15), (char) (cArr6[28] ^ '.'), (char) (cArr6[4] ^ 0), (char) (cArr6[12] ^ '*'), (char) (cArr6[32] ^ 0), (char) (cArr6[9] ^ '\f'), (char) (cArr6[12] ^ '+'), (char) (9164 ^ 9120), (char) (cArr6[21] ^ '\b'), (char) (cArr6[1] ^ 'B'), (char) (cArr6[9] ^ 17), (char) (cArr6[12] ^ 0), (char) (cArr6[28] ^ '1')};
                IOException iOException = new IOException(new String(cArr6).intern());
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        public static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            char[] cArr = {(char) (cArr[14] ^ 30), (char) (cArr[4] ^ '%'), (char) (cArr[7] ^ '.'), (char) (cArr[14] ^ 22), (char) ((-29222) ^ (-29282)), (char) (cArr[9] ^ 0), (char) (cArr[12] ^ 22), (char) (cArr[12] ^ '+'), (char) (cArr[2] ^ 7), (char) (cArr[12] ^ 11), (char) (cArr[3] ^ '\b'), (char) (cArr[12] ^ 11), (char) (cArr[4] ^ '*'), (char) (cArr[11] ^ 17), (char) (cArr[4] ^ '7')};
            return (Object[]) ki.h(obj, new String(cArr).intern(), ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ki$c */
    /* loaded from: classes.dex */
    public static final class c {
        static {
            C0095z.a();
        }

        public static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            char[] cArr = {(char) (cArr[3] ^ 24), (char) (cArr[3] ^ '\t'), (char) (cArr[3] ^ 28), (char) (12127 ^ 12087)};
            Field g = ki.g(classLoader, new String(cArr).intern());
            StringBuilder sb = new StringBuilder((String) g.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                char[] cArr2 = {(char) (cArr2[2] ^ 'K'), (char) (10050 ^ 10022), (char) (cArr2[1] ^ 1), (char) (cArr2[1] ^ 28)};
                sb2.append(new String(cArr2).intern());
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            g.set(classLoader, sb.toString());
            char[] cArr3 = {(char) (cArr3[5] ^ 30), (char) (cArr3[3] ^ '$'), (char) (cArr3[3] ^ 21), (char) (22472 ^ 22460), (char) (cArr3[3] ^ 28), (char) (cArr3[1] ^ '#')};
            ki.f(classLoader, new String(cArr3).intern(), strArr);
            char[] cArr4 = {(char) (cArr4[3] ^ 1), (char) (cArr4[2] ^ '/'), (char) (cArr4[5] ^ 26), (char) (26065 ^ 26045), (char) (cArr4[3] ^ '\t'), (char) (cArr4[0] ^ 30)};
            ki.f(classLoader, new String(cArr4).intern(), fileArr);
            char[] cArr5 = {(char) (cArr5[2] ^ 4), (char) (cArr5[2] ^ '3'), (char) ((-5716) ^ (-5691)), (char) (cArr5[4] ^ 3), (char) (cArr5[0] ^ 30)};
            ki.f(classLoader, new String(cArr5).intern(), zipFileArr);
            char[] cArr6 = {(char) ((-5922) ^ (-5965)), (char) (cArr6[0] ^ ')'), (char) (cArr6[0] ^ '\b'), (char) (cArr6[0] ^ 21), (char) (cArr6[1] ^ '7')};
            ki.f(classLoader, new String(cArr6).intern(), dexFileArr);
        }
    }

    static {
        C0095z.a();
        a = new HashSet();
        b = n(System.getProperty(new String(a(612706920 + 1039277428 + 66)).intern()));
    }

    private static char[] a(int i) {
        char[] cArr = {(char) (cArr[7] ^ 'D'), (char) (18559 ^ i), (char) (cArr[7] ^ 'X'), (char) (cArr[4] ^ 'O'), (char) (cArr[1] ^ 'O'), (char) (cArr[0] ^ 28), (char) (cArr[14] ^ 3), (char) (cArr[1] ^ 'O'), (char) (cArr[7] ^ 'X'), (char) (cArr[1] ^ 4), (char) (cArr[4] ^ '\\'), (char) (cArr[2] ^ 5), (char) (cArr[4] ^ 'G'), (char) (cArr[4] ^ 'A'), (char) (cArr[0] ^ 4)};
        return cArr;
    }

    private static char[] b(int i) {
        char[] cArr = {(char) (cArr[10] ^ 24), (char) (24834 ^ i), (char) (cArr[1] ^ 23), (char) (cArr[13] ^ 14), (char) (cArr[5] ^ 'X'), (char) (cArr[7] ^ 'X'), (char) (cArr[5] ^ 27), (char) (cArr[1] ^ 'O'), (char) (cArr[1] ^ 23), (char) (cArr[12] ^ '\f'), (char) (cArr[13] ^ 29), (char) (cArr[13] ^ 28), (char) (cArr[13] ^ 6), (char) (cArr[1] ^ 14), (char) (cArr[3] ^ 15)};
        return cArr;
    }

    public static void d(Context context) throws Exception {
        File filesDir = context.getFilesDir();
        char[] cArr = {(char) (cArr[2] ^ 16), (char) (cArr[4] ^ 11), (char) (cArr[1] ^ 6), (char) (cArr[4] ^ 1), (char) (cArr[9] ^ 'C'), (char) (cArr[1] ^ 1), (char) (cArr[12] ^ 25), (char) (cArr[11] ^ 23), (char) (cArr[12] ^ 1), (char) (13385 ^ 13412), (char) (cArr[0] ^ 23), (char) (cArr[8] ^ 28), (char) (cArr[4] ^ 22), (char) (cArr[3] ^ '\n'), (char) (cArr[6] ^ 18)};
        File file = new File(filesDir, new String(cArr).intern());
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            char[] cArr2 = {(char) (cArr2[13] ^ '0'), (char) (cArr2[14] ^ '\t'), (char) (cArr2[23] ^ 1), (char) (cArr2[28] ^ '\b'), (char) (cArr2[17] ^ 28), (char) (cArr2[16] ^ 6), (char) (cArr2[16] ^ 1), (char) (cArr2[31] ^ 'O'), (char) (cArr2[11] ^ 'D'), (char) (cArr2[15] ^ '\f'), (char) (cArr2[15] ^ 15), (char) (cArr2[28] ^ '\r'), (char) (cArr2[15] ^ 'C'), (char) (cArr2[16] ^ 28), (char) (cArr2[28] ^ '\f'), (char) (cArr2[14] ^ 6), (char) (cArr2[21] ^ 22), (char) (cArr2[15] ^ '\r'), (char) (cArr2[16] ^ 11), (char) (cArr2[16] ^ 14), (char) (cArr2[25] ^ '\n'), (char) (cArr2[14] ^ 28), (char) (cArr2[7] ^ 'G'), (char) (cArr2[15] ^ 7), (char) (cArr2[25] ^ 29), (char) (cArr2[31] ^ 'P'), (char) (cArr2[18] ^ 'D'), (char) (cArr2[31] ^ 'L'), (char) ((-19392) ^ (-19415)), (char) (cArr2[7] ^ 21), (char) (cArr2[12] ^ 0), (char) (cArr2[9] ^ 'G')};
            sb.append(new String(cArr2).intern());
            sb.append(file.getPath());
            char[] cArr3 = {(char) (cArr3[1] ^ 7), (char) ((-15491) ^ (-15533))};
            String intern = new String(cArr3).intern();
            sb.append(intern);
            String sb2 = sb.toString();
            char[] cArr4 = {(char) (cArr4[3] ^ '9'), (char) (cArr4[3] ^ 1), (char) ((-23509) ^ (-23481)), (char) (cArr4[2] ^ 24), (char) (cArr4[5] ^ '-'), (char) (cArr4[2] ^ '('), (char) (cArr4[2] ^ '\t'), (char) (cArr4[2] ^ 20)};
            String intern2 = new String(cArr4).intern();
            Log.i(intern2, sb2);
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb3 = new StringBuilder();
                char[] cArr5 = {(char) (cArr5[20] ^ '\"'), (char) (cArr5[10] ^ '\r'), (char) (cArr5[5] ^ '\r'), (char) (cArr5[32] ^ 'L'), (char) (cArr5[40] ^ 'E'), (char) (cArr5[40] ^ 'D'), (char) (cArr5[18] ^ 'O'), (char) (cArr5[32] ^ 'T'), (char) (cArr5[20] ^ 11), (char) (cArr5[11] ^ 'I'), (char) ((-5457) ^ (-5437)), (char) (cArr5[10] ^ 5), (char) (cArr5[9] ^ 'S'), (char) (cArr5[20] ^ 16), (char) (cArr5[23] ^ 'Y'), (char) (cArr5[22] ^ 1), (char) (cArr5[38] ^ 11), (char) (cArr5[10] ^ 15), (char) (cArr5[10] ^ 3), (char) (cArr5[12] ^ 29), (char) (cArr5[15] ^ 23), (char) (cArr5[0] ^ '\''), (char) (cArr5[10] ^ 30), (char) (cArr5[32] ^ 'Y'), (char) (cArr5[22] ^ 'R'), (char) (cArr5[12] ^ 23), (char) (cArr5[2] ^ '\f'), (char) (cArr5[5] ^ 28), (char) (cArr5[7] ^ 'T'), (char) (cArr5[11] ^ '\r'), (char) (cArr5[41] ^ 'A'), (char) (cArr5[11] ^ 27), (char) (cArr5[5] ^ 'D'), (char) (cArr5[16] ^ 6), (char) (cArr5[10] ^ 3), (char) (cArr5[38] ^ 0), (char) (cArr5[9] ^ 'T'), (char) (cArr5[23] ^ 28), (char) (cArr5[28] ^ 'N'), (char) (cArr5[31] ^ 6), (char) (cArr5[17] ^ 'C'), (char) (cArr5[18] ^ 'G')};
                sb3.append(new String(cArr5).intern());
                sb3.append(file.getPath());
                sb3.append(intern);
                Log.w(intern2, sb3.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb4 = new StringBuilder();
                char[] cArr6 = {(char) (cArr6[12] ^ '8'), (char) (cArr6[21] ^ 20), (char) (cArr6[11] ^ 28), (char) (cArr6[13] ^ '\f'), (char) (cArr6[13] ^ 11), (char) (cArr6[25] ^ 'G'), (char) (cArr6[1] ^ 'R'), (char) (cArr6[25] ^ 'T'), (char) (cArr6[21] ^ '\t'), (char) (cArr6[13] ^ 'E'), (char) (cArr6[25] ^ 'D'), (char) (cArr6[21] ^ 3), (char) (cArr6[9] ^ 'L'), (char) ((-26628) ^ (-26727)), (char) (cArr6[17] ^ 27), (char) (cArr6[3] ^ '\f'), (char) (cArr6[6] ^ 0), (char) (cArr6[21] ^ '\t'), (char) (cArr6[11] ^ '\t'), (char) (cArr6[9] ^ 'D'), (char) (cArr6[25] ^ 0), (char) (cArr6[13] ^ 3), (char) (cArr6[18] ^ 5), (char) (cArr6[9] ^ 'L'), (char) (cArr6[25] ^ 'E'), (char) (cArr6[9] ^ 0)};
                sb4.append(new String(cArr6).intern());
                sb4.append(file2.getPath());
                char[] cArr7 = {(char) (cArr7[2] ^ 'F'), (char) (cArr7[2] ^ '\t'), (char) (cArr7[8] ^ 'F'), (char) (6031 ^ 6063), (char) (cArr7[6] ^ '\t'), (char) (cArr7[7] ^ '\f'), (char) (cArr7[3] ^ 'Z'), (char) (cArr7[3] ^ 'E'), (char) (cArr7[3] ^ 0)};
                sb4.append(new String(cArr7).intern());
                sb4.append(file2.length());
                Log.i(intern2, sb4.toString());
                if (!file2.delete()) {
                    StringBuilder sb5 = new StringBuilder();
                    char[] cArr8 = {(char) (cArr8[6] ^ 'f'), (char) (cArr8[6] ^ 'A'), (char) (cArr8[17] ^ 6), (char) (cArr8[5] ^ '\b'), (char) (cArr8[5] ^ 1), (char) (cArr8[6] ^ 'D'), (char) (29565 ^ 29533), (char) (cArr8[17] ^ 27), (char) (cArr8[23] ^ 3), (char) (cArr8[17] ^ 'O'), (char) (cArr8[17] ^ 11), (char) (cArr8[0] ^ '#'), (char) (cArr8[5] ^ '\b'), (char) (cArr8[6] ^ 'E'), (char) (cArr8[0] ^ '2'), (char) (cArr8[0] ^ '#'), (char) (cArr8[3] ^ 'L'), (char) (cArr8[0] ^ ')'), (char) (cArr8[7] ^ 24), (char) (cArr8[23] ^ '\b'), (char) (cArr8[4] ^ 'E'), (char) (cArr8[7] ^ 18), (char) (cArr8[4] ^ '\f'), (char) (cArr8[5] ^ '\b'), (char) (cArr8[17] ^ '\n'), (char) (cArr8[22] ^ 'I')};
                    sb5.append(new String(cArr8).intern());
                    sb5.append(file2.getPath());
                    Log.w(intern2, sb5.toString());
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    char[] cArr9 = {(char) (cArr9[16] ^ 'd'), (char) (cArr9[13] ^ '\f'), (char) (cArr9[1] ^ '\t'), (char) (cArr9[16] ^ 'E'), (char) (cArr9[1] ^ 17), (char) (cArr9[13] ^ '\f'), (char) (cArr9[8] ^ 11), (char) (cArr9[10] ^ 'D'), (char) (cArr9[1] ^ '\n'), (char) (cArr9[13] ^ 5), (char) (cArr9[16] ^ 'D'), (char) (cArr9[1] ^ 'E'), (char) (cArr9[16] ^ 'F'), (char) ((-20601) ^ (-20498)), (char) (cArr9[5] ^ '\t'), (char) (cArr9[13] ^ '\f'), (char) (cArr9[1] ^ 'E')};
                    sb6.append(new String(cArr9).intern());
                    sb6.append(file2.getPath());
                    Log.i(intern2, sb6.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder sb7 = new StringBuilder();
                char[] cArr10 = {(char) (cArr10[20] ^ ')'), (char) (cArr10[20] ^ 14), (char) (cArr10[13] ^ '\f'), (char) (cArr10[7] ^ 24), (char) (cArr10[13] ^ 0), (char) (cArr10[32] ^ '\r'), (char) (cArr10[20] ^ 'O'), (char) (cArr10[2] ^ 29), (char) (cArr10[20] ^ 0), (char) (cArr10[8] ^ 'O'), (char) (cArr10[5] ^ 0), (char) (cArr10[33] ^ 23), (char) (10386 ^ 10494), (char) (cArr10[12] ^ '\t'), (char) (cArr10[17] ^ 7), (char) (cArr10[12] ^ '\t'), (char) (cArr10[31] ^ 'D'), (char) (cArr10[29] ^ 11), (char) (cArr10[17] ^ 22), (char) (cArr10[9] ^ 'C'), (char) (cArr10[13] ^ '\n'), (char) (cArr10[3] ^ 2), (char) (cArr10[5] ^ 0), (char) (cArr10[4] ^ 4), (char) (cArr10[20] ^ 29), (char) (cArr10[2] ^ 16), (char) (cArr10[10] ^ 'D'), (char) (cArr10[4] ^ 1), (char) (cArr10[31] ^ 1), (char) (cArr10[13] ^ 29), (char) (cArr10[13] ^ 'E'), (char) (cArr10[15] ^ 1), (char) (cArr10[7] ^ 29), (char) (cArr10[12] ^ 30), (char) (cArr10[24] ^ 'R')};
                sb7.append(new String(cArr10).intern());
                sb7.append(file.getPath());
                Log.w(intern2, sb7.toString());
                return;
            }
            StringBuilder sb8 = new StringBuilder();
            char[] cArr11 = {(char) (cArr11[23] ^ '!'), (char) (cArr11[11] ^ 'E'), (char) (cArr11[11] ^ 'L'), (char) (cArr11[4] ^ 17), (char) (cArr11[11] ^ 'T'), (char) (cArr11[1] ^ 0), (char) (cArr11[10] ^ 0), (char) (cArr11[22] ^ 'D'), (char) (cArr11[14] ^ '\f'), (char) (cArr11[29] ^ 'L'), (char) (cArr11[11] ^ 'D'), (char) (cArr11[14] ^ 'C'), (char) (cArr11[19] ^ 1), (char) (cArr11[8] ^ '\n'), (char) ((-25849) ^ (-25756)), (char) (cArr11[21] ^ 'O'), (char) (cArr11[19] ^ 28), (char) (cArr11[23] ^ 1), (char) (cArr11[14] ^ 2), (char) (cArr11[11] ^ 'R'), (char) (cArr11[22] ^ 29), (char) (cArr11[22] ^ 'D'), (char) (cArr11[11] ^ 'D'), (char) (cArr11[18] ^ 4), (char) (cArr11[29] ^ 'X'), (char) (cArr11[5] ^ 'E'), (char) (cArr11[18] ^ 5), (char) (cArr11[17] ^ '\r'), (char) (cArr11[6] ^ 22), (char) (cArr11[15] ^ 'O')};
            sb8.append(new String(cArr11).intern());
            sb8.append(file.getPath());
            Log.i(intern2, sb8.toString());
        }
    }

    public static void e(Context context, File file, File file2, String str, String str2, boolean z) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        Set<File> set = a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i = Build.VERSION.SDK_INT;
            if (i > 20) {
                char[] cArr = {(char) (cArr[3] ^ '9'), (char) (cArr[3] ^ 1), (char) (cArr[1] ^ 25), (char) (cArr[5] ^ '0'), (char) (cArr[2] ^ 5), (char) ((-7219) ^ (-7287)), (char) (cArr[7] ^ 29), (char) (cArr[5] ^ '<')};
                String intern = new String(cArr).intern();
                StringBuilder sb = new StringBuilder();
                char[] cArr2 = {(char) (cArr2[22] ^ '9'), (char) (cArr2[15] ^ 'U'), (char) (cArr2[5] ^ '('), (char) (cArr2[6] ^ 17), (char) (18971 ^ 19058), (char) (cArr2[35] ^ '-'), (char) (cArr2[4] ^ '\f'), (char) (cArr2[49] ^ 'X'), (char) (cArr2[26] ^ 0), (char) (cArr2[28] ^ 6), (char) (cArr2[15] ^ 'S'), (char) (cArr2[23] ^ 'E'), (char) (cArr2[42] ^ 24), (char) (cArr2[47] ^ 0), (char) (cArr2[30] ^ 3), (char) (cArr2[11] ^ 0), (char) (cArr2[0] ^ '*'), (char) (cArr2[38] ^ '&'), (char) (cArr2[41] ^ 'A'), (char) (cArr2[0] ^ '?'), (char) (cArr2[25] ^ 5), (char) (cArr2[8] ^ 'N'), (char) (cArr2[42] ^ 2), (char) (cArr2[5] ^ '!'), (char) (cArr2[46] ^ '\f'), (char) (cArr2[21] ^ '\n'), (char) (cArr2[23] ^ 'E'), (char) (cArr2[19] ^ 6), (char) (cArr2[38] ^ '<'), (char) (cArr2[0] ^ 'm'), (char) (cArr2[23] ^ 18), (char) (cArr2[22] ^ 27), (char) (cArr2[0] ^ '?'), (char) (cArr2[46] ^ 2), (char) (cArr2[27] ^ 'T'), (char) (cArr2[4] ^ 0), (char) (cArr2[19] ^ 28), (char) (cArr2[0] ^ 'm'), (char) (cArr2[22] ^ '\''), (char) (cArr2[49] ^ 'd'), (char) (cArr2[18] ^ '*'), (char) (cArr2[48] ^ 'N'), (char) (cArr2[4] ^ 31), (char) (cArr2[38] ^ '6'), (char) (cArr2[31] ^ 29), (char) (cArr2[19] ^ 1), (char) (cArr2[22] ^ 29), (char) (cArr2[0] ^ '\"'), (char) (cArr2[46] ^ 7), (char) (cArr2[3] ^ 'T')};
                sb.append(new String(cArr2).intern());
                sb.append(i);
                char[] cArr3 = {(char) (cArr3[9] ^ 'I'), (char) (cArr3[15] ^ 'I'), (char) (cArr3[20] ^ 's'), (char) (cArr3[10] ^ '-'), (char) (cArr3[24] ^ '%'), (char) (cArr3[19] ^ 'R'), (char) (cArr3[7] ^ 19), (char) (cArr3[25] ^ 'E'), (char) (cArr3[3] ^ '6'), (char) (cArr3[16] ^ 20), (char) (cArr3[18] ^ '\f'), (char) (cArr3[18] ^ '\n'), (char) (cArr3[11] ^ 1), (char) (cArr3[10] ^ 'I'), (char) (cArr3[20] ^ 'H'), (char) (cArr3[3] ^ '-'), (char) (cArr3[25] ^ 'G'), (char) (cArr3[18] ^ '\r'), (char) (cArr3[25] ^ 'E'), (char) (cArr3[18] ^ 23), (char) ((-7769) ^ (-7801)), (char) (cArr3[7] ^ 17), (char) (cArr3[19] ^ 26), (char) (cArr3[0] ^ '['), (char) (cArr3[25] ^ 'N'), (char) (cArr3[20] ^ 0)};
                sb.append(new String(cArr3).intern());
                sb.append(20);
                char[] cArr4 = {(char) (cArr4[17] ^ 0), (char) (cArr4[5] ^ 31), (char) (cArr4[13] ^ 11), (char) (cArr4[14] ^ 4), (char) (cArr4[13] ^ 22), (char) (cArr4[3] ^ 3), (char) (cArr4[14] ^ 15), (char) (cArr4[1] ^ 'S'), (char) (cArr4[14] ^ '\t'), (char) (cArr4[5] ^ '\t'), (char) (cArr4[3] ^ 'O'), (char) (cArr4[6] ^ 6), (char) (cArr4[8] ^ 3), (char) (cArr4[12] ^ 2), (char) ((-29925) ^ (-29840)), (char) (cArr4[8] ^ 7), (char) (cArr4[12] ^ 5), (char) (cArr4[14] ^ 'K'), (char) (cArr4[12] ^ 3), (char) (cArr4[10] ^ 'Y'), (char) (cArr4[17] ^ 0)};
                sb.append(new String(cArr4).intern());
                char[] cArr5 = {(char) (cArr5[23] ^ 7), (char) (cArr5[39] ^ '\f'), (char) (cArr5[9] ^ 7), (char) (cArr5[20] ^ 26), (char) (cArr5[12] ^ 'I'), (char) (cArr5[0] ^ 31), (char) (cArr5[9] ^ '\f'), (char) (cArr5[22] ^ 'M'), (char) (cArr5[48] ^ 4), (char) (cArr5[7] ^ 'I'), (char) (cArr5[24] ^ 24), (char) (cArr5[0] ^ 26), (char) (cArr5[23] ^ 'U'), (char) (cArr5[39] ^ 27), (char) (cArr5[0] ^ 7), (char) (cArr5[43] ^ 29), (char) (cArr5[43] ^ 24), (char) (cArr5[53] ^ 'T'), (char) (cArr5[48] ^ '^'), (char) (cArr5[50] ^ 7), (char) (cArr5[22] ^ 3), (char) (cArr5[12] ^ 0), (char) (cArr5[42] ^ 24), (char) (cArr5[48] ^ 6), (char) (cArr5[48] ^ 31), (char) (cArr5[7] ^ 'T'), (char) (cArr5[1] ^ 28), (char) (cArr5[0] ^ 22), (char) (cArr5[12] ^ 'E'), (char) (cArr5[25] ^ '\f'), (char) (cArr5[1] ^ 'U'), (char) (cArr5[15] ^ '\n'), (char) (cArr5[12] ^ 'A'), (char) (cArr5[44] ^ 'P'), (char) (cArr5[4] ^ '\b'), (char) (cArr5[7] ^ 'B'), (char) (cArr5[22] ^ 4), (char) (cArr5[53] ^ 'L'), (char) (cArr5[22] ^ 25), (char) (cArr5[7] ^ 'Y'), (char) (cArr5[11] ^ 'H'), (char) (cArr5[7] ^ 'B'), (char) (29812 ^ 29697), (char) (cArr5[22] ^ 25), (char) (cArr5[4] ^ 'I'), (char) (cArr5[10] ^ 29), (char) (cArr5[13] ^ 22), (char) (cArr5[22] ^ 'J'), (char) (cArr5[43] ^ 7), (char) (cArr5[43] ^ 'T'), (char) (cArr5[48] ^ 29), (char) (cArr5[47] ^ 'H'), (char) (cArr5[33] ^ 4), (char) (cArr5[35] ^ 'B'), (char) (cArr5[15] ^ 29), (char) (cArr5[4] ^ 1), (char) (cArr5[43] ^ 17), (char) (cArr5[51] ^ 'O')};
                sb.append(new String(cArr5).intern());
                char[] cArr6 = {(char) (cArr6[21] ^ 17), (char) (cArr6[22] ^ 18), (char) (cArr6[21] ^ 1), (char) (cArr6[5] ^ '\r'), (char) (cArr6[12] ^ 'A'), (char) (cArr6[21] ^ 26), (char) (cArr6[27] ^ 'G'), (char) (cArr6[9] ^ 'H'), (char) (cArr6[23] ^ '\f'), (char) (cArr6[16] ^ 'L'), (char) (cArr6[13] ^ 'V'), (char) (cArr6[2] ^ 25), (char) (cArr6[17] ^ '\f'), (char) (cArr6[16] ^ 0), (char) (cArr6[8] ^ 4), (char) (cArr6[8] ^ 'K'), (char) (cArr6[21] ^ 4), (char) (cArr6[21] ^ 31), (char) (cArr6[4] ^ 14), (char) (cArr6[16] ^ 0), (char) (cArr6[23] ^ '\f'), (char) ((-15302) ^ (-15288)), (char) (cArr6[4] ^ 'S'), (char) (cArr6[9] ^ 'S'), (char) (cArr6[7] ^ 29), (char) (cArr6[2] ^ 29), (char) (cArr6[4] ^ 29), (char) (cArr6[7] ^ 'P')};
                sb.append(new String(cArr6).intern());
                sb.append(System.getProperty(new String(b((2031604797 ^ 1084142912) - 26)).intern()));
                sb.append(new String(new char[]{(char) (15528 ^ 15498)}).intern());
                Log.w(intern, sb.toString());
            }
            ClassLoader j = j(context);
            if (j == null) {
                return;
            }
            d(context);
            File k = k(context, file2, str);
            li liVar = new li(file, k);
            IOException e = null;
            try {
                m(j, k, liVar.J(context, str2, false));
            } catch (IOException e2) {
                if (z) {
                    char[] cArr7 = {(char) (cArr7[1] ^ '8'), (char) (cArr7[4] ^ 28), (char) (cArr7[1] ^ 25), (char) (cArr7[4] ^ 29), (char) (1387 ^ 1282), (char) (cArr7[7] ^ '<'), (char) (cArr7[2] ^ '\t'), (char) (cArr7[3] ^ '\f')};
                    String intern2 = new String(cArr7).intern();
                    char[] cArr8 = {(char) (cArr8[32] ^ '('), (char) (cArr8[34] ^ 0), (char) (cArr8[41] ^ 'I'), (char) (cArr8[69] ^ 'L'), (char) (cArr8[74] ^ 4), (char) (cArr8[0] ^ '\"'), (char) (cArr8[69] ^ 0), (char) (cArr8[53] ^ '\r'), (char) (cArr8[70] ^ '\n'), (char) (cArr8[68] ^ 'D'), (char) (cArr8[41] ^ 'I'), (char) (cArr8[73] ^ 28), (char) (cArr8[38] ^ 23), (char) (cArr8[61] ^ 28), (char) (cArr8[74] ^ 0), (char) (cArr8[61] ^ 4), (char) (cArr8[2] ^ 5), (char) (cArr8[60] ^ 'T'), (char) (cArr8[8] ^ '\n'), (char) (cArr8[20] ^ '\f'), (char) (cArr8[69] ^ 'T'), (char) (cArr8[75] ^ 17), (char) (cArr8[43] ^ '\b'), (char) (cArr8[24] ^ 23), (char) (cArr8[9] ^ 'T'), (char) (cArr8[73] ^ 23), (char) (cArr8[11] ^ '\n'), (char) (cArr8[69] ^ 0), (char) (cArr8[68] ^ 23), (char) (cArr8[74] ^ 4), (char) (cArr8[9] ^ 'C'), (char) (cArr8[35] ^ 29), (char) (cArr8[20] ^ 26), (char) (cArr8[76] ^ 16), (char) (cArr8[20] ^ 21), (char) (cArr8[0] ^ '4'), (char) (cArr8[43] ^ 16), (char) (cArr8[7] ^ 'T'), (char) (cArr8[32] ^ '\n'), (char) (cArr8[74] ^ 4), (char) (cArr8[21] ^ '\n'), (char) (cArr8[60] ^ 'T'), (char) (cArr8[69] ^ 'F'), (char) (cArr8[53] ^ 16), (char) (cArr8[2] ^ 5), (char) (cArr8[9] ^ 'E'), (char) (cArr8[43] ^ 26), (char) (cArr8[19] ^ 'T'), (char) (cArr8[3] ^ 'L'), (char) (cArr8[77] ^ 27), (char) (cArr8[19] ^ 29), (char) (cArr8[75] ^ 23), (char) (cArr8[6] ^ 'R'), (char) (cArr8[69] ^ 'Y'), (char) (cArr8[69] ^ 'I'), (char) (cArr8[64] ^ 1), (char) (cArr8[60] ^ 19), (char) (cArr8[25] ^ 'E'), (char) (cArr8[15] ^ 27), (char) (cArr8[37] ^ 'I'), (char) (cArr8[69] ^ 'T'), (char) (cArr8[54] ^ 1), (char) (cArr8[7] ^ 'T'), (char) (cArr8[35] ^ 20), (char) (cArr8[74] ^ 14), (char) (cArr8[21] ^ 0), (char) (cArr8[32] ^ '\r'), (char) (cArr8[4] ^ 0), (char) (cArr8[69] ^ 'D'), (char) (30227 ^ 30259), (char) (cArr8[69] ^ 'E'), (char) (cArr8[20] ^ '\f'), (char) (cArr8[70] ^ 17), (char) (cArr8[9] ^ 'R'), (char) (cArr8[41] ^ 'A'), (char) (cArr8[73] ^ 17), (char) (cArr8[35] ^ 6), (char) (cArr8[56] ^ 14), (char) (cArr8[45] ^ '\n'), (char) (cArr8[0] ^ '(')};
                    Log.w(intern2, new String(cArr8).intern(), e2);
                    m(j, k, liVar.J(context, str2, true));
                } else {
                    throw e2;
                }
            }
            try {
                liVar.close();
            } catch (IOException e3) {
                e = e3;
            }
            if (e != null) {
                throw e;
            }
        }
    }

    public static void f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g = g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[1] ^ '/'), (char) (cArr[3] ^ 5), (char) (cArr[5] ^ 'E'), (char) (13596 ^ 13680), (char) (cArr[5] ^ 'D'), (char) (cArr[3] ^ 'L')};
        sb.append(new String(cArr).intern());
        sb.append(str);
        char[] cArr2 = {(char) (cArr2[13] ^ 0), (char) (cArr2[5] ^ '\b'), (char) (cArr2[7] ^ 26), (char) (cArr2[0] ^ 'T'), (char) (cArr2[6] ^ 'O'), (char) (cArr2[12] ^ '\b'), (char) (cArr2[7] ^ 26), (char) (cArr2[12] ^ 27), (char) (cArr2[12] ^ 0), (char) (cArr2[10] ^ 'D'), (char) (cArr2[11] ^ 'I'), (char) (cArr2[7] ^ 28), (char) (28545 ^ 28655), (char) (cArr2[5] ^ 'F')};
        sb.append(new String(cArr2).intern());
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    public static Method h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[6] ^ 'm'), (char) (cArr[6] ^ 'E'), (char) (cArr[6] ^ 'T'), (char) (cArr[1] ^ '\r'), (char) (cArr[6] ^ 'O'), (char) (cArr[1] ^ 1), (char) (29366 ^ 29334)};
        sb.append(new String(cArr).intern());
        sb.append(str);
        char[] cArr2 = {(char) (cArr2[15] ^ 'S'), (char) (cArr2[11] ^ 18), (char) (cArr2[12] ^ 29), (char) (cArr2[12] ^ 0), (char) (cArr2[2] ^ 1), (char) (cArr2[4] ^ 'H'), (char) (cArr2[15] ^ 3), (char) (cArr2[3] ^ 21), (char) (cArr2[2] ^ 27), (char) (cArr2[0] ^ 'A'), (char) (cArr2[11] ^ '\b'), (char) (cArr2[14] ^ 23), (char) (cArr2[11] ^ 17), (char) (cArr2[14] ^ 23), (char) (cArr2[15] ^ 1), (char) ((-22701) ^ (-22752)), (char) (cArr2[0] ^ 0)};
        sb.append(new String(cArr2).intern());
        sb.append(Arrays.asList(clsArr));
        char[] cArr3 = {(char) (cArr3[8] ^ 'N'), (char) (cArr3[12] ^ 0), (char) (cArr3[6] ^ 0), (char) (cArr3[1] ^ 26), (char) (cArr3[8] ^ 'N'), (char) ((-26123) ^ (-26221)), (char) (cArr3[5] ^ '\t'), (char) (cArr3[8] ^ 27), (char) (cArr3[6] ^ 1), (char) (cArr3[8] ^ '\n'), (char) (cArr3[9] ^ 'D'), (char) (cArr3[2] ^ 6), (char) (cArr3[6] ^ 1), (char) (cArr3[7] ^ 'U')};
        sb.append(new String(cArr3).intern());
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    public static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            char[] cArr = {(char) (cArr[2] ^ '!'), (char) (cArr[2] ^ 25), (char) ((-5800) ^ (-5836)), (char) (cArr[2] ^ 24), (char) (cArr[2] ^ 5), (char) (cArr[2] ^ '('), (char) (cArr[0] ^ '('), (char) (cArr[3] ^ '\f')};
            String intern = new String(cArr).intern();
            char[] cArr2 = {(char) (cArr2[24] ^ ')'), (char) (cArr2[34] ^ '\r'), (char) (cArr2[87] ^ '\r'), (char) (cArr2[83] ^ 24), (char) (cArr2[41] ^ 27), (char) (cArr2[39] ^ 27), (char) (cArr2[27] ^ 4), (char) (cArr2[21] ^ 'T'), (char) (cArr2[4] ^ 2), (char) (cArr2[40] ^ 7), (char) (cArr2[14] ^ 29), (char) (cArr2[94] ^ 28), (char) (cArr2[49] ^ '\n'), (char) (21616 ^ 21584), (char) (cArr2[75] ^ 19), (char) (cArr2[52] ^ '1'), (char) (cArr2[46] ^ 'Y'), (char) (cArr2[100] ^ 1), (char) (cArr2[24] ^ 1), (char) (cArr2[38] ^ 19), (char) (cArr2[84] ^ 0), (char) (cArr2[72] ^ 26), (char) (cArr2[61] ^ '\"'), (char) (cArr2[30] ^ 0), (char) (cArr2[4] ^ 26), (char) (cArr2[69] ^ 16), (char) (cArr2[62] ^ 1), (char) (cArr2[84] ^ 'A'), (char) (cArr2[85] ^ 4), (char) (cArr2[13] ^ 'N'), (char) (cArr2[87] ^ 'D'), (char) (cArr2[32] ^ '1'), (char) (cArr2[2] ^ 25), (char) (cArr2[27] ^ 17), (char) (cArr2[84] ^ 'L'), (char) (cArr2[30] ^ 'I'), (char) (cArr2[98] ^ 23), (char) (cArr2[86] ^ 14), (char) (cArr2[13] ^ 'T'), (char) (cArr2[98] ^ 29), (char) (cArr2[13] ^ 'O'), (char) (cArr2[19] ^ '\t'), (char) (cArr2[54] ^ '\''), (char) (cArr2[42] ^ '\''), (char) (cArr2[73] ^ 15), (char) (cArr2[61] ^ '\"'), (char) (cArr2[68] ^ 0), (char) (cArr2[31] ^ '\''), (char) (cArr2[65] ^ 'R'), (char) (cArr2[63] ^ 28), (char) (cArr2[68] ^ 'M'), (char) (cArr2[25] ^ 'B'), (char) (cArr2[82] ^ '0'), (char) (cArr2[0] ^ ')'), (char) (cArr2[84] ^ 'N'), (char) (cArr2[89] ^ 'Z'), (char) (cArr2[3] ^ '\t'), (char) (cArr2[74] ^ 22), (char) (cArr2[69] ^ 6), (char) (cArr2[38] ^ 'Z'), (char) (cArr2[83] ^ 'T'), (char) (cArr2[90] ^ 'm'), (char) (cArr2[87] ^ 17), (char) (cArr2[89] ^ ']'), (char) (cArr2[50] ^ 25), (char) (cArr2[94] ^ 'P'), (char) (cArr2[32] ^ 18), (char) (cArr2[89] ^ 'K'), (char) (cArr2[84] ^ 0), (char) (cArr2[46] ^ 'R'), (char) (cArr2[66] ^ 23), (char) (cArr2[89] ^ '@'), (char) (cArr2[75] ^ '\t'), (char) (cArr2[97] ^ '\b'), (char) (cArr2[27] ^ 15), (char) (cArr2[64] ^ 19), (char) (cArr2[12] ^ 'E'), (char) (cArr2[45] ^ 6), (char) (cArr2[21] ^ 26), (char) (cArr2[34] ^ 'L'), (char) (cArr2[30] ^ 'T'), (char) (cArr2[82] ^ 22), (char) (cArr2[84] ^ 'S'), (char) (cArr2[82] ^ 7), (char) (cArr2[38] ^ 'T'), (char) (cArr2[66] ^ 15), (char) (cArr2[102] ^ 1), (char) (cArr2[84] ^ 'D'), (char) (cArr2[96] ^ 21), (char) (cArr2[13] ^ 14), (char) (cArr2[1] ^ 'A'), (char) (cArr2[44] ^ '5'), (char) (cArr2[30] ^ 'K'), (char) (cArr2[13] ^ 'I'), (char) (cArr2[68] ^ 'P'), (char) (cArr2[0] ^ 'f'), (char) (cArr2[27] ^ 17), (char) (cArr2[93] ^ '\b'), (char) (cArr2[104] ^ 'Z'), (char) (cArr2[49] ^ '\f'), (char) (cArr2[50] ^ 5), (char) (cArr2[33] ^ 25), (char) (cArr2[96] ^ 30), (char) (cArr2[83] ^ 19), (char) (cArr2[68] ^ 14)};
            Log.w(intern, new String(cArr2).intern(), e);
            return null;
        }
    }

    public static ClassLoader j(Context context) {
        char[] cArr = {(char) (cArr[2] ^ '!'), (char) (cArr[2] ^ 25), (char) (cArr[3] ^ 24), (char) ((-5734) ^ (-5650)), (char) (cArr[0] ^ '$'), (char) (cArr[0] ^ '\t'), (char) (cArr[3] ^ 17), (char) (cArr[0] ^ '5')};
        String intern = new String(cArr).intern();
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            char[] cArr2 = {(char) (cArr2[11] ^ '0'), (char) (cArr2[31] ^ 'O'), (char) (cArr2[11] ^ 29), (char) (cArr2[74] ^ 27), (char) (cArr2[34] ^ 17), (char) (cArr2[49] ^ '5'), (char) (cArr2[8] ^ 23), (char) (cArr2[19] ^ 'R'), (char) (cArr2[34] ^ 23), (char) (cArr2[49] ^ '!'), (char) (cArr2[86] ^ 21), (char) (cArr2[28] ^ 'S'), (char) (cArr2[61] ^ 26), (char) (cArr2[38] ^ 'X'), (char) (cArr2[48] ^ 'L'), (char) (cArr2[73] ^ 2), (char) (cArr2[12] ^ 18), (char) (cArr2[8] ^ 7), (char) (cArr2[53] ^ 'E'), (char) (cArr2[11] ^ 1), (char) (cArr2[40] ^ 'C'), (char) (cArr2[74] ^ 6), (char) (cArr2[89] ^ 26), (char) (cArr2[19] ^ 'R'), (char) (cArr2[23] ^ 'N'), (char) (cArr2[65] ^ 28), (char) (cArr2[48] ^ 'L'), (char) (cArr2[57] ^ 30), (char) (cArr2[5] ^ 'X'), (char) (cArr2[12] ^ 28), (char) (cArr2[0] ^ '1'), (char) (cArr2[17] ^ 'D'), (char) (cArr2[74] ^ 1), (char) (cArr2[86] ^ 27), (char) (cArr2[12] ^ 7), (char) (cArr2[36] ^ 'D'), (char) (cArr2[90] ^ '\n'), (char) (cArr2[39] ^ 'H'), (char) (cArr2[9] ^ 20), (char) (cArr2[89] ^ 'D'), (char) (cArr2[92] ^ 'M'), (char) (cArr2[79] ^ '2'), (char) (cArr2[49] ^ '='), (char) (cArr2[65] ^ '\b'), (char) (cArr2[84] ^ 18), (char) (cArr2[49] ^ '!'), (char) (cArr2[37] ^ 0), (char) (cArr2[9] ^ 'B'), (char) (cArr2[62] ^ 'N'), (char) ((-17558) ^ (-17625)), (char) (cArr2[28] ^ 'U'), (char) (cArr2[88] ^ 27), (char) (cArr2[49] ^ '9'), (char) (cArr2[86] ^ 'T'), (char) (cArr2[62] ^ '\f'), (char) (cArr2[0] ^ '&'), (char) (cArr2[22] ^ 'S'), (char) (cArr2[79] ^ '!'), (char) (cArr2[74] ^ 26), (char) (cArr2[28] ^ 'N'), (char) (cArr2[37] ^ 11), (char) (cArr2[9] ^ 5), (char) (cArr2[89] ^ 7), (char) (cArr2[34] ^ 19), (char) (cArr2[61] ^ 'I'), (char) (cArr2[37] ^ '\f'), (char) (cArr2[0] ^ '-'), (char) (cArr2[74] ^ 'O'), (char) (cArr2[83] ^ 'T'), (char) (cArr2[74] ^ '\n'), (char) (cArr2[10] ^ 18), (char) (cArr2[2] ^ 26), (char) (cArr2[55] ^ 'E'), (char) (cArr2[86] ^ 25), (char) (cArr2[19] ^ 29), (char) (cArr2[84] ^ 20), (char) (cArr2[89] ^ '\f'), (char) (cArr2[39] ^ 3), (char) (cArr2[87] ^ 'C'), (char) (cArr2[11] ^ ' '), (char) (cArr2[22] ^ 24), (char) (cArr2[76] ^ '\f'), (char) (cArr2[89] ^ 25), (char) (cArr2[48] ^ 0), (char) (cArr2[60] ^ 30), (char) (cArr2[5] ^ 25), (char) (cArr2[77] ^ 'Z'), (char) (cArr2[49] ^ '.'), (char) (cArr2[41] ^ '\t'), (char) (cArr2[9] ^ 5), (char) (cArr2[11] ^ 29), (char) (cArr2[46] ^ 2), (char) (cArr2[89] ^ 'G')};
            Log.e(intern, new String(cArr2).intern());
            return null;
        } catch (RuntimeException e) {
            char[] cArr3 = {(char) (cArr3[26] ^ '2'), (char) (cArr3[23] ^ 'A'), (char) (cArr3[27] ^ '\b'), (char) (cArr3[40] ^ 0), (char) (cArr3[57] ^ 'U'), (char) (cArr3[44] ^ 'R'), (char) (cArr3[43] ^ 22), (char) (cArr3[26] ^ 'T'), (char) (cArr3[21] ^ 3), (char) (cArr3[82] ^ 'H'), (char) (cArr3[70] ^ 7), (char) (cArr3[66] ^ 2), (char) (cArr3[80] ^ 0), (char) (cArr3[77] ^ 'M'), (char) (cArr3[49] ^ 17), (char) (cArr3[20] ^ 'R'), (char) (cArr3[33] ^ 23), (char) (cArr3[58] ^ 11), (char) (cArr3[8] ^ 25), (char) (cArr3[44] ^ 'G'), (char) (cArr3[58] ^ 'B'), (char) (cArr3[58] ^ 22), (char) (cArr3[92] ^ 7), (char) (cArr3[93] ^ 'I'), (char) (cArr3[48] ^ 11), (char) (cArr3[89] ^ 3), (char) (cArr3[57] ^ 'T'), (char) (cArr3[21] ^ 21), (char) (cArr3[21] ^ 29), (char) (cArr3[92] ^ 6), (char) (cArr3[69] ^ 'I'), (char) (cArr3[8] ^ '4'), (char) (cArr3[53] ^ '\"'), (char) (cArr3[8] ^ 25), (char) (cArr3[11] ^ 24), (char) (cArr3[76] ^ 'E'), (char) (cArr3[34] ^ '\f'), (char) (cArr3[17] ^ 29), (char) (cArr3[67] ^ 'G'), (char) (cArr3[78] ^ '\f'), (char) (cArr3[22] ^ 3), (char) (cArr3[57] ^ 'A'), (char) (cArr3[26] ^ 7), (char) (cArr3[17] ^ 26), (char) (cArr3[66] ^ 'N'), (char) (cArr3[17] ^ 5), (char) (cArr3[26] ^ 27), (char) (cArr3[33] ^ 15), (char) (cArr3[60] ^ 'D'), (char) (cArr3[58] ^ 7), (char) (cArr3[26] ^ 6), (char) (cArr3[34] ^ 'Z'), (char) (cArr3[57] ^ 0), (char) (cArr3[51] ^ 'c'), (char) (cArr3[83] ^ '&'), (char) (cArr3[88] ^ 3), (char) (cArr3[84] ^ 31), (char) (cArr3[58] ^ 'B'), (char) (29351 ^ 29381), (char) (cArr3[8] ^ 18), (char) (cArr3[93] ^ 'I'), (char) (cArr3[66] ^ 28), (char) (cArr3[80] ^ 16), (char) (cArr3[90] ^ 26), (char) (cArr3[16] ^ 23), (char) (cArr3[57] ^ 'I'), (char) (cArr3[58] ^ '\f'), (char) (cArr3[17] ^ 14), (char) (cArr3[63] ^ 'N'), (char) (cArr3[16] ^ 16), (char) (cArr3[66] ^ 0), (char) (cArr3[18] ^ 'N'), (char) (cArr3[15] ^ 6), (char) (cArr3[8] ^ 18), (char) (cArr3[82] ^ 'S'), (char) (cArr3[68] ^ 'T'), (char) (cArr3[18] ^ 'N'), (char) (cArr3[7] ^ 'M'), (char) (cArr3[41] ^ 14), (char) (cArr3[66] ^ '\n'), (char) (cArr3[58] ^ 7), (char) (cArr3[73] ^ 'K'), (char) (cArr3[22] ^ 'O'), (char) (cArr3[66] ^ '='), (char) (cArr3[5] ^ 25), (char) (cArr3[96] ^ 'G'), (char) (cArr3[57] ^ 'P'), (char) (cArr3[25] ^ 'B'), (char) (cArr3[8] ^ 7), (char) (cArr3[58] ^ 3), (char) (cArr3[50] ^ 6), (char) (cArr3[79] ^ 7), (char) (cArr3[57] ^ 'H'), (char) (cArr3[28] ^ 0), (char) (cArr3[82] ^ 'N'), (char) (cArr3[49] ^ 2), (char) (cArr3[59] ^ 'K')};
            Log.w(intern, new String(cArr3).intern(), e);
            return null;
        }
    }

    public static File k(Context context, File file, String str) throws IOException {
        char[] cArr = {(char) (cArr[4] ^ '<'), (char) (cArr[7] ^ '\f'), (char) (cArr[4] ^ ';'), (char) (cArr[6] ^ 4), (char) ((-13106) ^ (-13167)), (char) (cArr[4] ^ '<'), (char) (cArr[4] ^ '>'), (char) (cArr[8] ^ 11), (char) (cArr[5] ^ 11), (char) (cArr[8] ^ '\r')};
        String intern = new String(cArr).intern();
        File file2 = new File(file, intern);
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), intern);
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void l(Context context) {
        char[] cArr = {(char) (cArr[5] ^ '\t'), (char) (cArr[0] ^ '8'), (char) (cArr[5] ^ '('), (char) (cArr[5] ^ '0'), (char) (cArr[7] ^ 17), (char) (19377 ^ 19445), (char) (cArr[5] ^ '!'), (char) (cArr[2] ^ 20)};
        String intern = new String(cArr).intern();
        char[] cArr2 = {(char) (cArr2[9] ^ '.'), (char) (cArr2[7] ^ 7), (char) (cArr2[13] ^ 3), (char) (cArr2[17] ^ 21), (char) (cArr2[8] ^ 15), (char) (20733 ^ 20625), (char) (cArr2[19] ^ 5), (char) (cArr2[2] ^ 26), (char) (cArr2[13] ^ 30), (char) (cArr2[5] ^ 11), (char) (cArr2[2] ^ 'S'), (char) (cArr2[13] ^ 17), (char) (cArr2[13] ^ 0), (char) (cArr2[5] ^ 28), (char) (cArr2[16] ^ 15), (char) (cArr2[11] ^ '\b'), (char) (cArr2[9] ^ 4), (char) (cArr2[8] ^ 15), (char) (cArr2[3] ^ 0), (char) (cArr2[9] ^ 14), (char) (cArr2[9] ^ '\b'), (char) (cArr2[11] ^ 15)};
        Log.i(intern, new String(cArr2).intern());
        if (b) {
            char[] cArr3 = {(char) (cArr3[22] ^ '\"'), (char) (cArr3[9] ^ '!'), (char) (cArr3[11] ^ 'I'), (char) (cArr3[19] ^ 24), (char) (cArr3[32] ^ 25), (char) (cArr3[55] ^ 0), (char) (cArr3[32] ^ 'X'), (char) (cArr3[9] ^ 1), (char) (cArr3[12] ^ 17), (char) (cArr3[46] ^ '\r'), (char) (cArr3[19] ^ 4), (char) (cArr3[26] ^ 28), (char) (cArr3[11] ^ '\r'), (char) (cArr3[33] ^ 'E'), (char) (cArr3[44] ^ 26), (char) (cArr3[29] ^ 'I'), (char) (cArr3[27] ^ 31), (char) (cArr3[25] ^ '8'), (char) (cArr3[52] ^ 'P'), (char) (cArr3[52] ^ 'P'), (char) (cArr3[58] ^ 3), (char) (cArr3[28] ^ 6), (char) (cArr3[40] ^ 0), (char) (cArr3[25] ^ 'a'), (char) (cArr3[6] ^ 0), (char) (cArr3[26] ^ '8'), (char) (cArr3[46] ^ 20), (char) (17581 ^ 17601), (char) (cArr3[42] ^ 24), (char) (cArr3[26] ^ 28), (char) (cArr3[43] ^ '-'), (char) (cArr3[26] ^ 16), (char) (cArr3[49] ^ 'X'), (char) (cArr3[58] ^ 'L'), (char) (cArr3[12] ^ 23), (char) (cArr3[19] ^ 5), (char) (cArr3[24] ^ 'P'), (char) (cArr3[19] ^ 0), (char) (cArr3[3] ^ 7), (char) (cArr3[40] ^ 6), (char) (cArr3[55] ^ 7), (char) (cArr3[54] ^ 'I'), (char) (cArr3[9] ^ 0), (char) (cArr3[40] ^ 29), (char) (cArr3[19] ^ 18), (char) (cArr3[51] ^ 1), (char) (cArr3[52] ^ 'A'), (char) (cArr3[9] ^ 30), (char) (cArr3[46] ^ 24), (char) (cArr3[27] ^ 'L'), (char) (cArr3[19] ^ 25), (char) (cArr3[26] ^ 6), (char) (cArr3[27] ^ 'L'), (char) (cArr3[8] ^ 17), (char) (cArr3[51] ^ 26), (char) (cArr3[19] ^ 3), (char) (cArr3[44] ^ 3), (char) (cArr3[27] ^ 14), (char) (cArr3[16] ^ 31), (char) (cArr3[16] ^ 22), (char) (cArr3[6] ^ 'D'), (char) (cArr3[11] ^ 'G')};
            Log.i(intern, new String(cArr3).intern());
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 4) {
            try {
                ApplicationInfo i2 = i(context);
                if (i2 == null) {
                    char[] cArr4 = {(char) (cArr4[25] ^ ','), (char) (cArr4[5] ^ 31), (char) (cArr4[72] ^ 'U'), (char) (cArr4[17] ^ '.'), (char) (cArr4[30] ^ 25), (char) (cArr4[8] ^ 19), (char) (cArr4[97] ^ '\b'), (char) (cArr4[75] ^ 6), (char) (cArr4[64] ^ 15), (char) (cArr4[60] ^ '['), (char) (cArr4[92] ^ 7), (char) (cArr4[61] ^ 'I'), (char) (cArr4[54] ^ 0), (char) (cArr4[88] ^ 29), (char) (cArr4[54] ^ '&'), (char) (cArr4[25] ^ '\f'), (char) (cArr4[3] ^ '\''), (char) (cArr4[75] ^ 0), (char) (cArr4[27] ^ 'E'), (char) (cArr4[77] ^ 21), (char) (cArr4[16] ^ 16), (char) (cArr4[93] ^ 0), (char) (cArr4[87] ^ 0), (char) (cArr4[89] ^ 'L'), (char) (cArr4[3] ^ ' '), (char) (cArr4[74] ^ 18), (char) (cArr4[29] ^ 'L'), (char) (cArr4[75] ^ '\n'), (char) (cArr4[63] ^ 'Y'), (char) (cArr4[27] ^ 'E'), (char) ((-8656) ^ (-8615)), (char) (cArr4[5] ^ '^'), (char) (cArr4[30] ^ '\f'), (char) (cArr4[4] ^ '^'), (char) (cArr4[95] ^ 'L'), (char) (cArr4[74] ^ 2), (char) (cArr4[11] ^ 28), (char) (cArr4[42] ^ 'N'), (char) (cArr4[40] ^ 0), (char) (cArr4[75] ^ 6), (char) (cArr4[17] ^ 1), (char) (cArr4[58] ^ 31), (char) (cArr4[77] ^ 'T'), (char) (cArr4[27] ^ '\n'), (char) (cArr4[28] ^ 'B'), (char) (cArr4[64] ^ 'L'), (char) (cArr4[8] ^ 2), (char) (cArr4[8] ^ 'C'), (char) (cArr4[30] ^ 29), (char) (cArr4[75] ^ '\n'), (char) (cArr4[8] ^ 16), (char) (cArr4[21] ^ 21), (char) (cArr4[83] ^ 'A'), (char) (cArr4[42] ^ 'c'), (char) (cArr4[87] ^ 6), (char) (cArr4[17] ^ 1), (char) (cArr4[82] ^ 6), (char) (cArr4[4] ^ 21), (char) (cArr4[13] ^ 22), (char) (cArr4[87] ^ 29), (char) (cArr4[64] ^ 'V'), (char) (cArr4[85] ^ 'Y'), (char) (cArr4[60] ^ 'w'), (char) (cArr4[95] ^ 25), (char) (cArr4[91] ^ 5), (char) (cArr4[43] ^ 27), (char) (cArr4[19] ^ '\b'), (char) (cArr4[24] ^ '%'), (char) (cArr4[98] ^ 'K'), (char) (cArr4[17] ^ 23), (char) (cArr4[43] ^ 'O'), (char) (cArr4[66] ^ 26), (char) (cArr4[30] ^ 28), (char) (cArr4[35] ^ 2), (char) (cArr4[84] ^ 2), (char) (cArr4[87] ^ 6), (char) (cArr4[17] ^ 29), (char) (cArr4[91] ^ 29), (char) (cArr4[76] ^ 'R'), (char) (cArr4[52] ^ 'L'), (char) (cArr4[84] ^ 27), (char) (cArr4[77] ^ 22), (char) (cArr4[2] ^ 'R'), (char) (cArr4[87] ^ '\b'), (char) (cArr4[30] ^ 27), (char) (cArr4[64] ^ 21), (char) (cArr4[83] ^ 'A'), (char) (cArr4[30] ^ 0), (char) (cArr4[76] ^ 1), (char) (cArr4[29] ^ 0), (char) (cArr4[74] ^ 20), (char) (cArr4[27] ^ '\f'), (char) (cArr4[27] ^ 22), (char) (cArr4[77] ^ 21), (char) (cArr4[98] ^ 'L'), (char) (cArr4[54] ^ 3), (char) (cArr4[49] ^ 0), (char) (cArr4[30] ^ '\r'), (char) (cArr4[76] ^ '\\')};
                    Log.i(intern, new String(cArr4).intern());
                    return;
                }
                File file = new File(i2.sourceDir);
                File file2 = new File(i2.dataDir);
                char[] cArr5 = {(char) (cArr5[11] ^ 22), (char) (cArr5[9] ^ 'H'), (char) (14197 ^ 14102), (char) (cArr5[10] ^ 11), (char) (cArr5[2] ^ '\r'), (char) (cArr5[9] ^ 'I'), (char) (cArr5[2] ^ 2), (char) (cArr5[3] ^ 29), (char) (cArr5[9] ^ 'T'), (char) (cArr5[2] ^ 'N'), (char) (cArr5[2] ^ 7), (char) (cArr5[2] ^ 6), (char) (cArr5[8] ^ 1), (char) (cArr5[9] ^ 'H'), (char) (cArr5[2] ^ 16)};
                e(context, file, file2, new String(cArr5).intern(), new String(new char[0]).intern(), true);
                char[] cArr6 = {(char) (cArr6[10] ^ 7), (char) (cArr6[7] ^ 'N'), (char) (cArr6[3] ^ 7), (char) (cArr6[6] ^ 24), (char) (31586 ^ 31491), (char) (cArr6[10] ^ 2), (char) (cArr6[4] ^ '\r'), (char) (cArr6[4] ^ 'A'), (char) (cArr6[4] ^ 5), (char) (cArr6[11] ^ '\n'), (char) (cArr6[4] ^ 15), (char) (cArr6[7] ^ 'E')};
                Log.i(intern, new String(cArr6).intern());
                return;
            } catch (Exception e) {
                char[] cArr7 = {(char) (cArr7[1] ^ '8'), (char) (cArr7[23] ^ 20), (char) (cArr7[23] ^ '\r'), (char) (11593 ^ 11581), (char) (cArr7[3] ^ 29), (char) (cArr7[21] ^ 'd'), (char) (cArr7[8] ^ 'E'), (char) (cArr7[26] ^ '\r'), (char) (cArr7[3] ^ 'T'), (char) (cArr7[25] ^ 5), (char) (cArr7[2] ^ 2), (char) (cArr7[6] ^ 22), (char) (cArr7[16] ^ 21), (char) (cArr7[7] ^ 25), (char) (cArr7[8] ^ 'L'), (char) (cArr7[4] ^ 5), (char) (cArr7[3] ^ 21), (char) (cArr7[11] ^ 7), (char) (cArr7[23] ^ '\b'), (char) (cArr7[23] ^ 14), (char) (cArr7[22] ^ '\b'), (char) (cArr7[6] ^ 'E'), (char) (cArr7[14] ^ '\n'), (char) (cArr7[8] ^ 'A'), (char) (cArr7[3] ^ 29), (char) (cArr7[23] ^ '\r'), (char) (cArr7[6] ^ 16), (char) (cArr7[28] ^ 23), (char) (cArr7[14] ^ '\t')};
                Log.e(intern, new String(cArr7).intern(), e);
                StringBuilder sb = new StringBuilder();
                char[] cArr8 = {(char) (cArr8[23] ^ ','), (char) (cArr8[17] ^ 1), (char) (cArr8[3] ^ 24), (char) (cArr8[23] ^ 21), (char) (cArr8[26] ^ '\f'), (char) (cArr8[7] ^ '<'), (char) (cArr8[12] ^ 17), (char) (cArr8[11] ^ 11), (char) (cArr8[10] ^ 'N'), (char) (cArr8[8] ^ 'I'), (char) (cArr8[16] ^ 15), (char) (18186 ^ 18297), (char) (cArr8[11] ^ 7), (char) (cArr8[7] ^ 25), (char) (cArr8[16] ^ '\r'), (char) (cArr8[5] ^ '('), (char) (cArr8[7] ^ 25), (char) (cArr8[7] ^ '\f'), (char) (cArr8[23] ^ '\b'), (char) (cArr8[7] ^ 23), (char) (cArr8[28] ^ 'N'), (char) (cArr8[26] ^ 'E'), (char) (cArr8[28] ^ 'F'), (char) (cArr8[1] ^ 20), (char) (cArr8[15] ^ 5), (char) (cArr8[14] ^ 0), (char) (cArr8[19] ^ '\n'), (char) (cArr8[14] ^ '\b'), (char) (cArr8[12] ^ 'T'), (char) (cArr8[15] ^ 'D')};
                sb.append(new String(cArr8).intern());
                sb.append(e.getMessage());
                char[] cArr9 = {(char) (cArr9[1] ^ 7), (char) (617 ^ 583)};
                sb.append(new String(cArr9).intern());
                throw new RuntimeException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        char[] cArr10 = {(char) (cArr10[6] ^ '('), (char) (cArr10[16] ^ 20), (char) (cArr10[20] ^ 2), (char) (cArr10[27] ^ 16), (char) (cArr10[3] ^ 29), (char) (cArr10[19] ^ '+'), (char) (cArr10[32] ^ '.'), (char) (cArr10[12] ^ '\f'), (char) (cArr10[27] ^ 'D'), (char) (cArr10[1] ^ 28), (char) (cArr10[27] ^ '\n'), (char) (cArr10[30] ^ ' '), (char) (cArr10[27] ^ 16), (char) (cArr10[28] ^ 'O'), (char) (cArr10[6] ^ '\t'), (char) (cArr10[27] ^ '\b'), (char) (cArr10[24] ^ '\b'), (char) (cArr10[10] ^ 26), (char) (cArr10[9] ^ 0), (char) (cArr10[33] ^ 'O'), (char) (cArr10[8] ^ 'N'), (char) (cArr10[13] ^ 'A'), (char) (cArr10[32] ^ '-'), (char) (cArr10[16] ^ 0), (char) (cArr10[32] ^ '\"'), (char) (cArr10[30] ^ '?'), (char) (cArr10[20] ^ 11), (char) (cArr10[24] ^ '\r'), (char) (cArr10[32] ^ 'e'), (char) (cArr10[32] ^ 'k'), (char) (cArr10[3] ^ '\''), (char) (cArr10[9] ^ '-'), (char) (3255 ^ 3324), (char) (cArr10[28] ^ 14)};
        sb2.append(new String(cArr10).intern());
        sb2.append(i);
        char[] cArr11 = {(char) (cArr11[18] ^ 'I'), (char) (cArr11[20] ^ 'I'), (char) (cArr11[4] ^ 6), (char) (cArr11[14] ^ 'D'), (char) (cArr11[25] ^ 3), (char) (cArr11[28] ^ 29), (char) (cArr11[27] ^ 1), (char) (cArr11[26] ^ 16), (char) (cArr11[17] ^ '='), (char) (cArr11[25] ^ 6), (char) (cArr11[27] ^ 29), (char) (cArr11[7] ^ 7), (char) (cArr11[22] ^ '0'), (char) (cArr11[14] ^ 1), (char) (cArr11[18] ^ '\r'), (char) (cArr11[11] ^ '\\'), (char) (cArr11[31] ^ 'N'), (char) (cArr11[0] ^ 'm'), (char) (cArr11[25] ^ 31), (char) (cArr11[15] ^ '@'), (char) (cArr11[32] ^ 0), (char) (cArr11[2] ^ ' '), (char) (cArr11[23] ^ 15), (char) (cArr11[32] ^ 'k'), (char) (cArr11[32] ^ 0), (char) (30732 ^ 30842), (char) (cArr11[23] ^ '.'), (char) (cArr11[2] ^ 1), (char) (cArr11[1] ^ 26), (char) (cArr11[14] ^ '\r'), (char) (cArr11[2] ^ 28), (char) (cArr11[33] ^ 7), (char) (cArr11[4] ^ 'U'), (char) (cArr11[26] ^ '\f'), (char) (cArr11[26] ^ 22), (char) (cArr11[22] ^ 'd')};
        sb2.append(new String(cArr11).intern());
        sb2.append(4);
        sb2.append(new String(new char[]{(char) (2123 ^ 2149)}).intern());
        throw new RuntimeException(sb2.toString());
    }

    public static void m(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            b.a(classLoader, list, file);
        } else if (i >= 14) {
            a.a(classLoader, list);
        } else {
            c.a(classLoader, list);
        }
    }

    public static boolean n(String str) {
        String intern;
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, new String(new char[]{(char) (24840 ^ 24870)}).intern());
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[15] ^ 'v'), (char) (cArr[14] ^ '#'), (char) (cArr[8] ^ 'V'), (char) (cArr[0] ^ '!'), (char) (cArr[8] ^ 31), (char) (cArr[12] ^ 29), (char) (cArr[12] ^ 1), (char) (cArr[6] ^ 'H'), (char) (cArr[6] ^ 30), (char) (cArr[0] ^ '3'), (char) (cArr[12] ^ 27), (char) (cArr[5] ^ 7), (char) (cArr[15] ^ 'I'), (char) (cArr[4] ^ 6), (char) (cArr[15] ^ 'N'), (char) (27464 ^ 27496)};
        sb.append(new String(cArr).intern());
        sb.append(str);
        if (z) {
            char[] cArr2 = {(char) (cArr2[2] ^ 'A'), (char) (cArr2[13] ^ 'H'), (char) (cArr2[17] ^ 17), (char) (cArr2[16] ^ 3), (char) (cArr2[2] ^ 'A'), (char) (cArr2[9] ^ 4), (char) (cArr2[11] ^ 16), (char) (cArr2[2] ^ '\r'), (char) (cArr2[0] ^ 'T'), (char) (cArr2[3] ^ 26), (char) (cArr2[8] ^ 16), (char) (cArr2[3] ^ 22), (char) (cArr2[9] ^ 17), (char) (cArr2[16] ^ 'P'), (char) (cArr2[10] ^ 23), (char) (cArr2[12] ^ '\r'), (char) ((-14209) ^ (-14321)), (char) (cArr2[3] ^ 3), (char) (cArr2[16] ^ 31), (char) (cArr2[7] ^ 30), (char) (cArr2[5] ^ 25)};
            intern = new String(cArr2).intern();
        } else {
            char[] cArr3 = {(char) (cArr3[17] ^ 'L'), (char) (cArr3[19] ^ '\r'), (char) (cArr3[24] ^ 28), (char) (cArr3[22] ^ 29), (char) (cArr3[12] ^ 5), (char) (cArr3[3] ^ 'E'), (char) (cArr3[12] ^ 24), (char) (cArr3[9] ^ 'O'), (char) (cArr3[23] ^ 'T'), (char) (cArr3[28] ^ 'O'), (char) (cArr3[6] ^ 6), (char) (cArr3[0] ^ 'A'), (char) ((-27492) ^ (-27414)), (char) (cArr3[20] ^ 1), (char) (cArr3[20] ^ 'D'), (char) (cArr3[17] ^ 1), (char) (cArr3[22] ^ '\r'), (char) (cArr3[6] ^ 2), (char) (cArr3[28] ^ 27), (char) (cArr3[17] ^ 5), (char) (cArr3[23] ^ 'D'), (char) (cArr3[9] ^ 'E'), (char) (cArr3[23] ^ 'X'), (char) (cArr3[12] ^ 'V'), (char) (cArr3[4] ^ 0), (char) (cArr3[23] ^ 'U'), (char) (cArr3[28] ^ 31), (char) (cArr3[20] ^ 20), (char) (cArr3[6] ^ 1), (char) (cArr3[22] ^ '\n'), (char) (cArr3[26] ^ 4)};
            intern = new String(cArr3).intern();
        }
        sb.append(intern);
        String sb2 = sb.toString();
        char[] cArr4 = {(char) ((-9683) ^ (-9632)), (char) (cArr4[6] ^ 16), (char) (cArr4[0] ^ '!'), (char) (cArr4[0] ^ '9'), (char) (cArr4[0] ^ '$'), (char) (cArr4[7] ^ '<'), (char) (cArr4[0] ^ '('), (char) (cArr4[6] ^ 29)};
        Log.i(new String(cArr4).intern(), sb2);
        return z;
    }

    public static void o(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        char[] cArr = {(char) (cArr[10] ^ '%'), (char) (cArr[13] ^ 0), (char) (cArr[1] ^ '\b'), (char) (cArr[13] ^ '\r'), (char) (cArr[0] ^ '#'), (char) (cArr[17] ^ 0), (char) (cArr[17] ^ 'D'), (char) (cArr[11] ^ 6), (char) (cArr[10] ^ '\f'), (char) (cArr[5] ^ 'D'), (char) (cArr[13] ^ 2), (char) (cArr[0] ^ '4'), (char) (cArr[13] ^ 4), (char) (16306 ^ 16339), (char) (cArr[20] ^ 'T'), (char) (cArr[8] ^ '\n'), (char) (cArr[1] ^ 'A'), (char) (cArr[13] ^ 5), (char) (cArr[10] ^ '\n'), (char) (cArr[5] ^ 22), (char) (cArr[17] ^ 'D')};
        String intern = new String(cArr).intern();
        char[] cArr2 = {(char) (cArr2[5] ^ '\t'), (char) (cArr2[7] ^ '\r'), (char) (cArr2[4] ^ 5), (char) (cArr2[1] ^ 1), (char) ((-16689) ^ (-16730)), (char) (cArr2[7] ^ '<'), (char) (cArr2[2] ^ '\t'), (char) (cArr2[2] ^ 20)};
        String intern2 = new String(cArr2).intern();
        if (parentFile == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(intern);
            sb.append(file.getPath());
            char[] cArr3 = {(char) (cArr3[7] ^ 'Z'), (char) (cArr3[18] ^ 'U'), (char) (cArr3[18] ^ '%'), (char) (cArr3[16] ^ 'A'), (char) (cArr3[15] ^ 1), (char) ((-6887) ^ (-6788)), (char) (cArr3[21] ^ '@'), (char) (cArr3[11] ^ 24), (char) (cArr3[4] ^ 'R'), (char) (cArr3[13] ^ 'F'), (char) (cArr3[9] ^ 15), (char) (cArr3[5] ^ '\t'), (char) (cArr3[3] ^ 4), (char) (cArr3[19] ^ 'L'), (char) (cArr3[13] ^ 'I'), (char) (cArr3[5] ^ 22), (char) (cArr3[15] ^ 'S'), (char) (cArr3[5] ^ 11), (char) (cArr3[19] ^ 25), (char) (cArr3[16] ^ 'L'), (char) (cArr3[12] ^ '\t'), (char) (cArr3[5] ^ 'K')};
            sb.append(new String(cArr3).intern());
            Log.e(intern2, sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(intern);
            sb2.append(file.getPath());
            char[] cArr4 = {(char) (cArr4[22] ^ 14), (char) (cArr4[18] ^ 0), (char) (cArr4[5] ^ 21), (char) (cArr4[13] ^ 'A'), (char) (cArr4[18] ^ 'R'), (char) (cArr4[0] ^ 'K'), (char) (cArr4[7] ^ 26), (char) (cArr4[19] ^ 16), (char) (cArr4[18] ^ 0), (char) (cArr4[6] ^ '\b'), (char) (cArr4[13] ^ 'I'), (char) (cArr4[22] ^ 'L'), (char) (cArr4[21] ^ 23), (char) (cArr4[18] ^ 0), (char) (cArr4[7] ^ 29), (char) (cArr4[1] ^ 'S'), (char) (cArr4[7] ^ 'T'), (char) (cArr4[22] ^ 'A'), (char) (cArr4[17] ^ 'A'), (char) (cArr4[18] ^ 'D'), (char) (cArr4[14] ^ 0), (char) (cArr4[0] ^ '\\'), (char) (31558 ^ 31590)};
            sb2.append(new String(cArr4).intern());
            sb2.append(parentFile.isDirectory());
            char[] cArr5 = {(char) (cArr5[7] ^ 'I'), (char) (cArr5[8] ^ 0), (char) (cArr5[5] ^ '\b'), (char) (cArr5[8] ^ 0), (char) (cArr5[7] ^ 3), (char) (cArr5[8] ^ 'I'), (char) (cArr5[2] ^ '\r'), (char) (cArr5[8] ^ 'E'), (char) ((-23498) ^ (-23530))};
            sb2.append(new String(cArr5).intern());
            sb2.append(parentFile.isFile());
            char[] cArr6 = {(char) (cArr6[4] ^ 'E'), (char) (cArr6[2] ^ 'E'), (char) (cArr6[4] ^ '\f'), (char) (cArr6[5] ^ 11), (char) (cArr6[5] ^ 26), (char) ((-20644) ^ (-20689)), (char) (cArr6[7] ^ 7), (char) (cArr6[0] ^ '_'), (char) (cArr6[3] ^ 'X')};
            sb2.append(new String(cArr6).intern());
            sb2.append(parentFile.exists());
            char[] cArr7 = {(char) (cArr7[10] ^ '\f'), (char) (cArr7[10] ^ 0), (char) (cArr7[4] ^ 19), (char) (cArr7[9] ^ 0), (char) ((-30971) ^ (-30876)), (char) (cArr7[7] ^ 6), (char) (cArr7[3] ^ 4), (char) (cArr7[6] ^ 3), (char) (cArr7[10] ^ 'L'), (char) (cArr7[4] ^ 4), (char) (cArr7[4] ^ 'A')};
            sb2.append(new String(cArr7).intern());
            sb2.append(parentFile.canRead());
            char[] cArr8 = {(char) (cArr8[7] ^ 'N'), (char) ((-27754) ^ (-27722)), (char) (cArr8[1] ^ 'W'), (char) (cArr8[4] ^ 27), (char) (cArr8[8] ^ 5), (char) (cArr8[4] ^ 29), (char) (cArr8[4] ^ '\b'), (char) (cArr8[1] ^ 'B'), (char) (cArr8[1] ^ 'L'), (char) (cArr8[1] ^ 'E'), (char) (cArr8[2] ^ 'W')};
            sb2.append(new String(cArr8).intern());
            sb2.append(parentFile.canWrite());
            Log.e(intern2, sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        char[] cArr9 = {(char) (cArr9[18] ^ '/'), (char) (cArr9[18] ^ '\b'), (char) (cArr9[12] ^ '\f'), (char) (cArr9[19] ^ 30), (char) (cArr9[15] ^ 0), (char) (cArr9[8] ^ 11), (char) (cArr9[18] ^ 'I'), (char) (cArr9[2] ^ 29), (char) (cArr9[24] ^ 29), (char) (cArr9[12] ^ 'E'), (char) (cArr9[24] ^ 17), (char) (cArr9[13] ^ 19), (char) (cArr9[14] ^ 17), (char) (cArr9[12] ^ 4), (char) (cArr9[15] ^ 17), (char) ((-13497) ^ (-13534)), (char) (cArr9[18] ^ 'I'), (char) (cArr9[24] ^ 22), (char) (cArr9[19] ^ 27), (char) (cArr9[15] ^ 23), (char) (cArr9[24] ^ 23), (char) (cArr9[24] ^ 17), (char) (cArr9[0] ^ '2'), (char) (cArr9[0] ^ ')'), (char) (cArr9[15] ^ 23), (char) (cArr9[14] ^ '\r'), (char) (cArr9[19] ^ 'R')};
        sb3.append(new String(cArr9).intern());
        sb3.append(file.getPath());
        throw new IOException(sb3.toString());
    }
}
