package okio;

import java.util.List;
import java.util.RandomAccess;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Options extends si0<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        private final void buildTrieRecursive(long j, Buffer buffer, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            Buffer buffer2;
            int i8 = i;
            boolean z = i2 < i3;
            String a = C0059ao.a(4085);
            if (z) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (!(list.get(i9).size() >= i8)) {
                        throw new IllegalArgumentException(a.toString());
                    }
                }
                ByteString byteString = list.get(i2);
                ByteString byteString2 = list.get(i3 - 1);
                int i10 = -1;
                if (i8 == byteString.size()) {
                    int i11 = i2 + 1;
                    i4 = i11;
                    i5 = list2.get(i2).intValue();
                    byteString = list.get(i11);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (byteString.getByte(i8) != byteString2.getByte(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (list.get(i13 - 1).getByte(i8) != list.get(i13).getByte(i8)) {
                            i12++;
                        }
                    }
                    long intCount = j + getIntCount(buffer) + 2 + (i12 * 2);
                    buffer.writeInt(i12);
                    buffer.writeInt(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        byte b = list.get(i14).getByte(i8);
                        if (i14 == i4 || b != list.get(i14 - 1).getByte(i8)) {
                            buffer.writeInt(b & 255);
                        }
                    }
                    Buffer buffer3 = new Buffer();
                    while (i4 < i3) {
                        byte b2 = list.get(i4).getByte(i8);
                        int i15 = i4 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 >= i3) {
                                i6 = i3;
                                break;
                            } else if (b2 != list.get(i16).getByte(i8)) {
                                i6 = i16;
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (i15 == i6 && i8 + 1 == list.get(i4).size()) {
                            buffer.writeInt(list2.get(i4).intValue());
                            i7 = i6;
                            buffer2 = buffer3;
                        } else {
                            buffer.writeInt(((int) (intCount + getIntCount(buffer3))) * i10);
                            i7 = i6;
                            buffer2 = buffer3;
                            buildTrieRecursive(intCount, buffer3, i8 + 1, list, i4, i6, list2);
                        }
                        buffer3 = buffer2;
                        i4 = i7;
                        i10 = -1;
                    }
                    buffer.writeAll(buffer3);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i17 = 0;
                for (int i18 = i8; i18 < min && byteString.getByte(i18) == byteString2.getByte(i18); i18++) {
                    i17++;
                }
                long intCount2 = j + getIntCount(buffer) + 2 + i17 + 1;
                buffer.writeInt(-i17);
                buffer.writeInt(i5);
                int i19 = i8 + i17;
                while (i8 < i19) {
                    buffer.writeInt(byteString.getByte(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i19 == list.get(i4).size()) {
                        buffer.writeInt(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException(C0059ao.a(4086).toString());
                }
                Buffer buffer4 = new Buffer();
                buffer.writeInt(((int) (getIntCount(buffer4) + intCount2)) * (-1));
                buildTrieRecursive(intCount2, buffer4, i19, list, i4, i3, list2);
                buffer.writeAll(buffer4);
                return;
            }
            throw new IllegalArgumentException(a.toString());
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            companion.buildTrieRecursive((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options of(okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, vl0 vl0Var) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // defpackage.ri0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // defpackage.si0, defpackage.ri0
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // defpackage.si0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // defpackage.si0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Options) byteString);
    }

    @Override // defpackage.si0, java.util.List
    public ByteString get(int i) {
        return this.byteStrings[i];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Options) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Options) byteString);
    }
}
