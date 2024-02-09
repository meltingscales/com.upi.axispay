.class public Lf1$d;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Lc3;

.field public final b:Li1;

.field public final c:I


# direct methods
.method public constructor <init>(Lc3;Li1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf1$d;->a:Lc3;

    .line 3
    iput-object p2, p0, Lf1$d;->b:Li1;

    .line 4
    iput p3, p0, Lf1$d;->c:I

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Lf1$d;->a:Lc3;

    invoke-virtual {v0}, La3;->h()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method
