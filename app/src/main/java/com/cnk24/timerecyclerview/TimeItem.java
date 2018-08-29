package com.cnk24.timerecyclerview;

/**
 * Created by Moon on 2015-03-03.
 */
public class TimeItem extends AdapterItem {

    public TimeItem(long time) {
        super(time);
    }

    public TimeItem(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    @Override
    public int getType() {
        return TYPE_TIME;
    }
}
