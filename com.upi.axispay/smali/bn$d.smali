.class public Lbn$d;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Ljava/lang/String;

.field public c:Lhn;

.field public d:Lbo;

.field public e:Lbn;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;Lbn;Lbo;Lhn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbn$d;->a:Landroid/view/View;

    .line 3
    iput-object p2, p0, Lbn$d;->b:Ljava/lang/String;

    .line 4
    iput-object p5, p0, Lbn$d;->c:Lhn;

    .line 5
    iput-object p4, p0, Lbn$d;->d:Lbo;

    .line 6
    iput-object p3, p0, Lbn$d;->e:Lbn;

    return-void
.end method
