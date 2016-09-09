package br.com.madeinlabs.dropsky;

import android.content.Context;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

public class DropSkyAdapter {
    private final Context mContext;
    private List<DropSkyItem> mDropSkyItems;

    public DropSkyAdapter(Context context) {
        mDropSkyItems = new LinkedList<>();
        mContext = context;
    }

    public int getCount() {
        return mDropSkyItems.size();
    }

    public DropSkyItem getDropSkyItem(int index){
        return mDropSkyItems.get(index);
    }

    public void addViewItem(View view, int colorResource) {
        DropSkyItem dropSkyItem = new DropSkyItem(mContext, view, colorResource);
        mDropSkyItems.add(dropSkyItem);
    }
}
