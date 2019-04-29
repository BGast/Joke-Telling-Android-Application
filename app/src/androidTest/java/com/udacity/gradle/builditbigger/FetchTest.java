package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

public class FetchTest extends AndroidTestCase {

    private EndpointsAsyncTask task;
    private String result;
    @Mock
    Context context;

    public FetchTest() {}

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        result = null;
        task = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                // Do nothing. Don't launch activity.
            }
        };
    }

    public void testAsyncTask() {
        try {
            task.execute(context);
            result = task.get(30, TimeUnit.SECONDS);
            assertNotNull(result);
        } catch (Exception e){
            fail("Test timed out");
        }
    }
}
