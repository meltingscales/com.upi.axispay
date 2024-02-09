.class public Lhm$a$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhm$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lgm;Lcm$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcm$a;

.field public final synthetic b:[Lgm;


# direct methods
.method public constructor <init>(Lcm$a;[Lgm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhm$a$a;->a:Lcm$a;

    iput-object p2, p0, Lhm$a$a;->b:[Lgm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhm$a$a;->a:Lcm$a;

    iget-object v1, p0, Lhm$a$a;->b:[Lgm;

    invoke-static {v1, p1}, Lhm$a;->k([Lgm;Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcm$a;->c(Lbm;)V

    return-void
.end method
