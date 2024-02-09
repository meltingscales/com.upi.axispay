.class public final synthetic Lkh;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lgi$b;


# instance fields
.field public final synthetic a:Lhi;

.field public final synthetic b:Lgi;


# direct methods
.method public synthetic constructor <init>(Lhi;Lgi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh;->a:Lhi;

    iput-object p2, p0, Lkh;->b:Lgi;

    return-void
.end method


# virtual methods
.method public final a(Luh$e;)V
    .locals 2

    iget-object v0, p0, Lkh;->a:Lhi;

    iget-object v1, p0, Lkh;->b:Lgi;

    invoke-virtual {v0, v1, p1}, Lhi;->e(Lgi;Luh$e;)V

    return-void
.end method
