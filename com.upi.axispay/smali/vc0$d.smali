.class public Lvc0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc0;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lvc0;


# direct methods
.method public constructor <init>(Lvc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvc0$d;->b:Lvc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x3110

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->c(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1}, Ln70;->d()V

    .line 3
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lvc0$d;->b:Lvc0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v0, 0x3111

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x16

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5
    iget-object v0, p0, Lvc0$d;->b:Lvc0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 6
    iget-object p1, p0, Lvc0$d;->b:Lvc0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
