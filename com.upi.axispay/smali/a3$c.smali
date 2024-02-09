.class public La3$c;
.super Landroid/database/DataSetObserver;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:La3;


# direct methods
.method public constructor <init>(La3;)V
    .locals 0

    .line 1
    iput-object p1, p0, La3$c;->a:La3;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, La3$c;->a:La3;

    invoke-virtual {v0}, La3;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, La3$c;->a:La3;

    invoke-virtual {v0}, La3;->a()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .line 1
    iget-object v0, p0, La3$c;->a:La3;

    invoke-virtual {v0}, La3;->dismiss()V

    return-void
.end method
