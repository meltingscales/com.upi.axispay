.class public Llg0;
.super Landroid/app/DialogFragment;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg0$b;
    }
.end annotation


# instance fields
.field public b:[Ljava/lang/String;

.field public c:[Ljava/lang/String;

.field public d:Llg0$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const v0, 0x1ee8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1ee9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Llg0;->b:[Ljava/lang/String;

    const v0, 0x1eea

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1eeb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Llg0;->c:[Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Llg0;)Llg0$b;
    .locals 0

    .line 1
    iget-object p0, p0, Llg0;->d:Llg0$b;

    return-object p0
.end method

.method public static synthetic b(Llg0;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llg0;->b:[Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Llg0;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llg0;->c:[Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public d(Llg0$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llg0;->d:Llg0$b;

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .line 1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x1eec

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f120402

    .line 3
    invoke-virtual {p0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const v2, 0x1eed

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Llg0;->c:[Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v2, p0, Llg0;->b:[Ljava/lang/String;

    :goto_1
    new-instance v3, Llg0$a;

    invoke-direct {v3, p0, p1}, Llg0$a;-><init>(Llg0;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 5
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
