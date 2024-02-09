.class public Lmyunmn/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmyunmn/Q;


# direct methods
.method public constructor <init>(Lmyunmn/Q;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/V;->a:Lmyunmn/Q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lmyunmn/V;->a:Lmyunmn/Q;

    iget-object v0, v0, Lmyunmn/Q;->a:Lmyunmn/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lmyunmn/b;->a(Lmyunmn/b;Z)V

    return-void
.end method
