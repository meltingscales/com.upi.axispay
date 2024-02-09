.class public Lt90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt90;->w(Lt90$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lt90;


# direct methods
.method public constructor <init>(Lt90;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt90$a;->c:Lt90;

    iput-object p2, p0, Lt90$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lt90$a;->c:Lt90;

    iget-object p1, p1, Lt90;->e:Lng0;

    if-eqz p1, :cond_0

    const v0, 0x7f0a0126

    .line 2
    iget-object v1, p0, Lt90$a;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
