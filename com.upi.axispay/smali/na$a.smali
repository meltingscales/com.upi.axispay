.class public Lna$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lna;->e(Landroid/content/Context;Lma;Lja;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lna$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Lma;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lma;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lna$a;->b:Ljava/lang/String;

    iput-object p2, p0, Lna$a;->c:Landroid/content/Context;

    iput-object p3, p0, Lna$a;->d:Lma;

    iput p4, p0, Lna$a;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lna$e;
    .locals 4

    .line 1
    iget-object v0, p0, Lna$a;->b:Ljava/lang/String;

    iget-object v1, p0, Lna$a;->c:Landroid/content/Context;

    iget-object v2, p0, Lna$a;->d:Lma;

    iget v3, p0, Lna$a;->e:I

    invoke-static {v0, v1, v2, v3}, Lna;->c(Ljava/lang/String;Landroid/content/Context;Lma;I)Lna$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lna$a;->a()Lna$e;

    move-result-object v0

    return-object v0
.end method
