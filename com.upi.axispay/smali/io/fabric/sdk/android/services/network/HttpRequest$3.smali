.class public Lio/fabric/sdk/android/services/network/HttpRequest$3;
.super Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;->receive(Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation<",
        "Lio/fabric/sdk/android/services/network/HttpRequest;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

.field public final synthetic val$output:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/OutputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$3;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iput-object p4, p0, Lio/fabric/sdk/android/services/network/HttpRequest$3;->val$output:Ljava/io/OutputStream;

    invoke-direct {p0, p2, p3}, Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;-><init>(Ljava/io/Closeable;Z)V

    return-void
.end method


# virtual methods
.method public run()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$3;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$3;->val$output:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->receive(Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$3;->run()Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method
