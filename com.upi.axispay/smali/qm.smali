.class public Lqm;
.super Lfn;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfn;-><init>()V

    .line 2
    invoke-virtual {p0}, Lqm;->o0()V

    return-void
.end method


# virtual methods
.method public final o0()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lfn;->l0(I)Lfn;

    .line 2
    new-instance v1, Lsm;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lsm;-><init>(I)V

    invoke-virtual {p0, v1}, Lfn;->d0(Lbn;)Lfn;

    new-instance v1, Lrm;

    invoke-direct {v1}, Lrm;-><init>()V

    .line 3
    invoke-virtual {p0, v1}, Lfn;->d0(Lbn;)Lfn;

    new-instance v1, Lsm;

    invoke-direct {v1, v0}, Lsm;-><init>(I)V

    .line 4
    invoke-virtual {p0, v1}, Lfn;->d0(Lbn;)Lfn;

    return-void
.end method
