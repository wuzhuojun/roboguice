package roboguice.inject;

import android.app.FragmentManager;
import com.google.inject.Inject;
import com.google.inject.Provider;

import android.app.Activity;

@ContextSingleton
public class FragmentManagerProvider implements Provider<FragmentManager> {
    @Inject protected Activity activity;

    @Override
    public FragmentManager get() {
        // BUG only supports compat library at the moment.  Does not support honeycomb directly yet
        return activity.getFragmentManager();
    }
}
