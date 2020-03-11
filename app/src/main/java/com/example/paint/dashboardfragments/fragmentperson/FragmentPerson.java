package com.example.paint.dashboardfragments.fragmentperson;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.paint.R;
import com.example.paint.userprofile.UserDetails;
import com.example.paint.dashboard.HomeScreen;
import com.example.paint.login.Login;

public class FragmentPerson extends Fragment {
    //    private static FragmentPerson objFragmentPerson;
//
//    public static FragmentPerson getInstance(){
//
//        if(objFragmentPerson==null){
//            objFragmentPerson= new FragmentPerson();
//        }
//        return objFragmentPerson;
//    }
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v5 = inflater.inflate(R.layout.activity_fragment_person, container, false);
//        setHasOptionsMenu(true);
        return v5;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.txttt);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent i = new Intent(context, UserDetails.class);
                context.startActivity(i);
            }
        });

        TextView textView1 = view.findViewById(R.id.textText);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent intent = new Intent(context, Login.class);
                context.startActivity(intent);
            }
        });

    }
    //    @Override
//    public void onPrepareOptionsMenu(Menu menu) {
//       menu.clear();
//    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((HomeScreen) getActivity()).hideImageIconAll();
    }
}
