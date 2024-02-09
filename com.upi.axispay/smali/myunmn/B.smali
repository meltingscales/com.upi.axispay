.class public Lmyunmn/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmyunmn/b;


# direct methods
.method public constructor <init>(Lmyunmn/b;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/B;->a:Lmyunmn/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lmyunmn/B;->a:Lmyunmn/b;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lmyunmn/b;->c(Lmyunmn/b;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object v0, p0, Lmyunmn/B;->a:Lmyunmn/b;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lmyunmn/b;->b(Lmyunmn/b;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object v0, p0, Lmyunmn/B;->a:Lmyunmn/b;

    invoke-static {v0, v1}, Lmyunmn/b;->a(Lmyunmn/b;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object v0, p0, Lmyunmn/B;->a:Lmyunmn/b;

    invoke-static {v0}, Lmyunmn/b;->i(Lmyunmn/b;)V

    return-void
.end method
