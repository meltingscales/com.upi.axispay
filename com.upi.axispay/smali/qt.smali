.class public final synthetic Lqt;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# instance fields
.field public final synthetic a:Ltu;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Llq;


# direct methods
.method public synthetic constructor <init>(Ltu;Ljava/util/List;Llq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqt;->a:Ltu;

    iput-object p2, p0, Lqt;->b:Ljava/util/List;

    iput-object p3, p0, Lqt;->c:Llq;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqt;->a:Ltu;

    iget-object v1, p0, Lqt;->b:Ljava/util/List;

    iget-object v2, p0, Lqt;->c:Llq;

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {v0, v1, v2, p1}, Ltu;->s0(Ljava/util/List;Llq;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
