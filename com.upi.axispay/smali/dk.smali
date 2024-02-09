.class public final synthetic Ldk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# instance fields
.field public final synthetic a:Lbl;


# direct methods
.method public synthetic constructor <init>(Lbl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk;->a:Lbl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldk;->a:Lbl;

    check-cast p1, Lbm;

    invoke-virtual {v0, p1}, Lbl;->x(Lbm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
