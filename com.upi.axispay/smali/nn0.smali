.class public final Lnn0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhn0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lhn0<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:Lhn0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ldl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldl0<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn0;Ldl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn0<",
            "+TT;>;",
            "Ldl0<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const v0, 0x18e6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x18e7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnn0;->a:Lhn0;

    iput-object p2, p0, Lnn0;->b:Ldl0;

    return-void
.end method

.method public static final synthetic b(Lnn0;)Lhn0;
    .locals 0

    .line 1
    iget-object p0, p0, Lnn0;->a:Lhn0;

    return-object p0
.end method

.method public static final synthetic c(Lnn0;)Ldl0;
    .locals 0

    .line 1
    iget-object p0, p0, Lnn0;->b:Ldl0;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnn0$a;

    invoke-direct {v0, p0}, Lnn0$a;-><init>(Lnn0;)V

    return-object v0
.end method
