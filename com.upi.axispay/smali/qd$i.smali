.class public Lqd$i;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd;->x(Ljava/util/List;Ljava/util/List;ZLpe$e;Lpe$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lqd;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$i;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqd$i;->b:Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lke;->B(Ljava/util/ArrayList;I)V

    return-void
.end method
