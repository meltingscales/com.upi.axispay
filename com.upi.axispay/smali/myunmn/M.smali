.class public Lmyunmn/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native a(I)V
.end method

.method public static native b(I)V
.end method

.method public static native c(I)V
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 0

    invoke-static {p1}, Lmyunmn/M;->a(I)V

    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 0

    invoke-static {p1}, Lmyunmn/M;->c(I)V

    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 0

    invoke-static {p1}, Lmyunmn/M;->b(I)V

    return-void
.end method
