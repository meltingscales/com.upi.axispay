.class public final synthetic Lhu;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$d;


# instance fields
.field public final synthetic a:Lvu;


# direct methods
.method public synthetic constructor <init>(Lvu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhu;->a:Lvu;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhu;->a:Lvu;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method
