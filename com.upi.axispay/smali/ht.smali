.class public final synthetic Lht;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Llq;


# direct methods
.method public synthetic constructor <init>(JLlq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lht;->a:J

    iput-object p3, p0, Lht;->b:Llq;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lht;->a:J

    iget-object v2, p0, Lht;->b:Llq;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Ltu;->D0(JLlq;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
