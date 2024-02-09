.class public final Lqi0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lci0;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lci0<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public b:Lsk0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsk0<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsk0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsk0<",
            "+TT;>;)V"
        }
    .end annotation

    const v0, 0x2c41

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqi0;->b:Lsk0;

    .line 3
    sget-object p1, Lni0;->a:Lni0;

    iput-object p1, p0, Lqi0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lqi0;->c:Ljava/lang/Object;

    sget-object v1, Lni0;->a:Lni0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqi0;->c:Ljava/lang/Object;

    sget-object v1, Lni0;->a:Lni0;

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lqi0;->b:Lsk0;

    invoke-static {v0}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Lsk0;->invoke()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lqi0;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lqi0;->b:Lsk0;

    .line 4
    :cond_0
    iget-object v0, p0, Lqi0;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqi0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqi0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x2c42

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
