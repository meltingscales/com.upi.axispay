package org.apache.commons.codec.language.bm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import myunmn.C0059ao;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.language.bm.Languages;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Rule {
    public static final String ALL = null;
    public static final RPattern ALL_STRINGS_RMATCHER;
    private static final String DOUBLE_QUOTE = null;
    private static final String HASH_INCLUDE = null;
    private static final Map<NameType, Map<RuleType, Map<String, Map<String, List<Rule>>>>> RULES;
    private final RPattern lContext;
    private final String pattern;
    private final PhonemeExpr phoneme;
    private final RPattern rContext;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public interface PhonemeExpr {
        Iterable<Phoneme> getPhonemes();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class PhonemeList implements PhonemeExpr {
        private final List<Phoneme> phonemes;

        public PhonemeList(List<Phoneme> list) {
            this.phonemes = list;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public List<Phoneme> getPhonemes() {
            return this.phonemes;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public interface RPattern {
        boolean isMatch(CharSequence charSequence);
    }

    static {
        NameType[] values;
        RuleType[] values2;
        C0059ao.a(Rule.class, 164);
        ALL_STRINGS_RMATCHER = new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.1
            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
            public boolean isMatch(CharSequence charSequence) {
                return true;
            }
        };
        RULES = new EnumMap(NameType.class);
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap hashMap = new HashMap();
                for (String str : Languages.getInstance(nameType).getLanguages()) {
                    try {
                        Scanner createScanner = createScanner(nameType, ruleType, str);
                        hashMap.put(str, parseRules(createScanner, createResourceName(nameType, ruleType, str)));
                        if (createScanner != null) {
                            createScanner.close();
                        }
                    } catch (IllegalStateException e) {
                        throw new IllegalStateException(C0059ao.a(5173) + createResourceName(nameType, ruleType, str), e);
                    }
                }
                if (!ruleType.equals(RuleType.RULES)) {
                    String a = C0059ao.a(5174);
                    Scanner createScanner2 = createScanner(nameType, ruleType, a);
                    try {
                        hashMap.put(a, parseRules(createScanner2, createResourceName(nameType, ruleType, a)));
                        if (createScanner2 != null) {
                            createScanner2.close();
                        }
                    } finally {
                    }
                }
                enumMap.put((EnumMap) ruleType, (RuleType) Collections.unmodifiableMap(hashMap));
            }
            RULES.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.pattern = str;
        this.lContext = pattern(str2 + C0059ao.a(5175));
        this.rContext = pattern(C0059ao.a(5176) + str3);
        this.phoneme = phonemeExpr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean contains(CharSequence charSequence, char c) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    private static String createResourceName(NameType nameType, RuleType ruleType, String str) {
        return String.format(C0059ao.a(5177), nameType.getName(), ruleType.getName(), str);
    }

    private static Scanner createScanner(NameType nameType, RuleType ruleType, String str) {
        return new Scanner(Resources.getInputStream(createResourceName(nameType, ruleType, str)), C0059ao.a(5180));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != charSequence2.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        Map<String, List<Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        ArrayList arrayList = new ArrayList();
        for (List<Rule> list : instanceMap.values()) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        return languageSet.isSingleton() ? getInstanceMap(nameType, ruleType, languageSet.getAny()) : getInstanceMap(nameType, ruleType, C0059ao.a(5182));
    }

    private static Phoneme parsePhoneme(String str) {
        int indexOf = str.indexOf(C0059ao.a(5183));
        if (indexOf >= 0) {
            if (str.endsWith(C0059ao.a(5184))) {
                return new Phoneme(str.substring(0, indexOf), Languages.LanguageSet.from(new HashSet(Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split(C0059ao.a(5185))))));
            }
            throw new IllegalArgumentException(C0059ao.a(5186));
        }
        return new Phoneme(str, Languages.ANY_LANGUAGE);
    }

    private static PhonemeExpr parsePhonemeExpr(String str) {
        if (str.startsWith(C0059ao.a(5187))) {
            if (str.endsWith(C0059ao.a(5188))) {
                ArrayList arrayList = new ArrayList();
                String substring = str.substring(1, str.length() - 1);
                for (String str2 : substring.split(C0059ao.a(5189))) {
                    arrayList.add(parsePhoneme(str2));
                }
                String a = C0059ao.a(5190);
                if (substring.startsWith(a) || substring.endsWith(a)) {
                    arrayList.add(new Phoneme(C0059ao.a(5191), Languages.ANY_LANGUAGE));
                }
                return new PhonemeList(arrayList);
            }
            throw new IllegalArgumentException(C0059ao.a(5192));
        }
        return parsePhoneme(str);
    }

    private static Map<String, List<Rule>> parseRules(Scanner scanner, String str) {
        String str2;
        String stripQuotes;
        String stripQuotes2;
        String stripQuotes3;
        int i;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (scanner.hasNextLine()) {
            int i5 = i3 + 1;
            String nextLine = scanner.nextLine();
            if (i4 != 0) {
                if (nextLine.endsWith(C0059ao.a(5193))) {
                    i = i2;
                    i4 = i;
                    i2 = i;
                    i3 = i5;
                }
                i = i2;
                i2 = i;
                i3 = i5;
            } else {
                if (nextLine.startsWith(C0059ao.a(5194))) {
                    i = i2;
                    i4 = 1;
                } else {
                    int indexOf = nextLine.indexOf(C0059ao.a(5195));
                    String trim = (indexOf >= 0 ? nextLine.substring(i2, indexOf) : nextLine).trim();
                    if (trim.length() == 0) {
                        continue;
                        i3 = i5;
                    } else {
                        boolean startsWith = trim.startsWith(C0059ao.a(5196));
                        String a = C0059ao.a(5197);
                        if (startsWith) {
                            String trim2 = trim.substring(8).trim();
                            if (!trim2.contains(C0059ao.a(5198))) {
                                Scanner createScanner = createScanner(trim2);
                                try {
                                    hashMap.putAll(parseRules(createScanner, str + C0059ao.a(5199) + trim2));
                                    if (createScanner != null) {
                                        createScanner.close();
                                    }
                                    i = i2;
                                } finally {
                                }
                            } else {
                                throw new IllegalArgumentException(C0059ao.a(5200) + nextLine + a + str);
                            }
                        } else {
                            String[] split = trim.split(C0059ao.a(5201));
                            if (split.length == 4) {
                                try {
                                    stripQuotes = stripQuotes(split[i2]);
                                    stripQuotes2 = stripQuotes(split[1]);
                                    stripQuotes3 = stripQuotes(split[2]);
                                    str2 = a;
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    str2 = a;
                                }
                                try {
                                    Rule rule = new Rule(stripQuotes, stripQuotes2, stripQuotes3, parsePhonemeExpr(stripQuotes(split[3])), i5, str, stripQuotes, stripQuotes2, stripQuotes3) { // from class: org.apache.commons.codec.language.bm.Rule.2
                                        private final String loc;
                                        private final int myLine;
                                        public final /* synthetic */ int val$cLine;
                                        public final /* synthetic */ String val$lCon;
                                        public final /* synthetic */ String val$location;
                                        public final /* synthetic */ String val$pat;
                                        public final /* synthetic */ String val$rCon;

                                        {
                                            this.val$cLine = i5;
                                            this.val$location = str;
                                            this.val$pat = stripQuotes;
                                            this.val$lCon = stripQuotes2;
                                            this.val$rCon = stripQuotes3;
                                            this.myLine = i5;
                                            this.loc = str;
                                        }

                                        public String toString() {
                                            return C0059ao.a(955) + C0059ao.a(956) + this.myLine + C0059ao.a(957) + this.loc + '\'' + C0059ao.a(958) + this.val$pat + '\'' + C0059ao.a(959) + this.val$lCon + '\'' + C0059ao.a(960) + this.val$rCon + "'}";
                                        }
                                    };
                                    i = 0;
                                    String substring = rule.pattern.substring(0, 1);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        list = new ArrayList();
                                        hashMap.put(substring, list);
                                    }
                                    list.add(rule);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new IllegalStateException(C0059ao.a(5202) + i5 + str2 + str, e);
                                }
                            } else {
                                throw new IllegalArgumentException(C0059ao.a(5203) + split.length + C0059ao.a(5204) + nextLine + C0059ao.a(5205) + str);
                            }
                        }
                    }
                }
                i2 = i;
                i3 = i5;
            }
        }
        return hashMap;
    }

    private static RPattern pattern(String str) {
        String a = C0059ao.a(5206);
        boolean startsWith = str.startsWith(a);
        boolean endsWith = str.endsWith(C0059ao.a(5207));
        int length = str.length();
        if (endsWith) {
            length--;
        }
        final String substring = str.substring(startsWith ? 1 : 0, length);
        String a2 = C0059ao.a(5208);
        if (substring.contains(a2)) {
            boolean startsWith2 = substring.startsWith(a2);
            boolean endsWith2 = substring.endsWith(C0059ao.a(5209));
            if (startsWith2 && endsWith2) {
                final String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains(a2)) {
                    boolean startsWith3 = substring2.startsWith(a);
                    if (startsWith3) {
                        substring2 = substring2.substring(1);
                    }
                    final boolean z = !startsWith3;
                    if (startsWith && endsWith) {
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.7
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public boolean isMatch(CharSequence charSequence) {
                                return charSequence.length() == 1 && Rule.contains(substring2, charSequence.charAt(0)) == z;
                            }
                        };
                    }
                    if (startsWith) {
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.8
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public boolean isMatch(CharSequence charSequence) {
                                return charSequence.length() > 0 && Rule.contains(substring2, charSequence.charAt(0)) == z;
                            }
                        };
                    }
                    if (endsWith) {
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.9
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public boolean isMatch(CharSequence charSequence) {
                                return charSequence.length() > 0 && Rule.contains(substring2, charSequence.charAt(charSequence.length() - 1)) == z;
                            }
                        };
                    }
                }
            }
        } else if (startsWith && endsWith) {
            if (substring.length() == 0) {
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.3
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return charSequence.length() == 0;
                    }
                };
            }
            return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.4
                @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                public boolean isMatch(CharSequence charSequence) {
                    return charSequence.equals(substring);
                }
            };
        } else if ((startsWith || endsWith) && substring.length() == 0) {
            return ALL_STRINGS_RMATCHER;
        } else {
            if (startsWith) {
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.5
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return Rule.startsWith(charSequence, substring);
                    }
                };
            }
            if (endsWith) {
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.6
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return Rule.endsWith(charSequence, substring);
                    }
                };
            }
        }
        return new RPattern(str) { // from class: org.apache.commons.codec.language.bm.Rule.10
            public Pattern pattern;
            public final /* synthetic */ String val$regex;

            {
                this.val$regex = str;
                this.pattern = Pattern.compile(str);
            }

            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
            public boolean isMatch(CharSequence charSequence) {
                return this.pattern.matcher(charSequence).find();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i = 0; i < charSequence2.length(); i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static String stripQuotes(String str) {
        String a = C0059ao.a(5210);
        if (str.startsWith(a)) {
            str = str.substring(1);
        }
        return str.endsWith(a) ? str.substring(0, str.length() - 1) : str;
    }

    public RPattern getLContext() {
        return this.lContext;
    }

    public String getPattern() {
        return this.pattern;
    }

    public PhonemeExpr getPhoneme() {
        return this.phoneme;
    }

    public RPattern getRContext() {
        return this.rContext;
    }

    public boolean patternAndContextMatches(CharSequence charSequence, int i) {
        if (i >= 0) {
            int length = this.pattern.length() + i;
            if (length <= charSequence.length() && charSequence.subSequence(i, length).equals(this.pattern) && this.rContext.isMatch(charSequence.subSequence(length, charSequence.length()))) {
                return this.lContext.isMatch(charSequence.subSequence(0, i));
            }
            return false;
        }
        throw new IndexOutOfBoundsException(C0059ao.a(5211));
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Phoneme implements PhonemeExpr {
        public static final Comparator<Phoneme> COMPARATOR = new Comparator<Phoneme>() { // from class: org.apache.commons.codec.language.bm.Rule.Phoneme.1
            @Override // java.util.Comparator
            public int compare(Phoneme phoneme, Phoneme phoneme2) {
                for (int i = 0; i < phoneme.phonemeText.length(); i++) {
                    if (i >= phoneme2.phonemeText.length()) {
                        return 1;
                    }
                    int charAt = phoneme.phonemeText.charAt(i) - phoneme2.phonemeText.charAt(i);
                    if (charAt != 0) {
                        return charAt;
                    }
                }
                return phoneme.phonemeText.length() < phoneme2.phonemeText.length() ? -1 : 0;
            }
        };
        private final Languages.LanguageSet languages;
        private final StringBuilder phonemeText;

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.phonemeText = new StringBuilder(charSequence);
            this.languages = languageSet;
        }

        public Phoneme append(CharSequence charSequence) {
            this.phonemeText.append(charSequence);
            return this;
        }

        public Languages.LanguageSet getLanguages() {
            return this.languages;
        }

        public CharSequence getPhonemeText() {
            return this.phonemeText;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public Iterable<Phoneme> getPhonemes() {
            return Collections.singleton(this);
        }

        @Deprecated
        public Phoneme join(Phoneme phoneme) {
            return new Phoneme(this.phonemeText.toString() + phoneme.phonemeText.toString(), this.languages.restrictTo(phoneme.languages));
        }

        public Phoneme mergeWithLanguage(Languages.LanguageSet languageSet) {
            return new Phoneme(this.phonemeText.toString(), this.languages.merge(languageSet));
        }

        public String toString() {
            return this.phonemeText.toString() + C0059ao.a(12908) + this.languages + C0059ao.a(12909);
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2) {
            this(phoneme.phonemeText, phoneme.languages);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2, Languages.LanguageSet languageSet) {
            this(phoneme.phonemeText, languageSet);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }
    }

    private static Scanner createScanner(String str) {
        return new Scanner(Resources.getInputStream(String.format(C0059ao.a(5178), str)), C0059ao.a(5179));
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, String str) {
        Map<String, List<Rule>> map = RULES.get(nameType).get(ruleType).get(str);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException(String.format(C0059ao.a(5181), nameType.getName(), ruleType.getName(), str));
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, String str) {
        return getInstance(nameType, ruleType, Languages.LanguageSet.from(new HashSet(Arrays.asList(str))));
    }
}
