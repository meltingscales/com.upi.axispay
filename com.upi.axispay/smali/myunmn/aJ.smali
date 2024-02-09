.class Lmyunmn/aJ;
.super Lmyunmn/aN;
.source "SourceFile"


# instance fields
.field final synthetic a:Lmyunmn/at;


# direct methods
.method constructor <init>(Lmyunmn/at;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/aJ;->a:Lmyunmn/at;

    invoke-direct {p0}, Lmyunmn/aN;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lmyunmn/aJ;->a:Lmyunmn/at;

    invoke-virtual {v0}, Lmyunmn/at;->d()Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lmyunmn/aJ;->a:Lmyunmn/at;

    invoke-virtual {v0}, Lmyunmn/at;->c()I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lmyunmn/aJ;->a:Lmyunmn/at;

    invoke-virtual {v0}, Lmyunmn/at;->a()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lmyunmn/aJ;->a:Lmyunmn/at;

    invoke-virtual {v0}, Lmyunmn/at;->b()I

    move-result v0

    return v0
.end method
