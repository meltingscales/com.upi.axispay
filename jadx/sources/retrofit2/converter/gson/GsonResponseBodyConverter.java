package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    public GsonResponseBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader newJsonReader = this.gson.newJsonReader(responseBody.charStream());
        try {
            T read = this.adapter.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException(C0059ao.a(10816));
        } finally {
            responseBody.close();
        }
    }
}
