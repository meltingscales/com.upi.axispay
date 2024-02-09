package org.apache.commons.codec.language.bm;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import myunmn.C0059ao;
import org.apache.commons.codec.language.bm.Languages;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Lang {
    private static final String LANGUAGE_RULES_RN = null;
    private static final Map<NameType, Lang> Langs;
    private final Languages languages;
    private final List<LangRule> rules;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class LangRule {
        private final boolean acceptOnMatch;
        private final Set<String> languages;
        private final Pattern pattern;

        public boolean matches(String str) {
            return this.pattern.matcher(str).find();
        }

        private LangRule(Pattern pattern, Set<String> set, boolean z) {
            this.pattern = pattern;
            this.languages = set;
            this.acceptOnMatch = z;
        }
    }

    static {
        NameType[] values;
        C0059ao.a(Lang.class, 322);
        Langs = new EnumMap(NameType.class);
        for (NameType nameType : NameType.values()) {
            Langs.put(nameType, loadFromResource(String.format(C0059ao.a(2148), nameType.getName()), Languages.getInstance(nameType)));
        }
    }

    private Lang(List<LangRule> list, Languages languages) {
        this.rules = Collections.unmodifiableList(list);
        this.languages = languages;
    }

    public static Lang instance(NameType nameType) {
        return Langs.get(nameType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
        throw new java.lang.IllegalArgumentException(myunmn.C0059ao.a(2156) + r5 + myunmn.C0059ao.a(2157) + r10 + myunmn.C0059ao.a(2158));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.commons.codec.language.bm.Lang loadFromResource(java.lang.String r10, org.apache.commons.codec.language.bm.Languages r11) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Scanner r2 = new java.util.Scanner
            java.io.InputStream r3 = org.apache.commons.codec.Resources.getInputStream(r10)
            r0 = 2149(0x865, float:3.011E-42)
            java.lang.String r4 = myunmn.C0059ao.a(r0)
            r2.<init>(r3, r4)
            r3 = 0
        L16:
            r4 = r3
        L17:
            boolean r5 = r2.hasNextLine()     // Catch: java.lang.Throwable -> Ldf
            if (r5 == 0) goto Ld6
            java.lang.String r5 = r2.nextLine()     // Catch: java.lang.Throwable -> Ldf
            r6 = 1
            if (r4 == 0) goto L32
            r0 = 2150(0x866, float:3.013E-42)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            boolean r5 = r5.endsWith(r6)     // Catch: java.lang.Throwable -> Ldf
            if (r5 == 0) goto L17
            goto L16
        L32:
            r0 = 2151(0x867, float:3.014E-42)
            java.lang.String r7 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            boolean r7 = r5.startsWith(r7)     // Catch: java.lang.Throwable -> Ldf
            if (r7 == 0) goto L41
            r4 = r6
            goto L17
        L41:
            r0 = 2152(0x868, float:3.016E-42)
            java.lang.String r7 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            int r7 = r5.indexOf(r7)     // Catch: java.lang.Throwable -> Ldf
            if (r7 < 0) goto L53
            java.lang.String r7 = r5.substring(r3, r7)     // Catch: java.lang.Throwable -> Ldf
            goto L54
        L53:
            r7 = r5
        L54:
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> Ldf
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Ldf
            if (r8 != 0) goto L5f
            goto L17
        L5f:
            r0 = 2153(0x869, float:3.017E-42)
            java.lang.String r8 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String[] r7 = r7.split(r8)     // Catch: java.lang.Throwable -> Ldf
            int r8 = r7.length     // Catch: java.lang.Throwable -> Ldf
            r9 = 3
            if (r8 != r9) goto La3
            r5 = r7[r3]     // Catch: java.lang.Throwable -> Ldf
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.lang.Throwable -> Ldf
            r6 = r7[r6]     // Catch: java.lang.Throwable -> Ldf
            r0 = 2154(0x86a, float:3.018E-42)
            java.lang.String r8 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String[] r6 = r6.split(r8)     // Catch: java.lang.Throwable -> Ldf
            r8 = 2
            r7 = r7[r8]     // Catch: java.lang.Throwable -> Ldf
            r0 = 2155(0x86b, float:3.02E-42)
            java.lang.String r8 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Ldf
            org.apache.commons.codec.language.bm.Lang$LangRule r8 = new org.apache.commons.codec.language.bm.Lang$LangRule     // Catch: java.lang.Throwable -> Ldf
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> Ldf
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> Ldf
            r9.<init>(r6)     // Catch: java.lang.Throwable -> Ldf
            r6 = 0
            r8.<init>(r5, r9, r7)     // Catch: java.lang.Throwable -> Ldf
            r1.add(r8)     // Catch: java.lang.Throwable -> Ldf
            goto L17
        La3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ldf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r1.<init>()     // Catch: java.lang.Throwable -> Ldf
            r0 = 2156(0x86c, float:3.021E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.append(r3)     // Catch: java.lang.Throwable -> Ldf
            r1.append(r5)     // Catch: java.lang.Throwable -> Ldf
            r0 = 2157(0x86d, float:3.023E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.append(r3)     // Catch: java.lang.Throwable -> Ldf
            r1.append(r10)     // Catch: java.lang.Throwable -> Ldf
            r0 = 2158(0x86e, float:3.024E-42)
            java.lang.String r10 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.append(r10)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> Ldf
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Ldf
            throw r11     // Catch: java.lang.Throwable -> Ldf
        Ld6:
            r2.close()
            org.apache.commons.codec.language.bm.Lang r10 = new org.apache.commons.codec.language.bm.Lang
            r10.<init>(r1, r11)
            return r10
        Ldf:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Le1
        Le1:
            r11 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Le6
            goto Lea
        Le6:
            r1 = move-exception
            r10.addSuppressed(r1)
        Lea:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.bm.Lang.loadFromResource(java.lang.String, org.apache.commons.codec.language.bm.Languages):org.apache.commons.codec.language.bm.Lang");
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet guessLanguages = guessLanguages(str);
        return guessLanguages.isSingleton() ? guessLanguages.getAny() : C0059ao.a(2159);
    }

    public Languages.LanguageSet guessLanguages(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.languages.getLanguages());
        for (LangRule langRule : this.rules) {
            if (langRule.matches(lowerCase)) {
                if (langRule.acceptOnMatch) {
                    hashSet.retainAll(langRule.languages);
                } else {
                    hashSet.removeAll(langRule.languages);
                }
            }
        }
        Languages.LanguageSet from = Languages.LanguageSet.from(hashSet);
        return from.equals(Languages.NO_LANGUAGES) ? Languages.ANY_LANGUAGE : from;
    }
}
