.class public Lm9$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lm9$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9;->f(Ly8$b;I)Ly8$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm9$c<",
        "Ly8$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lm9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ly8$c;

    invoke-virtual {p0, p1}, Lm9$b;->c(Ly8$c;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ly8$c;

    invoke-virtual {p0, p1}, Lm9$b;->d(Ly8$c;)Z

    move-result p1

    return p1
.end method

.method public c(Ly8$c;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly8$c;->e()I

    move-result p1

    return p1
.end method

.method public d(Ly8$c;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly8$c;->f()Z

    move-result p1

    return p1
.end method
