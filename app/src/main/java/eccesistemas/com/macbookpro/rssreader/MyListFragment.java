package eccesistemas.com.macbookpro.rssreader;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;

/**
 * Created by macbookpro on 11/21/16.
 */

public class MyListFragment extends Fragment {
    private OnItemSelectedListener listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view =inflater.inflate(R.layout.fragment_rsslist_overview, container, false);


        Button button = (Button) view.findViewById(R.id.updateButton);

        ///ADD A LISTENER FOR CLICK
        button.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        updateDetails("fake");

                    }
                });


        return view;



       // Actualizacion return super.onCreateView(inflater, container, savedInstanceState);
    }

    public interface OnItemSelectedListener {
        void onRssItemSelected(String link);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof OnItemSelectedListener){
            listener = (OnItemSelectedListener) context;


        }
        else
        {
            throw new ClassCastException(context.toString()
                    +  " must implement MyListFragment.OnItemSelectedListener"
                    );

        }

    }
    public void updateDetails(String s){

        ///create fake data

        String newTime = String.valueOf(System.currentTimeMillis());


        listener.onRssItemSelected(newTime);

    }

}
