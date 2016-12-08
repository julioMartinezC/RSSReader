package eccesistemas.com.macbookpro.rssreader;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by macbookpro on 11/21/16.
 Actualizar daots
*/



public class DetailFragment  extends Fragment {
    public static final String EXTRA_URL= "url";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater,
          //      container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_rssitem_detail, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String link = bundle.getString("url");
            setText(link);
        }
       /// super.onActivityCreated(savedInstanceState);
    }
    public void setText( String url){
        TextView view = (TextView)  getView().findViewById(R.id.detailsText);
         view.setText(url);
    }


}
