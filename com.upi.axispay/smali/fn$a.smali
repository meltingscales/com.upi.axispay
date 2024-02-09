.class public Lfn$a;
.super Lcn;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbn;


# direct methods
.method public constructor <init>(Lfn;Lbn;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lfn$a;->a:Lbn;

    invoke-direct {p0}, Lcn;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lbn;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfn$a;->a:Lbn;

    invoke-virtual {v0}, Lbn;->S()V

    .line 2
    invoke-virtual {p1, p0}, Lbn;->O(Lbn$f;)Lbn;

    return-void
.end method
