.class public Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lorg/npci/upi/security/pinactivitycomponent/Keypad$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 2

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p1, v0}, Lz;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    const/16 p1, 0x42

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->b0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Lorg/npci/upi/security/pinactivitycomponent/m;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->b0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Lorg/npci/upi/security/pinactivitycomponent/m;

    move-result-object p1

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/m;->l()V

    goto :goto_0

    :cond_0
    const/16 p1, 0x43

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->b0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Lorg/npci/upi/security/pinactivitycomponent/m;

    move-result-object p1

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/m;->t()V

    :cond_1
    :goto_0
    return-void
.end method
