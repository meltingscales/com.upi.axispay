.class public Ljf0$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf0;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljf0;


# direct methods
.method public constructor <init>(Ljf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljf0$g;->b:Ljf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Ljf0$g;->b:Ljf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    new-instance p1, Lcom/olive/upi/transport/model/UserRegister;

    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v0

    invoke-virtual {v0}, Lpa0;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Ljf0$g;->b:Ljf0;

    iget-object v0, v0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Ljf0$g;->b:Ljf0;

    iget-object v0, v0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Ljf0$g;->b:Ljf0;

    iget-object v0, v0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Ljf0$g;->b:Ljf0;

    iget-object v5, v0, Ljf0;->z:Ljava/lang/String;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/olive/upi/transport/model/UserRegister;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Ljf0$g;->b:Ljf0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x25

    invoke-direct {v1, v2, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
