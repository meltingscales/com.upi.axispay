.class public Lhi$a;
.super Landroid/content/BroadcastReceiver;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhi;


# direct methods
.method public constructor <init>(Lhi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhi$a;->a:Lhi;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lhi$a;->a:Lhi;

    invoke-virtual {p1}, Lhi;->g()V

    return-void
.end method
