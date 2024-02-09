.class public Lcom/upi/axispay/activity/MainActivity$j;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/MainActivity;->K0(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity$j;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$j;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lua0;->v(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->c()V

    .line 3
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity$j;->b:Lcom/upi/axispay/activity/MainActivity;

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity$j;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 6
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$j;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
