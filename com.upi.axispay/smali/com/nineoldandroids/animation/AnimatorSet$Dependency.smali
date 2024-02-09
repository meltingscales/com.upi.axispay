.class public Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Dependency"
.end annotation


# static fields
.field public static final AFTER:I

.field public static final WITH:I


# instance fields
.field public node:Lcom/nineoldandroids/animation/AnimatorSet$Node;

.field public rule:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;

    const v1, 0x90

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    .line 3
    iput p2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->rule:I

    return-void
.end method
