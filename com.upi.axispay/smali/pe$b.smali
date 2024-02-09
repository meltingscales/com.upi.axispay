.class public Lpe$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpe;->a(Lpe$e$c;Lpe$e$b;Lge;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lpe$d;

.field public final synthetic c:Lpe;


# direct methods
.method public constructor <init>(Lpe;Lpe$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpe$b;->c:Lpe;

    iput-object p2, p0, Lpe$b;->b:Lpe$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpe$b;->c:Lpe;

    iget-object v0, v0, Lpe;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lpe$b;->b:Lpe$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lpe$b;->c:Lpe;

    iget-object v0, v0, Lpe;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lpe$b;->b:Lpe$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
