package biz.httpsoftmobile.crimeintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by PC on 3/11/2018.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime(){
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getId() {
        return mId;
    }

    public String getmSuspect() {
        return mSuspect;
    }

    public void setmSuspect(String suspect) {
        this.mSuspect = suspect;
    }
    public String getPhotoFilename(){
        return "IMG_" + getId().toString()  + ".jpg";
    }
}
