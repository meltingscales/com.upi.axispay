.class public Lorg/npci/upi/security/services/CLServices;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static e:Lorg/npci/upi/security/services/CLServices;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lorg/npci/upi/security/services/CLRemoteService;

.field public c:Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;

.field public d:Landroid/content/ServiceConnection;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x2977

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    const v0, 0x2978

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    const v0, 0x2979

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    const/4 v0, 0x0

    sput-object v0, Lorg/npci/upi/security/services/CLServices;->e:Lorg/npci/upi/security/services/CLServices;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/npci/upi/security/services/CLServices;->b:Lorg/npci/upi/security/services/CLRemoteService;

    new-instance v0, Lorg/npci/upi/security/services/CLServices$1;

    invoke-direct {v0, p0}, Lorg/npci/upi/security/services/CLServices$1;-><init>(Lorg/npci/upi/security/services/CLServices;)V

    iput-object v0, p0, Lorg/npci/upi/security/services/CLServices;->d:Landroid/content/ServiceConnection;

    iput-object p1, p0, Lorg/npci/upi/security/services/CLServices;->a:Landroid/content/Context;

    iput-object p2, p0, Lorg/npci/upi/security/services/CLServices;->c:Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const p2, 0x297a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p2, p0, Lorg/npci/upi/security/services/CLServices;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p2, p0, Lorg/npci/upi/security/services/CLServices;->a:Landroid/content/Context;

    iget-object v0, p0, Lorg/npci/upi/security/services/CLServices;->d:Landroid/content/ServiceConnection;

    const/4 v1, 0x1

    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method public static synthetic a(Lorg/npci/upi/security/services/CLServices;Lorg/npci/upi/security/services/CLRemoteService;)Lorg/npci/upi/security/services/CLRemoteService;
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/services/CLServices;->b:Lorg/npci/upi/security/services/CLRemoteService;

    return-object p1
.end method

.method public static synthetic b()Lorg/npci/upi/security/services/CLServices;
    .locals 1

    sget-object v0, Lorg/npci/upi/security/services/CLServices;->e:Lorg/npci/upi/security/services/CLServices;

    return-object v0
.end method

.method public static synthetic c(Lorg/npci/upi/security/services/CLServices;)Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/services/CLServices;->c:Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;

    return-object p0
.end method

.method public static f(Landroid/content/Context;Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;)V
    .locals 1

    sget-object v0, Lorg/npci/upi/security/services/CLServices;->e:Lorg/npci/upi/security/services/CLServices;

    if-nez v0, :cond_0

    new-instance v0, Lorg/npci/upi/security/services/CLServices;

    invoke-direct {v0, p0, p1}, Lorg/npci/upi/security/services/CLServices;-><init>(Landroid/content/Context;Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;)V

    sput-object v0, Lorg/npci/upi/security/services/CLServices;->e:Lorg/npci/upi/security/services/CLServices;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const p1, 0x297b

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lorg/npci/upi/security/services/CLServices;->b:Lorg/npci/upi/security/services/CLRemoteService;

    invoke-interface {v2, p1, p2}, Lorg/npci/upi/security/services/CLRemoteService;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x297c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x297d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-object v1
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLRemoteResultReceiver;)V
    .locals 12

    move-object v11, p0

    move-object p0, p1

    move-object p1, p2

    move-object p2, p3

    move-object/from16 p3, p4

    move-object/from16 p4, p5

    move-object/from16 p5, p6

    move-object/from16 p6, p7

    move-object/from16 p7, p8

    move-object/from16 p8, p9

    move-object v0, v11

    :try_start_0
    iget-object v1, v0, Lorg/npci/upi/security/services/CLServices;->b:Lorg/npci/upi/security/services/CLRemoteService;

    invoke-virtual/range {p8 .. p8}, Lorg/npci/upi/security/services/CLRemoteResultReceiver;->b()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lorg/npci/upi/security/services/CLResultReceiver$Stub;->j(Landroid/os/IBinder;)Lorg/npci/upi/security/services/CLResultReceiver;

    move-result-object v10

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-interface/range {v1 .. v10}, Lorg/npci/upi/security/services/CLRemoteService;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLResultReceiver;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const p9, 0x297e

    invoke-static/range {p9 .. p9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const p9, 0x297f

    invoke-static/range {p9 .. p9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lorg/npci/upi/security/services/CLServices;->b:Lorg/npci/upi/security/services/CLRemoteService;

    invoke-interface {v2, p1, p2, p3, p4}, Lorg/npci/upi/security/services/CLRemoteService;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x2980

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x2981

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return v1
.end method
