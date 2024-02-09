.class public Lcom/olive/upi/transport/TransportManager$37;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/olive/upi/transport/TransportManager;->getInfo(Landroid/app/Activity;Lcom/olive/upi/transport/OliveRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/olive/upi/transport/api/Result<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/olive/upi/transport/TransportManager;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/TransportManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager$37;->this$0:Lcom/olive/upi/transport/TransportManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    return-void
.end method
