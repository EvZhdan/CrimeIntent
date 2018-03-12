package biz.httpsoftmobile.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by PC on 3/11/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
