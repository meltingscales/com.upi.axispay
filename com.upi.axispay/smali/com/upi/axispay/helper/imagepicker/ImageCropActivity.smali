.class public Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;
.super Lz;
.source "AxisPay"


# instance fields
.field public final A:Landroid/graphics/Bitmap$CompressFormat;

.field public B:Ljava/lang/String;

.field public C:Landroid/net/Uri;

.field public D:Landroid/net/Uri;

.field public E:Ljava/io/File;

.field public F:Landroid/view/View$OnClickListener;

.field public G:Landroid/view/View$OnClickListener;

.field public H:Landroid/view/View$OnClickListener;

.field public I:Landroid/view/View$OnClickListener;

.field public J:Landroid/view/View$OnClickListener;

.field public q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

.field public r:Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;

.field public s:Landroid/widget/Button;

.field public t:Landroid/widget/Button;

.field public u:Landroid/widget/Button;

.field public v:Landroid/widget/Button;

.field public w:Landroid/view/View;

.field public x:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

.field public y:Landroid/widget/Button;

.field public z:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz;-><init>()V

    .line 2
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->A:Landroid/graphics/Bitmap$CompressFormat;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->C:Landroid/net/Uri;

    .line 4
    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->D:Landroid/net/Uri;

    .line 5
    new-instance v0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$c;

    invoke-direct {v0, p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$c;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->F:Landroid/view/View$OnClickListener;

    .line 6
    new-instance v0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$d;

    invoke-direct {v0, p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$d;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->G:Landroid/view/View$OnClickListener;

    .line 7
    new-instance v0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$e;

    invoke-direct {v0, p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$e;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->H:Landroid/view/View$OnClickListener;

    .line 8
    new-instance v0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$f;

    invoke-direct {v0, p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$f;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->I:Landroid/view/View$OnClickListener;

    .line 9
    new-instance v0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;

    invoke-direct {v0, p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->J:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private E()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->D:Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->g0(Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lz;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-virtual {v0, v1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setMinimumScaleToFit(Landroid/graphics/drawable/Drawable;)F

    move-result v0

    .line 4
    iget-object v2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, v0

    invoke-virtual {v2, v3}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setMaximumScale(F)V

    .line 5
    iget-object v2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v0

    invoke-virtual {v2, v3}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setMediumScale(F)V

    .line 6
    iget-object v2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-virtual {v2, v0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setScale(F)V

    .line 7
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-virtual {v0, v1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->w:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 9
    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 10
    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->w:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static synthetic X(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->k0()V

    return-void
.end method

.method public static synthetic Y(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E:Ljava/io/File;

    return-object p0
.end method

.method public static synthetic Z(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->e0()V

    return-void
.end method

.method public static synthetic a0(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->l0()V

    return-void
.end method

.method public static synthetic b0(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->h0()V

    return-void
.end method

.method public static d0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 1
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    .line 2
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public c0(Ljava/io/Closeable;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final e0()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object v1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/io/File;

    const v2, 0x3aa4

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E:Ljava/io/File;

    return-void
.end method

.method public f0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const v1, 0x3aa5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    if-eqz p1, :cond_0

    const v1, 0x3aa6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final g0(Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v1, 0x0

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->z:Landroid/content/ContentResolver;

    invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v4, 0x1

    .line 3
    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    invoke-static {v2, v1, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 6
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    const/16 v5, 0x400

    if-gt v2, v5, :cond_1

    iget v6, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-le v6, v5, :cond_0

    goto :goto_0

    :cond_0
    move v2, v4

    goto :goto_1

    :cond_1
    :goto_0
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const-wide/high16 v7, 0x4090000000000000L    # 1024.0

    .line 7
    iget v3, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v7, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    move-result-wide v7

    div-double/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    int-to-double v2, v2

    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-int v2, v2

    .line 8
    :goto_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 9
    iput v2, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 10
    iget-object v2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->z:Landroid/content/ContentResolver;

    invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 11
    invoke-static {v2, v1, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 12
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 13
    new-instance v2, Landroid/media/ExifInterface;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    const v0, 0x3aa7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-virtual {v2, p1, v4}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result p1

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    const/4 v2, 0x6

    if-eq p1, v2, :cond_3

    const/16 v2, 0x8

    if-eq p1, v2, :cond_2

    goto :goto_3

    :cond_2
    const/high16 p1, 0x43870000    # 270.0f

    .line 15
    invoke-virtual {p0, v3, p1}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->i0(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 16
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_2

    :cond_3
    const/high16 p1, 0x42b40000    # 90.0f

    .line 17
    invoke-virtual {p0, v3, p1}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->i0(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 18
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_2

    :cond_4
    const/high16 p1, 0x43340000    # 180.0f

    .line 19
    invoke-virtual {p0, v3, p1}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->i0(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 20
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    move-object v3, p1

    :goto_3
    return-object v3

    :catch_0
    return-object v1
.end method

.method public final h0()V
    .locals 3

    .line 1
    new-instance v1, Landroid/content/Intent;

    const v0, 0x3aa8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const v0, 0x3aa9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x1

    .line 2
    :try_start_0
    invoke-virtual {p0, v1, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    const v0, 0x3aaa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method public final i0(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 2
    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final j0()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->getCroppedImage()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->C:Landroid/net/Uri;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    .line 3
    :try_start_0
    iget-object v4, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->z:Landroid/content/ContentResolver;

    invoke-virtual {v4, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 4
    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->A:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x5a

    invoke-virtual {v0, v1, v4, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    invoke-virtual {p0, v3}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->c0(Ljava/io/Closeable;)V

    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    .line 7
    invoke-virtual {p0, v3}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->c0(Ljava/io/Closeable;)V

    .line 8
    throw v0

    .line 9
    :catch_0
    invoke-virtual {p0, v3}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->c0(Ljava/io/Closeable;)V

    :cond_1
    return v2
.end method

.method public final k0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->j0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x3aab

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    const v2, 0x3aac

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, -0x1

    .line 5
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const v1, 0x3aad

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method public final l0()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    const v1, 0x3aae

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v1, Ljava/io/File;

    sget-object v2, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    const v3, 0x3aaf

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const v2, 0x3ab0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {p0, v2, v1}, Landroidx/core/content/FileProvider;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const v2, 0x3ab1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v1, 0x2

    .line 5
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public m0()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Lsd;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3ab2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->e0()V

    const/4 v1, -0x1

    const v0, 0x3ab3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    if-ne p1, v3, :cond_2

    if-ne p2, v1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Ljg0;->q(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->C:Landroid/net/Uri;

    .line 6
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    invoke-static {p1}, Ljg0;->q(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->D:Landroid/net/Uri;

    .line 7
    invoke-direct {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E()V

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->m0()V

    return-void

    .line 9
    :cond_1
    invoke-virtual {p0, v2}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->f0(Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v3, 0x1

    if-ne p1, v3, :cond_5

    if-nez p2, :cond_3

    .line 10
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->m0()V

    return-void

    :cond_3
    if-ne p2, v1, :cond_4

    .line 11
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    .line 12
    new-instance p2, Ljava/io/FileOutputStream;

    iget-object p3, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E:Ljava/io/File;

    invoke-direct {p2, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 13
    invoke-static {p1, p2}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->d0(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 14
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    .line 15
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 16
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    .line 17
    invoke-static {p1}, Ljg0;->q(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->C:Landroid/net/Uri;

    .line 18
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    invoke-static {p1}, Ljg0;->q(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->D:Landroid/net/Uri;

    .line 19
    invoke-direct {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 21
    invoke-virtual {p0, v2}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->f0(Ljava/lang/String;)V

    return-void

    .line 22
    :cond_4
    invoke-virtual {p0, v2}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->f0(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lsd;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0d0024

    .line 2
    invoke-virtual {p0, v0}, Lz;->setContentView(I)V

    const v0, 0x7f0a050a

    .line 3
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    invoke-virtual {p0, v0}, Lz;->U(Landroidx/appcompat/widget/Toolbar;)V

    const v0, 0x3ab4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->z:Landroid/content/ContentResolver;

    const v0, 0x7f0a0255

    .line 7
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lio/togoto/imagezoomcrop/photoview/PhotoView;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    const v0, 0x7f0a014f

    .line 8
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->r:Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;

    const v0, 0x7f0a00bf

    .line 9
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->s:Landroid/widget/Button;

    const v0, 0x7f0a00be

    .line 10
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->t:Landroid/widget/Button;

    const v0, 0x7f0a00c1

    .line 11
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->u:Landroid/widget/Button;

    const v0, 0x7f0a00c9

    .line 12
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->v:Landroid/widget/Button;

    const v0, 0x7f0a053a

    .line 13
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->w:Landroid/view/View;

    const v0, 0x7f0a00a6

    .line 14
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->x:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    const v0, 0x7f0a00cc

    .line 15
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->y:Landroid/widget/Button;

    .line 16
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->s:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->H:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->t:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->J:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->u:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->F:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->v:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->G:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->y:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    new-instance v1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$a;

    invoke-direct {v1, p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$a;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    invoke-virtual {v0, v1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setImageBoundsListener(Lio/togoto/imagezoomcrop/photoview/IGetImageBounds;)V

    .line 22
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->x:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    new-instance v1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;

    invoke-direct {v1, p0, v0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;-><init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;)V

    invoke-virtual {v0, v1}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 23
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->e0()V

    if-eqz p1, :cond_0

    const v0, 0x3ab5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const v0, 0x3ab6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const v1, 0x3ab7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const v1, 0x3ab8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->h0()V

    return-void

    .line 29
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->l0()V

    return-void

    .line 31
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    .line 32
    invoke-static {p1}, Ljg0;->q(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->C:Landroid/net/Uri;

    .line 33
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->B:Ljava/lang/String;

    invoke-static {p1}, Ljg0;->q(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->D:Landroid/net/Uri;

    .line 34
    invoke-direct {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->E()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->m0()V

    const/4 p1, 0x1

    return p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const v0, 0x3ab9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
