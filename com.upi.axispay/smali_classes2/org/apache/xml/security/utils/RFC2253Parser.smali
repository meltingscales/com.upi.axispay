.class public Lorg/apache/xml/security/utils/RFC2253Parser;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:Z

.field public static b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lorg/apache/xml/security/utils/RFC2253Parser;

    const v1, 0x193

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;II)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x22

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    const v0, 0x185c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x185d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz p0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move v7, v6

    :goto_0
    invoke-virtual {v2, v1, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v8

    if-ltz v8, :cond_2

    invoke-static {v2, v5, v8}, Lorg/apache/xml/security/utils/RFC2253Parser;->a(Ljava/lang/String;II)I

    move-result v5

    add-int/2addr v7, v5

    if-lez v8, :cond_1

    add-int/lit8 v5, v8, -0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v9, 0x5c

    if-eq v5, v9, :cond_1

    rem-int/lit8 v5, v7, 0x2

    const/4 v9, 0x1

    if-eq v5, v9, :cond_1

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lorg/apache/xml/security/utils/RFC2253Parser;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v6, v8, 0x1

    move v7, v4

    :cond_1
    add-int/lit8 v5, v8, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/utils/RFC2253Parser;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0

    :cond_3
    :goto_1
    return-object v2
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    invoke-virtual {p0, p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v5

    if-ltz v5, :cond_1

    invoke-static {p0, v2, v5}, Lorg/apache/xml/security/utils/RFC2253Parser;->a(Ljava/lang/String;II)I

    move-result v2

    add-int/2addr v4, v2

    if-lez v5, :cond_0

    add-int/lit8 v2, v5, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v6, 0x5c

    if-eq v2, v6, :cond_0

    rem-int/lit8 v2, v4, 0x2

    const/4 v6, 0x1

    if-eq v2, v6, :cond_0

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v3, v5, 0x1

    move v4, v1

    :cond_0
    add-int/lit8 v2, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    const v5, 0x185e

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v6

    if-ltz v6, :cond_1

    invoke-static {p0, v2, v6}, Lorg/apache/xml/security/utils/RFC2253Parser;->a(Ljava/lang/String;II)I

    move-result v2

    add-int/2addr v4, v2

    if-lez v6, :cond_0

    add-int/lit8 v2, v6, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v7, 0x5c

    if-eq v2, v7, :cond_0

    rem-int/lit8 v2, v4, 0x2

    const/4 v7, 0x1

    if-eq v2, v7, :cond_0

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/xml/security/utils/RFC2253Parser;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v3, v6, 0x1

    move v4, v1

    :cond_0
    add-int/lit8 v2, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const v0, 0x185f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    if-lez v1, :cond_0

    add-int/lit8 v2, v1, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/xml/security/utils/RFC2253Parser;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-lt v4, v5, :cond_1

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x39

    if-gt v2, v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const v0, 0x1860

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x1861

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x5c

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v3, Ljava/io/StringReader;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v3}, Ljava/io/StringReader;->read()I

    move-result p0

    const/4 v4, -0x1

    if-le p0, v4, :cond_2

    int-to-char p0, p0

    const/16 v4, 0x2c

    if-eq p0, v4, :cond_0

    const/16 v4, 0x3d

    if-eq p0, v4, :cond_0

    const/16 v4, 0x2b

    if-eq p0, v4, :cond_0

    const/16 v4, 0x3c

    if-eq p0, v4, :cond_0

    const/16 v4, 0x3e

    if-eq p0, v4, :cond_0

    const/16 v4, 0x23

    if-eq p0, v4, :cond_0

    const/16 v4, 0x3b

    if-ne p0, v4, :cond_1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/xml/security/utils/RFC2253Parser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_3
    sget-boolean v0, Lorg/apache/xml/security/utils/RFC2253Parser;->a:Z

    if-ne v0, v2, :cond_4

    const v0, 0x1862

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_4
    const v0, 0x1863

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_5
    :goto_1
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const v0, 0x1864

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1865

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lorg/apache/xml/security/utils/RFC2253Parser;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    const v2, 0x1866

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x1867

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v1, 0x20

    if-ne p0, v1, :cond_0

    new-instance p0, Ljava/lang/StringBuffer;

    invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v0, 0x1868

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
