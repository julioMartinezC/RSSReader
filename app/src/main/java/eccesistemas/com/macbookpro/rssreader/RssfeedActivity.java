package eccesistemas.com.macbookpro.rssreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RssfeedActivity extends AppCompatActivity
 implements  MyListFragment.OnItemSelectedListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rssfeed);
    }


    @Override
    public void onRssItemSelected(String link) {

        DetailFragment fragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.detailsFragment);
        fragment.setText(link);
    }
}
