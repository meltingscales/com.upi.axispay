.class public final Lw50$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw50;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Lw50$d;

.field public final b:[Z

.field public final synthetic c:Lw50;


# direct methods
.method public constructor <init>(Lw50;Lw50$d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lw50$c;->c:Lw50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lw50$c;->a:Lw50$d;

    .line 4
    invoke-static {p2}, Lw50$d;->d(Lw50$d;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lw50;->k(Lw50;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lw50$c;->b:[Z

    return-void
.end method

.method public synthetic constructor <init>(Lw50;Lw50$d;Lw50$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw50$c;-><init>(Lw50;Lw50$d;)V

    return-void
.end method

.method public static synthetic b(Lw50$c;)Lw50$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lw50$c;->a:Lw50$d;

    return-object p0
.end method

.method public static synthetic c(Lw50$c;)[Z
    .locals 0

    .line 1
    iget-object p0, p0, Lw50$c;->b:[Z

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lw50$c;->c:Lw50;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lw50;->w(Lw50;Lw50$c;Z)V

    return-void
.end method
