.class public Lmyunmn/aY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private native a(Lmyunmn/ai;)V
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    invoke-static {p2}, Lmyunmn/aN;->a(Landroid/os/IBinder;)Lmyunmn/ai;

    move-result-object p1

    invoke-direct {p0, p1}, Lmyunmn/aY;->a(Lmyunmn/ai;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
