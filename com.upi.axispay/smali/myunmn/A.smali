.class public Lmyunmn/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmyunmn/b;


# direct methods
.method public constructor <init>(Lmyunmn/b;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/A;->a:Lmyunmn/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lmyunmn/A;->a:Lmyunmn/b;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lmyunmn/b;->c(Lmyunmn/b;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object v0, p0, Lmyunmn/A;->a:Lmyunmn/b;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lmyunmn/b;->b(Lmyunmn/b;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object v0, p0, Lmyunmn/A;->a:Lmyunmn/b;

    invoke-static {v0, v1}, Lmyunmn/b;->a(Lmyunmn/b;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object v0, p0, Lmyunmn/A;->a:Lmyunmn/b;

    invoke-static {v0}, Lmyunmn/b;->d(Lmyunmn/b;)V

    return-void
.end method
