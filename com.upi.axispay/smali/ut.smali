.class public final synthetic Lut;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# instance fields
.field public final synthetic a:Ltu;

.field public final synthetic b:Lfq;

.field public final synthetic c:Llq;


# direct methods
.method public synthetic constructor <init>(Ltu;Lfq;Llq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lut;->a:Ltu;

    iput-object p2, p0, Lut;->b:Lfq;

    iput-object p3, p0, Lut;->c:Llq;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lut;->a:Ltu;

    iget-object v1, p0, Lut;->b:Lfq;

    iget-object v2, p0, Lut;->c:Llq;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1, v2, p1}, Ltu;->v0(Lfq;Llq;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
