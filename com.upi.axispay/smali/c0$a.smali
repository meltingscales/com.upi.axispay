.class public Lc0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljb$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc0;


# direct methods
.method public constructor <init>(Lc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc0$a;->b:Lc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc0$a;->b:Lc0;

    invoke-virtual {v0, p1}, Lc0;->c(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
