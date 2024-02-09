.class Lmyunmn/K;
.super Lmyunmn/aN;
.source "SourceFile"


# instance fields
.field final synthetic a:Lmyunmn/J;


# direct methods
.method constructor <init>(Lmyunmn/J;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/K;->a:Lmyunmn/J;

    invoke-direct {p0}, Lmyunmn/aN;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lmyunmn/K;->a:Lmyunmn/J;

    invoke-virtual {v0}, Lmyunmn/J;->b()Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lmyunmn/K;->a:Lmyunmn/J;

    invoke-virtual {v0}, Lmyunmn/J;->d()I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lmyunmn/K;->a:Lmyunmn/J;

    invoke-virtual {v0}, Lmyunmn/J;->a()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lmyunmn/K;->a:Lmyunmn/J;

    invoke-virtual {v0}, Lmyunmn/J;->c()I

    move-result v0

    return v0
.end method
