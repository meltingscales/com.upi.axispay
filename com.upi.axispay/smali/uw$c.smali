.class public Luw$c;
.super Landroid/util/Property;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Luw;",
        "Luw$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Luw;",
            "Luw$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luw$c;

    const v1, 0x3225

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Luw$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Luw$c;->a:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-class v0, Luw$e;

    invoke-direct {p0, v0, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Luw;)Luw$e;
    .locals 0

    .line 1
    invoke-interface {p1}, Luw;->getRevealInfo()Luw$e;

    move-result-object p1

    return-object p1
.end method

.method public b(Luw;Luw$e;)V
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Luw;->setRevealInfo(Luw$e;)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Luw;

    invoke-virtual {p0, p1}, Luw$c;->a(Luw;)Luw$e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Luw;

    check-cast p2, Luw$e;

    invoke-virtual {p0, p1, p2}, Luw$c;->b(Luw;Luw$e;)V

    return-void
.end method
