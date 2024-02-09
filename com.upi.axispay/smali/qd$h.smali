.class public Lqd$h;
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
.field public final synthetic b:Lme;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lqd;Lme;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$h;->b:Lme;

    iput-object p3, p0, Lqd$h;->c:Landroid/view/View;

    iput-object p4, p0, Lqd$h;->d:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqd$h;->b:Lme;

    iget-object v1, p0, Lqd$h;->c:Landroid/view/View;

    iget-object v2, p0, Lqd$h;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Lme;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
