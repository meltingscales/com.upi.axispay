.class public Lm2$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lqc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2;->a(Landroid/view/View;)Lqc$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm2$a;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrc;ILandroid/os/Bundle;)Z
    .locals 6

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x19

    if-lt v1, v4, :cond_1

    and-int/2addr p2, v3

    if-eqz p2, :cond_1

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lrc;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    invoke-virtual {p1}, Lrc;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/inputmethod/InputContentInfo;

    if-nez p3, :cond_0

    .line 4
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p3, v1

    :goto_0
    const v0, 0x1804

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_1

    :catch_0
    move-exception p1

    const v0, 0x1805

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x1806

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 6
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    .line 7
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    invoke-virtual {p1}, Lrc;->b()Landroid/content/ClipDescription;

    move-result-object v1

    new-instance v4, Landroid/content/ClipData$Item;

    .line 8
    invoke-virtual {p1}, Lrc;->a()Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-direct {p2, v1, v4}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 9
    new-instance v1, Lgb$a;

    const/4 v4, 0x2

    invoke-direct {v1, p2, v4}, Lgb$a;-><init>(Landroid/content/ClipData;I)V

    .line 10
    invoke-virtual {p1}, Lrc;->c()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgb$a;->d(Landroid/net/Uri;)Lgb$a;

    .line 11
    invoke-virtual {v1, p3}, Lgb$a;->b(Landroid/os/Bundle;)Lgb$a;

    .line 12
    invoke-virtual {v1}, Lgb$a;->a()Lgb;

    move-result-object p1

    .line 13
    iget-object p2, p0, Lm2$a;->a:Landroid/view/View;

    invoke-static {p2, p1}, Lac;->g0(Landroid/view/View;Lgb;)Lgb;

    move-result-object p1

    if-nez p1, :cond_2

    move v2, v3

    :cond_2
    return v2
.end method
