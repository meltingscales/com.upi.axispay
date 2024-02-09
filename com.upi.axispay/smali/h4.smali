.class public Lh4;
.super Lj4;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj4;-><init>()V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 1

    .line 1
    new-instance v0, Lh4$a;

    invoke-direct {v0, p0}, Lh4$a;-><init>(Lh4;)V

    sput-object v0, Ln4;->r:Ln4$a;

    return-void
.end method
