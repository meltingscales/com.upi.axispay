.class public final synthetic Lwt;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# instance fields
.field public final synthetic a:Ltu;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lkr$a;


# direct methods
.method public synthetic constructor <init>(Ltu;Ljava/util/Map;Lkr$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwt;->a:Ltu;

    iput-object p2, p0, Lwt;->b:Ljava/util/Map;

    iput-object p3, p0, Lwt;->c:Lkr$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwt;->a:Ltu;

    iget-object v1, p0, Lwt;->b:Ljava/util/Map;

    iget-object v2, p0, Lwt;->c:Lkr$a;

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {v0, v1, v2, p1}, Ltu;->o0(Ljava/util/Map;Lkr$a;Landroid/database/Cursor;)Lkr;

    move-result-object p1

    return-object p1
.end method
