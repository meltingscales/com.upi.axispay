.class public final Lco0$a;
.super Lzl0;
.source "AxisPay"

# interfaces
.implements Lhl0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco0;->V(Ljava/lang/CharSequence;[CIZI)Lhn0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzl0;",
        "Lhl0<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "Lgi0<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:[C

.field public final synthetic c:Z


# direct methods
.method public constructor <init>([CZ)V
    .locals 0

    iput-object p1, p0, Lco0$a;->b:[C

    iput-boolean p2, p0, Lco0$a;->c:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lzl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lco0$a;->b(Ljava/lang/CharSequence;I)Lgi0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/CharSequence;I)Lgi0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Lgi0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const v0, 0x10a9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lco0$a;->b:[C

    iget-boolean v1, p0, Lco0$a;->c:Z

    invoke-static {p1, v0, p2, v1}, Lco0;->N(Ljava/lang/CharSequence;[CIZ)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lli0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgi0;

    move-result-object p1

    :goto_0
    return-object p1
.end method
