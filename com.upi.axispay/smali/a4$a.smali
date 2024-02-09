.class public La4$a;
.super La4$e;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "La4$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(La4$c;La4$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La4$c<",
            "TK;TV;>;",
            "La4$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, La4$e;-><init>(La4$c;La4$c;)V

    return-void
.end method


# virtual methods
.method public b(La4$c;)La4$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La4$c<",
            "TK;TV;>;)",
            "La4$c<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p1, La4$c;->e:La4$c;

    return-object p1
.end method

.method public c(La4$c;)La4$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La4$c<",
            "TK;TV;>;)",
            "La4$c<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p1, La4$c;->d:La4$c;

    return-object p1
.end method
