.class public Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;
.super Lorg/npci/upi/security/services/CLRemoteService$Stub;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public final synthetic b:Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->b:Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;

    invoke-direct {p0}, Lorg/npci/upi/security/services/CLRemoteService$Stub;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->a:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;Landroid/content/Context;Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;-><init>(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLResultReceiver;)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->b:Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-static/range {v1 .. v10}, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->b(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLResultReceiver;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    iget-object v3, v0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->a:Landroid/content/Context;

    const-class v4, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->b:Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->c(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;)Lorg/npci/upi/security/pinactivitycomponent/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;->b:Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->c(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;)Lorg/npci/upi/security/pinactivitycomponent/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/npci/upi/security/pinactivitycomponent/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
