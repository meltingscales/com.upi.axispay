.class public abstract Lcom/olive/upi/database/AppDatabase;
.super Lbl;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/olive/upi/database/AppDatabase$b;
    }
.end annotation


# static fields
.field public static final l:Lcom/olive/upi/database/AppDatabase$b;

.field public static volatile m:Lcom/olive/upi/database/AppDatabase;

.field public static final n:Lkl;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lmyunmn/z;->a()V

    new-instance v0, Lcom/olive/upi/database/AppDatabase$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/olive/upi/database/AppDatabase$b;-><init>(Lvl0;)V

    sput-object v0, Lcom/olive/upi/database/AppDatabase;->l:Lcom/olive/upi/database/AppDatabase$b;

    .line 1
    new-instance v0, Lcom/olive/upi/database/AppDatabase$a;

    invoke-direct {v0}, Lcom/olive/upi/database/AppDatabase$a;-><init>()V

    sput-object v0, Lcom/olive/upi/database/AppDatabase;->n:Lkl;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbl;-><init>()V

    return-void
.end method

.method public static final synthetic C()Lcom/olive/upi/database/AppDatabase;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/database/AppDatabase;->m:Lcom/olive/upi/database/AppDatabase;

    return-object v0
.end method

.method public static final synthetic D()Lkl;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/database/AppDatabase;->n:Lkl;

    return-object v0
.end method

.method public static final synthetic E(Lcom/olive/upi/database/AppDatabase;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/olive/upi/database/AppDatabase;->m:Lcom/olive/upi/database/AppDatabase;

    return-void
.end method


# virtual methods
.method public abstract F()Lk70;
.end method

.method public abstract G()Lp70;
.end method
