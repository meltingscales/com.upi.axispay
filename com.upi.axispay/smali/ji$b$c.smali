.class public final Lji$b$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lyh$i;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyh$i;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lji$b$c;->a:Lyh$i;

    .line 3
    iput-object p2, p0, Lji$b$c;->b:Ljava/lang/Object;

    return-void
.end method
