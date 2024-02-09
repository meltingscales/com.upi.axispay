.class public Lqd$j;
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
.field public final synthetic b:Lqd$m;


# direct methods
.method public constructor <init>(Lqd;Lqd$m;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$j;->b:Lqd$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqd$j;->b:Lqd$m;

    invoke-virtual {v0}, Lqd$l;->a()V

    return-void
.end method
