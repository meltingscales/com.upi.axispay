.class public final synthetic Lpj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpj;->a:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpj;->a:I

    check-cast p1, Lbm;

    invoke-static {v0, p1}, Ljk$a;->m(ILbm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
