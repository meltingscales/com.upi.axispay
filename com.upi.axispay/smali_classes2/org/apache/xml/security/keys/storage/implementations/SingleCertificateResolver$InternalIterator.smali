.class public Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InternalIterator"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/security/cert/X509Certificate;


# direct methods
.method public constructor <init>(Ljava/security/cert/X509Certificate;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->b:Ljava/security/cert/X509Certificate;

    iput-object p1, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->b:Ljava/security/cert/X509Certificate;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->a:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->a:Z

    iget-object v0, p0, Lorg/apache/xml/security/keys/storage/implementations/SingleCertificateResolver$InternalIterator;->b:Ljava/security/cert/X509Certificate;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const v1, 0x39df

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
