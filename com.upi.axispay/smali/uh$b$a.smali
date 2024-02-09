.class public Luh$b$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luh$b;->p(Ljava/util/concurrent/Executor;Luh$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Luh$b$d;

.field public final synthetic c:Lsh;

.field public final synthetic d:Ljava/util/Collection;

.field public final synthetic e:Luh$b;


# direct methods
.method public constructor <init>(Luh$b;Luh$b$d;Lsh;Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luh$b$a;->e:Luh$b;

    iput-object p2, p0, Luh$b$a;->b:Luh$b$d;

    iput-object p3, p0, Luh$b$a;->c:Lsh;

    iput-object p4, p0, Luh$b$a;->d:Ljava/util/Collection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Luh$b$a;->b:Luh$b$d;

    iget-object v1, p0, Luh$b$a;->e:Luh$b;

    iget-object v2, p0, Luh$b$a;->c:Lsh;

    iget-object v3, p0, Luh$b$a;->d:Ljava/util/Collection;

    invoke-interface {v0, v1, v2, v3}, Luh$b$d;->a(Luh$b;Lsh;Ljava/util/Collection;)V

    return-void
.end method
