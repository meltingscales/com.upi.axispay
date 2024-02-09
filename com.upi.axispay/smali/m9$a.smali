.class public Lm9$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lm9$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9;->h([Loa$b;I)Loa$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm9$c<",
        "Loa$b;",
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
    check-cast p1, Loa$b;

    invoke-virtual {p0, p1}, Lm9$a;->c(Loa$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Loa$b;

    invoke-virtual {p0, p1}, Lm9$a;->d(Loa$b;)Z

    move-result p1

    return p1
.end method

.method public c(Loa$b;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Loa$b;->e()I

    move-result p1

    return p1
.end method

.method public d(Loa$b;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Loa$b;->f()Z

    move-result p1

    return p1
.end method
