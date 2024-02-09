package com.google.android.gms.vision.face;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LargestFaceFocusingProcessor extends FocusingProcessor<Face> {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Builder {
        private LargestFaceFocusingProcessor zza;

        public Builder(@RecentlyNonNull Detector<Face> detector, @RecentlyNonNull Tracker<Face> tracker) {
            this.zza = new LargestFaceFocusingProcessor(detector, tracker);
        }

        @RecentlyNonNull
        public LargestFaceFocusingProcessor build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setMaxGapFrames(int i) {
            this.zza.zza(i);
            return this;
        }
    }

    public LargestFaceFocusingProcessor(@RecentlyNonNull Detector<Face> detector, @RecentlyNonNull Tracker<Face> tracker) {
        super(detector, tracker);
    }

    @Override // com.google.android.gms.vision.FocusingProcessor
    public int selectFocus(@RecentlyNonNull Detector.Detections<Face> detections) {
        SparseArray<Face> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() != 0) {
            int keyAt = detectedItems.keyAt(0);
            float width = detectedItems.valueAt(0).getWidth();
            for (int i = 1; i < detectedItems.size(); i++) {
                int keyAt2 = detectedItems.keyAt(i);
                float width2 = detectedItems.valueAt(i).getWidth();
                if (width2 > width) {
                    keyAt = keyAt2;
                    width = width2;
                }
            }
            return keyAt;
        }
        throw new IllegalArgumentException("No faces for selectFocus.");
    }
}
