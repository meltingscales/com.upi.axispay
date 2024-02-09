.class public Lkg0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Llg0$b;


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Landroidx/fragment/app/Fragment;

.field public c:Landroid/app/Activity;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lkg0;->c:Landroid/app/Activity;

    invoke-static {v0}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object v0

    invoke-virtual {v0}, Ld70;->f()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v2, 0x22f7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x22f8

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-nez v1, :cond_2

    const v1, 0x22f9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x22fa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    goto :goto_1

    :cond_2
    :goto_0
    const v0, 0x22fb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    :goto_1
    invoke-virtual {p0, v2}, Lkg0;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lkg0;->c:Landroid/app/Activity;

    const-class v2, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x22fc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-object p1, p0, Lkg0;->c:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public c()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkg0;->c:Landroid/app/Activity;

    const v1, 0x22fd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x64

    if-eqz v0, :cond_1

    .line 2
    iget v0, p0, Lkg0;->e:I

    if-nez v0, :cond_4

    iget v3, p0, Lkg0;->d:I

    if-nez v3, :cond_4

    add-int/lit8 v0, v0, 0x1

    .line 3
    iput v0, p0, Lkg0;->e:I

    add-int/lit8 v3, v3, 0x1

    .line 4
    iput v3, p0, Lkg0;->d:I

    .line 5
    iget-object v0, p0, Lkg0;->b:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lkg0;->c:Landroid/app/Activity;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Ld8;->o(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    .line 7
    :cond_0
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lkg0;->c:Landroid/app/Activity;

    invoke-static {v0, v1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget v0, p0, Lkg0;->e:I

    if-nez v0, :cond_4

    add-int/lit8 v0, v0, 0x1

    .line 10
    iput v0, p0, Lkg0;->e:I

    .line 11
    iget-object v0, p0, Lkg0;->b:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lkg0;->c:Landroid/app/Activity;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Ld8;->o(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    .line 13
    :cond_2
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {p0}, Lkg0;->f()V

    :cond_4
    :goto_0
    return-void
.end method

.method public d(IILandroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const p1, 0x22fe

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lkg0;->g(Ljava/lang/String;)V

    .line 3
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const p3, 0x22ff

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const p1, 0x2300

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object p2, p0, Lkg0;->c:Landroid/app/Activity;

    invoke-static {p2, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_2
    const/16 p2, 0x4d2

    if-ne p1, p2, :cond_3

    .line 6
    invoke-virtual {p0}, Lkg0;->f()V

    :cond_3
    :goto_0
    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lkg0;->e:I

    .line 2
    iput v0, p0, Lkg0;->d:I

    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    new-instance v0, Llg0;

    invoke-direct {v0}, Llg0;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Llg0;->d(Llg0$b;)V

    .line 3
    iget-object v1, p0, Lkg0;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const v2, 0x2301

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lkg0;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public h(Landroid/app/Activity;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkg0;->c:Landroid/app/Activity;

    .line 2
    iput-object p2, p0, Lkg0;->a:Landroid/widget/ImageView;

    .line 3
    invoke-virtual {p0}, Lkg0;->c()V

    return-void
.end method
