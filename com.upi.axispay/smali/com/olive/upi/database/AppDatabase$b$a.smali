.class public final Lcom/olive/upi/database/AppDatabase$b$a;
.super Lbl$b;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/olive/upi/database/AppDatabase$b;->a(Landroid/content/Context;)Lcom/olive/upi/database/AppDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbl$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lbm;)V
    .locals 1

    const v0, 0x218c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Lbl$b;->a(Lbm;)V

    return-void
.end method
