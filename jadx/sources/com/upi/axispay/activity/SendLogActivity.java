package com.upi.axispay.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.upi.axispay.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SendLogActivity extends z implements View.OnClickListener {
    public String q = C0059ao.a(8118);
    public RecyclerView r;
    public m90 s;

    public final void X(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            eg0.A(this, C0059ao.a(8119));
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            File file = new File(this.q + C0059ao.a(8120) + it.next());
            if (file.exists()) {
                file.delete();
            }
        }
        Z();
    }

    public final void Y(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            eg0.A(this, C0059ao.a(8121));
            return;
        }
        Intent intent = new Intent();
        intent.setAction(C0059ao.a(8122));
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Uri.fromFile(new File(this.q + C0059ao.a(8123) + it.next())));
        }
        intent.putParcelableArrayListExtra(C0059ao.a(8124), arrayList2);
        intent.setType(C0059ao.a(8125));
        intent.putExtra(C0059ao.a(8127), new String[]{C0059ao.a(8126)});
        intent.putExtra(C0059ao.a(8129), new String[]{C0059ao.a(8128)});
        intent.putExtra(C0059ao.a(8130), C0059ao.a(8131));
        intent.putExtra(C0059ao.a(8133), C0059ao.a(8132) + arrayList.toString());
        startActivity(Intent.createChooser(intent, C0059ao.a(8134)));
    }

    public void Z() {
        File file = new File(this.q);
        ArrayList arrayList = new ArrayList();
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            arrayList.clear();
            for (File file2 : listFiles) {
                arrayList.add(file2.getName());
            }
            m90 m90Var = new m90(this, arrayList);
            this.s = m90Var;
            this.r.setAdapter(m90Var);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.delete_log) {
            X(this.s.w());
        } else if (id != R.id.send_log) {
        } else {
            Y(this.s.w());
        }
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_send_log);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.file_list);
        this.r = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ((Button) findViewById(R.id.send_log)).setOnClickListener(this);
        ((Button) findViewById(R.id.delete_log)).setOnClickListener(this);
        getExternalCacheDir();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.q = externalStorageDirectory.getAbsolutePath() + C0059ao.a(8135) + getPackageName() + C0059ao.a(8136);
        Z();
    }
}
