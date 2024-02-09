.class public Lmyunmn/J;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private final a:Lmyunmn/aN;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lmyunmn/K;

    invoke-direct {v0, p0}, Lmyunmn/K;-><init>(Lmyunmn/J;)V

    iput-object v0, p0, Lmyunmn/J;->a:Lmyunmn/aN;

    return-void
.end method


# virtual methods
.method public native a()I
.end method

.method public native a(Landroid/content/Intent;)Landroid/os/IBinder;
.end method

.method public native b()Z
.end method

.method public native c()I
.end method

.method public native d()I
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Lmyunmn/J;->a:Lmyunmn/aN;

    return-object p1
.end method
