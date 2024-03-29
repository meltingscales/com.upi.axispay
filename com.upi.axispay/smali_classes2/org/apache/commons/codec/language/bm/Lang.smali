.class public Lorg/apache/commons/codec/language/bm/Lang;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/codec/language/bm/Lang$LangRule;
    }
.end annotation


# static fields
.field private static final LANGUAGE_RULES_RN:Ljava/lang/String;

.field private static final Langs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/apache/commons/codec/language/bm/NameType;",
            "Lorg/apache/commons/codec/language/bm/Lang;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final languages:Lorg/apache/commons/codec/language/bm/Languages;

.field private final rules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/commons/codec/language/bm/Lang$LangRule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    const-class v0, Lorg/apache/commons/codec/language/bm/Lang;

    const v1, 0x142

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lorg/apache/commons/codec/language/bm/NameType;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/apache/commons/codec/language/bm/Lang;->Langs:Ljava/util/Map;

    .line 2
    invoke-static {}, Lorg/apache/commons/codec/language/bm/NameType;->values()[Lorg/apache/commons/codec/language/bm/NameType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 3
    sget-object v5, Lorg/apache/commons/codec/language/bm/Lang;->Langs:Ljava/util/Map;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/apache/commons/codec/language/bm/NameType;->getName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    const v7, 0x864

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4}, Lorg/apache/commons/codec/language/bm/Languages;->getInstance(Lorg/apache/commons/codec/language/bm/NameType;)Lorg/apache/commons/codec/language/bm/Languages;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/apache/commons/codec/language/bm/Lang;->loadFromResource(Ljava/lang/String;Lorg/apache/commons/codec/language/bm/Languages;)Lorg/apache/commons/codec/language/bm/Lang;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/util/List;Lorg/apache/commons/codec/language/bm/Languages;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/commons/codec/language/bm/Lang$LangRule;",
            ">;",
            "Lorg/apache/commons/codec/language/bm/Languages;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/codec/language/bm/Lang;->rules:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lorg/apache/commons/codec/language/bm/Lang;->languages:Lorg/apache/commons/codec/language/bm/Languages;

    return-void
.end method

.method public static instance(Lorg/apache/commons/codec/language/bm/NameType;)Lorg/apache/commons/codec/language/bm/Lang;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/codec/language/bm/Lang;->Langs:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/codec/language/bm/Lang;

    return-object p0
.end method

.method public static loadFromResource(Ljava/lang/String;Lorg/apache/commons/codec/language/bm/Languages;)Lorg/apache/commons/codec/language/bm/Lang;
    .locals 10

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v2, Ljava/util/Scanner;

    invoke-static {p0}, Lorg/apache/commons/codec/Resources;->getInputStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    const v0, 0x865

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    move v4, v3

    .line 3
    :cond_0
    :goto_1
    :try_start_0
    invoke-virtual {v2}, Ljava/util/Scanner;->hasNextLine()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 4
    invoke-virtual {v2}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    const v0, 0x866

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 5
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    const v0, 0x867

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 6
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v4, v6

    goto :goto_1

    :cond_2
    const v0, 0x868

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 7
    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-ltz v7, :cond_3

    .line 8
    invoke-virtual {v5, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_3
    move-object v7, v5

    .line 9
    :goto_2
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    const v0, 0x869

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 11
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 12
    array-length v8, v7

    const/4 v9, 0x3

    if-ne v8, v9, :cond_5

    .line 13
    aget-object v5, v7, v3

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 14
    aget-object v6, v7, v6

    const v0, 0x86a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x2

    .line 15
    aget-object v7, v7, v8

    const v0, 0x86b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 16
    new-instance v8, Lorg/apache/commons/codec/language/bm/Lang$LangRule;

    new-instance v9, Ljava/util/HashSet;

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v9, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v6, 0x0

    invoke-direct {v8, v5, v9, v7, v6}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;-><init>(Ljava/util/regex/Pattern;Ljava/util/Set;ZLorg/apache/commons/codec/language/bm/Lang$1;)V

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 17
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x86c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x86d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x86e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :cond_6
    invoke-virtual {v2}, Ljava/util/Scanner;->close()V

    .line 19
    new-instance p0, Lorg/apache/commons/codec/language/bm/Lang;

    invoke-direct {p0, v1, p1}, Lorg/apache/commons/codec/language/bm/Lang;-><init>(Ljava/util/List;Lorg/apache/commons/codec/language/bm/Languages;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 20
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    .line 21
    :try_start_2
    invoke-virtual {v2}, Ljava/util/Scanner;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method


# virtual methods
.method public guessLanguage(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/bm/Lang;->guessLanguages(Ljava/lang/String;)Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->isSingleton()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->getAny()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const p1, 0x86f

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public guessLanguages(Ljava/lang/String;)Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;
    .locals 4

    .line 1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lorg/apache/commons/codec/language/bm/Lang;->languages:Lorg/apache/commons/codec/language/bm/Languages;

    invoke-virtual {v1}, Lorg/apache/commons/codec/language/bm/Languages;->getLanguages()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 3
    iget-object v1, p0, Lorg/apache/commons/codec/language/bm/Lang;->rules:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/commons/codec/language/bm/Lang$LangRule;

    .line 4
    invoke-virtual {v2, p1}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-static {v2}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;->access$100(Lorg/apache/commons/codec/language/bm/Lang$LangRule;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 6
    invoke-static {v2}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;->access$200(Lorg/apache/commons/codec/language/bm/Lang$LangRule;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v2}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;->access$200(Lorg/apache/commons/codec/language/bm/Lang$LangRule;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {v0}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->from(Ljava/util/Set;)Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;

    move-result-object p1

    .line 9
    sget-object v0, Lorg/apache/commons/codec/language/bm/Languages;->NO_LANGUAGES:Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lorg/apache/commons/codec/language/bm/Languages;->ANY_LANGUAGE:Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;

    :cond_3
    return-object p1
.end method
