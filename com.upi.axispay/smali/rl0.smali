.class public abstract Lrl0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lvm0;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrl0$a;
    }
.end annotation


# static fields
.field public static final NO_RECEIVER:Ljava/lang/Object;


# instance fields
.field private final isTopLevel:Z

.field private final name:Ljava/lang/String;

.field private final owner:Ljava/lang/Class;

.field public final receiver:Ljava/lang/Object;

.field private transient reflected:Lvm0;

.field private final signature:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lrl0$a;->a()Lrl0$a;

    move-result-object v0

    sput-object v0, Lrl0;->NO_RECEIVER:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lrl0;->NO_RECEIVER:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lrl0;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lrl0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lrl0;->receiver:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lrl0;->owner:Ljava/lang/Class;

    .line 6
    iput-object p3, p0, Lrl0;->name:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lrl0;->signature:Ljava/lang/String;

    .line 8
    iput-boolean p5, p0, Lrl0;->isTopLevel:Z

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0, p1}, Lvm0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0, p1}, Lvm0;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public compute()Lvm0;
    .locals 1

    .line 1
    iget-object v0, p0, Lrl0;->reflected:Lvm0;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lrl0;->computeReflected()Lvm0;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lrl0;->reflected:Lvm0;

    :cond_0
    return-object v0
.end method

.method public abstract computeReflected()Lvm0;
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lum0;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBoundReceiver()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lrl0;->receiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrl0;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()Lxm0;
    .locals 2

    .line 1
    iget-object v0, p0, Lrl0;->owner:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lrl0;->isTopLevel:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Lkm0;->b(Ljava/lang/Class;)Lxm0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkm0;->a(Ljava/lang/Class;)Lwm0;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->getParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getReflected()Lvm0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->compute()Lvm0;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Lrk0;

    invoke-direct {v0}, Lrk0;-><init>()V

    throw v0
.end method

.method public getReturnType()Ldn0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->getReturnType()Ldn0;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrl0;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Len0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->getVisibility()Len0;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public isFinal()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->isFinal()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->isOpen()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrl0;->getReflected()Lvm0;

    move-result-object v0

    invoke-interface {v0}, Lvm0;->isSuspend()Z

    move-result v0

    return v0
.end method
