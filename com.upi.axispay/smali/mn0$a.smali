.class public final Lmn0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lom0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmn0;->a(Lhn0;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;",
        "Lom0;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lhn0;


# direct methods
.method public constructor <init>(Lhn0;)V
    .locals 0

    iput-object p1, p0, Lmn0$a;->b:Lhn0;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lmn0$a;->b:Lhn0;

    invoke-interface {v0}, Lhn0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
