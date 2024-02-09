.class public final enum Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

.field public static final enum BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

.field public static final enum LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

.field public static final enum RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

.field public static final enum TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;


# instance fields
.field private mCoordinate:F


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    .line 2
    new-instance v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    const-string v3, "TOP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    .line 3
    new-instance v3, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    const-string v5, "RIGHT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    .line 4
    new-instance v5, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    const-string v7, "BOTTOM"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    const/4 v7, 0x4

    new-array v7, v7, [Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->$VALUES:[Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getHeight()F
    .locals 2

    .line 1
    sget-object v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v0

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method public static getWidth()F
    .locals 2

    .line 1
    sget-object v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v0

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;
    .locals 1

    .line 1
    const-class v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    return-object p0
.end method

.method public static values()[Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;
    .locals 1

    .line 1
    sget-object v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->$VALUES:[Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v0}, [Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    return-object v0
.end method


# virtual methods
.method public getCoordinate()F
    .locals 1

    .line 1
    iget v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->mCoordinate:F

    return v0
.end method

.method public setCoordinate(F)V
    .locals 0

    .line 1
    iput p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->mCoordinate:F

    return-void
.end method
