.class public interface abstract Lbm;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract B()Z
.end method

.method public abstract D()V
.end method

.method public abstract F()V
.end method

.method public abstract N(Ljava/lang/String;)Landroid/database/Cursor;
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract g()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getPath()Ljava/lang/String;
.end method

.method public abstract h(I)V
.end method

.method public abstract i(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract isOpen()Z
.end method

.method public abstract n(Ljava/lang/String;)Lfm;
.end method

.method public abstract p(Lem;)Landroid/database/Cursor;
.end method

.method public abstract u(Lem;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
.end method

.method public abstract v()Z
.end method
