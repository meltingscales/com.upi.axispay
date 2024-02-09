.class public Lq70$c;
.super Lnk;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq70;-><init>(Lbl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnk<",
        "Lo70;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lq70;Lbl;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lnk;-><init>(Lbl;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const v0, 0x1e5d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
