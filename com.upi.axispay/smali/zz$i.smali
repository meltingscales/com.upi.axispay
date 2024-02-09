.class public Lzz$i;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzz;->G(Landroid/widget/AutoCompleteTextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lzz;


# direct methods
.method public constructor <init>(Lzz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzz$i;->a:Lzz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lzz$i;->a:Lzz;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lzz;->p(Lzz;Z)Z

    .line 2
    iget-object v0, p0, Lzz$i;->a:Lzz;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lzz;->k(Lzz;J)J

    .line 3
    iget-object v0, p0, Lzz$i;->a:Lzz;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lzz;->o(Lzz;Z)V

    return-void
.end method
