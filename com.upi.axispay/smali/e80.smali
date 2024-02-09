.class public Le80;
.super La80;
.source "AxisPay"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La80;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static k(Landroid/net/Uri;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lld;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lld;-><init>(Ljava/lang/String;)V

    const p0, 0x3814

    invoke-static {p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, p0, v1}, Lld;->e(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public c(Lq80;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lq80;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3815

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lq80;I)Ls80$a;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, La80;->j(Lq80;)Ljava/io/InputStream;

    move-result-object p2

    invoke-static {p2}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    move-result-object p2

    .line 2
    new-instance v0, Ls80$a;

    sget-object v1, Ln80$e;->d:Ln80$e;

    iget-object p1, p1, Lq80;->d:Landroid/net/Uri;

    invoke-static {p1}, Le80;->k(Landroid/net/Uri;)I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, p2, v1, p1}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V

    return-object v0
.end method
