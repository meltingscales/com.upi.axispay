.class public Lmyunmn/Q;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lmyunmn/b;


# direct methods
.method public constructor <init>(Lmyunmn/b;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/Q;->a:Lmyunmn/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lmyunmn/Q;->a:Lmyunmn/b;

    invoke-static {p1}, Lmyunmn/b;->f(Lmyunmn/b;)Landroid/app/Activity;

    move-result-object p1

    new-instance p2, Lmyunmn/V;

    invoke-direct {p2, p0}, Lmyunmn/V;-><init>(Lmyunmn/Q;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
