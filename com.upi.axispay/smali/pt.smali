.class public final synthetic Lpt;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# instance fields
.field public final synthetic a:Ltu;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lkr$a;


# direct methods
.method public synthetic constructor <init>(Ltu;Ljava/lang/String;Ljava/util/Map;Lkr$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt;->a:Ltu;

    iput-object p2, p0, Lpt;->b:Ljava/lang/String;

    iput-object p3, p0, Lpt;->c:Ljava/util/Map;

    iput-object p4, p0, Lpt;->d:Lkr$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpt;->a:Ltu;

    iget-object v1, p0, Lpt;->b:Ljava/lang/String;

    iget-object v2, p0, Lpt;->c:Ljava/util/Map;

    iget-object v3, p0, Lpt;->d:Lkr$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1, v2, v3, p1}, Ltu;->q0(Ljava/lang/String;Ljava/util/Map;Lkr$a;Landroid/database/sqlite/SQLiteDatabase;)Lkr;

    move-result-object p1

    return-object p1
.end method
