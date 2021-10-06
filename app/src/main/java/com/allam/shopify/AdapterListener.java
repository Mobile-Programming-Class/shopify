package com.allam.shopify;

import android.view.View;

public interface AdapterListener {
    void onDeleteClicked(View view, int position);
    void onLongClicked(View view, int position);
}