package biz.httpsoftmobile.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by PC on 3/11/2018.
 * Синглетный класс
 */

public class CrimeLab {

    private  static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();

        for(int i = 0; i< 100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime # "+i);
            crime.setSolved(i % 2 == 0);//Для каждого второо объекта
            mCrimes.add(crime);
        }

    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

}
