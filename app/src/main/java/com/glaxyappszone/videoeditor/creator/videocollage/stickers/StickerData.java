package com.glaxyappszone.videoeditor.creator.videocollage.stickers;

public class StickerData {
    public int pos;
    public ClgSingleFingerView singlefview;

    public StickerData(ClgSingleFingerView clgSingleFingerView, int i) {
        this.singlefview = clgSingleFingerView;
        this.pos = i;
    }
}
