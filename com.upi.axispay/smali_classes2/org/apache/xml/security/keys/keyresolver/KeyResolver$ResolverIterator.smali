.class public Lorg/apache/xml/security/keys/keyresolver/KeyResolver$ResolverIterator;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/xml/security/keys/keyresolver/KeyResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResolverIterator"
.end annotation


# instance fields
.field public a:Ljava/util/Iterator;

.field public b:I


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/keys/keyresolver/KeyResolver$ResolverIterator;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lorg/apache/xml/security/keys/keyresolver/KeyResolver$ResolverIterator;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/xml/security/keys/keyresolver/KeyResolver$ResolverIterator;->b:I

    iget-object v0, p0, Lorg/apache/xml/security/keys/keyresolver/KeyResolver$ResolverIterator;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/xml/security/keys/keyresolver/KeyResolver;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lorg/apache/xml/security/keys/keyresolver/KeyResolver;->d:Lorg/apache/xml/security/keys/keyresolver/KeyResolverSpi;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const v1, 0x2702

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const v1, 0x2703

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
