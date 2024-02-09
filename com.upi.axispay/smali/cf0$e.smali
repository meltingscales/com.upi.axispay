.class public Lcf0$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf0;->K(Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Lcf0;


# direct methods
.method public constructor <init>(Lcf0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcf0$e;->e:Lcf0;

    iput-object p2, p0, Lcf0$e;->b:Ljava/lang/String;

    iput-object p3, p0, Lcf0$e;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcf0$e;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcf0$e;->e:Lcf0;

    iget-object v1, p0, Lcf0$e;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcf0$e;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lcf0$e;->d:Z

    invoke-virtual {v0, v1, v2, v3}, Lcf0;->I(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
