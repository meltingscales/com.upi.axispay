.class public Llg0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg0;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Llg0;


# direct methods
.method public constructor <init>(Llg0;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llg0$a;->c:Llg0;

    iput-object p2, p0, Llg0$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Llg0$a;->c:Llg0;

    invoke-static {p1}, Llg0;->a(Llg0;)Llg0$b;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 2
    iget-object p1, p0, Llg0$a;->c:Llg0;

    invoke-static {p1}, Llg0;->a(Llg0;)Llg0$b;

    move-result-object p1

    iget-object v0, p0, Llg0$a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Llg0$a;->b:Ljava/lang/String;

    const v1, 0x2617

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llg0$a;->c:Llg0;

    invoke-static {v0}, Llg0;->c(Llg0;)[Ljava/lang/String;

    move-result-object v0

    aget-object p2, v0, p2

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Llg0$a;->c:Llg0;

    invoke-static {v0}, Llg0;->b(Llg0;)[Ljava/lang/String;

    move-result-object v0

    aget-object p2, v0, p2

    :goto_1
    invoke-interface {p1, p2}, Llg0$b;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
