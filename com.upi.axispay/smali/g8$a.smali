.class public Lg8$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lg8$d;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg8$d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg8$a;->b:Lg8$d;

    iput-object p2, p0, Lg8$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg8$a;->b:Lg8$d;

    iget-object v1, p0, Lg8$a;->c:Ljava/lang/Object;

    iput-object v1, v0, Lg8$d;->b:Ljava/lang/Object;

    return-void
.end method
