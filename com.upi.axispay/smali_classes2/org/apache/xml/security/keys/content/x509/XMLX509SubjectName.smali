.class public Lorg/apache/xml/security/keys/content/x509/XMLX509SubjectName;
.super Lorg/apache/xml/security/utils/SignatureElementProxy;
.source "AxisPay"

# interfaces
.implements Lorg/apache/xml/security/keys/content/x509/XMLX509DataContent;


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/apache/xml/security/utils/ElementProxy;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/xml/security/utils/RFC2253Parser;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const v0, 0x1071

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/apache/xml/security/keys/content/x509/XMLX509SubjectName;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lorg/apache/xml/security/keys/content/x509/XMLX509SubjectName;

    invoke-virtual {p1}, Lorg/apache/xml/security/keys/content/x509/XMLX509SubjectName;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lorg/apache/xml/security/keys/content/x509/XMLX509SubjectName;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lorg/apache/xml/security/keys/content/x509/XMLX509SubjectName;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    return v1
.end method
