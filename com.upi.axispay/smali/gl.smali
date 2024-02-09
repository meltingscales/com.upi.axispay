.class public Lgl;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm$c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/io/File;

.field public final c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcm$c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lcm$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcm$c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgl;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lgl;->b:Ljava/io/File;

    .line 4
    iput-object p3, p0, Lgl;->c:Ljava/util/concurrent/Callable;

    .line 5
    iput-object p4, p0, Lgl;->d:Lcm$c;

    return-void
.end method


# virtual methods
.method public a(Lcm$b;)Lcm;
    .locals 8

    .line 1
    new-instance v7, Lfl;

    iget-object v1, p1, Lcm$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lgl;->a:Ljava/lang/String;

    iget-object v3, p0, Lgl;->b:Ljava/io/File;

    iget-object v4, p0, Lgl;->c:Ljava/util/concurrent/Callable;

    iget-object v0, p1, Lcm$b;->c:Lcm$a;

    iget v5, v0, Lcm$a;->a:I

    iget-object v0, p0, Lgl;->d:Lcm$c;

    .line 2
    invoke-interface {v0, p1}, Lcm$c;->a(Lcm$b;)Lcm;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lfl;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILcm;)V

    return-object v7
.end method
