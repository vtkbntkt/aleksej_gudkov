package com.gai.aleksej_gudkov.data;

import android.os.Parcel;
import android.os.Parcelable;


public class TaskCardCreator implements Parcelable {
    private String mLikeCount;
    private String mTargetCompanyType;
    private String mAccidentAddress;
    private String mRegDate;
    private String mDaysRest;
    private int mLikeId;
    private int mSymbolId;
    private long mItemId;

    public TaskCardCreator(String likeCount, String targetCompanyType, String accidentAddress,
                           String regDate, String daysRest, int likeId, int symbolId, long itemId) {
        mLikeCount = likeCount;
        mTargetCompanyType = targetCompanyType;
        mAccidentAddress = accidentAddress;
        mRegDate = regDate;
        mDaysRest = daysRest;
        mLikeId = likeId;
        mSymbolId = symbolId;
        mItemId = itemId;
    }

    public String getmLikeCount() {
        return mLikeCount;
    }

    public String getmTargetCompanyType() {
        return mTargetCompanyType;
    }

    public String getmAccidentAddress() {
        return mAccidentAddress;
    }

    public String getmRegDate() {
        return mRegDate;
    }

    public String getmDaysRest() {
        return mDaysRest;
    }

    public int getmLikeId() {
        return mLikeId;
    }

    public int getmSymbolId() {
        return mSymbolId;
    }

    public long getmItemId() {
        return mItemId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mLikeCount);
        dest.writeString(mTargetCompanyType);
        dest.writeString(mAccidentAddress);
        dest.writeString(mRegDate);
        dest.writeString(mDaysRest);
        dest.writeInt(mLikeId);
        dest.writeInt(mSymbolId);
        dest.writeLong(mItemId);
    }

    public static final Parcelable.Creator CREATOR
            = new Parcelable.Creator() {
        public TaskCardCreator createFromParcel(Parcel in) {
            return new TaskCardCreator(in);
        }

        public TaskCardCreator[] newArray(int size) {
            return new TaskCardCreator[size];
        }
    };

    public TaskCardCreator(Parcel in) {
        mLikeCount = in.readString();
        mTargetCompanyType = in.readString();
        mAccidentAddress = in.readString();
        mRegDate = in.readString();
        mDaysRest = in.readString();
        mLikeId = in.readInt();
        mSymbolId = in.readInt();
        mItemId = in.readLong();
    }
}

