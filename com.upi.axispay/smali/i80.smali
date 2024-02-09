.class public Li80;
.super La80;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li80$a;
    }
.end annotation


# static fields
.field public static final b:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x98f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Li80;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La80;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static k(Landroid/content/ContentResolver;Landroid/net/Uri;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    sget-object v4, Li80;->b:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    return p0

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    return v0

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw p0

    :catch_0
    if-eqz v1, :cond_5

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_5
    return v0
.end method

.method public static l(II)Li80$a;
    .locals 2

    .line 1
    sget-object v0, Li80$a;->e:Li80$a;

    iget v1, v0, Li80$a;->c:I

    if-gt p0, v1, :cond_0

    iget v1, v0, Li80$a;->d:I

    if-gt p1, v1, :cond_0

    return-object v0

    .line 2
    :cond_0
    sget-object v0, Li80$a;->f:Li80$a;

    iget v1, v0, Li80$a;->c:I

    if-gt p0, v1, :cond_1

    iget p0, v0, Li80$a;->d:I

    if-gt p1, p0, :cond_1

    return-object v0

    .line 3
    :cond_1
    sget-object p0, Li80$a;->g:Li80$a;

    return-object p0
.end method


# virtual methods
.method public c(Lq80;)Z
    .locals 2

    .line 1
    iget-object p1, p1, Lq80;->d:Landroid/net/Uri;

    .line 2
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const v1, 0x990

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const v0, 0x991

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Lq80;I)Ls80$a;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v7, p0

    .line 1
    iget-object v0, v7, La80;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    .line 2
    iget-object v0, v6, Lq80;->d:Landroid/net/Uri;

    invoke-static {v8, v0}, Li80;->k(Landroid/content/ContentResolver;Landroid/net/Uri;)I

    move-result v9

    .line 3
    iget-object v0, v6, Lq80;->d:Landroid/net/Uri;

    invoke-virtual {v8, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x1

    if-eqz v0, :cond_0

    const v1, 0x992

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v11, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v11, v0

    .line 5
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lq80;->c()Z

    move-result v0

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    .line 6
    iget v0, v6, Lq80;->h:I

    iget v1, v6, Lq80;->i:I

    invoke-static {v0, v1}, Li80;->l(II)Li80$a;

    move-result-object v13

    if-nez v11, :cond_1

    .line 7
    sget-object v0, Li80$a;->g:Li80$a;

    if-ne v13, v0, :cond_1

    .line 8
    invoke-virtual/range {p0 .. p1}, La80;->j(Lq80;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    move-result-object v0

    .line 9
    new-instance v1, Ls80$a;

    sget-object v2, Ln80$e;->d:Ln80$e;

    invoke-direct {v1, v12, v0, v2, v9}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V

    return-object v1

    .line 10
    :cond_1
    iget-object v0, v6, Lq80;->d:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v14

    .line 11
    invoke-static/range {p1 .. p1}, Ls80;->d(Lq80;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v5

    .line 12
    iput-boolean v10, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 13
    iget v0, v6, Lq80;->h:I

    iget v1, v6, Lq80;->i:I

    iget v2, v13, Li80$a;->c:I

    iget v3, v13, Li80$a;->d:I

    move-object v4, v5

    move-object v10, v5

    move-object/from16 v5, p1

    invoke-static/range {v0 .. v5}, Ls80;->a(IIIILandroid/graphics/BitmapFactory$Options;Lq80;)V

    if-eqz v11, :cond_3

    .line 14
    sget-object v0, Li80$a;->g:Li80$a;

    if-ne v13, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    iget v0, v13, Li80$a;->b:I

    .line 15
    :goto_1
    invoke-static {v8, v14, v15, v0, v10}, Landroid/provider/MediaStore$Video$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    .line 16
    :cond_3
    iget v0, v13, Li80$a;->b:I

    .line 17
    invoke-static {v8, v14, v15, v0, v10}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_4

    .line 18
    new-instance v1, Ls80$a;

    sget-object v2, Ln80$e;->d:Ln80$e;

    invoke-direct {v1, v0, v12, v2, v9}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V

    return-object v1

    .line 19
    :cond_4
    invoke-virtual/range {p0 .. p1}, La80;->j(Lq80;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    move-result-object v0

    .line 20
    new-instance v1, Ls80$a;

    sget-object v2, Ln80$e;->d:Ln80$e;

    invoke-direct {v1, v12, v0, v2, v9}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V

    return-object v1
.end method
