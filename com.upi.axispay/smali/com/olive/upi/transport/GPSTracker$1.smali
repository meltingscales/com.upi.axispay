.class public Lcom/olive/upi/transport/GPSTracker$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/olive/upi/transport/GPSTracker;->showSettingsAlert()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/olive/upi/transport/GPSTracker;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/GPSTracker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/GPSTracker$1;->this$0:Lcom/olive/upi/transport/GPSTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    new-instance p1, Landroid/content/Intent;

    const p2, 0x3720

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/olive/upi/transport/GPSTracker$1;->this$0:Lcom/olive/upi/transport/GPSTracker;

    invoke-static {p2}, Lcom/olive/upi/transport/GPSTracker;->access$000(Lcom/olive/upi/transport/GPSTracker;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
