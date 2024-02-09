.class public final Lgb$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/ClipData;

.field public b:I

.field public c:I

.field public d:Landroid/net/Uri;

.field public e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgb$a;->a:Landroid/content/ClipData;

    .line 3
    iput p2, p0, Lgb$a;->b:I

    return-void
.end method


# virtual methods
.method public a()Lgb;
    .locals 1

    .line 1
    new-instance v0, Lgb;

    invoke-direct {v0, p0}, Lgb;-><init>(Lgb$a;)V

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)Lgb$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lgb$a;->e:Landroid/os/Bundle;

    return-object p0
.end method

.method public c(I)Lgb$a;
    .locals 0

    .line 1
    iput p1, p0, Lgb$a;->c:I

    return-object p0
.end method

.method public d(Landroid/net/Uri;)Lgb$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lgb$a;->d:Landroid/net/Uri;

    return-object p0
.end method
