.class public Lcm$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcm$b$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lcm$a;

.field public final d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcm$a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcm$b;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcm$b;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcm$b;->c:Lcm$a;

    .line 5
    iput-boolean p4, p0, Lcm$b;->d:Z

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcm$b$a;
    .locals 1

    .line 1
    new-instance v0, Lcm$b$a;

    invoke-direct {v0, p0}, Lcm$b$a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
